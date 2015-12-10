package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClosedChannelExceptionTest
implements org.j8unit.repository.java.nio.channels.ClosedChannelExceptionTests<java.nio.channels.ClosedChannelException> {

    @Override
    public java.nio.channels.ClosedChannelException createNewSUT() {
        return new java.nio.channels.ClosedChannelException();
    }

}
