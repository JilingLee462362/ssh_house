package com.ssh.house.biz;

import java.util.List;

import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.entity.TyInstalmentApply;

public class TestInstalmentApplyBizImpl {
	
	InstalmentApplyBizI instalmentApplyBizI = SpringUtils.getBean("instalmentApplyBizI", InstalmentApplyBizI.class);
//	@Test
	public void testcount(){
		System.out.println("总数="+instalmentApplyBizI.count("select count(*) from TyInstalmentApply"));
		
	}
	
//	@Test
	public void testfind(){
		
		List<TyInstalmentApply> applyList =  instalmentApplyBizI.find("from TyInstalmentApply");
		for(TyInstalmentApply applies : applyList){
			System.out.println("IaId:" + applies.getIaId() +"...."+ "ApprovalState:" + applies.getIaApprovalState());
		}
	}
	
	@Test
	public void testUpdate(){
		TyInstalmentApply IA = new TyInstalmentApply();
		IA.setIaContent("挺急的，在线等");
		IA.setIaId(22222);
		instalmentApplyBizI.update(IA);
	}

}
