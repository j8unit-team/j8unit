package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ClientRequestInterceptorOperations;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ClientRequestInterceptorOperations}
 * (by simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.ClientRequestInterceptorOperationsTests}).
 */
@RunWith(J8Unit4.class)
public class ClientRequestInterceptorOperationsTest
implements ClientRequestInterceptorOperationsTests<ClientRequestInterceptorOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ClientRequestInterceptorOperations]

    @Override
    public ClientRequestInterceptorOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.ClientRequestInterceptorOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.ClientRequestInterceptorOperations]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.ClientRequestInterceptorOperations]

}
