package com.ssh.house.biz;

 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.entity.House;
import com.ssh.house.entity.Streetnumber;
import com.ssh.house.entity.Type;
import com.ssh.house.entity.Userinfo;

public class TestHouseBizImpl {

	HouseBizI houseBizI=SpringUtils.getBean("houseBizI", HouseBizI.class);
	

	
	//@Test
	public void testUpdate(){
		
		House  h=new House();
		h.setId(49);
		h.setContact("test");
		h.setDescription("厦门好房子");
		h.setFlag("出售中");
		h.setFloorage(80);
		h.setPrice(50000);
		h.setPubdate(new Date());
		Streetnumber  str=new Streetnumber();
		str.setId(4);
		
		h.setStreetnumber(str);
		h.setTitle(" 房主不要了 ");
		Type type=new Type();
		type.setId(1);
		h.setType(type);
		Userinfo ui=new Userinfo();
		
		ui.setUserid(5);
		h.setUserinfo(ui);
		 
		
		
		houseBizI.update(h);
		
	}
	
	
	@Test
	public void testSave(){
		 
		House  h=new House();
		 
		h.setContact("test");
		h.setDescription("厦门好房子1007");
		h.setFlag("出售中");
		h.setFloorage(80);
		h.setPrice(50000);
		h.setPubdate(new Date());
		Streetnumber  str=new Streetnumber();
		str.setId(4);
		
		h.setStreetnumber(str);
		h.setTitle(" 房主不要了 ");
		Type type=new Type();
		type.setId(2);
		h.setType(type);
		 
		houseBizI.save(h);
		
		
		
		
		
		
		
	}
		
	
	//@Test
	public void testDel(){
		
		House  h=new House();
		h.setId(271);
		houseBizI.delete(h);
		
		
	}
	
	
	
	//@Test
	public void test(){
		
		System.out.println(houseBizI);
		
		List<Object>  param=new ArrayList<Object>();
	 
		
		List<House> list = houseBizI.find("from House",param,1, 20);
		
		System.out.println("size :"+list.size());
		for (House house : list) {
			
			System.out.println(house.getId());
			
		}
		
		
		
		
	}
	
	

}
