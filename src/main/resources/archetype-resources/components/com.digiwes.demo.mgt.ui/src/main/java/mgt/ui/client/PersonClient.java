#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mgt.ui.client;
import ${package}.mgt.bean.Person;
import ${package}.mgt.service.IPersonService;
import ${package}.mgt.ui.internal.Activator;
//import org.apache.log4j.Logger;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;

/**
 * Created by liurl3 on 2015/12/9.
 */
public class PersonClient{
    private static Logger log = LoggerFactory.getLogger(PersonClient.class);
    private static BundleContext context ;
    private static PersonClient personClient = new PersonClient();
    private PersonClient(){

    }
    public static PersonClient getInstance(){
        log.info("Instance PersonClient Class");
        context = Activator.getBundleContext();
        return personClient;
    }
    public List<Person> getPersons(){
        List<Person> personList = null ;
        //获取服务
        IPersonService personService = null;
        if(context != null) {
            ServiceReference sp = context.getServiceReference(IPersonService.class.getName());
            if (sp != null) {
                personService = (IPersonService) context.getService(sp);
            }else{
                log.error("ServiceReference is null");
            }
            if (personService != null) {
                personList = personService.getPersonList();
            }else{
                log.error("personService is null");
            }
        }else{
            log.error("BundleContext is null");
        }
        return personList;
    }

}
