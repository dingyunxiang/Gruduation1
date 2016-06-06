package edu.nefu.gdms.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.nefu.gdms.dao.StudentDao;
import edu.nefu.gdms.domain.Log;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.support.GdmsHibernateDaoSupport;

@Repository("studentDao")
public class StudentDaoHibernate extends BaseDaoImpl<Student> implements StudentDao{

}
