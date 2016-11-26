package org.j8unit.repository.java.nio.channels;

import java.nio.channels.ReadableByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ReadableByteChannel} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.nio.channels.ReadableByteChannelClassTests}).
 */
@RunWith(J8Unit4.class)
public class ReadableByteChannelClassTest
implements ReadableByteChannelClassTests<ReadableByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.ReadableByteChannel]

    @Override
    public Class<ReadableByteChannel> createNewSUT() {
        return ReadableByteChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.ReadableByteChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.ReadableByteChannel]

}
