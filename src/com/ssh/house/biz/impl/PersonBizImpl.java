package com.ssh.house.biz.impl;

import static org.springframework.test.web.client.response.MockRestResponseCreators.withServerError;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withUnauthorizedRequest;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssh.house.appcomm.base.BaseBizImpl;
import com.ssh.house.biz.PersonBizI;
import com.ssh.house.dao.PersonDaoI;
import com.ssh.house.entity.Person;



@Service("personBizI")
public class PersonBizImpl extends BaseBizImpl<Person> implements PersonBizI {

	
	
	PersonDaoI personDaoI;
	@Resource(name="personDaoI")
	public void setPersonDaoI(PersonDaoI personDaoI) {
		this.personDaoI = personDaoI;
	}
	

	@Override
	public Serializable save(Person o) {
	
		return personDaoI.save(o);
	}



	@Override
	public void delete(Person o) {
		personDaoI.delete(o);
	}

	@Override
	public void update(Person o) {
	
		personDaoI.update(o);
	}

	@Override
	public void saveOrUpdate(Person o) {
	
		personDaoI.saveOrUpdate(o);
	}

	@Override
	public List<Person> find(String hql) {
	
		return personDaoI.find(hql);
	}

	@Override
	public List<Person> find(String hql, Object[] param) {
	
		return personDaoI.find(hql, param);
	}

	@Override
	public List<Person> find(String hql, List<Object> param) {
	
		return personDaoI.find(hql, param);
	}

	@Override
	public List<Person> find(String hql, Object[] param, Integer page, Integer rows) {
	
		return find(hql, param, page, rows);
	}

	@Override
	public List<Person> find(String hql, List<Object> param, Integer page, Integer rows) {
	
		return personDaoI.find(hql, param, page, rows);
	}

	@Override
	public Person get(Class<Person> c, Serializable id) {
	
		return personDaoI.get(c, id);
	}

	@Override
	public Person get(String hql, Object[] param) {
	
		return personDaoI.get(hql, param);
	}

	@Override
	public Person get(String hql, List<Object> param) {
	
		return personDaoI.get(hql, param);
	}

	@Override
	public Long count(String hql) {
	
		return personDaoI.count(hql);
	}

	@Override
	public Long count(String hql, Object[] param) {
	
		return personDaoI.count(hql, param);
	}

	@Override
	public Long count(String hql, List<Object> param) {
	
		return personDaoI.count(hql, param);
	}

	@Override
	public Integer executeHql(String hql) {
	
		return personDaoI.executeHql(hql);
	}

	@Override
	public Integer executeHql(String hql, Object[] param) {
	
		return personDaoI.executeHql(hql, param);
	}

	@Override
	public Integer executeHql(String hql, List<Object> param) {
	
		return personDaoI.executeHql(hql, param);
	}

}
