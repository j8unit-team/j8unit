package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.LOCATION_FORWARD;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LOCATION_FORWARD} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.LOCATION_FORWARDTests}).
 */
@RunWith(J8Unit4.class)
public class LOCATION_FORWARDTest
implements LOCATION_FORWARDTests<LOCATION_FORWARD> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.LOCATION_FORWARD]

    @Override
    public LOCATION_FORWARD createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.LOCATION_FORWARD], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.LOCATION_FORWARD]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.LOCATION_FORWARD]

}
