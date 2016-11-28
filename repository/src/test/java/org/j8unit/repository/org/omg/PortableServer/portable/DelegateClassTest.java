package org.j8unit.repository.org.omg.PortableServer.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.portable.Delegate;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Delegate} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.PortableServer.portable.DelegateClassTests}).
 */
@RunWith(J8Unit4.class)
public class DelegateClassTest
implements org.j8unit.repository.org.omg.PortableServer.portable.DelegateClassTests<Delegate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.portable.Delegate]

    @Override
    public Class<Delegate> createNewSUT() {
        return Delegate.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.portable.Delegate]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.portable.Delegate]

}
