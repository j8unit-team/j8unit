package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ClientRequestInterceptor;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ClientRequestInterceptor} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.ClientRequestInterceptorClassTests}).
 */

@RunWith(J8Unit4.class)
public class ClientRequestInterceptorClassTest
implements ClientRequestInterceptorClassTests<ClientRequestInterceptor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ClientRequestInterceptor]

    @Override
    public Class<ClientRequestInterceptor> createNewSUT() {
        return ClientRequestInterceptor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ClientRequestInterceptor]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ClientRequestInterceptor]

}
