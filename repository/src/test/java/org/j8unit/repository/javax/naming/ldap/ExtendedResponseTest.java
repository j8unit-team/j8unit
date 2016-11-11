package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.ExtendedResponse;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ExtendedResponse} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.naming.ldap.ExtendedResponseTests}).
 */

@RunWith(J8Unit4.class)
public class ExtendedResponseTest
implements ExtendedResponseTests<ExtendedResponse> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ldap.ExtendedResponse]

    @Override
    public ExtendedResponse createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.ldap.ExtendedResponse], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.ldap.ExtendedResponse]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.ldap.ExtendedResponse]

}
