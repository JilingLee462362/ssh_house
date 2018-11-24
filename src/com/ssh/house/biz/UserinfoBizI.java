package com.ssh.house.biz;

import com.ssh.house.appcomm.base.BaseBizI;
import com.ssh.house.entity.Userinfo;

public interface UserinfoBizI extends BaseBizI<Userinfo> {
	
	
	
	public  Userinfo  login(String username,String userpass);

}
