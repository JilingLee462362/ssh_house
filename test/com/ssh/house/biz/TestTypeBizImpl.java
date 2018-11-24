package com.ssh.house.biz;

import static org.junit.Assert.*;

import org.junit.Test;
import com.ssh.house.entity.Type;
import com.ssh.house.appcomm.SpringUtils;

public class TestTypeBizImpl {
	
	TypeBizI typeBizI=SpringUtils.getBean("typeBizI", TypeBizI.class);

	@Test

	public void testSave() {
		Type t=new Type("星星湾小区");
		typeBizI.save(t);
	
	}

}
