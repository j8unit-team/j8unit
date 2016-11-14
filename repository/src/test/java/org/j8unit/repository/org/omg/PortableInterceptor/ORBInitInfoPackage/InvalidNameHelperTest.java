package org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidNameHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InvalidNameHelper} (by simply reusing
 * the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidNameHelperTests}).
 */

@RunWith(J8Unit4.class)
public class InvalidNameHelperTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidNameHelperTests<InvalidNameHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidNameHelper]

    @Override
    public InvalidNameHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidNameHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidNameHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidNameHelper]

}
