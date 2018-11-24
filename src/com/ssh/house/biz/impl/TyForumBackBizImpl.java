package com.ssh.house.biz.impl;



import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.TyForumBackBizI;
import com.ssh.house.dao.TyForumBackDaoI;
import com.ssh.house.entity.TyForumBack;

@Service("tyForumBackBizI")
@Transactional
public class TyForumBackBizImpl extends BaseBizImpl<TyForumBack> implements TyForumBackBizI {
	
	TyForumBackDaoI tyForumBackDaoI;
	@Resource(name="tyForumBackDaoI")
	public void setTyForumBackDaoI(TyForumBackDaoI tyForumBackDaoI) {
		this.tyForumBackDaoI = tyForumBackDaoI;
	}
	
	@Override
	public void deleteAll(List<TyForumBack> list) {
		for (TyForumBack tyForumBack : list) {
			this.delete(tyForumBack);
		}

			
	}
}
