package org.j8unit.repository.java.net;

import java.net.SocketOption;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SocketOption} (by simply reusing the
 * J8Unit test interface {@link SocketOptionClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SocketOptionClassTest
implements SocketOptionClassTests<SocketOption> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.SocketOption]

    @Override
    public Class<SocketOption> createNewSUT() {
        return SocketOption.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.SocketOption]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.SocketOption]

}
