 
package edu.nefu.gdms.service;

import edu.nefu.gdms.beans.TeacherBean;
import edu.nefu.gdms.beans.TitleBean;

import java.io.File;
import java.util.List;


public interface TeacherManager {
	
	
	/*
	 *  
	 * 
	 * 
	 */
	
	boolean login(String username, String password);
	
	void save(TeacherBean teacher);
	
	List<TeacherBean> getAll();
	
	TeacherBean getByTeaNumber(String number);
	
	String addTitle(String teid,TitleBean titleBean, File file, String filename);
	
	
	void modify(TeacherBean teacherBean);

	void updatePassword(String pwd, String teid);
	
	List<TitleBean> getAllTitleByTeid(String teid);
	public String setTitleBySid(String tiid,String sid);
	
	
}
 
