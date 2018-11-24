package com.ssh.house.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssh.house.appcomm.base.BaseDaoImpl;
import com.ssh.house.dao.UserinfoDaoI;
import com.ssh.house.entity.Userinfo;



@Repository(value="userinfoDaoI")
public class UserinfoDaoImpl extends BaseDaoImpl<Userinfo> implements UserinfoDaoI {

	

}
