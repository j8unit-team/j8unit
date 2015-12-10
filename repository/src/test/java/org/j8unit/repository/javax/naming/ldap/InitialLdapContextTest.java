package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InitialLdapContextTest
implements org.j8unit.repository.javax.naming.ldap.InitialLdapContextTests<javax.naming.ldap.InitialLdapContext> {

    @Override
    public javax.naming.ldap.InitialLdapContext createNewSUT() {
        try {
            return new javax.naming.ldap.InitialLdapContext();
        } catch (final Exception cause) {
            throw new AssertionError("Failed to create new subject-under-test instance!", cause);
        }

    }

}
