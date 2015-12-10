package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PagedResultsControlClassTest
implements org.j8unit.repository.javax.naming.ldap.PagedResultsControlClassTests<javax.naming.ldap.PagedResultsControl> {

    @Override
    public Class<javax.naming.ldap.PagedResultsControl> createNewSUT() {
        return javax.naming.ldap.PagedResultsControl.class;
    }

}
