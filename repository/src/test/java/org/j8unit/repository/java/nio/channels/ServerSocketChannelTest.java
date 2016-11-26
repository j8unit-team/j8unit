package org.j8unit.repository.java.nio.channels;

import java.nio.channels.ServerSocketChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ServerSocketChannel} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.nio.channels.ServerSocketChannelTests}).
 */
@RunWith(J8Unit4.class)
public class ServerSocketChannelTest
implements ServerSocketChannelTests<ServerSocketChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.ServerSocketChannel]

    @Override
    public ServerSocketChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.ServerSocketChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.ServerSocketChannel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.ServerSocketChannel]

}
