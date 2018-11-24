package com.ssh.house.dao.impl;

import org.springframework.stereotype.Repository;

import com.ssh.house.appcomm.base.BaseDaoImpl;
import com.ssh.house.entity.TyInstalmentApply;
import com.ssh.house.dao.InstalmentApplyDaoI;

/**
 * 分期付款申请实现类
 * @author xyn
 *
 */

@Repository(value="instalmentApplyDaoI")
public class InstalmentApplyDaoImpl extends BaseDaoImpl<TyInstalmentApply> implements InstalmentApplyDaoI {

}
