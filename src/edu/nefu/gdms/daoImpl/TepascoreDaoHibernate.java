package edu.nefu.gdms.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.nefu.gdms.dao.TepascoreDao;
import edu.nefu.gdms.domain.Log;
import edu.nefu.gdms.domain.Tepascore;
import edu.nefu.gdms.support.GdmsHibernateDaoSupport;


@Repository("tepascoreDao")
public class TepascoreDaoHibernate extends BaseDaoImpl<Tepascore> implements TepascoreDao {

}
