package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.AdapterManagerIdHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AdapterManagerIdHelper} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.AdapterManagerIdHelperTests}).
 */

@RunWith(J8Unit4.class)
public class AdapterManagerIdHelperTest
implements AdapterManagerIdHelperTests<AdapterManagerIdHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.AdapterManagerIdHelper]

    @Override
    public AdapterManagerIdHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.AdapterManagerIdHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.AdapterManagerIdHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.AdapterManagerIdHelper]

}
