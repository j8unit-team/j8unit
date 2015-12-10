package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NetworkChannelClassTest
implements org.j8unit.repository.java.nio.channels.NetworkChannelClassTests<java.nio.channels.NetworkChannel> {

    @Override
    public Class<java.nio.channels.NetworkChannel> createNewSUT() {
        return java.nio.channels.NetworkChannel.class;
    }

}
