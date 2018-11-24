package com.ssh.house.dao.impl;

import org.springframework.stereotype.Repository;

import com.ssh.house.appcomm.base.BaseDaoImpl;
import com.ssh.house.dao.TyReportFormsDao;
import com.ssh.house.entity.TyReportForms;
@Repository(value="tyReportFormsDao")
public class TyReportFormsDaoI extends BaseDaoImpl<TyReportForms> implements TyReportFormsDao {

}
