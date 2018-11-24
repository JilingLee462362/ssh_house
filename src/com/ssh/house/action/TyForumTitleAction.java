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
import com.ssh.house.appcomm.util.TimeUtil;
import com.ssh.house.biz.TyForumBackBizI;
import com.ssh.house.biz.TyForumTitleBizI;
import com.ssh.house.entity.TyEmployee;
import com.ssh.house.entity.TyForumBack;
import com.ssh.house.entity.TyForumTitle;


@ParentPackage(value="json-default")
@Namespace(value="/tyforumtitle")
@Controller
public class TyForumTitleAction extends BaseAction implements ModelDriven<TyForumTitle> {
	TyForumTitle tft = new TyForumTitle();
	TyEmployee te = new TyEmployee();
	private TyForumTitleBizI tyForumTitleBizI;
	private TyForumBackBizI tyForumBackBizI;
	private List<TyForumTitle> list;
	
	
	
	@Resource(name="tyForumTitleBizI")
	public void setTyForumTitleBizI(TyForumTitleBizI tyForumTitleBizI) {
		this.tyForumTitleBizI = tyForumTitleBizI;
	}
	@Resource(name="tyForumBackBizI")
	public void setTyForumBackBizI(TyForumBackBizI tyForumBackBizI) {
		this.tyForumBackBizI = tyForumBackBizI;
	}
	
	
	@ResponseBody
	@Action(value="update", results = { @Result(type = "json", params = { "root", "SUCCESS" }) })
	public String update(){
		System.out.println("update--------------tft.getFtId()"+tft.getFtId());
		te.getEmployeeid();
		System.out.println("te.getEmployeeid();"+te.getEmployeeid());
		//得手动将userid写入
		tft.setTyEmployee(te);

		try {
			tyForumTitleBizI.update(tft);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}

	}
	
	@ResponseBody
	@Action(value="findOne", results = {@Result(name = "tyforumtitle_edit", location = "/tyforumtitle_edit.jsp")})
	public String findOne() {
		System.out.println("findOne--------------tft.getFtId()"+tft.getFtId());
		List<Object> param = new ArrayList<Object>();
		param.add(tft.getFtId());//添加回复表 待查询的ft_id	
		list = tyForumTitleBizI.find("from TyForumTitle where ftId=?",param);
		for (TyForumTitle tyForumTitle : list) {
			System.out.println(tyForumTitle.getFtId()+"-"+tyForumTitle.getFtTitle());
			System.out.println(tyForumTitle.getForumContent());
			System.out.println(tyForumTitle.getTyEmployee().getEmployeeid());//获取用户ID
			System.out.println("---------------------------------");
		}
		requestMap.put("TyForumTitleList", list);
		return "tyforumtitle_edit";
	}
	
	
	@ResponseBody
	@Action(value="delete",results = { @Result(type = "json", params = { "root", "SUCCESS" }) })
	public String delete() {
		//获取表单数据
		System.out.println("delete--------------tft.getFtId()"+tft.getFtId());
		//先查询该帖子下的评论及回复
		List<Object> param = new ArrayList<Object>();
		param.add(tft.getFtId());//添加回复表 待查询的ft_id		
		List<TyForumBack> listBack = tyForumBackBizI.find("from TyForumBack as b where b.tyForumTitle.ftId=?", param);
		if(listBack.size() > 0) {
			System.out.println("该帖子下有评论"+listBack.size());
			for (TyForumBack tyForumBack : listBack) {
				System.out.println(tyForumBack.getCommentId());
			}
			//先删除该帖子下的评论
			tyForumBackBizI.deleteAll(listBack);
		}else {
			System.out.println("该帖子下无评论"+listBack.size());
		}
		
		try {
			tyForumTitleBizI.delete(tft);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}	
	}
	
	@ResponseBody
	@Action(value="save",results = { @Result(type = "json", params = { "root", "SUCCESS" }) })
	public String save() {
		String ftId = TimeUtil.gettimesString();//根据时间生成id
		tft.setFtId(ftId);
		//获取表单数据
		tft.getFtTitle();
		tft.getForumContent();
		te.getEmployeeid();
		tft.setTyEmployee(te);
		try {
			tyForumTitleBizI.save(tft);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
			
	}
	
	
	@Action(value="find", results = {@Result(name = "tyforumtitle_list", location = "/tyforumtitle_list.jsp")})
	public String find() {
		System.out.println("findall--------------");
		list = tyForumTitleBizI.find("from TyForumTitle");
		for (TyForumTitle tyForumTitle : list) {
			System.out.println(tyForumTitle.getFtId()+"-"+tyForumTitle.getFtTitle());
			System.out.println(tyForumTitle.getForumContent());
			System.out.println(tyForumTitle.getTyEmployee().getEmployeeid());//获取用户ID
			System.out.println("---------------------------------");
		}
		requestMap.put("TyForumTitleList", list);
		return "tyforumtitle_list";
	}
	
	
	@Override
	public TyForumTitle getModel() {
		// TODO Auto-generated method stub
		return tft;
	}



	public List<TyForumTitle> getList() {
		return list;
	}



	public TyEmployee getTe() {
		return te;
	}



	public void setTe(TyEmployee te) {
		this.te = te;
	}
	
	
	
}
