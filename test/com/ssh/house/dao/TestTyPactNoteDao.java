package com.ssh.house.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.biz.TyPactNoteBizI;
import com.ssh.house.entity.PageBean;
import com.ssh.house.entity.TyPactNote;

public class TestTyPactNoteDao {
	
	
	TyPactNoteDao tpactNoteDao = SpringUtils.getBean("tyPactNoteDao", TyPactNoteDao.class);
	TyPactNoteBizI tyPactNoteBizI = SpringUtils.getBean("tyPactNoteBizI", TyPactNoteBizI.class);
	
	@Test
	public void find(){
		
		List<TyPactNote> findAll = tpactNoteDao.findAll();
		for (TyPactNote tyPactNote : findAll) {
			System.out.println(tyPactNote.toString());
		}
		
	}
	@Test
	public void findBybage(){
		
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(TyPactNote.class);
		PageBean<TyPactNote> findByPage = tyPactNoteBizI.findByPage(detachedCriteria, 1, 2);
		System.out.println(findByPage.getList().get(0).getPnName());
		
	}
}
