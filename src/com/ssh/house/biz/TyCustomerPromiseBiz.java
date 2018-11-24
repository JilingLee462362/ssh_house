package com.ssh.house.biz;

import org.hibernate.criterion.DetachedCriteria;

import com.ssh.house.entity.PageBean;
import com.ssh.house.entity.TyCustomerPromise;

/**
 * TyCustomerPromise的service接口
 * @author Administrator
 *
 */
public interface TyCustomerPromiseBiz {

	PageBean<TyCustomerPromise> findByPage(DetachedCriteria detachedCriteria, Integer currPage, Integer pageSize);//分页查询

	TyCustomerPromise findById(Integer cpId);//根据ID查询客户

	void update(TyCustomerPromise tyCustomerPromise);//客户信息更新

	void save(TyCustomerPromise tyCustomerPromise);//客户信息保存

	void delete(TyCustomerPromise tyCustomerPromise);//客户信息删除

}
