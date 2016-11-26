package org.j8unit.repository.java.net;

import java.net.SocketImplFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SocketImplFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.SocketImplFactoryClassTests}).
 */
@RunWith(J8Unit4.class)
public class SocketImplFactoryClassTest
implements SocketImplFactoryClassTests<SocketImplFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.SocketImplFactory]

    @Override
    public Class<SocketImplFactory> createNewSUT() {
        return SocketImplFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.SocketImplFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.SocketImplFactory]

}
