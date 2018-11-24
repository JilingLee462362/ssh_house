package com.ssh.house.biz.impl;

import static org.springframework.test.web.client.response.MockRestResponseCreators.withServerError;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withUnauthorizedRequest;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.HouseBizI;
import com.ssh.house.dao.HouseDaoI;
import com.ssh.house.entity.House;


@Service("houseBizI")
@Transactional
public class HouseBizImpl extends BaseBizImpl<House> implements HouseBizI {

	
	
	HouseDaoI houseDaoI;
	@Resource(name="houseDaoI")
	public void setHouseDaoI(HouseDaoI houseDaoI) {
		this.houseDaoI = houseDaoI;
	}

	@Override
	public Serializable save(House o) {
	
		return houseDaoI.save(o);
	}

	@Override
	public void delete(House o) {
		houseDaoI.delete(o);
	}

	@Override
	public void update(House o) {
	
			houseDaoI.update(o);
	}

	@Override
	public void saveOrUpdate(House o) {
	
		houseDaoI.saveOrUpdate(o);
	}

	@Override
	public List<House> find(String hql) {
	
		return houseDaoI.find(hql);
	}

	@Override
	public List<House> find(String hql, Object[] param) {
	
		return houseDaoI.find(hql, param);
	}

	@Override
	public List<House> find(String hql, List<Object> param) {
	
		return houseDaoI.find(hql, param);
	}

	@Override
	public List<House> find(String hql, Object[] param, Integer page, Integer rows) {
	
		return find(hql, param, page, rows);
	}

	@Override
	public List<House> find(String hql, List<Object> param, Integer page, Integer rows) {
	
		return houseDaoI.find(hql, param, page, rows);
	}

	@Override
	public House get(Class<House> c, Serializable id) {
	
		return houseDaoI.get(c, id);
	}

	@Override
	public House get(String hql, Object[] param) {
	
		return houseDaoI.get(hql, param);
	}

	@Override
	public House get(String hql, List<Object> param) {
	
		return houseDaoI.get(hql, param);
	}

	@Override
	public Long count(String hql) {
	
		return houseDaoI.count(hql);
	}

	@Override
	public Long count(String hql, Object[] param) {
	
		return houseDaoI.count(hql, param);
	}

	@Override
	public Long count(String hql, List<Object> param) {
	
		return houseDaoI.count(hql, param);
	}

	@Override
	public Integer executeHql(String hql) {
	
		return houseDaoI.executeHql(hql);
	}

	@Override
	public Integer executeHql(String hql, Object[] param) {
	
		return houseDaoI.executeHql(hql, param);
	}

	@Override
	public Integer executeHql(String hql, List<Object> param) {
	
		return houseDaoI.executeHql(hql, param);
	}

}
