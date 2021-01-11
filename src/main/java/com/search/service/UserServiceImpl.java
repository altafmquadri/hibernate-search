package com.search.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.dao.UserDAO;
import com.search.model.User;

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
