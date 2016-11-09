package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.LdapReferralException;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LdapReferralException} (by simply reusing
 * the J8Unit test interface {@link LdapReferralExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class LdapReferralExceptionClassTest
implements LdapReferralExceptionClassTests<LdapReferralException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.LdapReferralException]

    @Override
    public Class<LdapReferralException> createNewSUT() {
        return LdapReferralException.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.LdapReferralException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.LdapReferralException]

}
