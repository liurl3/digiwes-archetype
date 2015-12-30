#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ds.ann.mgt.dao;

import ${package}.ds.ann.mgt.bean.Student;

import java.util.List;

/**
 * Created by liurl3 on 2015/12/9.
 */
public interface IStudentDao {

    public List<Student> getStudentList();
}
