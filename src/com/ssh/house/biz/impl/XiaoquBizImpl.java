package com.ssh.house.biz.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.XiaoquBizI;
import com.ssh.house.dao.XiaoquDaoI;
import com.ssh.house.entity.Xiaoqu;


@Service("xiaoquBizI")
@Transactional
public class XiaoquBizImpl extends BaseBizImpl<Xiaoqu> implements XiaoquBizI {
	
	XiaoquDaoI xiaoquDaoI;
	

	public XiaoquDaoI getXiaoquDaoI() {
		return xiaoquDaoI;
	}
	@Resource(name="xiaoquDaoI")
	public void setXiaoquDaoI(XiaoquDaoI xiaoquDaoI) {
		this.xiaoquDaoI = xiaoquDaoI;
	}

	@Override
	public Serializable save(Xiaoqu o) {
		return xiaoquDaoI.save(o);
	}

	@Override
	public void delete(Xiaoqu o) {
		xiaoquDaoI.delete(o);
	}

	@Override
	public void update(Xiaoqu o) {
		xiaoquDaoI.update(o);
	}

	@Override
	public void saveOrUpdate(Xiaoqu o) {
		xiaoquDaoI.saveOrUpdate(o);

	}

	@Override
	public List<Xiaoqu> find(String hql) {
		return xiaoquDaoI.find(hql);
	}

	@Override
	public List<Xiaoqu> find(String hql, Object[] param) {
		return xiaoquDaoI.find(hql, param);
	}

	@Override
	public List<Xiaoqu> find(String hql, List<Object> param) {
		return xiaoquDaoI.find(hql, param);
	}

	@Override
	public List<Xiaoqu> find(String hql, Object[] param, Integer page, Integer rows) {
		return xiaoquDaoI.find(hql, param, page, rows);
	}

	@Override
	public List<Xiaoqu> find(String hql, List<Object> param, Integer page, Integer rows) {
		return xiaoquDaoI.find(hql, param, page, rows);
	}

	@Override
	public Xiaoqu get(Class<Xiaoqu> c, Serializable id) {
		return xiaoquDaoI.get(c, id);
	}

	@Override
	public Xiaoqu get(String hql, Object[] param) {
		return xiaoquDaoI.get(hql, param);
	}

	@Override
	public Xiaoqu get(String hql, List<Object> param) {
		return xiaoquDaoI.get(hql, param);
	}

	@Override
	public Long count(String hql) {
		return xiaoquDaoI.count(hql);
	}

	@Override
	public Long count(String hql, Object[] param) {
		return xiaoquDaoI.count(hql, param);
	}

	@Override
	public Long count(String hql, List<Object> param) {
		return xiaoquDaoI.count(hql, param);
	}

	@Override
	public Integer executeHql(String hql) {
		return xiaoquDaoI.executeHql(hql);
	}

	@Override
	public Integer executeHql(String hql, Object[] param) {
		return xiaoquDaoI.executeHql(hql, param);
	}

	@Override
	public Integer executeHql(String hql, List<Object> param) {
		return xiaoquDaoI.executeHql(hql, param);
	}

}
