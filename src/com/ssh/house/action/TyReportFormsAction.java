package com.ssh.house.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.ssh.house.appcomm.base.BaseAction;
import com.ssh.house.biz.TyReportFormsBizI;
import com.ssh.house.entity.Guanggao;
import com.ssh.house.entity.TyReportForms;
@ParentPackage(value="struts-default")
@Namespace("/t")
@Controller
public class TyReportFormsAction extends BaseAction implements ModelDriven<TyReportForms>{
	TyReportForms tyReportForms = new TyReportForms();
	Integer pageNum=1;//页码
	Integer pageSize=10;//页面大小
	String deleteString = null;//批量删除
	TyReportFormsBizI tyReportFormsBizI;
	
	public Integer getPageNum() {
		return pageNum;
	}


	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}




	public String getDeleteString() {
		return deleteString;
	}


	public void setDeleteString(String deleteString) {
		this.deleteString = deleteString;
	}
	
	
	
	
	@Resource(name="tyReportFormsBizI")
	public void setTyReportFormsBizI(TyReportFormsBizI tyReportFormsBizI) {
		this.tyReportFormsBizI = tyReportFormsBizI;
	}


	@Override
	public TyReportForms getModel() {
		// TODO Auto-generated method stub
		return tyReportForms;
	}
	
	List<Object> list = new ArrayList<Object>();
	
	/**
	 * 分页查询
	 * @return
	 */
	@Action(value="pageFind",results={@Result(name="tyReportForms",location="/tyreportforms_list.jsp")})
	public String pageFind(){
		System.out.println(pageNum);
		Integer m = Integer.valueOf(tyReportFormsBizI.count("select count(*) from TyReportForms").toString());
		Integer count = m%10 == 0?m/10:m/10+1;
		if (count != null) {
			if (pageNum <1) {
				pageNum =1;
			}
			if (pageNum > count ) {
				pageNum = count;
			}
			
			requestMap.put("count",count);
			requestMap.put("m",m);
			
		}
		
		
		
		List<TyReportForms> tyList = tyReportFormsBizI.find("from TyReportForms",list, pageNum, pageSize);
		requestMap.put("tyList",tyList);
		requestMap.put("pageNum",pageNum);
		return "tyReportForms";
	}
	
	@Action(value="delete",results={@Result(name="tyReportForms",location="/tyreportforms_list.jsp")})
	public String delete(){
		/**
		 * 批量删除
		 */
		if (deleteString != null) {
			System.out.println(deleteString);
			String[] strings = deleteString.split(",");
			for (int i = 0; i < strings.length; i++) {
				tyReportForms.setRfId(Integer.valueOf(strings[i]));
				tyReportFormsBizI.delete(tyReportForms);
			}
			
		} else {
			/**
			 * 删除单个数据
			 */
			System.out.println(tyReportForms.getRfId());
			tyReportFormsBizI.delete(tyReportForms);
		}
		return this.pageFind();
	}
	/**
	 * 更新或添加广告
	 * @return
	 */
	@Action(value="update",results={@Result(name="tyReportForms",location="/tyreportforms_list.jsp"),@Result(name="edit",location="/tyreportforms_edit.jsp")})
	public String update(){
		System.out.println(tyReportForms.getRfId());
		if (tyReportForms.getRfId()!=null) {
			/**
			 * 编辑广告
			 */
			if (tyReportForms.getRfName() == null) {
				
				TyReportForms tyReportForms2 = tyReportFormsBizI.get(TyReportForms.class,tyReportForms.getRfId());
				requestMap.put("tyReportForms2",tyReportForms2);
				return "edit";
			} else {
				tyReportFormsBizI.saveOrUpdate(tyReportForms);
				return this.pageFind();
			}
			
		}else {
			/**
			 * 添加广告
			 */
			
			tyReportFormsBizI.saveOrUpdate(tyReportForms);
			return this.pageFind();
		}
		
		
	}
	
	

}
