package com.ssh.house.biz.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.TyPositionBizI;
import com.ssh.house.dao.TyPositionDaoI;
import com.ssh.house.entity.TyPosition;


@Service("typositionBizI")
@Transactional
public class TyPositionBizImpl extends BaseBizImpl<TyPosition> implements TyPositionBizI {
	
	TyPositionDaoI typositionDaoI;
	@Resource(name="typositionDaoI")
	public void setTyPositionDaoI(TyPositionDaoI typositionDaoI) {
		this.typositionDaoI = typositionDaoI;
	}
	

	@Override
	public Serializable save(TyPosition o) {
		
		return typositionDaoI.save(o);
	}

	@Override
	public void delete(TyPosition o) {
		typositionDaoI.delete(o);

	}

	@Override
	public void update(TyPosition o) {
		typositionDaoI.update(o);

	}

	@Override
	public void saveOrUpdate(TyPosition o) {
		typositionDaoI.saveOrUpdate(o);

	}

	@Override
	public List<TyPosition> find(String hql) {
		
		return typositionDaoI.find(hql);
	}

	@Override
	public List<TyPosition> find(String hql, Object[] param) {
		
		return typositionDaoI.find(hql, param);
	}

	@Override
	public List<TyPosition> find(String hql, List<Object> param) {
		
		return typositionDaoI.find(hql, param);
	}

	@Override
	public List<TyPosition> find(String hql, Object[] param, Integer page, Integer rows) {
		
		return typositionDaoI.find(hql, param, page, rows);
	}

	@Override
	public List<TyPosition> find(String hql, List<Object> param, Integer page, Integer rows) {
	
		return typositionDaoI.find(hql, param, page, rows);
	}

	@Override
	public TyPosition get(Class<TyPosition> c, Serializable id) {
		
		return typositionDaoI.get(c, id);
	}

	@Override
	public TyPosition get(String hql, Object[] param) {
		
		return typositionDaoI.get(hql, param);
	}

	@Override
	public TyPosition get(String hql, List<Object> param) {
		
		return typositionDaoI.get(hql, param);
	}

	@Override
	public Long count(String hql) {
	
		return typositionDaoI.count(hql);
	}

	@Override
	public Long count(String hql, Object[] param) {
		
		return typositionDaoI.count(hql, param);
	}

	@Override
	public Long count(String hql, List<Object> param) {
		
		return typositionDaoI.count(hql, param);
	}

	@Override
	public Integer executeHql(String hql) {
	
		return typositionDaoI.executeHql(hql);
	}

	@Override
	public Integer executeHql(String hql, Object[] param) {
		
		return typositionDaoI.executeHql(hql, param);
	}

	@Override
	public Integer executeHql(String hql, List<Object> param) {
		
		return typositionDaoI.executeHql(hql, param);
	}

}
