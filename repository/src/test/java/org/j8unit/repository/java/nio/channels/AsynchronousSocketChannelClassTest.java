package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AsynchronousSocketChannelClassTest
implements org.j8unit.repository.java.nio.channels.AsynchronousSocketChannelClassTests<java.nio.channels.AsynchronousSocketChannel> {

    @Override
    public Class<java.nio.channels.AsynchronousSocketChannel> createNewSUT() {
        return java.nio.channels.AsynchronousSocketChannel.class;
    }

}
