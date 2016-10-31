package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.LdapContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LdapContextTest
implements org.j8unit.repository.javax.naming.ldap.LdapContextTests<LdapContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ldap.LdapContext]

    @Override
    public LdapContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.ldap.LdapContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.ldap.LdapContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.ldap.LdapContext]

}
