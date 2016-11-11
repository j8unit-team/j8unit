package org.j8unit.repository.java.rmi.server;

import java.rmi.server.Unreferenced;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Unreferenced} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.rmi.server.UnreferencedClassTests}).
 */

@RunWith(J8Unit4.class)
public class UnreferencedClassTest
implements UnreferencedClassTests<Unreferenced> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.Unreferenced]

    @Override
    public Class<Unreferenced> createNewSUT() {
        return Unreferenced.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.Unreferenced]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.Unreferenced]

}
