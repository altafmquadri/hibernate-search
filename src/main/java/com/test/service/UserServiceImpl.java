package com.test.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.test.dao.UserDAO;
import com.test.model.User;

//@Component
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO uD;

	
	@Override
	public void addUser(User user) {
		uD.addUser(user);
	}

	@Override
	public List<User> getAllUsers() {
		return uD.getAllUsers();
	}

	@Override
	public void deleteUser(Integer id) {
		uD.deleteUser(id);
	}

	@Override
	public User getUserById(Integer id) {
		System.out.println("i am in getuserbyid");
		return uD.getUserById(id);
	}

	@Override
	public void change(User user) {
		uD.change(user);
	}

}
