package com.ssh.house.biz;

import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.biz.impl.TyPositionBizImpl;
import com.ssh.house.entity.TyPosition;

public class TestTyPositionBizImpl {

	TyPositionBizImpl typositionBizI = SpringUtils.getBean("typositionBizI", TyPositionBizImpl.class);
	
	@Test
	public void add(){
		TyPosition ty = new TyPosition();
		ty.setPositionname("德光");
		typositionBizI.save(ty);
	}
	
	@Test
	public void get(){
		
		TyPosition tyPosition = typositionBizI.get(TyPosition.class, 11);
		tyPosition.setPositionname("黄德光");
	}
	
	@Test
	public void update(){
		
		TyPosition tyPosition = typositionBizI.get(TyPosition.class, 11);
		tyPosition.setPositionname("黄德光");
		typositionBizI.update(tyPosition);
	}
	
	@Test
	public void delete(){
		
		TyPosition ty = typositionBizI.get(TyPosition.class, 11);
		TyPosition ty2 = typositionBizI.get(TyPosition.class, 12);
		typositionBizI.delete(ty);
		typositionBizI.delete(ty2);
	}
}
