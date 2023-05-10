package com.mph.props;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.sql.Connection;

public class PropsMain {
	public Connection con;
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spr-props.xml");		
		MyDao dao = (MyDao) context.getBean("dao");
		System.out.println(dao.getDbname() + "  " + dao.getUname() + "  " + dao.getPassword());
		System.out.println(dao.getDbConnection())	;	
	}
	
	
	
	
	
	

}