package org.j8unit.repository.org.omg.PortableServer.CurrentPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.CurrentPackage.NoContextHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NoContextHelper} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.CurrentPackage.NoContextHelperTests}).
 */

@RunWith(J8Unit4.class)
public class NoContextHelperTest
implements NoContextHelperTests<NoContextHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.CurrentPackage.NoContextHelper]

    @Override
    public NoContextHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.CurrentPackage.NoContextHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.CurrentPackage.NoContextHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.CurrentPackage.NoContextHelper]

}
