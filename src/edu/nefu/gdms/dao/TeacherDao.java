package edu.nefu.gdms.dao;


import java.util.List;

import edu.nefu.gdms.domain.Teacher;

public interface TeacherDao extends BaseDao<Teacher> {
	
	public Teacher getByNumber(String number);
	
	

}
