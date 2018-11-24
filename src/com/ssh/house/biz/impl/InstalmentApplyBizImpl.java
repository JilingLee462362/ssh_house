package com.ssh.house.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.InstalmentApplyBizI;
import com.ssh.house.dao.InstalmentApplyDaoI;
import com.ssh.house.dao.impl.InstalmentApplyDaoImpl;
import com.ssh.house.entity.TyInstalmentApply;

@Service(value="instalmentApplyBizI")
@Transactional
public class InstalmentApplyBizImpl extends BaseBizImpl<TyInstalmentApply> implements InstalmentApplyBizI{
	
	InstalmentApplyDaoI instalmentApplyDaoI;

	@Resource(name="instalmentApplyDaoI")
	public void setInstalmentApplyDaoI(InstalmentApplyDaoI instalmentApplyDaoI) {
		this.instalmentApplyDaoI = instalmentApplyDaoI;
	}
	
	
	
}