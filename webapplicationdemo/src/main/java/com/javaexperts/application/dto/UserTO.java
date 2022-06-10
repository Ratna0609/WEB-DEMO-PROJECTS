package com.javaexperts.application.dto;

public class UserTO {
	private int userid;
	private String fname;
	private String email;
	private long phone;
	private String username;
	private String password;

	public UserTO() {

	}

	public UserTO(int userid, String fname, String email, long phone, String username, String password) {

		this.userid = userid;
		this.fname = fname;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
