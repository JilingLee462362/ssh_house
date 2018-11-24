package com.ssh.house.biz;

import org.hibernate.criterion.DetachedCriteria;

import com.ssh.house.entity.PageBean;
import com.ssh.house.entity.TyPactNote;

/**
 * TyPactNote的业务层接口
 * @author Administrator
 *
 */
public interface TyPactNoteBizI {

	PageBean<TyPactNote> findByPage(DetachedCriteria detachedCriteria, Integer currPage, Integer pageSize);//条件带分页查询

	void save(TyPactNote tyPactNote);//信息保存

	TyPactNote findById(Integer pnId);//根据ID查找信息

	void delete(TyPactNote tyPactNote);//根据ID删除信息

	void update(TyPactNote tyPactNote);//信息更新

}
