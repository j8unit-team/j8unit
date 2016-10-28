package org.j8unit.repository.java.nio.channels;

import java.nio.channels.SeekableByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SeekableByteChannelClassTest
implements org.j8unit.repository.java.nio.channels.SeekableByteChannelClassTests<SeekableByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.SeekableByteChannel]

    @Override
    public Class<SeekableByteChannel> createNewSUT() {
        return SeekableByteChannel.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.SeekableByteChannel]

}
