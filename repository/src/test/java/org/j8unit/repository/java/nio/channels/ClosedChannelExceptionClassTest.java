package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClosedChannelExceptionClassTest
implements org.j8unit.repository.java.nio.channels.ClosedChannelExceptionClassTests<java.nio.channels.ClosedChannelException> {

    @Override
    public Class<java.nio.channels.ClosedChannelException> createNewSUT() {
        return java.nio.channels.ClosedChannelException.class;
    }

}
