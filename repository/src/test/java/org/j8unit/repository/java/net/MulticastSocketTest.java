package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MulticastSocketTest
implements org.j8unit.repository.java.net.MulticastSocketTests<java.net.MulticastSocket> {

    @Override
    public java.net.MulticastSocket createNewSUT() {
        try {
            return new java.net.MulticastSocket();
        } catch (final Exception cause) {
            throw new AssertionError("Failed to create new subject-under-test instance!", cause);
        }

    }

}
