package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SortKeyClassTest
implements org.j8unit.repository.javax.naming.ldap.SortKeyClassTests<javax.naming.ldap.SortKey> {

    @Override
    public Class<javax.naming.ldap.SortKey> createNewSUT() {
        return javax.naming.ldap.SortKey.class;
    }

}
