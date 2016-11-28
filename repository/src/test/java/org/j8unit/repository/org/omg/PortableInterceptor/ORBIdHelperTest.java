package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ORBIdHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ORBIdHelper} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.ORBIdHelperTests}).
 */
@RunWith(J8Unit4.class)
public class ORBIdHelperTest
implements ORBIdHelperTests<ORBIdHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ORBIdHelper]

    @Override
    public ORBIdHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.ORBIdHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.ORBIdHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.ORBIdHelper]

}
