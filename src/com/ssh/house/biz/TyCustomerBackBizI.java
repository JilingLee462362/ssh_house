package com.ssh.house.biz;

import com.ssh.house.appcomm.base.BaseBizI;
import com.ssh.house.entity.TyCustomerBack;

public interface TyCustomerBackBizI extends BaseBizI<TyCustomerBack> {

	public TyCustomerBack loginin(String cusname,String cuspwd);
}
