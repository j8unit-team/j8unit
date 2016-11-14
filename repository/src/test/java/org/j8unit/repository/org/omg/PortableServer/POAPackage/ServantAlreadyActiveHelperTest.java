package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAPackage.ServantAlreadyActiveHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ServantAlreadyActiveHelper} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.POAPackage.ServantAlreadyActiveHelperTests}).
 */

@RunWith(J8Unit4.class)
public class ServantAlreadyActiveHelperTest
implements ServantAlreadyActiveHelperTests<ServantAlreadyActiveHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.POAPackage.ServantAlreadyActiveHelper]

    @Override
    public ServantAlreadyActiveHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.POAPackage.ServantAlreadyActiveHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.POAPackage.ServantAlreadyActiveHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.POAPackage.ServantAlreadyActiveHelper]

}
