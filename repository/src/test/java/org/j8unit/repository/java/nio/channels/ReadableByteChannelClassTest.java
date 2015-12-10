package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReadableByteChannelClassTest
implements org.j8unit.repository.java.nio.channels.ReadableByteChannelClassTests<java.nio.channels.ReadableByteChannel> {

    @Override
    public Class<java.nio.channels.ReadableByteChannel> createNewSUT() {
        return java.nio.channels.ReadableByteChannel.class;
    }

}
