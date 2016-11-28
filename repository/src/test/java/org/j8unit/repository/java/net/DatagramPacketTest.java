package org.j8unit.repository.java.net;

import java.net.DatagramPacket;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DatagramPacket} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.net.DatagramPacketTests}).
 */
@RunWith(J8Unit4.class)
public class DatagramPacketTest
implements DatagramPacketTests<DatagramPacket> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.DatagramPacket]

    @Override
    public DatagramPacket createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.DatagramPacket], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.DatagramPacket]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.DatagramPacket]

}
