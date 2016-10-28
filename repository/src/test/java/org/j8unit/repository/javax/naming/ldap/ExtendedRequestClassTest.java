package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.ExtendedRequest;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExtendedRequestClassTest
implements org.j8unit.repository.javax.naming.ldap.ExtendedRequestClassTests<ExtendedRequest> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.ExtendedRequest]

    @Override
    public Class<ExtendedRequest> createNewSUT() {
        return ExtendedRequest.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.ExtendedRequest]

}
