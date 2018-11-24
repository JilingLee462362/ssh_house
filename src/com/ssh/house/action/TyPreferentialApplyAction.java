package com.ssh.house.action;


import java.util.ArrayList;

import java.util.List;


import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.ssh.house.appcomm.base.BaseAction;
import com.ssh.house.biz.HouseBizI;

import com.ssh.house.biz.TyPreferentialApplyBizI;
import com.ssh.house.entity.House;
import com.ssh.house.entity.TyPreferentialApply;

@ParentPackage(value="struts-default")
@Namespace(value="/tyPreferentialApply")
@Controller
@Scope(value="prototype")
public class TyPreferentialApplyAction extends BaseAction implements ModelDriven<TyPreferentialApply> {

	TyPreferentialApply TY = new TyPreferentialApply();
	
	private TyPreferentialApplyBizI TyPreferentialApplyBizI;
	private HouseBizI houseBizI;
	private Integer pageNo = 1;
	private Integer pageSize = 5;

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		
	}
	
	
	public TyPreferentialApply getTY() {
		return TY;
	}

	public void setTy(TyPreferentialApply tY) {
		TY = tY;
	}

	@Resource(name="tyPreferentialApplyBizI")
	public void setTyPreferentialApplyBizI(TyPreferentialApplyBizI TyPreferentialApplyBizI) {
		this.TyPreferentialApplyBizI = TyPreferentialApplyBizI;
	}
	@Resource(name="houseBizI")
	public void setHouseBizI(HouseBizI houseBizI) {
		this.houseBizI = houseBizI;
	}


	@Action(value = "find", results={@Result(name="TyPreferentialApply_list", location = "/tyPreferentialApply_list.jsp")})
	public String find(){
		StringBuffer hql = new StringBuffer(" from TyPreferentialApply ");	
		//总条数
		Integer totalCount = Integer.valueOf(TyPreferentialApplyBizI.count("select count(*) "+hql.toString()).toString());
		//总分页数
		Integer pageCount = totalCount % this.pageSize == 0 ? totalCount/ this.pageSize : totalCount / this.pageSize + 1;	
		if (pageNo<1) {
			pageNo=1;
		}
		if (pageNo>pageCount) {
			pageNo=pageCount;
		}
				
		List<TyPreferentialApply> pList = TyPreferentialApplyBizI.find(hql.toString(), new ArrayList(), pageNo, pageSize);
			
		requestMap.put("pList", pList);
		requestMap.put("pageNo", pageNo);
		requestMap.put("totalCount", totalCount);
		requestMap.put("pageCount", pageCount);
		return "TyPreferentialApply_list";
		
	}
	//优惠申请表
	@Action(value = "toSavetyPreferentialApply", results={@Result(name="TyPreferentialApply_add", location = "/tyPreferentialApply_add.jsp")})
	public String toSavetyPreferentialApply(){
		List<House> hList = houseBizI.find("from House");
		requestMap.put("hList", hList);
		return "TyPreferentialApply_add";
		
	}
	
	//保存申请表
	@Action(value = "saveApply", results={@Result(name="save_e", location = "/save_e.jsp"),@Result(name="save_s", location = "/save_s.jsp")})
	public String saveApply() {
		if(TY.getPaDate()!=null) {			 
			
			TyPreferentialApplyBizI.save(TY);
			
			
			return "save_s";
		}
		
		
		
		return "save_e";
	}
	
	
	
	
	
	
	
	//删除
	@Action(value = "del",results= {@Result(name="del_s", location = "/del_s.jsp"),@Result(name="del_e", location = "/del_e.jsp")})
	public String del(){	
		if(TY.getPaApplyid()!=null) {
			System.out.println(TY.getPaApplyid());
		TyPreferentialApplyBizI.delete(TY);		
		return "del_s";		
		}
		return "del_e";
	}


	@Override
	public TyPreferentialApply getModel() {
		
		return TY;
	}

}
