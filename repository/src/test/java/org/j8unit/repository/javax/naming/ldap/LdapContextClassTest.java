package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.LdapContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LdapContextClassTest
implements org.j8unit.repository.javax.naming.ldap.LdapContextClassTests<LdapContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.LdapContext]

    @Override
    public Class<LdapContext> createNewSUT() {
        return LdapContext.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.LdapContext]

}
