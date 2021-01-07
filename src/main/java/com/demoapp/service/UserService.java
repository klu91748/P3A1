package com.demoapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoapp.dao.UserDao;
import com.demoapp.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public boolean loginValid(String user, String pass) {
		try {
			User u = userDao.findById(user).get();
			System.out.println(u);
	 		if (u != null && u.getPass().equals(pass)) {
	 			return true;
	 		}
		} catch(Exception e) {
			System.out.println("error");
		}
 		return false;
	}
	
	public boolean addUser(String uname, String pass) {
		
		userDao.save(new User(uname, pass));
		
		return true;
	}
	
	public boolean findUser(String uname) {
		if (userDao.findById(uname) != null) {
			return true;
		}
		return false;
	}

	public boolean updateUser(String name, String pass) {
		User user = userDao.findById(name).get();
		user.setPass(pass);
		userDao.save(user);
		return true;
	}

	public boolean deleteUser(String name) {
		userDao.deleteById(name);
		return true;
	}
}
