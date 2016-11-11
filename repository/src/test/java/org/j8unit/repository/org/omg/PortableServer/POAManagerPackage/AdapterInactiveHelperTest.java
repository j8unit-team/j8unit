package org.j8unit.repository.org.omg.PortableServer.POAManagerPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAManagerPackage.AdapterInactiveHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AdapterInactiveHelper} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.POAManagerPackage.AdapterInactiveHelperTests}).
 */

@RunWith(J8Unit4.class)
public class AdapterInactiveHelperTest
implements AdapterInactiveHelperTests<AdapterInactiveHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.POAManagerPackage.AdapterInactiveHelper]

    @Override
    public AdapterInactiveHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.POAManagerPackage.AdapterInactiveHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.POAManagerPackage.AdapterInactiveHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.POAManagerPackage.AdapterInactiveHelper]

}
