package com.ssh.house.action;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.house.appcomm.base.BaseAction;
import com.ssh.house.appcomm.util.TimeUtil;
import com.ssh.house.biz.TyForumBackBizI;
import com.ssh.house.biz.TyForumTitleBizI;
import com.ssh.house.entity.TyEmployee;
import com.ssh.house.entity.TyForumBack;
import com.ssh.house.entity.TyForumTitle;

@ParentPackage(value="json-default")
@Namespace(value="/tyforumback")
@Controller
public class TyForumBackAction extends BaseAction implements ModelDriven<TyForumBack> {
	TyForumBack tfb = new TyForumBack();
	TyForumTitle tft = new TyForumTitle();
	TyEmployee te = new TyEmployee();
	private TyForumBackBizI tyForumBackBizI;
	private TyForumTitleBizI tyForumTitleBizI;
	private List<TyForumBack> list;
	
	@Resource(name="tyForumBackBizI")
	public void setTyForumBackBizI(TyForumBackBizI tyForumBackBizI) {
		this.tyForumBackBizI = tyForumBackBizI;
	}
	@Resource(name="tyForumTitleBizI")
	public void setTyForumTitleBizI(TyForumTitleBizI tyForumTitleBizI) {
		this.tyForumTitleBizI = tyForumTitleBizI;
	}
	
	
	@ResponseBody
	@Action(value="save",results = { @Result(type = "json", params = { "root", "SUCCESS" }) })
	public String save() {
		System.out.println("save--------------");
		String commentId = TimeUtil.gettimesString();
		System.out.println(commentId+"---------------------------------------");	
		tfb.setCommentId(commentId);
		tft.getFtId();System.out.println("tft.getFtId()"+tft.getFtId());
		tfb.setTyForumTitle(tft);
		
		te.getEmployeeid();System.out.println("te.getEmployeeid()"+te.getEmployeeid());
		tfb.setTyEmployee(te);
		
		tfb.getReplyId();System.out.println("tfb.getReplyId()"+tfb.getReplyId());
				
		try {
			tyForumBackBizI.save(tfb);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
			
	}
	
	
	
	@ResponseBody
	@Action(value="delete",results = { @Result(type = "json", params = { "root", "SUCCESS" }) })
	public String delete() {
		//获取表单数据
		System.out.println("delete--------------tfb.getCommentId()"+tfb.getCommentId());
		//先进行一次查询,查看该评论下是否有回复
				List<Object> param = new ArrayList<Object>();
				param.add(tfb.getCommentId());//添加待查询的id		
				List<TyForumBack> list = tyForumBackBizI.find("from TyForumBack where replyId=?", param);
				if(list.size() > 0) {
					System.out.println("该评论下有回复"+list.size());
					for (TyForumBack tyForumBack : list) {
						System.out.println(tyForumBack.getCommentId());
					}
					//先删除该评论下的回复
					tyForumBackBizI.deleteAll(list);
				
				}else {
					System.out.println("该评论下无回复"+list.size());
				}
				
				//再删除该评论
				tfb.setCommentId(tfb.getCommentId());
				System.out.println(tfb.getReplyId()+"+"+tfb.getCommentId());
				try {
					tyForumBackBizI.delete(tfb);
					return SUCCESS;
				} catch (Exception e) {
					return ERROR;
				}
				
	}
	
	
	@Action(value="find", results = {@Result(name = "tyforumback_list", location = "/tyforumback_list.jsp")})
	public String find() {
		System.out.println("findall--------------tft.getFtId()"+tft.getFtId());
		List<Object> param = new ArrayList<Object>();
		param.add(tft.getFtId());
		
		list = tyForumBackBizI.find("from TyForumBack as b where b.tyForumTitle.ftId=?", param);
		for (TyForumBack tyForumBack : list) {
			System.out.println(tyForumBack.getCommentId());
			System.out.println(tyForumBack.getTyForumTitle().getFtId());
			System.out.println(tyForumBack.getCommentContent());
			System.out.println(tyForumBack.getTyEmployee().getEmployeeid());//获取用户ID
			System.out.println(tyForumBack.getReplyId());
			System.out.println("---------------------------------");
		}
		
		requestMap.put("TyForumBackList", list);//评论回复
		requestMap.put("TyForumBackId", tft.getFtId());
		return "tyforumback_list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public TyForumBack getModel() {
		// TODO Auto-generated method stub
		return tfb;
	}
	

	
	public List<TyForumBack> getList() {
		return list;
	}
	
	public TyForumTitle getTft() {
		return tft;
	}
	public void setTft(TyForumTitle tft) {
		this.tft = tft;
	}
	
	public TyEmployee getTe() {
		return te;
	}
	public void setTe(TyEmployee te) {
		this.te = te;
	}
	
	

}
