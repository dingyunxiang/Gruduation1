package edu.nefu.gdms.serviceImpl;

import edu.nefu.gdms.beans.TeacherBean;
import edu.nefu.gdms.beans.TitleBean;
import edu.nefu.gdms.domain.Teacher;
import edu.nefu.gdms.domain.Title;
import edu.nefu.gdms.service.TeacherManager;
import edu.nefu.gdms.service.util.FileLoaderManagerImpl;
import edu.nefu.gdms.service.util.ManagerTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by dingyunxiang on 16/6/6.
 */
@Service("teacherService")
public class TeacherServiceImpl extends ManagerTemplate implements TeacherManager{

    @Override
    public boolean login(String username, String password) {
        List<Teacher> list = teacherDao.getEntity(Teacher.class,"number",username);
        if(list == null) return false;
        Teacher teacher = list.get(0);
        if(teacher!=null && teacher.getPwd().equals(password)){
            return true;
        }
        return false;
    }

    @Override
    public void save(TeacherBean teacher) {
        teacherDao.save(new Teacher(teacher));
    }

    @Override
    public List<TeacherBean> getAll() {
        List<Teacher> li = teacherDao.getAll(Teacher.class);
        List<TeacherBean> list = new ArrayList<TeacherBean>(li.size());
        for(Teacher tea:li){
            list.add(new TeacherBean(tea));
        }
        return list;
    }

    @Override
    public TeacherBean getByTeaNumber(String number) {
        List<Teacher> list = teacherDao.getEntity(Teacher.class,"number",number);
        if(list == null) return null;
        return new TeacherBean(list.get(0));
    }

    @Transactional
    @Override
    public String addTitle(String teid,TitleBean titleBean, File file, String filename) {
        Title title = new Title(titleBean);
        Teacher teacher = teacherDao.getEntityById(Teacher.class,teid);
        title.setTeacher(teacher);
        titleDao.save(title);
        String path = "web/file/";
        Calendar cal = Calendar.getInstance();
        String year = cal.get(Calendar.YEAR)+"/";
        path  +=year+"teacher/"+teacher.getNumber();
        System.out.println();
        try {
            FileLoaderManagerImpl.saveFile(file,filename,path);
            return "success";
        } catch (IOException e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @Override
    public void modify(TeacherBean teacherBean) {
       teacherDao.update(new Teacher(teacherBean));
    }

    @Override
    public void updatePassword(String pwd, String teid) {
        Teacher teacher = teacherDao.getEntityById(Teacher.class,teid);
        teacher.setPwd(pwd);
        teacherDao.update(teacher);
    }

    @Override
    public List<TitleBean> getAllTitleByTeid(String teid) {
        List<Title> li = titleDao.getEntity(Title.class,"teid",teid);
        List<TitleBean> list = new ArrayList<TitleBean>(li.size());
        for(Title title:li){
            list.add(new TitleBean(title));
        }
        return list;
    }
}
