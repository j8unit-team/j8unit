package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.LdapContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LdapContext} (by simply reusing the
 * J8Unit test interface {@link LdapContextTests}).
 */

@RunWith(J8Unit4.class)
public class LdapContextTest
implements LdapContextTests<LdapContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ldap.LdapContext]

    @Override
    public LdapContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.ldap.LdapContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.ldap.LdapContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.ldap.LdapContext]

}
