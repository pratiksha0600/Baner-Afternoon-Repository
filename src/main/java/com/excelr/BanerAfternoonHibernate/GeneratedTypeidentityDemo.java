package com.excelr.BanerAfternoonHibernate;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.excelr.BanerAfternoonHibernate.entity.Student;

public class GeneratedTypeidentityDemo {

	public static void main(String[] args) {
        SessionFactory factory=MySessionFactory.getSessionFactory();
    	
		Session session1=factory.openSession();
		Transaction tx=session1.beginTransaction();

		 ArrayList<Student> students=new ArrayList ();
//	        students.add(new Student ("Frank", 78.5,"aaa@gmail.com"));
//	    	students.add(new Student ( "Tom", 98.5,"jjj@gmail.com"));
	     	students.add(new Student ( "Jacks", 88.5,"ggg@gmail.com"));
	  
	    	for(Student s:students)
	    	    session1.save(s);
	    	
	    	tx.commit();
	    	System.out.println("Records Inserted");
	    	
	    	session1.close();
	}

}
