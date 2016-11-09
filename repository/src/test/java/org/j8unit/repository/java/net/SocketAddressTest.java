package org.j8unit.repository.java.net;

import java.net.SocketAddress;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SocketAddress} (by simply reusing the
 * J8Unit test interface {@link SocketAddressTests}).
 */

@RunWith(J8Unit4.class)
public class SocketAddressTest
implements SocketAddressTests<SocketAddress> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.SocketAddress]

    @Override
    public SocketAddress createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.SocketAddress], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.SocketAddress]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.SocketAddress]

}
