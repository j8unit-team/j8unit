package org.j8unit.repository.java.nio.channels;

import java.nio.channels.WritableByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WritableByteChannelClassTest
implements org.j8unit.repository.java.nio.channels.WritableByteChannelClassTests<WritableByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.WritableByteChannel]

    @Override
    public Class<WritableByteChannel> createNewSUT() {
        return WritableByteChannel.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.WritableByteChannel]

}
