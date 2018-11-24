package com.ssh.house.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.ssh.house.appcomm.base.BaseAction;
import com.ssh.house.biz.TyCustomerBackBizI;
import com.ssh.house.entity.TyCustomerBack;

@ParentPackage(value="struts-default")
@Namespace(value="/tycustomerback")
@Controller
public class TyCustomerBackAction extends BaseAction implements ModelDriven<TyCustomerBack> {

	TyCustomerBack ty = new TyCustomerBack();
	
	TyCustomerBackBizI tycustomerbackBizI;
	@Resource(name="tycustomerbackBizI")
	public void setTycustomerbackBizI(TyCustomerBackBizI tycustomerbackBizI) {
		this.tycustomerbackBizI = tycustomerbackBizI;
	}
	public TyCustomerBackBizI getTycustomerbackBizI() {
		return tycustomerbackBizI;
	}
	
	@Action(value = "login", results = { @Result(name = "index", location= "/index.jsp") })
	public String loginin(){
		System.out.println("===========login==============");
		TyCustomerBack tyCustomerBack = tycustomerbackBizI.loginin(ty.getCusname(), ty.getCuspwd());
		if(tyCustomerBack != null){
			sessionMap.put("tyCustomerBack", tyCustomerBack);
			return "index";
		}else{
			return "customerlogin";
		}
	}
	
	@Action(value = "loginout", results = { @Result(name = "customerlogin", location= "/customerlogin.jsp") })
	public String logininout(){
		System.out.println("===========88888888888==============");
		sessionMap.remove("tyCustomerBack");
		return "customerlogin";
	}
	
	
	
	
	
	
	
	
	






















	@Override
	public TyCustomerBack getModel() {
		// TODO Auto-generated method stub
		return ty;
	}

}
