#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ds.mgt.dao;

import ${package}.ds.mgt.bean.Employee;

import java.util.List;

/**
 * Created by liurl3 on 2015/12/9.
 */
public interface IEmployeeDao {

    public List<Employee> getEmoloyeeList();
}
