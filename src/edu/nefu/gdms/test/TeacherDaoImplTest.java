package edu.nefu.gdms.test;

import edu.nefu.gdms.dao.TeacherDao;
import edu.nefu.gdms.domain.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TeacherDaoImplTest {
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("/web/WEB-INF/applicationContext.xml");
	TeacherDao dao = (TeacherDao) ac.getBean("teacherDao");

	@Test
	public void test() {
		int number = 0;
		while(number<20){
			number++;
			Teacher teacher =new Teacher(null, "1", "李丹","13132641198", "110", "1234567890@qq.com", "计算机科学与技术", "教授", null, null, null, null);
			teacher.setNumber(number+"");
			teacher.setPwd("110");
			dao.save(teacher);
		}
		
		
		
		
		
		
		
//		
//		List<Teacher> list=dao.getAll();
//		
//		
//	Teacher t=list.get(0);
//	System.out.println(t.getEmail());
		
		
		
	}

	
	
}
