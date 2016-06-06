package edu.nefu.gdms.test;

import edu.nefu.gdms.beans.TitleBean;
import edu.nefu.gdms.dao.TeacherDao;
import edu.nefu.gdms.service.TeacherManager;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.File;

public class TeacherDaoImplTest {
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("/web/WEB-INF/applicationContext.xml");
	TeacherDao dao = (TeacherDao) ac.getBean("teacherDao");
	TeacherManager service = (TeacherManager) ac.getBean("teacherService");

	@Test
	public void test() {
//		int number = 0;
//		while(number<20){
//			number++;
//			Teacher teacher =new Teacher(null, "1", "李丹","13132641198", "110", "1234567890@qq.com", "计算机科学与技术", "教授", null, null, null, null);
//			teacher.setNumber(number+"");
//			teacher.setPwd("110");
//			dao.save(teacher);
//		}

		File f = new File("web/index.jsp");
		TitleBean t = new TitleBean();
		t.setStatus("初始化");
		t.setTname("index");
		service.addTitle("5e9b6336552408250155240826830000",t,f,"index.jsp");



		
	}

	
	
}
