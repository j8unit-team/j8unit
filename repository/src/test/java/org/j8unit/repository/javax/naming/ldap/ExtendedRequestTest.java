package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.ExtendedRequest;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ExtendedRequest} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.naming.ldap.ExtendedRequestTests}).
 */
@RunWith(J8Unit4.class)
public class ExtendedRequestTest
implements ExtendedRequestTests<ExtendedRequest> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ldap.ExtendedRequest]

    @Override
    public ExtendedRequest createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.ldap.ExtendedRequest], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.ldap.ExtendedRequest]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.ldap.ExtendedRequest]

}
