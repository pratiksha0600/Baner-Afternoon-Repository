package com.excelr.BanerAfternoonHibernate;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excelr.BanerAfternoonHibernate.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
          Session session1=factory.openSession();
//    	Student s1=new Student(1,"sanket",87.6);
    	Transaction tx=session1.beginTransaction();
        ArrayList<Student> students=new ArrayList ();
        students.add(new Student ( "Alice", 78.5,"alice@gmail.com"));
    	students.add(new Student ( "ben", 98.5,"ben@gmail.com"));
     	students.add(new Student ( "chris", 88.5,"chris@gmail.com"));
  
    	for(Student s:students)
    	    session1.save(s);
    	
    	tx.commit();
    	System.out.println("Records Inserted");
    	
    	session1.close();
    }
}