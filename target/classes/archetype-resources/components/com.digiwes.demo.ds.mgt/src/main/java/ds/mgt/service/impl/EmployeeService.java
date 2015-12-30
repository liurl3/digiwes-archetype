#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ds.mgt.service.impl;

import ${package}.ds.mgt.bean.Employee;
import ${package}.ds.mgt.dao.IEmployeeDao;
import ${package}.ds.mgt.dao.impl.EmployeeDao;
import ${package}.ds.mgt.service.IEmployeeService;

import java.util.List;

/**
 * Created by liurl3 on 2015/12/11.
 */
public class EmployeeService implements IEmployeeService {
    private IEmployeeDao employeeDao = new EmployeeDao();
    @Override
    public List<Employee> getEmployeeList() {
        return employeeDao.getEmoloyeeList();
    }
}
