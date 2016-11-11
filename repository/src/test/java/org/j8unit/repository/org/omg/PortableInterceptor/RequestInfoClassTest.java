package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.RequestInfo;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RequestInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.RequestInfoClassTests}).
 */

@RunWith(J8Unit4.class)
public class RequestInfoClassTest
implements RequestInfoClassTests<RequestInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.RequestInfo]

    @Override
    public Class<RequestInfo> createNewSUT() {
        return RequestInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.RequestInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.RequestInfo]

}
