package org.j8unit.repository.java.nio.channels;

import java.nio.channels.GatheringByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GatheringByteChannel} (by simply reusing
 * the J8Unit test interface {@link GatheringByteChannelClassTests}).
 */

@RunWith(J8Unit4.class)
public class GatheringByteChannelClassTest
implements GatheringByteChannelClassTests<GatheringByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.GatheringByteChannel]

    @Override
    public Class<GatheringByteChannel> createNewSUT() {
        return GatheringByteChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.GatheringByteChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.GatheringByteChannel]

}
