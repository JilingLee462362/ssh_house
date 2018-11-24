package com.ssh.house.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.apache.struts2.jasper.tagplugins.jstl.core.Redirect;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import com.ssh.house.biz.TyCustomerPromiseBiz;
import com.ssh.house.biz.TyPactNoteBizI;
import com.ssh.house.entity.PageBean;
import com.ssh.house.entity.TyCustomerPromise;
import com.ssh.house.entity.TyPactNote;

/**
 * 合同签署记录表TyPactNote的action
 * 
 * @author Administrator
 *
 */
@Controller
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace("/")
public class TyPactNoteAction extends ActionSupport implements ModelDriven<TyPactNote> {

	// 模型驱动
	private TyPactNote tyPactNote = new TyPactNote();

	@Override
	public TyPactNote getModel() {
		// TODO Auto-generated method stub
		return tyPactNote;
	}

	// service的注入
	@Autowired
	private TyPactNoteBizI tpactNoteBizI;

	// 页面参数的注入
	private Integer currPage = 1;
	private Integer pageSize = 15;

	public void setCurrPage(Integer currPage) {
		if (currPage == null) {
			currPage = 1;
		}
		this.currPage = currPage;
	}

	public void setPageSize(Integer pageSize) {
		if (pageSize == null) {
			pageSize = 15;
		}
		this.pageSize = pageSize;
	}
	
	/**
	 * 条件带分页查询
	 * @return
	 */
	@SkipValidation
	@Action(value="TyPactNote_findByPage",results={@Result(name="findByPage",location="/tyPactNote_list.jsp")})
	public String findByPage(){		
		//离线查询对象
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(TyPactNote.class);
		//按客户查询
		if(tyPactNote.getPnCustomerId() != null && !"".equals(tyPactNote.getPnCustomerId())){
			
			detachedCriteria.add(Restrictions.eq("pnCustomerId", tyPactNote.getPnCustomerId()));
		}
		//按公司代表查询
		if(tyPactNote.getPnDeputy() != null && !"".equals(tyPactNote.getPnDeputy())){
			
			detachedCriteria.add(Restrictions.eq("pnDeputy", tyPactNote.getPnDeputy()));
		}
		
		
		PageBean<TyPactNote> pageBean = tpactNoteBizI.findByPage(detachedCriteria,currPage,pageSize);
		//把pageBean压入栈
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findByPage";
	}
	/**
	 * 信息保存
	 */
	
	@Action(value="TyPactNote_save",results={@Result(name="save",type="redirectAction",location="TyPactNote_findByPage.action"),
			@Result(name="input",location="/tyPactNote_add.jsp")})
	@Validations(requiredStrings={@RequiredStringValidator(fieldName="pnName",message="合同名称不能为空!"),
								@RequiredStringValidator(fieldName="pnDeputy",message="公司代表不能为空!")
																										})
	public String save(){
		
		tpactNoteBizI.save(tyPactNote);
		return "save";
	}
	/**
	 * 根据ID查询合同信息
	 */
	@SkipValidation
	@Action(value="TyPactNote_findById",results={@Result(name="findByid",location="/tyPactNote_edit.jsp")})
	public String finById(){
		tyPactNote = tpactNoteBizI.findById(tyPactNote.getPnId());//查询信息
		ActionContext.getContext().getValueStack().push(tyPactNote);
		return "findByid";//回显到编辑页
	}
	
	/**
	 * 合同记录删除
	 */
	@SkipValidation
	@Action(value="TyPactNote_delete",results={@Result(name="delete",type="redirectAction",location="TyPactNote_findByPage.action")})
	public String delete(){
		
		tyPactNote = tpactNoteBizI.findById(tyPactNote.getPnId());//查询信息
		System.out.println(tyPactNote.toString());
		tpactNoteBizI.delete(tyPactNote);//删除信息
		return "delete";
	}
	/**
	 * 合同信息更新
	 */
	@SkipValidation
	@Action(value="TyPactNote_update",results={@Result(name="update",type="redirectAction",location="TyPactNote_findByPage.action")})
	public String update(){
		
		tpactNoteBizI.update(tyPactNote);
		return "update";
	}

}
