package org.ssh.dao;

import java.util.List;

import org.hibernate.Query;
import org.ssh.entities.Teacher;

public class TeacherDao extends BaseDao {
	
	
	//查询所有老师信息
	public List<Teacher> getAll(){
		String hql = "FROM Teacher";
		return this.getSessionFactory().createQuery(hql).list();
	}
	
	public boolean login(Teacher teacher){
		String hql = "FROM Teacher t WHERE t.username=? and t.password=? ";
		Query query = this.getSessionFactory().createQuery(hql);
		query.setString(0, teacher.getUsername());
		query.setString(1, teacher.getPassword());
		List result = query.list();
		System.out.println(result);
		if(result.size()==0){
			return false;
		}
		return true;
	}
	
	
	
}
