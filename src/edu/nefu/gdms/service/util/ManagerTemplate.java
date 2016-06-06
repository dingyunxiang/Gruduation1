package edu.nefu.gdms.service.util;

import edu.nefu.gdms.dao.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ManagerTemplate {
	@Autowired
	protected StudentDao studentDao;

	@Autowired
	protected GrourDao grourDao;

	@Autowired
	protected PaperDao paperDao;

	@Autowired
	protected SystimeDao systimeDao;

	@Autowired
	protected TeacherDao teacherDao;

	@Autowired
	protected TitleDao titleDao;

	@Autowired
	protected TepascoreDao tepascoreDao;

	@Autowired
	protected LogDao logDao;
	
	public Date now = new Date(); 
	public SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	

	
	
	
	
}
