package com.ssh.house.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssh.house.appcomm.base.BaseDaoImpl;
import com.ssh.house.dao.HouseDaoI;
import com.ssh.house.entity.House;


@Repository(value="houseDaoI")
public class HouseDaoImpl extends BaseDaoImpl<House> implements HouseDaoI {

	

}
