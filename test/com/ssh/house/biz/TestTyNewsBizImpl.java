package com.ssh.house.biz;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.entity.TyNews;


public class TestTyNewsBizImpl {

     TyNewsBizI biz=SpringUtils.getBean("tyNewsBizI", TyNewsBizI.class);
	
	
	@Test
	public void testFindString() {
		
		List<TyNews> list = biz.find("from TyNews");
		
		for (TyNews tyNews : list) {
			System.out.println(tyNews);
		}
			
		
		
	}

}
