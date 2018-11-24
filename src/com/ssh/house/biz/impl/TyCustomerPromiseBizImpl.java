package com.ssh.house.biz.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.house.biz.TyCustomerPromiseBiz;
import com.ssh.house.dao.TyCustomerPromiseDao;
import com.ssh.house.entity.PageBean;
import com.ssh.house.entity.TyCustomerPromise;

/**
 * TyCustomerPromise的service实现类
 * @author Administrator
 *
 */
@Service
public class TyCustomerPromiseBizImpl implements TyCustomerPromiseBiz{

	//TyCustomerPromiseDao注入
	@Autowired
	private TyCustomerPromiseDao tyCustomerPromiseDao;
	
	
	/**
	 * 条件带分页查询
	 */
	@Override
	public PageBean<TyCustomerPromise> findByPage(DetachedCriteria detachedCriteria, Integer currPage, Integer pageSize) {
		//分页参数绑定
		PageBean<TyCustomerPromise> pageBean = new PageBean<TyCustomerPromise>();
		pageBean.setCurrPage(currPage);
		pageBean.setPageSize(pageSize);
		//查询总记录数
		Integer totalCount = tyCustomerPromiseDao.findCount(detachedCriteria);
		pageBean.setTotalCount(totalCount);
		
		//总页数
		Double totalCountD = totalCount.doubleValue();
		Double totalPage = Math.ceil(totalCountD/pageSize);	
		pageBean.setTotalPage(totalPage.intValue());
		
		//从哪页开始查
		Integer begin = (currPage-1)*pageSize;
		List<TyCustomerPromise> list =  tyCustomerPromiseDao.findByPage(detachedCriteria, begin, pageSize);
		pageBean.setList(list);
		return pageBean;
		
	}

	/**
	 * 根据ID查询客户
	 */
	@Override
	public TyCustomerPromise findById(Integer cpId) {
		// TODO Auto-generated method stub
		TyCustomerPromise findById = tyCustomerPromiseDao.findById(cpId);
		return findById;
	}
	/**
	 * 客户信息更新
	 */
	@Override
	public void update(TyCustomerPromise tyCustomerPromise) {
		// TODO Auto-generated method stub
		
		tyCustomerPromiseDao.update(tyCustomerPromise);
		
	}
	/**
	 * 客户信息保存
	 */
	@Override
	public void save(TyCustomerPromise tyCustomerPromise) {
		// TODO Auto-generated method stub
		tyCustomerPromiseDao.save(tyCustomerPromise);
	}
	/**
	 * 客户信息删除
	 */
	@Override
	public void delete(TyCustomerPromise tyCustomerPromise) {
		// TODO Auto-generated method stub
		tyCustomerPromiseDao.delete(tyCustomerPromise);
	}

}
