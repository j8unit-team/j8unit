package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAPackage.NoServantHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NoServantHelper} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.POAPackage.NoServantHelperTests}).
 */

@RunWith(J8Unit4.class)
public class NoServantHelperTest
implements NoServantHelperTests<NoServantHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.POAPackage.NoServantHelper]

    @Override
    public NoServantHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.POAPackage.NoServantHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.POAPackage.NoServantHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.POAPackage.NoServantHelper]

}
