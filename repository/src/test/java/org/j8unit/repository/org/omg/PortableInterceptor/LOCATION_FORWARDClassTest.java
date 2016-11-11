package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.LOCATION_FORWARD;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LOCATION_FORWARD} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.LOCATION_FORWARDClassTests}).
 */

@RunWith(J8Unit4.class)
public class LOCATION_FORWARDClassTest
implements LOCATION_FORWARDClassTests<LOCATION_FORWARD> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.LOCATION_FORWARD]

    @Override
    public Class<LOCATION_FORWARD> createNewSUT() {
        return LOCATION_FORWARD.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.LOCATION_FORWARD]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.LOCATION_FORWARD]

}
