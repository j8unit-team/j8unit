package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.LdapName;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LdapNameTest
implements org.j8unit.repository.javax.naming.ldap.LdapNameTests<LdapName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ldap.LdapName]

    @Override
    public LdapName createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.ldap.LdapName], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.ldap.LdapName]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.ldap.LdapName]

}
