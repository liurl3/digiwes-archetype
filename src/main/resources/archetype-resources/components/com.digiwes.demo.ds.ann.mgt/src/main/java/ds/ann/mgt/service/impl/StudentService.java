#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ds.ann.mgt.service.impl;

import ${package}.ds.ann.mgt.bean.Student;
import ${package}.ds.ann.mgt.dao.IStudentDao;
import ${package}.ds.ann.mgt.dao.impl.StudentDao;
import ${package}.ds.ann.mgt.service.IStudentService;

import java.util.List;

/**
 * Created by liurl3 on 2015/12/11.
 */
/**
 * @scr.component name="demo.student.service" immediate=true
 * @scr.service value="${package}.ds.ann.mgt.service.IStudentService"
 */
public class StudentService implements IStudentService {
    private IStudentDao studentDao = new StudentDao();
    @Override
    public List<Student> getStudentList() {
        return studentDao.getStudentList();
    }
}
