package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.PortableRemoteObjectDelegate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PortableRemoteObjectDelegate} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.rmi.CORBA.PortableRemoteObjectDelegateClassTests}).
 */
@RunWith(J8Unit4.class)
public class PortableRemoteObjectDelegateClassTest
implements PortableRemoteObjectDelegateClassTests<PortableRemoteObjectDelegate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.rmi.CORBA.PortableRemoteObjectDelegate]

    @Override
    public Class<PortableRemoteObjectDelegate> createNewSUT() {
        return PortableRemoteObjectDelegate.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.rmi.CORBA.PortableRemoteObjectDelegate]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.rmi.CORBA.PortableRemoteObjectDelegate]

}
