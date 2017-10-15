package org.ssh.entities;

public class Teacher {
	private int id;
	private String username;
	private String password;
	private String realname;
	private int classno;
	private String tel;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
	public Teacher(int id, String username, String password, String realname, int classno, String tel) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.realname = realname;
		this.classno = classno;
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public int getClassno() {
		return classno;
	}
	public void setClassno(int classno) {
		this.classno = classno;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
}
