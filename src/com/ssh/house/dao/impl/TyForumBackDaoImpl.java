package com.ssh.house.dao.impl;

import org.springframework.stereotype.Repository;

import com.ssh.house.appcomm.base.BaseDaoImpl;
import com.ssh.house.dao.TyForumBackDaoI;
import com.ssh.house.entity.TyForumBack;

@Repository(value="tyForumBackDaoI")
public class TyForumBackDaoImpl extends BaseDaoImpl<TyForumBack> implements TyForumBackDaoI{

}
