package com.ssh.house.dao.impl;


import org.springframework.stereotype.Repository;

import com.ssh.house.appcomm.base.BaseDaoImpl;
import com.ssh.house.dao.TyForumTitleDaoI;
import com.ssh.house.entity.TyForumTitle;

@Repository(value="tyForumTitleDaoI")
public class TyForumTitleDaoImpl extends BaseDaoImpl<TyForumTitle> implements TyForumTitleDaoI{

}
