#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mgt.service.impl;

import ${package}.mgt.bean.Person;
import ${package}.mgt.dao.IPersonDao;
import ${package}.mgt.dao.impl.PersonDao;
import ${package}.mgt.service.IPersonService;

import java.util.List;

/**
 * Created by liurl3 on 2015/12/9.
 */
public class PersonService implements IPersonService {
    private IPersonDao personDao = new PersonDao();
    @Override
    public List<Person> getPersonList() {
        return personDao.getPersonList();
    }
}
