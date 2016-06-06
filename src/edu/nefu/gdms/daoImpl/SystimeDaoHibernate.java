package edu.nefu.gdms.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.nefu.gdms.dao.SystimeDao;
import edu.nefu.gdms.domain.Grour;
import edu.nefu.gdms.domain.Log;
import edu.nefu.gdms.domain.Systime;
import edu.nefu.gdms.support.GdmsHibernateDaoSupport;


@Repository("systimeDao")
public class SystimeDaoHibernate extends BaseDaoImpl<Systime> implements SystimeDao{

	
}
