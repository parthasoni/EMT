package com.parth.emt.dao;


import com.parth.emt.beans.User;


public interface UserDao {

	public User getUser(String user, String password);
}
