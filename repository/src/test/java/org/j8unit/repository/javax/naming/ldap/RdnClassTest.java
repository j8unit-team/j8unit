package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RdnClassTest
implements org.j8unit.repository.javax.naming.ldap.RdnClassTests<javax.naming.ldap.Rdn> {

    @Override
    public Class<javax.naming.ldap.Rdn> createNewSUT() {
        return javax.naming.ldap.Rdn.class;
    }

}
