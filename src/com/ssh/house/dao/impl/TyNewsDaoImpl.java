package com.ssh.house.dao.impl;

import org.springframework.stereotype.Repository;

import com.ssh.house.appcomm.base.BaseDaoImpl;
import com.ssh.house.dao.TyNewsDaoI;
import com.ssh.house.entity.TyNews;




@Repository(value="tyNewsDaoI")
public class TyNewsDaoImpl extends BaseDaoImpl<TyNews> implements TyNewsDaoI{

}
