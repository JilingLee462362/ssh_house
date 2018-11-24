package com.ssh.house.dao.impl;

import org.springframework.stereotype.Repository;

import com.ssh.house.appcomm.base.BaseDaoImpl;
import com.ssh.house.dao.XiaoquDaoI;
import com.ssh.house.entity.Xiaoqu;

@Repository(value="xiaoquDaoI")
public class XiaoquDaoImpl extends BaseDaoImpl<Xiaoqu> implements XiaoquDaoI{

}
