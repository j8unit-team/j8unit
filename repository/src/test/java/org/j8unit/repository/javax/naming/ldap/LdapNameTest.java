package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LdapNameTest
implements org.j8unit.repository.javax.naming.ldap.LdapNameTests<javax.naming.ldap.LdapName> {

    @Override
    public javax.naming.ldap.LdapName createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.naming.ldap.LdapName] available.");
    }

}
