package org.j8unit.repository.java.nio.channels;

import java.nio.channels.GatheringByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GatheringByteChannelClassTest
implements org.j8unit.repository.java.nio.channels.GatheringByteChannelClassTests<GatheringByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.GatheringByteChannel]

    @Override
    public Class<GatheringByteChannel> createNewSUT() {
        return GatheringByteChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.GatheringByteChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.GatheringByteChannel]

}
