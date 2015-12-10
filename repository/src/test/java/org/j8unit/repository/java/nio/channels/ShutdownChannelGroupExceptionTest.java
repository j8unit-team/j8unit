package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShutdownChannelGroupExceptionTest
implements org.j8unit.repository.java.nio.channels.ShutdownChannelGroupExceptionTests<java.nio.channels.ShutdownChannelGroupException> {

    @Override
    public java.nio.channels.ShutdownChannelGroupException createNewSUT() {
        return new java.nio.channels.ShutdownChannelGroupException();
    }

}
