package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.AdapterNameHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AdapterNameHelper} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.AdapterNameHelperTests}).
 */

@RunWith(J8Unit4.class)
public class AdapterNameHelperTest
implements AdapterNameHelperTests<AdapterNameHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.AdapterNameHelper]

    @Override
    public AdapterNameHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.AdapterNameHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.AdapterNameHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.AdapterNameHelper]

}
