package org.j8unit.repository.java.nio.channels;

import java.nio.channels.AsynchronousByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AsynchronousByteChannel} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.nio.channels.AsynchronousByteChannelTests}).
 */
@RunWith(J8Unit4.class)
public class AsynchronousByteChannelTest
implements AsynchronousByteChannelTests<AsynchronousByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.AsynchronousByteChannel]

    @Override
    public AsynchronousByteChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.AsynchronousByteChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.AsynchronousByteChannel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.AsynchronousByteChannel]

}
