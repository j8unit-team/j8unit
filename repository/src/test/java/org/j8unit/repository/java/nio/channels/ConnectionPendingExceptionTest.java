package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectionPendingExceptionTest
implements org.j8unit.repository.java.nio.channels.ConnectionPendingExceptionTests<java.nio.channels.ConnectionPendingException> {

    @Override
    public java.nio.channels.ConnectionPendingException createNewSUT() {
        return new java.nio.channels.ConnectionPendingException();
    }

}
