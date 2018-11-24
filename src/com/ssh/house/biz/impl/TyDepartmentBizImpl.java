package com.ssh.house.biz.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.TyDepartmentBizI;
import com.ssh.house.dao.TyDepartmentDaoI;
import com.ssh.house.entity.TyDepartment;

@Service("tydepartmentBizI")
@Transactional
public class TyDepartmentBizImpl extends BaseBizImpl<TyDepartment> implements TyDepartmentBizI {

	TyDepartmentDaoI  tydepartmentDaoI;
	@Resource(name="tydepartmentDaoI")
	public void setTyDepartmentDaoI(TyDepartmentDaoI tydepartmentDaoI){
		this.tydepartmentDaoI=tydepartmentDaoI;
	}
	
	
	
	@Override
	public Serializable save(TyDepartment o) {
		
		return tydepartmentDaoI.save(o);
	}

	@Override
	public void delete(TyDepartment o) {
		tydepartmentDaoI.delete(o);

	}

	@Override
	public void update(TyDepartment o) {
		tydepartmentDaoI.update(o);

	}

	@Override
	public void saveOrUpdate(TyDepartment o) {
		tydepartmentDaoI.saveOrUpdate(o);

	}

	@Override
	public List<TyDepartment> find(String hql) {
		
		return tydepartmentDaoI.find(hql);
	}

	@Override
	public List<TyDepartment> find(String hql, Object[] param) {
	
		return tydepartmentDaoI.find(hql, param);
	}

	@Override
	public List<TyDepartment> find(String hql, List<Object> param) {
		
		return tydepartmentDaoI.find(hql, param);
	}

	@Override
	public List<TyDepartment> find(String hql, Object[] param, Integer page, Integer rows) {
		
		return tydepartmentDaoI.find(hql, param, page, rows);
	}

	@Override
	public List<TyDepartment> find(String hql, List<Object> param, Integer page, Integer rows) {
		
		return tydepartmentDaoI.find(hql, param, page, rows);
	}

	@Override
	public TyDepartment get(Class<TyDepartment> c, Serializable id) {
		
		return tydepartmentDaoI.get(c, id);
	}

	@Override
	public TyDepartment get(String hql, Object[] param) {
		
		return tydepartmentDaoI.get(hql, param);
	}

	@Override
	public TyDepartment get(String hql, List<Object> param) {
		
		return tydepartmentDaoI.get(hql, param);
	}

	@Override
	public Long count(String hql) {
		
		return tydepartmentDaoI.count(hql);
	}

	@Override
	public Long count(String hql, Object[] param) {
		
		return tydepartmentDaoI.count(hql, param);
	}

	@Override
	public Long count(String hql, List<Object> param) {
		
		return tydepartmentDaoI.count(hql, param);
	}

	@Override
	public Integer executeHql(String hql) {
		
		return tydepartmentDaoI.executeHql(hql);
	}

	@Override
	public Integer executeHql(String hql, Object[] param) {
		
		return tydepartmentDaoI.executeHql(hql, param);
	}

	@Override
	public Integer executeHql(String hql, List<Object> param) {
		
		return tydepartmentDaoI.executeHql(hql, param);
	}

}
