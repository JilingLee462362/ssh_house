package com.ssh.house.biz;


import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.ssh.house.appcomm.HibernateSessionFactory;
import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.appcomm.base.BaseAction;
import com.ssh.house.entity.Streetnumber;
import com.ssh.house.entity.Xiaoqu;


public class TestStreetnumberBizImpl extends BaseAction{
	StreetnumberBizI streetnumberBizI = SpringUtils.getBean("streetnumberBizI", StreetnumberBizI.class);
	String hql = "from Streetnumber";
	Streetnumber streetnumber = new Streetnumber();
	
	@Test
	public void testUpdate() {
		System.out.println("update--------------");
		streetnumber.setId(1);
		streetnumber.setName("新北京路");
		Xiaoqu xiaoqu = new Xiaoqu();
		xiaoqu.setId(3);
		streetnumber.setXiaoqu(xiaoqu);
		streetnumberBizI.update(streetnumber);
	}
	//@Test
	public void testDelete() {
		System.out.println("delete--------------");
		streetnumber.setId(61);
		streetnumberBizI.delete(streetnumber);
	}
	//@Test
	public void testSave() {
		System.out.println("save--------------");
		streetnumber.setName("北京路");
		Xiaoqu xiaoqu = new Xiaoqu();
		xiaoqu.setId(1);
		streetnumber.setXiaoqu(xiaoqu);
		streetnumberBizI.save(streetnumber);
	}
	//@Test
	public void testFindAll() {
		System.out.println("findall--------------");
		List<Streetnumber> list = streetnumberBizI.find(hql);
		for (Streetnumber streetnumber : list) {
			System.out.println(streetnumber.getId()+"-"+streetnumber.getName());
		}
	}
	
	//@Test
	public void testFindPage() {
		System.out.println("findpage--------------");
		Object[] parm = null;
		List<Streetnumber> list = streetnumberBizI.find(hql, parm, 1, 5);
		for (Streetnumber streetnumber : list) {
			System.out.println(streetnumber.getId()+"-"+streetnumber.getName());
		}
	}
	

}
