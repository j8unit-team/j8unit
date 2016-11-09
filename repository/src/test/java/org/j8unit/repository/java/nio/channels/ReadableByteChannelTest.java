package org.j8unit.repository.java.nio.channels;

import java.nio.channels.ReadableByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ReadableByteChannel} (by simply
 * reusing the J8Unit test interface {@link ReadableByteChannelTests}).
 */

@RunWith(J8Unit4.class)
public class ReadableByteChannelTest
implements ReadableByteChannelTests<ReadableByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.ReadableByteChannel]

    @Override
    public ReadableByteChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.ReadableByteChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.ReadableByteChannel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.ReadableByteChannel]

}
