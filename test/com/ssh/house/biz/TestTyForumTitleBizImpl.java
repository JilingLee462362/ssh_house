package com.ssh.house.biz;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.appcomm.base.BaseAction;
import com.ssh.house.appcomm.util.TimeUtil;
import com.ssh.house.entity.TyEmployee;
import com.ssh.house.entity.TyForumBack;
import com.ssh.house.entity.TyForumTitle;
import com.ssh.house.entity.Xiaoqu;

public class TestTyForumTitleBizImpl extends BaseAction{
	TyForumTitleBizI tyForumTitleBizI = SpringUtils.getBean("tyForumTitleBizI", TyForumTitleBizI.class);
	TyForumBackBizI tyForumBackBizI = SpringUtils.getBean("tyForumBackBizI", TyForumBackBizI.class);
	
	String hql = "from TyForumTitle";
	TyForumTitle tyForumTitle = new TyForumTitle();
	TyEmployee tyEmployee = new TyEmployee();
	TyForumBack tyForumBack = new TyForumBack();
	
	//@Test
	public void testUpdate() {
		System.out.println("update--------------");
		tyForumTitle.setFtId("20181105185814");
		tyForumTitle.setFtTitle("新北京路2");
		tyForumTitle.setForumContent("新北京路开通啦");
		tyEmployee.setEmployeeid(1002);
		tyForumTitle.setTyEmployee(tyEmployee);

		tyForumTitleBizI.update(tyForumTitle);
	}
	@Test
	public void testDelete() {
		System.out.println("delete--------------");
		//先查询该帖子下的评论及回复
		List<Object> param = new ArrayList<Object>();
		param.add("20181105185814");//添加回复表 待查询的ft_id		
		List<TyForumBack> list = tyForumBackBizI.find("from TyForumBack as b where b.tyForumTitle.ftId=?", param);
		if(list.size() > 0) {
			System.out.println("该帖子下有评论"+list.size());
			for (TyForumBack tyForumBack : list) {
				System.out.println(tyForumBack.getCommentId());
			}
			//先删除该帖子下的评论
			tyForumBackBizI.deleteAll(list);
		}else {
			System.out.println("该帖子下无评论"+list.size());
		}
		
		tyForumTitle.setFtId("20181105185814");
		tyForumTitleBizI.delete(tyForumTitle);
	}
	//@Test
	public void testSave() {
		System.out.println("save--------------");
		String ftId = TimeUtil.gettimesString();
		System.out.println(ftId+"---------------------------------------");
		tyForumTitle.setFtId(ftId);
		tyForumTitle.setFtTitle("北京路标题2");
		tyForumTitle.setForumContent("随便说说2");
		
		tyEmployee.setEmployeeid(1001);
		tyForumTitle.setTyEmployee(tyEmployee);

		tyForumTitleBizI.save(tyForumTitle);
	}
	//@Test
	public void testFindAll() {
		System.out.println("findall--------------");
		List<TyForumTitle> list = tyForumTitleBizI.find(hql);
		for (TyForumTitle tyForumTitle : list) {
			System.out.println(tyForumTitle.getFtId()+"-"+tyForumTitle.getFtTitle());
			System.out.println(tyForumTitle.getForumContent());
			System.out.println(tyForumTitle.getTyEmployee().getEmployeeid());//获取用户ID
			System.out.println("---------------------------------");
		}
	}
	
	//@Test
	public void testFindPage() {
		System.out.println("findpage--------------");
		Object[] parm = null;
		List<TyForumTitle> list = tyForumTitleBizI.find(hql, parm, 1, 2);
		for (TyForumTitle tyForumTitle : list) {
			System.out.println(tyForumTitle.getFtId()+"-"+tyForumTitle.getFtTitle());
			System.out.println(tyForumTitle.getForumContent());
			System.out.println(tyForumTitle.getTyEmployee().getEmployeeid());
			System.out.println();
			System.out.println("---------------------------------");
			
		}
	}
	
}
