package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SortControlClassTest
implements org.j8unit.repository.javax.naming.ldap.SortControlClassTests<javax.naming.ldap.SortControl> {

    @Override
    public Class<javax.naming.ldap.SortControl> createNewSUT() {
        return javax.naming.ldap.SortControl.class;
    }

}
