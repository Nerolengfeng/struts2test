package org.ssh.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.ssh.service.TeacherService;

import com.opensymphony.xwork2.ActionSupport;

public class TeacherAction extends ActionSupport implements RequestAware {
	private TeacherService teacherService;
	public void setTeacherService(TeacherService teacherService){
		this.teacherService = teacherService;
	}
	
	private Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request=arg0;
	}
	
	public String list(){
		request.put("teachers", teacherService.getAll());
		return "list";
	}
	public String login(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(teacherService.login(username, password)){
			return "login-success";
		}else{
			return "login-error";
		}
	}
	
	
	
}
