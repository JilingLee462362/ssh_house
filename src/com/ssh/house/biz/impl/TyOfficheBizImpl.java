package com.ssh.house.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.TyOfficheBizI;
import com.ssh.house.dao.TyOfficheDaoI;
import com.ssh.house.entity.TyOffiche;

@Service("tyOfficheBizI")
@Transactional
public class TyOfficheBizImpl extends BaseBizImpl<TyOffiche> implements TyOfficheBizI{
	TyOfficheDaoI tyOfficheDaoI;
	@Resource(name="tyOfficheDaoI")
	public void setTyOfficheDaoI(TyOfficheDaoI tyOfficheDaoI) {
		this.tyOfficheDaoI = tyOfficheDaoI;
	}
	
}
