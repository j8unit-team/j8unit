package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ClientRequestInfo;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ClientRequestInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.ClientRequestInfoClassTests}).
 */
@RunWith(J8Unit4.class)
public class ClientRequestInfoClassTest
implements ClientRequestInfoClassTests<ClientRequestInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ClientRequestInfo]

    @Override
    public Class<ClientRequestInfo> createNewSUT() {
        return ClientRequestInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ClientRequestInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ClientRequestInfo]

}
