package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerSocketTest
implements org.j8unit.repository.java.net.ServerSocketTests<java.net.ServerSocket> {

    @Override
    public java.net.ServerSocket createNewSUT() {
        try {
            return new java.net.ServerSocket();
        } catch (final Exception cause) {
            throw new AssertionError("Failed to create new subject-under-test instance!", cause);
        }

    }

}
