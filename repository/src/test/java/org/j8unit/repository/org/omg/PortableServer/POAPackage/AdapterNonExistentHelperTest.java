package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAPackage.AdapterNonExistentHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AdapterNonExistentHelper} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.POAPackage.AdapterNonExistentHelperTests}).
 */
@RunWith(J8Unit4.class)
public class AdapterNonExistentHelperTest
implements AdapterNonExistentHelperTests<AdapterNonExistentHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.POAPackage.AdapterNonExistentHelper]

    @Override
    public AdapterNonExistentHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.POAPackage.AdapterNonExistentHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.POAPackage.AdapterNonExistentHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.POAPackage.AdapterNonExistentHelper]

}
