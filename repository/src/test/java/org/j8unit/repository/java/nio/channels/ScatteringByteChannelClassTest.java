package org.j8unit.repository.java.nio.channels;

import java.nio.channels.ScatteringByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScatteringByteChannelClassTest
implements org.j8unit.repository.java.nio.channels.ScatteringByteChannelClassTests<ScatteringByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.ScatteringByteChannel]

    @Override
    public Class<ScatteringByteChannel> createNewSUT() {
        return ScatteringByteChannel.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.ScatteringByteChannel]

}
