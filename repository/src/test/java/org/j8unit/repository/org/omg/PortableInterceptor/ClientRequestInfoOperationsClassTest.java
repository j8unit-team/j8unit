package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ClientRequestInfoOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ClientRequestInfoOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.ClientRequestInfoOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class ClientRequestInfoOperationsClassTest
implements ClientRequestInfoOperationsClassTests<ClientRequestInfoOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ClientRequestInfoOperations]

    @Override
    public Class<ClientRequestInfoOperations> createNewSUT() {
        return ClientRequestInfoOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ClientRequestInfoOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ClientRequestInfoOperations]

}
