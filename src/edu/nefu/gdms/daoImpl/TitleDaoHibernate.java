package edu.nefu.gdms.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.nefu.gdms.dao.TitleDao;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.domain.Title;
import edu.nefu.gdms.support.GdmsHibernateDaoSupport;


@Repository("titleDao")
public class TitleDaoHibernate extends BaseDaoImpl<Title> implements TitleDao {

	

}
