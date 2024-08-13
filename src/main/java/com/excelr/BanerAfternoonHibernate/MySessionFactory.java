package com.excelr.BanerAfternoonHibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySessionFactory {
	private static SessionFactory factory=null;
	
	public static SessionFactory getSessionFactory()
	{
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	factory=cfg.buildSessionFactory();
    	return factory;
	}
}
