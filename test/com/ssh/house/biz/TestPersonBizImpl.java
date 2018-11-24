package com.ssh.house.biz;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.biz.impl.PersonBizImpl;
import com.ssh.house.entity.Person;

public class TestPersonBizImpl {

	PersonBizI biz=SpringUtils.getBean("personBizI", PersonBizI.class);
	
	
	
	
	//添加 方法 的测试
	
	
	
	
	
	@Test
	public void testFindString() {
		
		
		List<Person> list = biz.find("from Person");
		
		for (Person person : list) {
			
			System.out.println(person);
		}
		
	}

}
