package com.ssh.house.biz.impl;

import java.io.Serializable;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.TyDealNoteBizI;
import com.ssh.house.dao.TyDealNoteDaoI;
import com.ssh.house.entity.TyDealNote;

@Service(value = "tyDealNoteBizI")
@Transactional
public class TyDealNoteBizImpl extends BaseBizImpl<TyDealNote> implements TyDealNoteBizI {
	
	TyDealNoteDaoI tyDealNoteDaoI;

	@Resource(name = "tyDealNoteDaoI")
	public void setDyDealNoteDaoI(TyDealNoteDaoI tyDealNoteDaoI) {
		this.tyDealNoteDaoI = tyDealNoteDaoI;
	}
	
	
}
