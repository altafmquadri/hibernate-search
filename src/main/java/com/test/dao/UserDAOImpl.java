package com.test.dao;

import java.lang.invoke.MethodHandles;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	private Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass()); 
	
	
	@Autowired
	private SessionFactory sf;

//	public void setSf(SessionFactory sf) {
//		this.sf = sf;
//	}

	public void addUser(User user) {
//		sf.getCurrentSession().saveOrUpdate(user);

	}

//	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
//		return sf.getCurrentSession().createQuery("from User").list();
		return null;
	}

	public User updateUser(User user) {
//		Session session = this.sf.getCurrentSession();
//		session.update(user);
//		return user;
		return null;
	}

	public void deleteUser(Integer id) {
//		User user = sf.getCurrentSession().load(User.class, id);
//		if (user != null) {
//			this.sf.getCurrentSession().delete(user);
//		}
	}

	public User getUserById(Integer id) {
		logger.info("getUserbyId -> {}", id);
		User user = (User) sf.openSession().load(User.class, id);
		return user;
	}

}
