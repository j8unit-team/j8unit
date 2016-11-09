package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.TRANSPORT_RETRY;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TRANSPORT_RETRY} (by simply reusing the
 * J8Unit test interface {@link TRANSPORT_RETRYClassTests}).
 */

@RunWith(J8Unit4.class)
public class TRANSPORT_RETRYClassTest
implements TRANSPORT_RETRYClassTests<TRANSPORT_RETRY> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.TRANSPORT_RETRY]

    @Override
    public Class<TRANSPORT_RETRY> createNewSUT() {
        return TRANSPORT_RETRY.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.TRANSPORT_RETRY]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.TRANSPORT_RETRY]

}
