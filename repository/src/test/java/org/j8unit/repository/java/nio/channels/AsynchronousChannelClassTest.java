package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AsynchronousChannelClassTest
implements org.j8unit.repository.java.nio.channels.AsynchronousChannelClassTests<java.nio.channels.AsynchronousChannel> {

    @Override
    public Class<java.nio.channels.AsynchronousChannel> createNewSUT() {
        return java.nio.channels.AsynchronousChannel.class;
    }

}
