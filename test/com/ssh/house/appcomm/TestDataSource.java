package com.ssh.house.appcomm;

import javax.sql.DataSource;

public class TestDataSource {

	public static void main(String[] args) {
		
		
		DataSource  ds=SpringUtils.getBean("dataSource", DataSource.class);
		
		System.out.println(ds);

	}

}
