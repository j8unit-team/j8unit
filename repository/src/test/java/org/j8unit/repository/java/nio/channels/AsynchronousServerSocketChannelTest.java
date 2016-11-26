package org.j8unit.repository.java.nio.channels;

import java.nio.channels.AsynchronousServerSocketChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AsynchronousServerSocketChannel} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.channels.AsynchronousServerSocketChannelTests}).
 */
@RunWith(J8Unit4.class)
public class AsynchronousServerSocketChannelTest
implements AsynchronousServerSocketChannelTests<AsynchronousServerSocketChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.AsynchronousServerSocketChannel]

    @Override
    public AsynchronousServerSocketChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.AsynchronousServerSocketChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.AsynchronousServerSocketChannel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.AsynchronousServerSocketChannel]

}
