package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatagramChannelClassTest
implements org.j8unit.repository.java.nio.channels.DatagramChannelClassTests<java.nio.channels.DatagramChannel> {

    @Override
    public Class<java.nio.channels.DatagramChannel> createNewSUT() {
        return java.nio.channels.DatagramChannel.class;
    }

}
