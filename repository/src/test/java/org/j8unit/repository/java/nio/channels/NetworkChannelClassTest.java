package org.j8unit.repository.java.nio.channels;

import java.nio.channels.NetworkChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NetworkChannelClassTest
implements org.j8unit.repository.java.nio.channels.NetworkChannelClassTests<NetworkChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.NetworkChannel]

    @Override
    public Class<NetworkChannel> createNewSUT() {
        return NetworkChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.NetworkChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.NetworkChannel]

}
