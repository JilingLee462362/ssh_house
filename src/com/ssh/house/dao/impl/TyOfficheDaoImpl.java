package com.ssh.house.dao.impl;

import org.springframework.stereotype.Repository;

import com.ssh.house.appcomm.base.BaseDaoImpl;
import com.ssh.house.dao.TyOfficheDaoI;
import com.ssh.house.entity.TyOffiche;



@Repository(value="tyOfficheDaoI")
public class TyOfficheDaoImpl extends BaseDaoImpl<TyOffiche> implements TyOfficheDaoI{

}
