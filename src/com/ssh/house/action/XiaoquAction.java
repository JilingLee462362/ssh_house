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
import com.ssh.house.biz.XiaoquBizI;
import com.ssh.house.entity.Xiaoqu;

@ParentPackage(value="struts-default")
@Namespace(value="/xiaoqu")
@Controller
public class XiaoquAction extends BaseAction implements ModelDriven<Xiaoqu> {

	Xiaoqu x = new Xiaoqu();
	
	private XiaoquBizI xiaoquBizI;
	
	
	


	//	@Action(value="save",results = { @Result(name = "", location = "") })
	public String save(){
		xiaoquBizI.save(x);
		return "";
	}
	
	public XiaoquBizI getXiaoquBizI() {
		return xiaoquBizI;
	}

	@Resource(name="xiaoquBizI")
	public void setXiaoquBizI(XiaoquBizI xiaoquBizI) {
		this.xiaoquBizI = xiaoquBizI;
	}

		@Action(value="delX")
	public String delX(){
			System.out.println(x.getId()+"-------------------------------------");
		xiaoquBizI.delete(x);
		return this.find();
	}
	
	@Action(value="update")
	public void update(){
		System.out.println(x.getId());
	}
	
	@Action(value="find",results = { @Result(name = "xiaoqu_list", location = "/xiaoqu_list.jsp") })
	public String find(){
		
		String hql = "from Xiaoqu";
		List<Xiaoqu> xiaoqulist = xiaoquBizI.find(hql);

		System.out.println(xiaoqulist.size());
		Integer count  = Integer.valueOf(xiaoquBizI.count("select count(*) "+hql).toString());
		requestMap.put("xiaoqulist", xiaoqulist);
		requestMap.put("count", count);
		return "xiaoqu_list";
	}
	
	@Override
	public Xiaoqu getModel() {
		// TODO Auto-generated method stub
		return x;
	}

	
	
}
