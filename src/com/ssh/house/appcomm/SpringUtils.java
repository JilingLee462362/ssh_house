package com.ssh.house.appcomm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *  
 * @author  TZHU
 *
 * @param  
 */
public class SpringUtils {

	private static final String[] SPRING_XML = { "applicationContext.xml"};

	public static  <T>  T  getBean(String beanId,Class<T> t) {

		ApplicationContext  app=new  ClassPathXmlApplicationContext(SPRING_XML);

	
		
		return  app.getBean(beanId,t);

	};

}
