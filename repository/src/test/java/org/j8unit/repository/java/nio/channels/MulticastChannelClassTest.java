package org.j8unit.repository.java.nio.channels;

import java.nio.channels.MulticastChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MulticastChannelClassTest
implements org.j8unit.repository.java.nio.channels.MulticastChannelClassTests<MulticastChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.MulticastChannel]

    @Override
    public Class<MulticastChannel> createNewSUT() {
        return MulticastChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.MulticastChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.MulticastChannel]

}
