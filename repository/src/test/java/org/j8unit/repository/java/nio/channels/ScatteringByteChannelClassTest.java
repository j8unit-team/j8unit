package org.j8unit.repository.java.nio.channels;

import java.nio.channels.ScatteringByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ScatteringByteChannel} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.nio.channels.ScatteringByteChannelClassTests}).
 */
@RunWith(J8Unit4.class)
public class ScatteringByteChannelClassTest
implements ScatteringByteChannelClassTests<ScatteringByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.ScatteringByteChannel]

    @Override
    public Class<ScatteringByteChannel> createNewSUT() {
        return ScatteringByteChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.ScatteringByteChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.ScatteringByteChannel]

}
