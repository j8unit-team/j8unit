package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StartTlsRequestClassTest
implements org.j8unit.repository.javax.naming.ldap.StartTlsRequestClassTests<javax.naming.ldap.StartTlsRequest> {

    @Override
    public Class<javax.naming.ldap.StartTlsRequest> createNewSUT() {
        return javax.naming.ldap.StartTlsRequest.class;
    }

}
