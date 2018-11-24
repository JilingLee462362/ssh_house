package com.ssh.house.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.opensymphony.xwork2.ModelDriven;
import com.ssh.house.appcomm.base.BaseAction;
import com.ssh.house.biz.StreetnumberBizI;
import com.ssh.house.biz.XiaoquBizI;
import com.ssh.house.entity.Streetnumber;
import com.ssh.house.entity.Xiaoqu;
@ParentPackage(value="json-default")
@Namespace(value="/streetnumber")
@Controller
public class StreetnumberAction extends BaseAction implements ModelDriven<Streetnumber> {

	Streetnumber s = new Streetnumber();
	private StreetnumberBizI streetnumberBizI;
	private XiaoquBizI	xiaoquBizI;
	String hql = "from Streetnumber";
	Integer  pageNum;
	Integer pageSize;
	
	
	
	
	@Resource(name="streetnumberBizI")
	public void setStreetnumberBizI(StreetnumberBizI streetnumberBizI) {
		this.streetnumberBizI = streetnumberBizI;
	}

	@Resource(name="xiaoquBizI")
	public void setXiaoquBizI(XiaoquBizI xiaoquBizI) {
		this.xiaoquBizI = xiaoquBizI;
	}


	
	
	
	
	@ResponseBody
	@Action(value="save", results = { @Result(type = "json", params = { "root", "SUCCESS" }) })
	public String save(){
		System.out.println("xiaoquid="+s.getXiaoqu().getId()+"--------------------id:"+s.getId());
		try {
			streetnumberBizI.save(s);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}

	}
	
	@ResponseBody
	@Action(value="update", results = { @Result(type = "json", params = { "root", "SUCCESS" }) })
	public String update(){
		System.out.println("xiaoquid="+s.getXiaoqu().getId()+"--------------------");
		try {
			streetnumberBizI.update(s);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}

	}
	
//	@Action(value="findUpdate", results = {@Result(name = "streetnumber_find", location = "/streetnumber_find.jsp")})
//	public String findUpdate(){
//		System.out.println("findUpdate--------------");
//		System.out.println(s.getXiaoqu().getId()+"-----------------------------"+s.getName());
//		List<Object> param = new ArrayList<Object>();
//		param.add(s.getName());
//		param.add(s.getXiaoqu().getId());
//		List<Streetnumber> StreetnumberList = streetnumberBizI.find("from Streetnumber where name=? and district_id=?", param);
//		requestMap.put("StreetnumberOne", StreetnumberList);
//		return "streetnumber_find";
//	}
	
	@Action(value="findOne", results = {@Result(name = "streetnumber_edit", location = "/streetnumber_edit.jsp")})
	public String findOne(){
		System.out.println("findone--------------");
		System.out.println(s.getId()+"-----------------------------");
		List<Streetnumber> StreetnumberList = streetnumberBizI.find("from Streetnumber where id="+s.getId());
		List<Xiaoqu> XiaoquList = xiaoquBizI.find("from Xiaoqu");
		requestMap.put("StreetnumberOne", StreetnumberList);
		requestMap.put("XiaoquList", XiaoquList);
		return "streetnumber_edit";
	}
	
	@Action(value="delete", results = {@Result(name = "streetnumber_list", location = "/streetnumber_list.jsp") , @Result(type = "json", params = { "root", "ERROR" })})
	public String delete(){
		System.out.println("id========="+s.getId());
		try {
			streetnumberBizI.delete(s);
			return this.find();
		} catch (Exception e) {
			return ERROR;
		}
		
	}
	
	@Action(value="find", results = {@Result(name = "streetnumber_list", location = "/streetnumber_list.jsp")})
	public String find() {
		
		System.out.println("findpage--------------");
		Object[] parm = null;
		List<Streetnumber> list = streetnumberBizI.find(hql, parm, pageNum, pageSize);
		for (Streetnumber streetnumber : list) {
			System.out.println(streetnumber.getId()+"-"+streetnumber.getName()+"-"+streetnumber.getXiaoqu().getName());
		}
		
		requestMap.put("StreetnumberList", list);
		if((pageNum != null) && (pageNum >1)) {
			requestMap.put("page", pageNum);
		}else {
			requestMap.put("page", 1);
		}
		
		return "streetnumber_list";
		
	}
	
	
	
	
	
	@Override
	public Streetnumber getModel() {
		// TODO Auto-generated method stub
		return s;
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
	
}
