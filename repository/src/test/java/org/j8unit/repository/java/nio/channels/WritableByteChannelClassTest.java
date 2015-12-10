package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WritableByteChannelClassTest
implements org.j8unit.repository.java.nio.channels.WritableByteChannelClassTests<java.nio.channels.WritableByteChannel> {

    @Override
    public Class<java.nio.channels.WritableByteChannel> createNewSUT() {
        return java.nio.channels.WritableByteChannel.class;
    }

}
