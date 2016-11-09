package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.CurrentHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CurrentHelper} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.CurrentHelperTests}).
 */

@RunWith(J8Unit4.class)
public class CurrentHelperTest
implements org.j8unit.repository.org.omg.PortableServer.CurrentHelperTests<CurrentHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.CurrentHelper]

    @Override
    public CurrentHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.CurrentHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.CurrentHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.CurrentHelper]

}
