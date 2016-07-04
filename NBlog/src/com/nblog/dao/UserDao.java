package com.nblog.dao;

import com.nblog.bean.User;

public interface UserDao {
	 public User getUser(User user);
	 public void addUser(User user);
	 public void updateUser(User user);
	 public void deleteUser(int UserId);
	 public User getUserById(int id);
}
