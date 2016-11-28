package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ServerRequestInterceptorOperations;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ServerRequestInterceptorOperations}
 * (by simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInterceptorOperationsTests}).
 */
@RunWith(J8Unit4.class)
public class ServerRequestInterceptorOperationsTest
implements ServerRequestInterceptorOperationsTests<ServerRequestInterceptorOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ServerRequestInterceptorOperations]

    @Override
    public ServerRequestInterceptorOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.ServerRequestInterceptorOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.ServerRequestInterceptorOperations]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.ServerRequestInterceptorOperations]

}
