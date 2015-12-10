package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StartTlsRequestTest
implements org.j8unit.repository.javax.naming.ldap.StartTlsRequestTests<javax.naming.ldap.StartTlsRequest> {

    @Override
    public javax.naming.ldap.StartTlsRequest createNewSUT() {
        return new javax.naming.ldap.StartTlsRequest();
    }

}
