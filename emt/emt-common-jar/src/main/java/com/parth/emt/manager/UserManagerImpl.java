package com.parth.emt.manager;


import org.springframework.beans.factory.annotation.Autowired;

import com.parth.emt.beans.User;
import com.parth.emt.dao.UserDao;
import com.parth.emt.exception.AuthenticationFailure;


public class UserManagerImpl implements UserManager {
	
	@Autowired
	private UserDao userDao;

	@Override
	public void authenticate(String username, String password) throws AuthenticationFailure {
		User user = userDao.getUser(username, password);
		if(user == null) {
			throw new AuthenticationFailure();
		}		
	}

	
	public void setUserDao(UserDao userDao) {	
		this.userDao = userDao;
	}
}
