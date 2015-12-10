package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SeekableByteChannelClassTest
implements org.j8unit.repository.java.nio.channels.SeekableByteChannelClassTests<java.nio.channels.SeekableByteChannel> {

    @Override
    public Class<java.nio.channels.SeekableByteChannel> createNewSUT() {
        return java.nio.channels.SeekableByteChannel.class;
    }

}
