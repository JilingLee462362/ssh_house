package com.ssh.house.biz;

import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.biz.impl.TyDepartmentBizImpl;
import com.ssh.house.entity.TyDepartment;

public class TestTyDepartmentBizImpl {

	TyDepartmentBizImpl tydepartmentBizI = SpringUtils.getBean("tydepartmentBizI", TyDepartmentBizImpl.class);
	
	@Test
	public void add(){
		TyDepartment ty = new TyDepartment();
		ty.setDepartname("德光");
		tydepartmentBizI.save(ty);
	}
	
	@Test
	public void get(){
		TyDepartment ty = tydepartmentBizI.get(TyDepartment.class, 6);
		System.out.println(ty.getDepartname());
	}
	
	@Test
	public void update(){
		TyDepartment ty = tydepartmentBizI.get(TyDepartment.class, 6);
		ty.setDepartname("黄德光");
		tydepartmentBizI.update(ty);
	}
	
	@Test
	public void delete(){
		TyDepartment ty = tydepartmentBizI.get(TyDepartment.class, 6);
		tydepartmentBizI.delete(ty);
	}
}
