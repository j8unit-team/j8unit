package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AsynchronousServerSocketChannelClassTest
implements org.j8unit.repository.java.nio.channels.AsynchronousServerSocketChannelClassTests<java.nio.channels.AsynchronousServerSocketChannel> {

    @Override
    public Class<java.nio.channels.AsynchronousServerSocketChannel> createNewSUT() {
        return java.nio.channels.AsynchronousServerSocketChannel.class;
    }

}
