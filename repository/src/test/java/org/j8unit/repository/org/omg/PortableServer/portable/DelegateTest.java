package org.j8unit.repository.org.omg.PortableServer.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.portable.Delegate;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Delegate} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.portable.DelegateTests}).
 */
@RunWith(J8Unit4.class)
public class DelegateTest
implements org.j8unit.repository.org.omg.PortableServer.portable.DelegateTests<Delegate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.portable.Delegate]

    @Override
    public Delegate createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.portable.Delegate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.portable.Delegate]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.portable.Delegate]

}
