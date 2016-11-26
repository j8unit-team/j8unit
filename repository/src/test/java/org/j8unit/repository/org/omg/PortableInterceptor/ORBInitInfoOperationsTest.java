package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ORBInitInfoOperations;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ORBInitInfoOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoOperationsTests}).
 */
@RunWith(J8Unit4.class)
public class ORBInitInfoOperationsTest
implements ORBInitInfoOperationsTests<ORBInitInfoOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ORBInitInfoOperations]

    @Override
    public ORBInitInfoOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.ORBInitInfoOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.ORBInitInfoOperations]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.ORBInitInfoOperations]

}
