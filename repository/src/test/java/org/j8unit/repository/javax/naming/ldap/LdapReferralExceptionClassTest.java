package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LdapReferralExceptionClassTest
implements org.j8unit.repository.javax.naming.ldap.LdapReferralExceptionClassTests<javax.naming.ldap.LdapReferralException> {

    @Override
    public Class<javax.naming.ldap.LdapReferralException> createNewSUT() {
        return javax.naming.ldap.LdapReferralException.class;
    }

}
