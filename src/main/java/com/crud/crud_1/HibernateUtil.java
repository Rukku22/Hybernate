package com.crud.crud_1;

import java.util.Properties;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
 private static SessionFactory factory;
 public static SessionFactory getSessionFactory() {
	 if(factory==null) {
		 
		 Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml"); 
		    cfg.addAnnotatedClass(Crud.class);
		 factory=cfg.buildSessionFactory();
 	 }
	 return factory;
 
}
}
