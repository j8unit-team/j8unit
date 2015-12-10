package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MulticastChannelClassTest
implements org.j8unit.repository.java.nio.channels.MulticastChannelClassTests<java.nio.channels.MulticastChannel> {

    @Override
    public Class<java.nio.channels.MulticastChannel> createNewSUT() {
        return java.nio.channels.MulticastChannel.class;
    }

}
