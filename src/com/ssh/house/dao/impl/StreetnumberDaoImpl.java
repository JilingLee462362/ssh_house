package com.ssh.house.dao.impl;

import org.springframework.stereotype.Repository;

import com.ssh.house.appcomm.base.BaseDaoImpl;
import com.ssh.house.dao.StreetnumberDaoI;
import com.ssh.house.entity.Streetnumber;

@Repository(value="streetnumberDaoI")
public class StreetnumberDaoImpl extends BaseDaoImpl<Streetnumber> implements StreetnumberDaoI {

}
