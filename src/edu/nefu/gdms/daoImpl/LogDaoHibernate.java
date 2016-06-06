package edu.nefu.gdms.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.nefu.gdms.dao.LogDao;
import edu.nefu.gdms.domain.Log;
import edu.nefu.gdms.support.GdmsHibernateDaoSupport;

@Repository("logDao")
public class LogDaoHibernate extends BaseDaoImpl<Log> implements LogDao{

	
 
}
