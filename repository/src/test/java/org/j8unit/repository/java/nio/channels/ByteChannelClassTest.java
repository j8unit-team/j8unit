package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ByteChannelClassTest
implements org.j8unit.repository.java.nio.channels.ByteChannelClassTests<java.nio.channels.ByteChannel> {

    @Override
    public Class<java.nio.channels.ByteChannel> createNewSUT() {
        return java.nio.channels.ByteChannel.class;
    }

}
