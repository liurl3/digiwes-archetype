#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ds.mgt.ui.client;

import ${package}.ds.mgt.bean.Employee;
import ${package}.ds.mgt.service.IEmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by liurl3 on 2015/12/9.
 */
public class EmployeeClient {
    private static Logger log = LoggerFactory.getLogger(EmployeeClient.class);
    private static EmployeeClient employeeClient = new EmployeeClient();
    private static IEmployeeService employeeService;
    private EmployeeClient(){

    }
    public static EmployeeClient getInstance(){
        log.info("Instance EmployeeClient");
        return employeeClient;
    }

    public List<Employee> getEmployeeList(){
        List<Employee> employeeList = null;
        //Get Service
       IEmployeeService employeeService = EmployeeServiceComponent.getService();
        if(employeeService != null){
            employeeList = employeeService.getEmployeeList();
        }else {
            log.error("personService is null");
        }

        return employeeList;
    }
}
