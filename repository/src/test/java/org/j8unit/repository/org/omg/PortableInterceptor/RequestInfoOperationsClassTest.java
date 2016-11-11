package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.RequestInfoOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RequestInfoOperations} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.RequestInfoOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class RequestInfoOperationsClassTest
implements RequestInfoOperationsClassTests<RequestInfoOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.RequestInfoOperations]

    @Override
    public Class<RequestInfoOperations> createNewSUT() {
        return RequestInfoOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.RequestInfoOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.RequestInfoOperations]

}
