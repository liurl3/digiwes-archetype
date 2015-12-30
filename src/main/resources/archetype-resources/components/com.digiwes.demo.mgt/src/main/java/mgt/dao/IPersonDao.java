#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mgt.dao;

import ${package}.mgt.bean.Person;

import java.util.List;

/**
 * Created by liurl3 on 2015/12/9.
 */
public interface IPersonDao {

    public List<Person> getPersonList();
}
