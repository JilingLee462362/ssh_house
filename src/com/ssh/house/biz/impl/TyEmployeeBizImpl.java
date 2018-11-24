package com.ssh.house.biz.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.TyEmployeeBizI;
import com.ssh.house.dao.TyEmployeeDaoI;
import com.ssh.house.entity.TyEmployee;


@Service("tyemployeeBizI")
@Transactional
public class TyEmployeeBizImpl extends BaseBizImpl<TyEmployee> implements TyEmployeeBizI {

	TyEmployeeDaoI  tyemployeeDaoI;
	@Resource(name="tyemployeeDaoI")
	public void setTyEmployeeDaoI(TyEmployeeDaoI tyemployeeDaoI) {
		this.tyemployeeDaoI = tyemployeeDaoI;
	}
	
	
	@Override
	public Serializable save(TyEmployee o) {
		
		return tyemployeeDaoI.save(o);
	}

	@Override
	public void delete(TyEmployee o) {
		tyemployeeDaoI.delete(o);

	}

	@Override
	public void update(TyEmployee o) {
		tyemployeeDaoI.update(o);

	}

	@Override
	public void saveOrUpdate(TyEmployee o) {
		tyemployeeDaoI.saveOrUpdate(o);

	}

	@Override
	public List<TyEmployee> find(String hql) {
		
		return tyemployeeDaoI.find(hql);
	}

	@Override
	public List<TyEmployee> find(String hql, Object[] param) {
	
		return tyemployeeDaoI.find(hql, param);
	}

	@Override
	public List<TyEmployee> find(String hql, List<Object> param) {
		
		return tyemployeeDaoI.find(hql, param);
	}

	@Override
	public List<TyEmployee> find(String hql, Object[] param, Integer page, Integer rows) {
		
		return tyemployeeDaoI.find(hql, param, page, rows);
	}

	@Override
	public List<TyEmployee> find(String hql, List<Object> param, Integer page, Integer rows) {
		
		return tyemployeeDaoI.find(hql, param, page, rows);
	}

	@Override
	public TyEmployee get(Class<TyEmployee> c, Serializable id) {
		
		return tyemployeeDaoI.get(c, id);
	}

	@Override
	public TyEmployee get(String hql, Object[] param) {
	
		return tyemployeeDaoI.get(hql, param);
	}

	@Override
	public TyEmployee get(String hql, List<Object> param) {
		
		return tyemployeeDaoI.get(hql, param);
	}

	@Override
	public Long count(String hql) {
	
		return tyemployeeDaoI.count(hql);
	}

	@Override
	public Long count(String hql, Object[] param) {
		
		return tyemployeeDaoI.count(hql, param);
	}

	@Override
	public Long count(String hql, List<Object> param) {
		
		return tyemployeeDaoI.count(hql, param);
	}

	@Override
	public Integer executeHql(String hql) {
	
		return tyemployeeDaoI.executeHql(hql);
	}

	@Override
	public Integer executeHql(String hql, Object[] param) {
		
		return tyemployeeDaoI.executeHql(hql, param);
	}

	@Override
	public Integer executeHql(String hql, List<Object> param) {
		
		return tyemployeeDaoI.executeHql(hql, param);
	}

}
