package com.ssh.house.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.house.biz.HouseBizI;
import com.ssh.house.biz.TyCustomerPromiseBiz;
import com.ssh.house.entity.House;
import com.ssh.house.entity.PageBean;
import com.ssh.house.entity.TyCustomerPromise;

import net.sf.json.JSONArray;

/**
 * 签约action类
 * @author Administrator
 *
 */
@Controller
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace("/")
public class TyCustomerPromiseAction extends ActionSupport implements ModelDriven<TyCustomerPromise>{
	
	//模型驱动类
	private TyCustomerPromise  tyCustomerPromise = new TyCustomerPromise();
	@Override
	public TyCustomerPromise getModel() {
		// TODO Auto-generated method stub
		return tyCustomerPromise;
	}
	//service的注入
	@Autowired
	private TyCustomerPromiseBiz tyCustomerPromiseBiz;
	
	//页面参数的注入
		private Integer currPage = 1;
		private Integer pageSize = 15;
		
		public void setCurrPage(Integer currPage) {
			if(currPage == null){
				currPage = 1;
			}
			this.currPage = currPage;
		}

		public void setPageSize(Integer pageSize) {
			if(pageSize == null){
				 pageSize = 15;
			}
			this.pageSize = pageSize;
		}
		
		
		//houseBiz注入
		@Autowired
		private HouseBizI houseBizI;
		
	
	/**
	 * 条件带分页查询
	 * @return
	 */
	@Action(value="TyCPromise_findByPage",results={@Result(name="findByPage",location="/tyCustomerPromise_list.jsp")})
	public String findByPage(){
		
		//离线查询对象
		//按房屋编号查询
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(TyCustomerPromise.class);
		if(tyCustomerPromise.getHouse() != null){
			if(tyCustomerPromise.getHouse().getId() != null && !"".equals(tyCustomerPromise.getHouse().getId())){
				detachedCriteria.add(Restrictions.eq("house.id", tyCustomerPromise.getHouse().getId()));
			}
			
		}
		//是否签合同
		if(tyCustomerPromise.getCpAlreadyPromise() != null && !"".equals(tyCustomerPromise.getCpAlreadyPromise())){
			detachedCriteria.add(Restrictions.eq("cpAlreadyPromise",tyCustomerPromise.getCpAlreadyPromise()));
		}
		//是否缴纳金额
		
		if(tyCustomerPromise.getCpWhether() != null && !"".equals(tyCustomerPromise.getCpWhether())){
			
			detachedCriteria.add(Restrictions.eq("cpWhether", tyCustomerPromise.getCpWhether()));
		}

		
		
		PageBean<TyCustomerPromise> pageBean = tyCustomerPromiseBiz.findByPage(detachedCriteria,currPage,pageSize);
		//把pageBean压入栈
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findByPage";
	}
	
	/**
	 * 根据ID客户查询
	 */
	@Action(value="TyCPromise_findById",results={@Result(name="findById",location="/tyCustomerPromise_edit.jsp")})
	public String findById(){
		
		tyCustomerPromise = tyCustomerPromiseBiz.findById(tyCustomerPromise.getCpId());
		ActionContext.getContext().getValueStack().push(tyCustomerPromise);
		return "findById";
	}
	/**
	 * 客户信息更新
	 */
	@Action(value="TyCPromise_update",results={@Result(name="update",type="redirectAction",location="TyCPromise_findByPage.action")})
	public String update(){
		
		tyCustomerPromiseBiz.update(tyCustomerPromise);
		return "update";
	}
	/**
	 * 客户信息保存
	 */
	@Action(value="TyCPromise_save",results={@Result(name="save",type="redirectAction",location="TyCPromise_findByPage.action")})
	public String save(){
		
		tyCustomerPromiseBiz.save(tyCustomerPromise);
		return "save";
	}
	/**
	 * 客户信息删除
	 */
	@Action(value="TyCPromise_delete",results={@Result(name="delete",type="redirectAction",location="TyCPromise_findByPage.action")})
	public String delete(){
		//先查询再删除
		tyCustomerPromise = tyCustomerPromiseBiz.findById(tyCustomerPromise.getCpId());
		tyCustomerPromiseBiz.delete(tyCustomerPromise);
		return "delete";
	}
	
	
	
	
	/**
	 * 查询房子回显
	 */
	@Action(value="fingByhouse")
	public String fingByhouse(){
		//查询用户为空的房子
		List<House> houses = houseBizI.find("from House where  userinfo IS NULL ");
		
		//重新封装到新的list中
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < houses.size(); i++) {
			list.add(houses.get(i).getId().toString());
		}
		
		//转为json
		JSONArray jsonArray = JSONArray.fromObject(list);
		//写到页面
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		try {
			response.getWriter().println(jsonArray);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return NONE;
		
	}
	
}
