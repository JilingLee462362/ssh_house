package com.ssh.house.biz;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.entity.TyDealNote;

public class TestTyDealNoteBizImpl {

	TyDealNoteBizI tyDealNoteBizI = SpringUtils.getBean("tyDealNoteBizI", TyDealNoteBizI.class);
	@Test
	public void testFind(){
		List<TyDealNote> dealnotes =  tyDealNoteBizI.find("from TyDealNote");
		System.out.println(dealnotes.size());
		for(TyDealNote dealnote: dealnotes){
			System.out.println(dealnote.getApplyid()+"....."+dealnote.getDnCustomerId());
		}
	}
	
//	@Test
	public void testSave(){
		TyDealNote deal = new TyDealNote();
		deal.setApplyid(1001);
		deal.setDnBeginPrice(60000);
		deal.setDnCustomerId(10006);
		deal.setEmployeeid(1009);
		deal.setDnDate(new Date());
		deal.setDnEndPrice(55000);
		deal.setDnDescription("待付款");
		tyDealNoteBizI.save(deal);
	}
	
//	@Test
	public void testUpdate(){
		TyDealNote deal = new TyDealNote();
		deal.setDnId(50001);
		deal.setDnBeginPrice(70000);
		tyDealNoteBizI.saveOrUpdate(deal);
	}
	
	
}
