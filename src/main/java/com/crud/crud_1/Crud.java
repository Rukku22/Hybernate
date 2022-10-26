package com.crud.crud_1;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Crud {
public void create() {

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml"); 
	
	SessionFactory sessionFactory = cfg.buildSessionFactory();
 	  Session session = sessionFactory.openSession();
	Registration r=new Registration();
	r.setRollno(100);
	r.setName("ruksana");
	r.setGroup("mpc");
	
	 
	  session.beginTransaction();
	  
	  session.save(r);
	  System.out.println("Inserted Successfully");
	  session.getTransaction().commit();
	  session.close();
	  sessionFactory.close();
	 }
public void read() {
	 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
  	 Session session = sessionFactory.openSession();
 	 
     long rollno=100;
    Registration re = session.get(Registration.class,rollno);
  
     System.out.println("rollno: " + re.getRollno());
     System.out.println("name: " + re.getName());
     System.out.println("group: " +re.getGroup());
   session.close();
}
public void update() {
	 Registration book = new Registration();
	    book.setRollno(100);
	    book.setName("ruksana");
	    
	    book.setGroup("mpc");
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	   session.update(book);
	     session.getTransaction().commit();
	    session.close();
}
public void delete() {
	 Registration  book = new  Registration ();
	    book.setRollno(100);
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	 
	    session.delete(book);
	 
	    session.getTransaction().commit();
	    session.close();
}
 
}


