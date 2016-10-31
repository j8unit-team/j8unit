package org.j8unit.repository.java.nio.channels;

import java.nio.channels.AsynchronousChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AsynchronousChannelClassTest
implements org.j8unit.repository.java.nio.channels.AsynchronousChannelClassTests<AsynchronousChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.AsynchronousChannel]

    @Override
    public Class<AsynchronousChannel> createNewSUT() {
        return AsynchronousChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.AsynchronousChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.AsynchronousChannel]

}
