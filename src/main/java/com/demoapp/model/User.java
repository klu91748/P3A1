package com.demoapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
@Id
	private String uname;
	private String pass;
	
	public User() {
		
	}
	
	public User(String uname, String pass) {
		super();
		this.uname = uname;
		this.pass = pass;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
