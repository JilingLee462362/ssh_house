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
import com.ssh.house.biz.TyDealNoteBizI;
import com.ssh.house.entity.TyDealNote;

/**
 * 交易记录
 * 
 *
 */
@Controller
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace("/deal")
public class TyDealNoteAction extends BaseAction implements ModelDriven<TyDealNote> {

	private TyDealNote dealNote = new TyDealNote();
	private Integer pageNum = 1;
	private Integer pageSize = 2;
	private Integer query;
	private Integer queryId;

	public Integer getQuery() {
		return query;
	}

	public void setQuery(Integer query) {
		this.query = query;
	}

	public Integer getQueryId() {
		return queryId;
	}

	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}

	@Override
	public String toString() {
		return "TyDealNoteAction [pageNum=" + pageNum + ", pageSize=" + pageSize + "]";
	}

	private TyDealNoteBizI tyDealNoteBizI;

	public TyDealNote getDealNote() {
		return dealNote;
	}

	public void setDealNote(TyDealNote dealNote) {
		this.dealNote = dealNote;
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

	@Resource(name = "tyDealNoteBizI")
	public void setTyDealNoteBizI(TyDealNoteBizI tyDealNoteBizI) {
		this.tyDealNoteBizI = tyDealNoteBizI;
	}

	@Override
	public TyDealNote getModel() {
		return dealNote;
	}

	@Action(value = "find", results = { @Result(name = "dealnote", location = "/dealnote_list.jsp") })
	public String find() {

		StringBuffer hql = new StringBuffer(" from TyDealNote t ");
		
		
		if(queryId != null && !"".equals(queryId) && queryId != 3 && query != null){
			hql.append(" where 1 = 1 ");
			if(query.equals(1)){
				dealNote.setDnId(queryId);
				hql.append(" and t.dnId = " + queryId);
			}else if(query.equals(2)){
				dealNote.setDnCustomerId(queryId);
				hql.append(" and t.dnCustomerId = " + queryId);
			}else if(query.equals(3)){
				dealNote.setEmployeeid(queryId);
				hql.append(" and t.employeeid = " + queryId);
			}
			
		}else{
			query = 0;
		}
		// 总条数
		Integer totalCount = Integer.valueOf(tyDealNoteBizI.count("select count(*) " + hql.toString()).toString());
		// 总分页数
		Integer pageCount = totalCount % this.pageSize == 0 ? totalCount / this.pageSize
				: totalCount / this.pageSize + 1;
		
		
		if(pageNum > pageCount){
			pageNum = pageCount;
		}else if(pageNum <= 0){
			pageNum = 1;
		}

		List<TyDealNote> deals = tyDealNoteBizI.find(hql.toString(), new ArrayList(), pageNum, pageSize);
		System.out.println(deals.size());

		System.out.println("pageNum =" + pageNum);
		requestMap.put("deals", deals);
		
		requestMap.put("pageNum", pageNum);
		requestMap.put("totalCount", totalCount);
		requestMap.put("pageCount", pageCount);
		
		return "dealnote";
	}

}
