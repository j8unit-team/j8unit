package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ServerRequestInterceptor;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServerRequestInterceptor} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInterceptorClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServerRequestInterceptorClassTest
implements ServerRequestInterceptorClassTests<ServerRequestInterceptor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInterceptor]

    @Override
    public Class<ServerRequestInterceptor> createNewSUT() {
        return ServerRequestInterceptor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInterceptor]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInterceptor]

}
