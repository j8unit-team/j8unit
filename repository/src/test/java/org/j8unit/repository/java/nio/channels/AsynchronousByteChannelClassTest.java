package org.j8unit.repository.java.nio.channels;

import java.nio.channels.AsynchronousByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AsynchronousByteChannel} (by simply
 * reusing the J8Unit test interface {@link AsynchronousByteChannelClassTests}).
 */

@RunWith(J8Unit4.class)
public class AsynchronousByteChannelClassTest
implements AsynchronousByteChannelClassTests<AsynchronousByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.AsynchronousByteChannel]

    @Override
    public Class<AsynchronousByteChannel> createNewSUT() {
        return AsynchronousByteChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.AsynchronousByteChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.AsynchronousByteChannel]

}
