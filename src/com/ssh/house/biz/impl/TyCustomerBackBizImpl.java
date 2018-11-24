package com.ssh.house.biz.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.TyCustomerBackBizI;
import com.ssh.house.dao.TyCustomerBackDaoI;
import com.ssh.house.entity.TyCustomerBack;


@Service("tycustomerbackBizI")
@Transactional
public class TyCustomerBackBizImpl extends BaseBizImpl<TyCustomerBack> implements TyCustomerBackBizI {

	TyCustomerBackDaoI tycustomerbackDaoI;
	@Resource(name="tycustomerbackDaoI")
	public void setTyCustomerBackDaoI(TyCustomerBackDaoI tycustomerbackDaoI) {
		this.tycustomerbackDaoI = tycustomerbackDaoI;
	}
	
	
	@Override
	public Serializable save(TyCustomerBack o) {
	
		return tycustomerbackDaoI.save(o);
	}

	@Override
	public void delete(TyCustomerBack o) {
		tycustomerbackDaoI.delete(o);

	}

	@Override
	public void update(TyCustomerBack o) {
		tycustomerbackDaoI.update(o);

	}

	@Override
	public void saveOrUpdate(TyCustomerBack o) {
		tycustomerbackDaoI.saveOrUpdate(o);

	}

	@Override
	public List<TyCustomerBack> find(String hql) {

		return tycustomerbackDaoI.find(hql);
	}

	@Override
	public List<TyCustomerBack> find(String hql, Object[] param) {
	
		return tycustomerbackDaoI.find(hql, param);
	}

	@Override
	public List<TyCustomerBack> find(String hql, List<Object> param) {

		return tycustomerbackDaoI.find(hql, param);
	}

	@Override
	public List<TyCustomerBack> find(String hql, Object[] param, Integer page, Integer rows) {
	
		return tycustomerbackDaoI.find(hql, param, page, rows);
	}

	@Override
	public List<TyCustomerBack> find(String hql, List<Object> param, Integer page, Integer rows) {
	
		return tycustomerbackDaoI.find(hql, param, page, rows);
	}

	@Override
	public TyCustomerBack get(Class<TyCustomerBack> c, Serializable id) {
	
		return tycustomerbackDaoI.get(c, id);
	}

	@Override
	public TyCustomerBack get(String hql, Object[] param) {
		
		return tycustomerbackDaoI.get(hql, param);
	}

	@Override
	public TyCustomerBack get(String hql, List<Object> param) {
		
		return tycustomerbackDaoI.get(hql, param);
	}

	@Override
	public Long count(String hql) {
		
		return tycustomerbackDaoI.count(hql);
	}

	@Override
	public Long count(String hql, Object[] param) {
		
		return tycustomerbackDaoI.count(hql, param);
	}

	@Override
	public Long count(String hql, List<Object> param) {
		
		return tycustomerbackDaoI.count(hql, param);
	}

	@Override
	public Integer executeHql(String hql) {

		return tycustomerbackDaoI.executeHql(hql);
	}

	@Override
	public Integer executeHql(String hql, Object[] param) {
		
		return tycustomerbackDaoI.executeHql(hql, param);
	}

	@Override
	public Integer executeHql(String hql, List<Object> param) {
		
		return tycustomerbackDaoI.executeHql(hql, param);
	}


	@Override
	public TyCustomerBack loginin(String cusname,String cuspwd) {
		String hql = "from TyCustomerBack where cusname = ? and cuspwd = ?";
		Object[] param = {cusname,cuspwd};
		return tycustomerbackDaoI.get(hql, param);
		
	}

}
