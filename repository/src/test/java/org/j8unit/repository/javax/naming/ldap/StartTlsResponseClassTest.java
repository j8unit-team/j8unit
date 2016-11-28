package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.StartTlsResponse;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StartTlsResponse} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.ldap.StartTlsResponseClassTests}).
 */
@RunWith(J8Unit4.class)
public class StartTlsResponseClassTest
implements StartTlsResponseClassTests<StartTlsResponse> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.StartTlsResponse]

    @Override
    public Class<StartTlsResponse> createNewSUT() {
        return StartTlsResponse.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.StartTlsResponse]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.StartTlsResponse]

}
