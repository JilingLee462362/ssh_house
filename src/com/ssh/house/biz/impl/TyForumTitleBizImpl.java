package com.ssh.house.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.TyForumTitleBizI;
import com.ssh.house.dao.TyForumTitleDaoI;
import com.ssh.house.entity.TyForumTitle;
@Service("tyForumTitleBizI")
@Transactional
public class TyForumTitleBizImpl extends BaseBizImpl<TyForumTitle> implements TyForumTitleBizI{
	TyForumTitleDaoI tyForumTitleDaoI;
	@Resource(name="tyForumTitleDaoI")
	public void setTyForumTitleDaoI(TyForumTitleDaoI tyForumTitleDaoI) {
		this.tyForumTitleDaoI = tyForumTitleDaoI;
	}
	
}
