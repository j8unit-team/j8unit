package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ServerRequestInfo;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServerRequestInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInfoClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServerRequestInfoClassTest
implements ServerRequestInfoClassTests<ServerRequestInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInfo]

    @Override
    public Class<ServerRequestInfo> createNewSUT() {
        return ServerRequestInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ServerRequestInfo]

}
