package org.j8unit.repository.java.nio.channels;

import java.nio.channels.SeekableByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SeekableByteChannel} (by simply reusing
 * the J8Unit test interface {@link SeekableByteChannelClassTests}).
 */

@RunWith(J8Unit4.class)
public class SeekableByteChannelClassTest
implements SeekableByteChannelClassTests<SeekableByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.SeekableByteChannel]

    @Override
    public Class<SeekableByteChannel> createNewSUT() {
        return SeekableByteChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.SeekableByteChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.SeekableByteChannel]

}
