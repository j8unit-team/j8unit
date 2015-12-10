package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InitialLdapContextClassTest
implements org.j8unit.repository.javax.naming.ldap.InitialLdapContextClassTests<javax.naming.ldap.InitialLdapContext> {

    @Override
    public Class<javax.naming.ldap.InitialLdapContext> createNewSUT() {
        return javax.naming.ldap.InitialLdapContext.class;
    }

}
