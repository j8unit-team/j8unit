package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerSocketChannelClassTest
implements org.j8unit.repository.java.nio.channels.ServerSocketChannelClassTests<java.nio.channels.ServerSocketChannel> {

    @Override
    public Class<java.nio.channels.ServerSocketChannel> createNewSUT() {
        return java.nio.channels.ServerSocketChannel.class;
    }

}
