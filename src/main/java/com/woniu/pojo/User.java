package com.woniu.pojo;
// Generated 2019-12-18 19:44:42 by Hibernate Tools 3.5.0.Final

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private int uid;
	private Role role;
	private String uname;
	private String upwd;

	public User() {
	}

	public User(int uid) {
		this.uid = uid;
	}

	public User(int uid, Role role, String uname, String upwd) {
		this.uid = uid;
		this.role = role;
		this.uname = uname;
		this.upwd = upwd;
	}

	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

}
