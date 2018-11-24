package com.ssh.house.biz.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.UserinfoBizI;
import com.ssh.house.dao.UserinfoDaoI;
import com.ssh.house.entity.Userinfo;



@Service("userinfoBizI")
public class UserinfoBizImpl extends BaseBizImpl<Userinfo> implements UserinfoBizI {

	UserinfoDaoI userinfoDaoI; //  DI 属性注入 ，构造方法注入 ，set()注入
	
	
	@Resource(name="userinfoDaoI")
	public void setUserinfoDaoI(UserinfoDaoI userinfoDaoI) {
		this.userinfoDaoI = userinfoDaoI;
	}



	@Override
	public Userinfo login(String username, String userpass) {
	
		//hql  sql  
		return userinfoDaoI.get("from Userinfo where username=? and userpass=?", new String[]{username,userpass});
	}

	
	
	
}
  