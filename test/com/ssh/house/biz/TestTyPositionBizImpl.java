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
		ty.setPositionname("�¹�");
		typositionBizI.save(ty);
	}
	
	@Test
	public void get(){
		
		TyPosition tyPosition = typositionBizI.get(TyPosition.class, 11);
		tyPosition.setPositionname("�Ƶ¹�");
	}
	
	@Test
	public void update(){
		
		TyPosition tyPosition = typositionBizI.get(TyPosition.class, 11);
		tyPosition.setPositionname("�Ƶ¹�");
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
