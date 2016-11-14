package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ServerRequestInterceptorOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServerRequestInterceptorOperations} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInterceptorOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServerRequestInterceptorOperationsClassTest
implements ServerRequestInterceptorOperationsClassTests<ServerRequestInterceptorOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInterceptorOperations]

    @Override
    public Class<ServerRequestInterceptorOperations> createNewSUT() {
        return ServerRequestInterceptorOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInterceptorOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInterceptorOperations]

}
