package com.ssh.house.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.house.appcomm.base.BaseAction;
import com.ssh.house.biz.UserinfoBizI;
import com.ssh.house.entity.Userinfo;

@ParentPackage(value="struts-default")
@Namespace("/ui")
@Controller(value="userinfoAction")
public class UserinfoAction extends BaseAction implements ModelDriven<Userinfo> {
	Userinfo ui = new Userinfo(); // 参数可以直接传到后台
	UserinfoBizI userinfoBizI; //注入

	@Resource(name = "userinfoBizI")
	public void setUserinfoBizI(UserinfoBizI userinfoBizI) {
		this.userinfoBizI = userinfoBizI;
	}

	@Action(value = "loginout", results = { @Result(name = "login", location = "/login.jsp") })
	public String loginout() {
		System.out.println("loginout........................... ");
		sessionMap.remove("userinfoLogin");
		return "login";

	}
	
	
	// @Action(value = "loginout", results = { @Result(name = "login", location= "/login.jsp") })
	@Action(value = "login", results = { @Result(name = "admin", location= "/admin.jsp") })
	public String login() {
		System.out.println("  login()............................. ");
		Userinfo userinfoLogin = userinfoBizI.login(ui.getUsername(), ui.getUserpass());
		if (userinfoLogin == null) {

			return "login";
		} else {

			// httpSession.setAttribute("userinfoLogin", userinfoLogin);
			sessionMap.put("userinfoLogin", userinfoLogin);

			return "admin";

		}

	}

	@Override
	public Userinfo getModel() {

		return ui;
	}

}
