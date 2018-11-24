package com.ssh.house.dao.impl;

import org.springframework.stereotype.Repository;
import com.ssh.house.appcomm.base.BaseDaoImpl;
import com.ssh.house.dao.TypeDaoI;
import com.ssh.house.entity.Type;

@Repository(value="typeDaoI")
public class TypeDaoImpl extends BaseDaoImpl<Type>  implements TypeDaoI {

}
