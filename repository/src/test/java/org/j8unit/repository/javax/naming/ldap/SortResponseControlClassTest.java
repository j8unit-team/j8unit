package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SortResponseControlClassTest
implements org.j8unit.repository.javax.naming.ldap.SortResponseControlClassTests<javax.naming.ldap.SortResponseControl> {

    @Override
    public Class<javax.naming.ldap.SortResponseControl> createNewSUT() {
        return javax.naming.ldap.SortResponseControl.class;
    }

}
