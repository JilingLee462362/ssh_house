package com.ssh.house.biz;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.appcomm.util.TimeUtil;
import com.ssh.house.entity.TyEmployee;
import com.ssh.house.entity.TyForumBack;
import com.ssh.house.entity.TyForumTitle;

public class TestTyForumBackBizImpl {

	TyForumBackBizI tyForumBackBizI = SpringUtils.getBean("tyForumBackBizI", TyForumBackBizI.class);
	String hql = "from TyForumBack";
	TyForumBack tyForumBack = new TyForumBack();
	TyEmployee tyEmployee = new TyEmployee();
	TyForumTitle tyForumTitle = new TyForumTitle();
	
	//@Test
	public void testUpdate() {
		System.out.println("update--------------");
//		TyForumBack.setFtId("20181105185814");
//		TyForumBack.setFtTitle("新北京路2");
//		TyForumBack.setForumContent("新北京路开通啦");
//		tyEmployee.setEmployeeid(1002);
//		TyForumBack.setTyEmployee(tyEmployee);
//
//		TyForumBackBizI.update(TyForumBack);
	}
	//@Test
	public void testDelete() {
		System.out.println("delete--------------");
		
		//先进行一次查询,查看该评论下是否有回复
		List<Object> param = new ArrayList<Object>();
		param.add("1");//添加待查询的id		
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
		tyForumBack.setCommentId("1");
//		System.out.println(tyForumBack.getReplyId()+"+"+tyForumBack.getCommentId());
		tyForumBackBizI.delete(tyForumBack);
	
	}
	//@Test
	public void testSave() {
		System.out.println("save--------------");
		String commentId = TimeUtil.gettimesString();
		System.out.println(commentId+"---------------------------------------");
		tyForumBack.setTyForumTitle(tyForumTitle);
		tyForumBack.setCommentId(commentId);
		tyForumBack.setCommentContent("瞎比比");
		
		tyForumTitle.setFtId("CS3");
		tyForumBack.setTyForumTitle(tyForumTitle);
		
		tyEmployee.setEmployeeid(1001);
		tyForumBack.setTyEmployee(tyEmployee);
		
		tyForumBack.setReplyId("2018110514350001");
		
		tyForumBackBizI.save(tyForumBack);
	}
	//@Test
	public void testFindAll() {
		System.out.println("findall--------------");
		List<TyForumBack> list = tyForumBackBizI.find(hql);
		for (TyForumBack tyForumBack : list) {
			System.out.println(tyForumBack.getCommentId());
			System.out.println(tyForumBack.getTyForumTitle().getFtId());
			System.out.println(tyForumBack.getCommentContent());
			System.out.println(tyForumBack.getTyEmployee().getEmployeeid());//获取用户ID
			System.out.println(tyForumBack.getReplyId());
			System.out.println("---------------------------------");
		}
	}
	
	//@Test
	public void testFindPage() {
		System.out.println("findpage--------------");
		Object[] parm = null;
		List<TyForumBack> list = tyForumBackBizI.find(hql, parm, 1, 2);
		for (TyForumBack tyForumBack : list) {
			System.out.println(tyForumBack.getCommentId());
			System.out.println(tyForumBack.getTyForumTitle().getFtId());
			System.out.println(tyForumBack.getCommentContent());
			System.out.println(tyForumBack.getTyEmployee().getEmployeeid());//获取用户ID
			System.out.println(tyForumBack.getReplyId());
			System.out.println("---------------------------------");
			
		}
	}
	//@Test
		public void testFindOne() {
			System.out.println("findall--------------");
			List<TyForumBack> list = tyForumBackBizI.find(hql);
			for (TyForumBack tyForumBack : list) {
				System.out.println(tyForumBack.getCommentId());
				System.out.println(tyForumBack.getTyForumTitle().getFtId());
				System.out.println(tyForumBack.getCommentContent());
				System.out.println(tyForumBack.getTyEmployee().getEmployeeid());//获取用户ID
				System.out.println(tyForumBack.getReplyId());
				System.out.println("---------------------------------");
			}
		}

}
