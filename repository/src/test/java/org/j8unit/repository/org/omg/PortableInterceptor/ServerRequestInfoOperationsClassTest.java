package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ServerRequestInfoOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServerRequestInfoOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInfoOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServerRequestInfoOperationsClassTest
implements ServerRequestInfoOperationsClassTests<ServerRequestInfoOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInfoOperations]

    @Override
    public Class<ServerRequestInfoOperations> createNewSUT() {
        return ServerRequestInfoOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInfoOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInfoOperations]

}
