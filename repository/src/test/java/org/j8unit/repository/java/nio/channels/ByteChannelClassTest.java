package org.j8unit.repository.java.nio.channels;

import java.nio.channels.ByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ByteChannelClassTest
implements org.j8unit.repository.java.nio.channels.ByteChannelClassTests<ByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.ByteChannel]

    @Override
    public Class<ByteChannel> createNewSUT() {
        return ByteChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.ByteChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.ByteChannel]

}
