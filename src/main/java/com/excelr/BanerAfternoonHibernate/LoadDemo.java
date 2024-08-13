package com.excelr.BanerAfternoonHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excelr.BanerAfternoonHibernate.entity.Student;

public class LoadDemo {

	public static void main(String[] args) {
		SessionFactory factory=MySessionFactory.getSessionFactory();
    	
		Session session1=factory.openSession();
		Transaction tx=session1.beginTransaction();
		
		Student student1=session1.load(Student.class, 1);  
//    	System.out.println("hii"); 
//    	System.out.println("bye"); 
    	System.out.println(student1.getPer());
    	
    	Student student2=session1.load(Student.class, 1);  
    	System.out.println(student2.getSname());
    	
    	Student student3=session1.load(Student.class, 1);  
    	System.out.println(student3.getRno());
    	
    	System.out.println(student1==student2);
	}

}
