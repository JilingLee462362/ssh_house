package com.ssh.house.biz;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;


import com.ssh.house.entity.TyOffiche;

public class TestTyOfficheBizImpl {

     TyOfficheBizI biz=SpringUtils.getBean("tyOfficheBizI", TyOfficheBizI.class);
	
	
	@Test
	public void testFindString() {
		
		List<TyOffiche> list = biz.find("from TyOffiche");
		
		for (TyOffiche tyOffiche : list) {
			
			System.out.println(tyOffiche);
			
		}
		
	}

}
