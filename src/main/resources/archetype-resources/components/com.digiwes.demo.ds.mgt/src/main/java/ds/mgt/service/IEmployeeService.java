#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ds.mgt.service;

import ${package}.ds.mgt.bean.Employee;

import java.util.List;

/**
 * Created by liurl3 on 2015/12/11.
 */
public interface IEmployeeService {
    public List<Employee> getEmployeeList();
}
