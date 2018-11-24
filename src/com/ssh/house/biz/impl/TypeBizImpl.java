package com.ssh.house.biz.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.TypeBizI;
import com.ssh.house.dao.TypeDaoI;
import com.ssh.house.entity.Type;

@Service("typeBizI")
@Transactional
public class TypeBizImpl extends BaseBizImpl<Type> implements TypeBizI {
	
	TypeDaoI typeDaoI;
	@Resource(name="typeDaoI")
	public void setTypeDaoI(TypeDaoI typeDaoI) {
		this.typeDaoI = typeDaoI;
	}
	

	@Override
	public Serializable save(Type o) {
		return typeDaoI.save(o);
	}

	@Override
	public void delete(Type o) {
		typeDaoI.delete(o);

	}

	@Override
	public void update(Type o) {
		typeDaoI.delete(o);

	}

	@Override
	public void saveOrUpdate(Type o) {
		typeDaoI.saveOrUpdate(o);

	}

	@Override
	public List<Type> find(String hql) {
		
		return typeDaoI.find(hql);
	}

	@Override
	public List<Type> find(String hql, Object[] param) {
		
		return typeDaoI.find(hql, param);
	}

	@Override
	public List<Type> find(String hql, List<Object> param) {
		
		return typeDaoI.find(hql,param);
	}

	@Override
	public List<Type> find(String hql, Object[] param, Integer page, Integer rows) {
		
		return typeDaoI.find(hql, param, page, rows);
	}

	@Override
	public List<Type> find(String hql, List<Object> param, Integer page, Integer rows) {
		
		return typeDaoI.find(hql, param, page, rows);
	}

	@Override
	public Type get(Class<Type> c, Serializable id) {
		
		return typeDaoI.get(c, id);
	}

	@Override
	public Type get(String hql, Object[] param) {
		
		return typeDaoI.get(hql, param);
	}

	@Override
	public Type get(String hql, List<Object> param) {
		
		return typeDaoI.get(hql, param);
	}

	@Override
	public Long count(String hql) {
		
		return typeDaoI.count(hql);
	}

	@Override
	public Long count(String hql, Object[] param) {
	
		return typeDaoI.count(hql, param);
	}

	@Override
	public Long count(String hql, List<Object> param) {
		
		return typeDaoI.count(hql, param);
	}

	@Override
	public Integer executeHql(String hql) {
		
		return typeDaoI.executeHql(hql);
	}

	@Override
	public Integer executeHql(String hql, Object[] param) {
		
		return typeDaoI.executeHql(hql, param);
	}

	@Override
	public Integer executeHql(String hql, List<Object> param) {
	
		return typeDaoI.executeHql(hql, param);
	}

}
