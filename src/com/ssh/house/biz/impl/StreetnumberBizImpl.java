package com.ssh.house.biz.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.StreetnumberBizI;
import com.ssh.house.dao.StreetnumberDaoI;
import com.ssh.house.entity.Streetnumber;

@Service("streetnumberBizI")
public class StreetnumberBizImpl extends BaseBizImpl<Streetnumber> implements StreetnumberBizI {

	StreetnumberDaoI streetnumberDaoI;
	@Resource(name="streetnumberDaoI")
	public void setStreetnumberDaoI(StreetnumberDaoI streetnumberDaoI) {
		this.streetnumberDaoI = streetnumberDaoI;
	}

}
