package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.LdapContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LdapContext} (by simply reusing the
 * J8Unit test interface {@link LdapContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class LdapContextClassTest
implements LdapContextClassTests<LdapContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.LdapContext]

    @Override
    public Class<LdapContext> createNewSUT() {
        return LdapContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.LdapContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.LdapContext]

}
