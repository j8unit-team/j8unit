package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatagramSocketTest
implements org.j8unit.repository.java.net.DatagramSocketTests<java.net.DatagramSocket> {

    @Override
    public java.net.DatagramSocket createNewSUT() {
        try {
            return new java.net.DatagramSocket();
        } catch (final Exception cause) {
            throw new AssertionError("Failed to create new subject-under-test instance!", cause);
        }

    }

}
