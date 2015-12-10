package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GatheringByteChannelClassTest
implements org.j8unit.repository.java.nio.channels.GatheringByteChannelClassTests<java.nio.channels.GatheringByteChannel> {

    @Override
    public Class<java.nio.channels.GatheringByteChannel> createNewSUT() {
        return java.nio.channels.GatheringByteChannel.class;
    }

}
