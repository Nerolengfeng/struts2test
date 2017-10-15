package org.ssh.service;

import java.util.List;

import org.ssh.dao.TeacherDao;
import org.ssh.entities.Teacher;

public class TeacherService {
	private TeacherDao teacherDao;
	
	public void setTeacherDao(TeacherDao teacherDao){
		this.teacherDao = teacherDao;
	}
	
	public List<Teacher> getAll(){
		return teacherDao.getAll();
	}
	
	public boolean login(String username,String password){
		Teacher teacher = new Teacher();
		teacher.setUsername(username);
		teacher.setPassword(password);
		return teacherDao.login(teacher);
		
	}
}
