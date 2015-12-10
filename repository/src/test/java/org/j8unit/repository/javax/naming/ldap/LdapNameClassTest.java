package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LdapNameClassTest
implements org.j8unit.repository.javax.naming.ldap.LdapNameClassTests<javax.naming.ldap.LdapName> {

    @Override
    public Class<javax.naming.ldap.LdapName> createNewSUT() {
        return javax.naming.ldap.LdapName.class;
    }

}
