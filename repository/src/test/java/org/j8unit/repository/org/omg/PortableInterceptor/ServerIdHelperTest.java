package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ServerIdHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ServerIdHelper} (by simply reusing
 * the J8Unit test interface {@link ServerIdHelperTests}).
 */

@RunWith(J8Unit4.class)
public class ServerIdHelperTest
implements ServerIdHelperTests<ServerIdHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ServerIdHelper]

    @Override
    public ServerIdHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.ServerIdHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.ServerIdHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.ServerIdHelper]

}
