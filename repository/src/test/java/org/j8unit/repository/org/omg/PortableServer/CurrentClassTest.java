package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.Current;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Current} (by simply reusing the J8Unit
 * test interface {@link CurrentClassTests}).
 */

@RunWith(J8Unit4.class)
public class CurrentClassTest
implements CurrentClassTests<Current> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.Current]

    @Override
    public Class<Current> createNewSUT() {
        return Current.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.Current]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.Current]

}
