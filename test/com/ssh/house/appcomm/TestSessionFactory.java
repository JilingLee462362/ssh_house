package com.ssh.house.appcomm;

import org.hibernate.SessionFactory;

public class TestSessionFactory {

	public static void main(String[] args) {
	
		SessionFactory sessionFactory = SpringUtils.getBean("sessionFactory", SessionFactory.class);
		
		//打印sessionFactory
		System.out.println("打印sessionFactory  :"+sessionFactory.openSession());
		
		
		

	}

}
