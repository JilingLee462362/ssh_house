package com.ssh.house.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.ssh.house.appcomm.base.BaseAction;
import com.ssh.house.biz.TyEmployeeBizI;
import com.ssh.house.entity.TyEmployee;



@ParentPackage(value="struts-default")
@Namespace(value="/tyemployee")
@Controller
public class TyEmployeeAction extends BaseAction implements  ModelDriven<TyEmployee>{
 

	TyEmployee te=new TyEmployee();
	private Integer pageNum = 1;
	private Integer pageSize = 10;
	
	private TyEmployeeBizI tyemployeeBizI;
	

	
	public TyEmployeeBizI getTyemployeeBizI() {
		return tyemployeeBizI;
	}

	@Resource(name="tyemployeeBizI")
	public void setTyemployeeBizI(TyEmployeeBizI tyemployeeBizI) {
		this.tyemployeeBizI = tyemployeeBizI;
	}





	@Action(value="find",results = { @Result(name = "tyemployeelist", location = "/tyemployeelist.jsp") })
	public String find(){
		String hql = "from TyEmployee";
		Object[] param = {};
		List<TyEmployee> tylist = tyemployeeBizI.find(hql,param, pageNum, pageSize);
		
		
		Long count = tyemployeeBizI.count(("select count(*) " + hql).toString());
		Integer page = (int) (count % this.pageSize==0 ? count/this.pageSize :count/this.pageSize+1);
		sessionMap.put("page", page);
		sessionMap.put("pageNum", pageNum);
		sessionMap.put("tylist", tylist);
		sessionMap.put("count", count);
		return "tyemployeelist";
	}
	
	
	@Action(value="edit",results = { @Result(name = "tyemployee_edit", location = "/tyemployee_edit.jsp") })
	public String edit(){
			TyEmployee ty = tyemployeeBizI.get(TyEmployee.class, te.getEmployeeid());
			sessionMap.put("ty", ty);
			return "tyemployee_edit";
	}
	
	@Action(value="update",results = { @Result(name = "tyemployee_edit", location = "/tyemployee_edit.jsp") })
	public String update(){
		/***
		 * 
		 */
		return "tyemployee_edit";
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

	@Override
	public TyEmployee getModel() {
		
		return te;
	}

}
