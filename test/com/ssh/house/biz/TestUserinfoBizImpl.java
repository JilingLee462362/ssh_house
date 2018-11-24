package com.ssh.house.biz;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.biz.UserinfoBizI;
import com.ssh.house.entity.Userinfo;

public class TestUserinfoBizImpl {

	UserinfoBizI userinfoBizI=SpringUtils.getBean("userinfoBizI", UserinfoBizI.class);
	
	
	
	
	//@Test
	public void testLogin() {
	
		Userinfo userinfo = userinfoBizI.login("zshow", "123123");
		
		System.out.println(userinfo.getUsermail());
		
		
		
	}

	@Test
	public void testFindString() {
		
		
		
		List<Userinfo> list = userinfoBizI.find("from  Userinfo");
		
		for (Userinfo userinfo : list) {
			
			System.out.println(userinfo.getUsername()+"  "+userinfo.getUserpass());
		}
		
		
		
		
	}

}
