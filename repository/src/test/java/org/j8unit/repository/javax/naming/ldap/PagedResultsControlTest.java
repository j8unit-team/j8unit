package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PagedResultsControlTest
implements org.j8unit.repository.javax.naming.ldap.PagedResultsControlTests<javax.naming.ldap.PagedResultsControl> {

    @Override
    public javax.naming.ldap.PagedResultsControl createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.naming.ldap.PagedResultsControl] available.");
    }

}
