package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketHandlerTest
implements org.j8unit.repository.java.util.logging.SocketHandlerTests<java.util.logging.SocketHandler> {

    @Override
    public java.util.logging.SocketHandler createNewSUT() {
        try {
            return new java.util.logging.SocketHandler();
        } catch (final Exception cause) {
            throw new AssertionError("Failed to create new subject-under-test instance!", cause);
        }

    }

}
