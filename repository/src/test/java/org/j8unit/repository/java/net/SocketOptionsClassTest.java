package org.j8unit.repository.java.net;

import java.net.SocketOptions;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SocketOptions} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.SocketOptionsClassTests}).
 */

@RunWith(J8Unit4.class)
public class SocketOptionsClassTest
implements SocketOptionsClassTests<SocketOptions> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.SocketOptions]

    @Override
    public Class<SocketOptions> createNewSUT() {
        return SocketOptions.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.SocketOptions]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.SocketOptions]

}
