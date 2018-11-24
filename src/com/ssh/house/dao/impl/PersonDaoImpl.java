package com.ssh.house.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssh.house.appcomm.base.BaseDaoImpl;
import com.ssh.house.dao.PersonDaoI;
import com.ssh.house.entity.Person;



@Repository(value="personDaoI")
public class PersonDaoImpl extends BaseDaoImpl<Person> implements PersonDaoI {

	

}
