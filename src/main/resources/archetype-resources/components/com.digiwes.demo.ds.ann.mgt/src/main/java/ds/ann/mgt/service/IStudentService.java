#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ds.ann.mgt.service;

import ${package}.ds.ann.mgt.bean.Student;


import java.util.List;


public interface IStudentService {
    public List<Student> getStudentList();
}
