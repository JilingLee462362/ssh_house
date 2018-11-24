package com.ssh.house.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssh.house.appcomm.base.BaseDaoImpl;
import com.ssh.house.dao.TyDealNoteDaoI;
import com.ssh.house.entity.TyDealNote;

@Repository(value = "tyDealNoteDaoI")
public class TyDealNoteDaoImpl extends BaseDaoImpl<TyDealNote> implements TyDealNoteDaoI {}
