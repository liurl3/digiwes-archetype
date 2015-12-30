#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mgt.service;

import ${package}.mgt.bean.Person;

import java.util.List;

/**
 * Created by liurl3 on 2015/12/9.
 */
public interface IPersonService {
    public List<Person> getPersonList();
}
