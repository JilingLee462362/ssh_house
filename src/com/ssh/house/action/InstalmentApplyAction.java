package com.ssh.house.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.house.appcomm.base.BaseAction;
import com.ssh.house.biz.InstalmentApplyBizI;
import com.ssh.house.entity.TyInstalmentApply;
import com.ssh.house.entity.Userinfo;

@ParentPackage(value="struts-default")
@Namespace(value="/insapp")
@Controller
@Scope(value="prototype")
public class InstalmentApplyAction extends BaseAction implements ModelDriven<TyInstalmentApply> {

	TyInstalmentApply IA = new TyInstalmentApply();
	
	private InstalmentApplyBizI instalmentApplyBizI;
	private Integer pageNum = 1;
	private Integer pageSize = 2;
	private Integer query;
	private Integer queryId;
	private Integer userid;
	String message = null;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getQueryId() {
		return queryId;
	}

	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}

	public Integer getQuery() {
		return query;
	}

	public void setQuery(Integer query) {
		this.query = query;
	}

	public InstalmentApplyBizI getInstalmentApplyBizI() {
		return instalmentApplyBizI;
	}

	public TyInstalmentApply getIA() {
		return IA;
	}

	public void setIA(TyInstalmentApply iA) {
		IA = iA;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	@Resource(name="instalmentApplyBizI")
	public void setInstalmentApplyBizI(InstalmentApplyBizI instalmentApplyBizI) {
		this.instalmentApplyBizI = instalmentApplyBizI;
	}
	
	@Action(value = "find", results={@Result(name="instalmentapply_list", location = "/instalmentapply_list.jsp")})
	public String find(){
		
/*		System.out.println("query"+query);
		System.out.println("queryId"+queryId);*/
		
//		System.out.println("isDate:" + IA.getIaDate());
		StringBuffer hql = new StringBuffer(" from TyInstalmentApply ia ");
		hql.append(" where 1 = 1 ");
		
		//按客户编号、代理人编号、审批人编号查询
		if(queryId != null && !"".equals(queryId) && queryId != 3 && query != null){
			if(query.equals(1)){
				IA.setIaCustomerId(queryId);
				hql.append(" and ia.iaCustomerId = " + queryId);
			}else if(query.equals(2)){
				IA.setIaEmpId(queryId);
				hql.append(" and ia.iaEmpId = " + queryId);
			}else if(query.equals(3)){
				IA.setIaApproverId(queryId);
				hql.append(" and ia.iaApproverId = " + queryId);
			}
			
		}else{
			query = 0;
		}
		//按日期查询
//		if(IA.getIaDate() != null && !"".equals(IA.getIaDate())){
//			hql.append(" and DATE_FORMAT(iaDate,   '%Y-%m-%d') = " + "'"+ IA.getIaDate()+"'");
//		}
		
		//按审批状态查询
		if(IA.getIaApprovalState() != null && !"".equals(IA.getIaApprovalState())){
			hql.append(" and ia.iaApprovalState = " + IA.getIaApprovalState());
		}
		//总条数
		Integer totalCount = Integer.valueOf(instalmentApplyBizI.count("select count(*) "+hql.toString()).toString());
		//总分页数
		Integer pageCount = totalCount % this.pageSize == 0 ? totalCount/ this.pageSize : totalCount / this.pageSize + 1;
		
		if(pageNum > pageCount){
			pageNum = pageCount;
		}
		if(pageNum <= 0){
			pageNum = 1;
		}
		
		List<TyInstalmentApply> iAlist = instalmentApplyBizI.find(hql.toString(), new ArrayList(), pageNum, pageSize);
	
		requestMap.put("iAlist", iAlist);
		
		requestMap.put("pageNum", pageNum);
		requestMap.put("totalCount", totalCount);
		requestMap.put("pageCount", pageCount);	
		requestMap.put("query", query);
		requestMap.put("queryId", queryId);
		return "instalmentapply_list";
		
	}
	
	/**
	 * 
	 * 添加
	 */
	@Action(value = "save", results={@Result(name = "result", location="/result.jsp")})
	public String save(){
		
		IA.setIaMind("待审核");
		IA.setIaStatus("待审核");
		IA.setIaApprovalState(0);
		try{
			instalmentApplyBizI.save(IA);
			message = "添加成功";
		}catch(Exception e){
			message = "添加失败";
		}
		requestMap.put("message", message);
		return "result";
	}
	
	/**
	 * 跳转审核页面
	 * @return
	 */
	@Action(value="toUpdate", results={@Result(name = "approval", location="/approval_edit.jsp")})
	public String toUpdate(){
		
		String hql = "from TyInstalmentApply where iaId = " + IA.getIaId();
		List<TyInstalmentApply> instalmentApply = instalmentApplyBizI.find(hql);
		System.out.println(instalmentApply.size());
		System.out.println(instalmentApply.toString());
		requestMap.put("instalmentApply", instalmentApply);
		requestMap.put("userid", userid);
		return "approval";
	}
	
	/**
	 * 审核操作
	 * 
	 */
	@Action(value="doUpdate", results={@Result(name="result", location="/result.jsp")})
	public String doUpdate(){
		/*IA.setIaApproverId(userid);
		System.out.println("userid="+userid);*/
		/*ActionContext ac = ActionContext.getContext();
		Map session = ac.getSession();
		session.get("userinfo");*/
		
		Userinfo ui = (Userinfo) sessionMap.get("userinfoLogin");
		System.out.println("ui.getuserid="+ui.getUserid());
		IA.setIaApproverId(ui.getUserid());
		
		IA.setIaStatus("已审核");
		System.out.println("IA.getIaId()"+IA.getIaId());
		try{
			instalmentApplyBizI.update(IA);
			message="提交成功";
		}catch(Exception e){
			message="提交失败";
		}
		requestMap.put("message", message);
		return "result";
	}
	

	@Override
	public TyInstalmentApply getModel() {
		
		return IA;
	}

}
