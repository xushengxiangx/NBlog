package com.nblog.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nblog.bean.User;
import com.nblog.dao.UserDao;
import com.nblog.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return userDao.getUserById(userId);
	}

}
