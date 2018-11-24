package com.ssh.house.appcomm.base;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.house.appcomm.util.Page;
@ParentPackage("struts-default") 
@Namespace("/")
@Results({
		@Result(name = com.opensymphony.xwork2.Action.SUCCESS, location = "/success.jsp"),
		@Result(name = com.opensymphony.xwork2.Action.ERROR, location = "/error.jsp"),
		@Result(name = "login", location = "/login.jsp"),
		@Result(name = "index", location = "/index.jsp"),
		@Result(name = "main", location = "/admin/main.jsp") })
// @ExceptionMappings  
@ExceptionMappings({ @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
@Controller
@Scope(value="prototype")
public class BaseAction extends ActionSupport implements RequestAware,
		SessionAware, ApplicationAware, ServletRequestAware,
		ServletContextAware {
	
	public BaseAction() {
		System.out.println("************** BaseAction()~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
	}
	//struts API
	public Map<String, Object> requestMap;
	public Map<String, Object> sessionMap;
	public Map<String, Object> applicationMap;
	
	//servlet API
	public HttpServletRequest httpRequest;
	public HttpSession httpSession;
	public ServletContext httpApplication;
	

	public BaseBizI  baseBiz;
	
	@Resource(name="baseBiz")
	public void setBaseBiz(BaseBizI baseBiz) {
		this.baseBiz = baseBiz;
	}


	public void setRequest(Map<String, Object> requestMap) {
		this.requestMap = requestMap;
	}

	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	public void setApplication(Map<String, Object> applicationMap) {
		this.applicationMap = applicationMap;
	}

	public void setServletRequest(HttpServletRequest httpRequest) {
		this.httpRequest = httpRequest;
		httpSession = httpRequest.getSession();
	}

	public void setServletContext(ServletContext httpApplication) {
		this.httpApplication = httpApplication;
	}

	
	

	
	
	

}
