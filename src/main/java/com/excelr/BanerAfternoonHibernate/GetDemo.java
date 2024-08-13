package com.excelr.BanerAfternoonHibernate;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excelr.BanerAfternoonHibernate.entity.Student;

public class GetDemo {

	public static void main(String[] args) {

    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session1=factory.openSession();
    	Transaction tx=session1.beginTransaction();
    	
//    	Student student1=session1.get(Student.class, 1);  // 1.select //went to the db fetch it
//    	System.out.println(student1);                     // 2.student(rno=) //the select query will reflect on the console
//    	
//    	Student student2=session1.get(Student.class, 1);  // 3.  //will it query the db ?no
//    	                                                  // 4. student(rno=) //the select query will not  reflect on the console
//    	System.out.println(student2);
//    	
//    	Student student3=session1.get(Student.class, 1);  //5
//    	System.out.println(student3);                     //student(rno=)
//    	
//    	System.out.println(student2==student3);          //true
//    	System.out.println(student1==student3);          //true
    	
    	
    	Student student1=session1.get(Student.class, 1);  // 1.select //went to the db fetch it
    	System.out.println(student1);                     // 2.student(rno=) //the select query will reflect on the console
    	
    	Student student2=session1.get(Student.class, 2);  // 3. select //will it query the db ?no
    	                                                  // 4. student(rno=) //the select query will not  reflect on the console
    	System.out.println(student2);
    	
    	Student student3=session1.get(Student.class, 3);  //5 select
    	System.out.println(student3);                     //student(rno=)
    	
    	Student student4=session1.get(Student.class, 4);  
    	System.out.println(student4);  
    	
    	System.out.println(student2==student3);          //false
    	System.out.println(student1==student3);          //false
    	session1.close();
    }

	}


