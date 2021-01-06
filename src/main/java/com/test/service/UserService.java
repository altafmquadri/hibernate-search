package com.test.service;

import java.util.List;

import com.test.model.User;

public interface UserService {

	public void addUser(User user);

	public List<User> getAllUsers();

	public User updateUser(User user);

	public void deleteUser(Integer id);

	public User getUserById(Integer id);

}
