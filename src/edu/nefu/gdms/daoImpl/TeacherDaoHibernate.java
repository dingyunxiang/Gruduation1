package edu.nefu.gdms.daoImpl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import edu.nefu.gdms.dao.TeacherDao;
import edu.nefu.gdms.domain.Teacher;


@Repository("teacherDao")
public class TeacherDaoHibernate extends BaseDaoImpl<Teacher> implements TeacherDao {

	@Override
	public Teacher getByNumber(String number) {
		String hql = "from Teacher where number = '"+number+"'";
		Query query  =  this.getSession().createQuery(hql);
		return (Teacher)query.list().get(0);
	}
	
}
