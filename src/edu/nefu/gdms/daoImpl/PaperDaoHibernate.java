package edu.nefu.gdms.daoImpl;

import org.springframework.stereotype.Repository;

import edu.nefu.gdms.dao.PaperDao;
import edu.nefu.gdms.domain.Paper;

@Repository("paperDao")
public class PaperDaoHibernate  extends BaseDaoImpl<Paper> implements PaperDao{

}
