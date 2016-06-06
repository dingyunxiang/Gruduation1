package edu.nefu.gdms.serviceImpl;

import edu.nefu.gdms.beans.StudentBean;
import edu.nefu.gdms.beans.TitleBean;
import edu.nefu.gdms.domain.Student;
import edu.nefu.gdms.domain.Title;
import edu.nefu.gdms.service.StudentManager;
import edu.nefu.gdms.service.util.ManagerTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dingyunxiang on 16/6/6.
 */
@Service("studentService")
public class StudentServiceImpl extends ManagerTemplate implements StudentManager {

    @Override
    public boolean login(String username, String password) {
        List<Student> list = studentDao.getEntity(Student.class, "number", username);
        if (list.size() == 0) return false;
        Student student = list.get(0);
        if (student != null && student.getPwd().equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String save(StudentBean studentBean) {
        studentDao.save(new Student(studentBean));
        return "succ";
    }

    @Override
    public void modify(StudentBean studentBean) {
        studentDao.update(new Student(studentBean));
    }

    @Override
    public void remove(String sid) {
        studentDao.delete(Student.class,sid);
    }

    @Override
    public String setTeacher(String studentNumber, String teacherNumber) {
        return null;
    }

    @Override
    public StudentBean getByStuNumber(String number) {
        List<Student> list = studentDao.getEntity(Student.class, "number", number);
        if (list.size() == 0) return null;
        return new StudentBean(list.get(0));
    }

    @Override
    public StudentBean getBySid(String sid) {
        return new StudentBean(studentDao.getEntityById(Student.class,sid));
    }

    @Override
    public List<StudentBean> getAll() {
        List<Student> list = studentDao.getAll(Student.class);
        List<StudentBean> l1 = new ArrayList<StudentBean>(list.size());
        for(Student s :list){
            l1.add(new StudentBean(s));
        }
        return l1;
    }

    //修改密码
    @Override
    public void updatePassword(String pwd, String sid) {
        Student student = studentDao.getEntityById(Student.class,sid);
        student.setPwd(pwd);
        studentDao.update(student);
    }

    //学生设置论题
    public boolean setTitle(String sid,String tid){
        if(getTitleBySid(sid) == null) {
            Student student = studentDao.getEntityById(Student.class, sid);
            Title title = titleDao.getEntityById(Title.class, tid);
            title.setStudent(student);
            title.setStatus("初选");
            titleDao.update(title);
            return true;
        }else{
            return false;
        }
    }

    //通过学生id获取学生选题
    public TitleBean getTitleBySid(String sid){
        List<Title> li = titleDao.getEntity(Title.class,"sid",sid);
        if(li == null ) return null;
        return new TitleBean(li.get(0));
    }

}
