package org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateNameHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DuplicateNameHelper} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateNameHelperTests}).
 */

@RunWith(J8Unit4.class)
public class DuplicateNameHelperTest
implements DuplicateNameHelperTests<DuplicateNameHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateNameHelper]

    @Override
    public DuplicateNameHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateNameHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateNameHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateNameHelper]

}
