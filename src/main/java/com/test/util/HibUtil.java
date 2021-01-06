package com.test.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import com.test.model.User;

@Component
public class HibUtil {

	private static SessionFactory sessionFactory; 
	   
	      static {
	    	  sessionFactory = new AnnotationConfiguration()
	    			  .addAnnotatedClass(User.class).configure().buildSessionFactory();
	      }
	 
	      public static SessionFactory getSessionFactory() {
	    	  return HibUtil.sessionFactory;
	      }
}
