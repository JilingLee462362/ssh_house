package com.ssh.house.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.TyNewsBizI;
import com.ssh.house.dao.TyNewsDaoI;

import com.ssh.house.entity.TyNews;


@Service("tyNewsBizI")
@Transactional
public class TyNewsBizImpl extends BaseBizImpl<TyNews> implements TyNewsBizI{
	TyNewsDaoI tyNewsDaoI;
	@Resource(name="tyNewsDaoI")
	public void setTyNewsDaoI(TyNewsDaoI tyNewsDaoI) {
		this.tyNewsDaoI = tyNewsDaoI;
	}
	
}
