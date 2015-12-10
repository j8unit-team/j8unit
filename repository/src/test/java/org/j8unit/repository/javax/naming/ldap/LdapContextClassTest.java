package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LdapContextClassTest
implements org.j8unit.repository.javax.naming.ldap.LdapContextClassTests<javax.naming.ldap.LdapContext> {

    @Override
    public Class<javax.naming.ldap.LdapContext> createNewSUT() {
        return javax.naming.ldap.LdapContext.class;
    }

}
