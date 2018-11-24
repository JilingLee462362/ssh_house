package com.ssh.house.biz.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.appcomm.base.BaseDaoImpl;
import com.ssh.house.biz.TyPreferentialApplyBizI;
import com.ssh.house.dao.TyPreferentialApplyDaoI;
import com.ssh.house.entity.TyPreferentialApply;

@Service(value = "tyPreferentialApplyBizI")
public class TyPreferentialApplyBizImpl extends BaseDaoImpl<TyPreferentialApply> implements TyPreferentialApplyBizI {


}
