package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PagedResultsResponseControlClassTest
implements org.j8unit.repository.javax.naming.ldap.PagedResultsResponseControlClassTests<javax.naming.ldap.PagedResultsResponseControl> {

    @Override
    public Class<javax.naming.ldap.PagedResultsResponseControl> createNewSUT() {
        return javax.naming.ldap.PagedResultsResponseControl.class;
    }

}
