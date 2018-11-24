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
import com.ssh.house.biz.PersonBizI;
import com.ssh.house.entity.Person;



@ParentPackage(value="struts-default")
@Namespace(value="/person")
@Controller
public class PersonAction extends BaseAction implements ModelDriven<Person> {

	Person p = new Person();
	private PersonBizI personBizI;
	
	@Resource(name="personBizI")
	public void setPersonBizI(PersonBizI personBizI) {
		this.personBizI = personBizI;
	}


	@Action(value="find",results={@Result(name="person_list",location="/person_list.jsp")})
	public String find(){
		List<Person> PersonList = personBizI.find("from Person");
		requestMap.put("PersonList", PersonList);
		return "person_list";
		
	}
	
	
	@Override
	public Person getModel() {
		
		return p;
	}

}
