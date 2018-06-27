package com.parth.emt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.parth.emt.beans.User;


public class UserDaoImpl implements UserDao{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public User getUser(String username, String password) {

		Session session = sessionFactory.getCurrentSession();
		List<User> users = session
				.createQuery("from User where username=:username AND password=L=:password")
				.setParameter("username", username)
				.setParameter("password", password)
				.list();
		
		if(users.size() > 0) {
			return users.get(0);
		}
		return null;
	}

}
