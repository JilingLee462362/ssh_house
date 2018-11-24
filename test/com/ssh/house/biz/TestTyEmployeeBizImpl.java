package com.ssh.house.biz;

import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.biz.impl.TyEmployeeBizImpl;
import com.ssh.house.entity.TyEmployee;

public class TestTyEmployeeBizImpl {

	TyEmployeeBizImpl tyemployeeBizI = SpringUtils.getBean("tyemployeeBizI", TyEmployeeBizImpl.class);
	
	@Test
	public void add(){
		TyEmployee ty = new TyEmployee();
		ty.setEmployeename("德光");
		tyemployeeBizI.save(ty);
	}
	
	@Test
	public void get(){
		TyEmployee ty = tyemployeeBizI.get(TyEmployee.class, 1028);
		System.out.println(ty.getEmployeename());
	}
	
	@Test
	public void update(){
		TyEmployee ty = tyemployeeBizI.get(TyEmployee.class, 1028);
		ty.setEmployeename("黄德光");
		tyemployeeBizI.update(ty);
	}
	
	@Test
	public void delete(){
		TyEmployee ty = tyemployeeBizI.get(TyEmployee.class, 1028);
		tyemployeeBizI.delete(ty);
	}
}
