package com.ssh.house.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.dao.UserinfoDaoI;
import com.ssh.house.entity.House;
import com.ssh.house.entity.Userinfo;

public class TestUserinfoDaoImpl {

	UserinfoDaoI  userinfoDaoI=SpringUtils.getBean("userinfoDaoI", UserinfoDaoI.class);
	HouseDaoI houseDaoI = SpringUtils.getBean("houseDaoI", HouseDaoI.class);
	
	@Test
	public void testFindString() {
		
		List<Userinfo> list = userinfoDaoI.find("from Userinfo");	
		for (Userinfo userinfo : list) {
			System.out.println(userinfo.getUsername());
		}
		
	}
	@Test
	public void save(){
		
		Userinfo userinfo = new Userinfo();
		userinfo.setUserfamily("java,javaweb,javascript");
		userinfo.setUsermail("115102@qq.com");
		userinfo.setUsername("蕾姆");
		userinfo.setUserpass("123123");
		userinfo.setUserphone("1806506491");
		
		House house = houseDaoI.get(House.class, 272);
		
		
		//设置关系
		userinfo.getHouses().add(house);
		house.setUserinfo(userinfo);
		
		//保存用户
		userinfoDaoI.save(userinfo);
		houseDaoI.saveOrUpdate(house);
		
	}
	
	@Test
	public void find(){
		List<Object> param = new ArrayList<Object>();
		List<Userinfo> list = userinfoDaoI.find("from Userinfo", param, 1, 15);//分页带条件查询用户数量
		System.out.println(list.size()+"=============================");
		
	}
	@Test
	public void count(){
		
		Long list = userinfoDaoI.count("select count(*) from Userinfo");
		System.out.println(list+"=============================");
		
	}

}
