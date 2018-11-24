package com.ssh.house.dao;

import org.junit.Test;
import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.entity.TyPreferentialApply;

public class TestTyPreferentialApplyDaoImpl {
	
	TyPreferentialApplyDaoI dao=SpringUtils.getBean("tyPreferentialApplyDaoI",TyPreferentialApplyDaoI.class);
	@Test
	public void testDel() {
		TyPreferentialApply o = new TyPreferentialApply();
		o.setPaApplyid(234433);
		dao.delete(o);
	}

}
