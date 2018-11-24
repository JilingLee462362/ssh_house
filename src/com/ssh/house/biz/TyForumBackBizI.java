package com.ssh.house.biz;

import java.util.List;

import com.ssh.house.appcomm.base.BaseBizI;
import com.ssh.house.entity.TyForumBack;

public interface TyForumBackBizI extends BaseBizI<TyForumBack>{
	public void deleteAll(List<TyForumBack> list);
}
