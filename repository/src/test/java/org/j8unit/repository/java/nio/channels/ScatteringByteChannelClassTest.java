package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScatteringByteChannelClassTest
implements org.j8unit.repository.java.nio.channels.ScatteringByteChannelClassTests<java.nio.channels.ScatteringByteChannel> {

    @Override
    public Class<java.nio.channels.ScatteringByteChannel> createNewSUT() {
        return java.nio.channels.ScatteringByteChannel.class;
    }

}
