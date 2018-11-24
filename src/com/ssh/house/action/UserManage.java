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

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.house.biz.UserinfoBizI;
import com.ssh.house.entity.PageBean;
import com.ssh.house.entity.Userinfo;

/**
 * 用户管理
 * @author Administrator
 *
 */
@Controller
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace("/")
public class UserManage extends ActionSupport implements ModelDriven<Userinfo>{
	
	//模型驱动
	private Userinfo userinfo = new Userinfo();
	@Override
	public Userinfo getModel() {
		// TODO Auto-generated method stub
		return userinfo;
	}
	
	//userinfoBiz注入
	@Resource(name = "userinfoBizI")
	UserinfoBizI userinfoBizI;
	
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



	/**
	 * 用户查询
	 * 
	 */
	@Action(value="userManage_find", results={@Result(name = "find", location= "/userManage.jsp") })
	public String find(){
		
		//页面参数设置
		List<Object> param = new ArrayList<Object>();
		String hql = "from Userinfo";
		List<Userinfo> list = userinfoBizI.find(hql, param, currPage, pageSize);//分页带条件查询用户数量
		Long count = userinfoBizI.count("select count(*) from Userinfo");//查询总的用户数量
		Double countD = count.doubleValue();
		Double totalPageD = Math.ceil(countD/pageSize);
		
		//将参数返回页面
		PageBean<Userinfo> pageBean = new PageBean<Userinfo>();
		pageBean.setCurrPage(currPage);//当前页
		pageBean.setPageSize(pageSize);//每页显示数量
		pageBean.setList(list);//用户数据
		pageBean.setTotalCount(count.intValue());//总用户数量
		pageBean.setTotalPage(totalPageD.intValue());//总的页数
		
		ActionContext.getContext().getValueStack().push(pageBean);//把参数放回页面
		return "find";
	}
	/**
	 * 用户的删除
	 * 
	 */
	@Action(value="userManage_delete", results={@Result(name = "delete",type="redirectAction", location= "userManage_find.action") })
	public String delete(){
		
		//查询用户
		userinfo = userinfoBizI.get(Userinfo.class, userinfo.getUserid());
		//删除用户
		userinfoBizI.delete(userinfo);
		return "delete";
	}
	/**
	 *用户数据查询返回编辑页
	 */
	@Action(value="userManage_edit",results={@Result(name="edit",location="/userEdit.jsp")})
	public String findByID(){
		
		//查询用户
		userinfo = userinfoBizI.get(Userinfo.class, userinfo.getUserid());	
		return "edit";
	}
	/**
	 * 用户数据更新
	 */
	@Action(value="userManage_update", results={@Result(name = "update",type="redirectAction", location= "userManage_find.action") })
	public String update(){
		
		userinfoBizI.update(userinfo);
		return "update";
	}
	/**
	 * 用户添加
	 */
	@Action(value="userManage_save", results={@Result(name = "save",type="redirectAction", location= "userManage_find.action") })
	public String save(){
		
		userinfoBizI.save(userinfo);
		return "save";
	}
	
}
