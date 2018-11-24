package com.ssh.house.biz.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.house.biz.TyPactNoteBizI;
import com.ssh.house.dao.TyPactNoteDao;
import com.ssh.house.entity.PageBean;
import com.ssh.house.entity.TyPactNote;
/**
 * TyPactNote的业务层接口
 * @author Administrator
 *
 */
@Service("tyPactNoteBizI")
public class TyPactNoteBizImpl implements TyPactNoteBizI{
	
	//TyPactNoteDao的注入
	@Autowired
	private TyPactNoteDao tyPactNoteDao;
	
	/**
	 * 条件带分页查询
	 */
	@Override
	public PageBean<TyPactNote> findByPage(DetachedCriteria detachedCriteria, Integer currPage, Integer pageSize) {
		// TODO Auto-generated method stub
		//分页参数绑定
				PageBean<TyPactNote> pageBean = new PageBean<TyPactNote>();
				pageBean.setCurrPage(currPage);
				pageBean.setPageSize(pageSize);
				//查询总记录数
				Integer totalCount = tyPactNoteDao.findCount(detachedCriteria);
				pageBean.setTotalCount(totalCount);
				
				//总页数
				Double totalCountD = totalCount.doubleValue();
				Double totalPage = Math.ceil(totalCountD/pageSize);	
				pageBean.setTotalPage(totalPage.intValue());
				
				//从哪页开始查
				Integer begin = (currPage-1)*pageSize;
				List<TyPactNote> list =  tyPactNoteDao.findByPage(detachedCriteria, begin, pageSize);
				pageBean.setList(list);
				return pageBean;
	}
	
	/**
	 * 信息保存
	 */
	@Override
	public void save(TyPactNote tyPactNote) {
		// TODO Auto-generated method stub
		tyPactNoteDao.save(tyPactNote);
	}
	/**
	 * 根据ID查找合同信息
	 */
	@Override
	public TyPactNote findById(Integer pnId) {
		// TODO Auto-generated method stub
		return tyPactNoteDao.findById(pnId);
	}
	/**
	 * 根据ID删除信息
	 */
	@Override
	public void delete(TyPactNote tyPactNote) {
		// TODO Auto-generated method stub
		tyPactNoteDao.delete(tyPactNote);
	}
	/**
	 * 信息更新
	 */
	@Override
	public void update(TyPactNote tyPactNote) {
		// TODO Auto-generated method stub
		tyPactNoteDao.update(tyPactNote);
	}

}
