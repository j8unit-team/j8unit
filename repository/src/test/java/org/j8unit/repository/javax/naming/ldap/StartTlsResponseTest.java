package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.StartTlsResponse;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StartTlsResponse} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.naming.ldap.StartTlsResponseTests}).
 */

@RunWith(J8Unit4.class)
public class StartTlsResponseTest
implements StartTlsResponseTests<StartTlsResponse> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ldap.StartTlsResponse]

    @Override
    public StartTlsResponse createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.ldap.StartTlsResponse], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.ldap.StartTlsResponse]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.ldap.StartTlsResponse]

}
