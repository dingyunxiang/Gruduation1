package edu.nefu.gdms.service;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.beans.TitleBean;

import java.util.List;

public interface StudentManager {
	
	
	/*
	 * 学生登录
	 * 
	 * 
	 */
	
	boolean login(String username, String password);
	
	String save(StudentBean studentBean);
	
	
	void modify(StudentBean studentBean);
	
	void remove(String sid);
	
	String  setTeacher(String studentNumber, String teacherNumber);
	
	StudentBean getByStuNumber(String number);
	
	StudentBean getBySid(String sid); 
	
	List<StudentBean> getAll();

	void updatePassword(String pwd, String sid);
	public boolean setTitle(String sid,String tid);
	public TitleBean getTitleBySid(String sid);
	
}
