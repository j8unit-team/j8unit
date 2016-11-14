package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.RequestInfoOperations;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RequestInfoOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.RequestInfoOperationsTests}).
 */

@RunWith(J8Unit4.class)
public class RequestInfoOperationsTest
implements RequestInfoOperationsTests<RequestInfoOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.RequestInfoOperations]

    @Override
    public RequestInfoOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.RequestInfoOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.RequestInfoOperations]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.RequestInfoOperations]

}
