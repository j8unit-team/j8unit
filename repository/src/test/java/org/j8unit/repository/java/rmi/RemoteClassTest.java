package org.j8unit.repository.java.rmi;

import java.rmi.Remote;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Remote} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.rmi.RemoteClassTests}).
 */
@RunWith(J8Unit4.class)
public class RemoteClassTest
implements RemoteClassTests<Remote> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.Remote]

    @Override
    public Class<Remote> createNewSUT() {
        return Remote.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.Remote]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.Remote]

}
