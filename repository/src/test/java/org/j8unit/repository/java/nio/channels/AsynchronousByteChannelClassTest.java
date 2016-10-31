package org.j8unit.repository.java.nio.channels;

import java.nio.channels.AsynchronousByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AsynchronousByteChannelClassTest
implements org.j8unit.repository.java.nio.channels.AsynchronousByteChannelClassTests<AsynchronousByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.AsynchronousByteChannel]

    @Override
    public Class<AsynchronousByteChannel> createNewSUT() {
        return AsynchronousByteChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.AsynchronousByteChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.AsynchronousByteChannel]

}
