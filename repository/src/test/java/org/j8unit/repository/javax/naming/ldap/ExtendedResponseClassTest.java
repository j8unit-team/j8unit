package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.ExtendedResponse;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExtendedResponseClassTest
implements org.j8unit.repository.javax.naming.ldap.ExtendedResponseClassTests<ExtendedResponse> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.ExtendedResponse]

    @Override
    public Class<ExtendedResponse> createNewSUT() {
        return ExtendedResponse.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.ExtendedResponse]

}
