package org.j8unit.repository.java.net;

import java.net.NetworkInterface;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NetworkInterface} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.net.NetworkInterfaceTests}).
 */

@RunWith(J8Unit4.class)
public class NetworkInterfaceTest
implements NetworkInterfaceTests<NetworkInterface> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.NetworkInterface]

    @Override
    public NetworkInterface createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.NetworkInterface], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.NetworkInterface]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.NetworkInterface]

}
