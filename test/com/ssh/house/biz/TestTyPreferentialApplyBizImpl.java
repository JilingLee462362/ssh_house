package com.ssh.house.biz;
import java.util.List;

import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.biz.TyPreferentialApplyBizI;
import com.ssh.house.entity.TyPreferentialApply;

public class TestTyPreferentialApplyBizImpl {	
	TyPreferentialApplyBizI bizI = SpringUtils.getBean("tyPreferentialApplyBizI", TyPreferentialApplyBizI.class);
	@Test
	public void  TestBiz(){
		TyPreferentialApply o = new TyPreferentialApply();
		o.setPaApplyid(234433);
		bizI.delete(o );
		
		
	}
	
	
	
	
	

}
