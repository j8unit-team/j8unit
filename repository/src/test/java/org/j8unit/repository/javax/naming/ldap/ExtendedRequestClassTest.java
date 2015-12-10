package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExtendedRequestClassTest
implements org.j8unit.repository.javax.naming.ldap.ExtendedRequestClassTests<javax.naming.ldap.ExtendedRequest> {

    @Override
    public Class<javax.naming.ldap.ExtendedRequest> createNewSUT() {
        return javax.naming.ldap.ExtendedRequest.class;
    }

}
