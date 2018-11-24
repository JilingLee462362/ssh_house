package com.ssh.house.biz;

import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.biz.impl.TyCustomerBackBizImpl;
import com.ssh.house.entity.TyCustomerBack;

public class TestTyCustomerBackBizImpl {
	
	TyCustomerBackBizImpl tycustomerbackBizI = SpringUtils.getBean("tycustomerbackBizI", TyCustomerBackBizImpl.class);
	
	@Test
	public void add(){
		TyCustomerBack ty = new TyCustomerBack();
		ty.setCusname("德光");
		tycustomerbackBizI.save(ty);
	}
	
	@Test
	public void get(){
		TyCustomerBack ty = tycustomerbackBizI.get(TyCustomerBack.class, 10021);
		System.out.println(ty.getCusname());
	}
	
	@Test
	public void update(){
		TyCustomerBack ty = tycustomerbackBizI.get(TyCustomerBack.class, 10021);
		ty.setCusname("黄德光");
		tycustomerbackBizI.update(ty);
	}
	
	@Test
	public void delete(){
		TyCustomerBack ty = tycustomerbackBizI.get(TyCustomerBack.class, 10021);
		TyCustomerBack ty2 = tycustomerbackBizI.get(TyCustomerBack.class, 10022);
		tycustomerbackBizI.delete(ty);
		tycustomerbackBizI.delete(ty2);
	}
}
