package org.j8unit.repository.java.nio.channels;

import java.nio.channels.ScatteringByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ScatteringByteChannel} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.nio.channels.ScatteringByteChannelTests}).
 */

@RunWith(J8Unit4.class)
public class ScatteringByteChannelTest
implements ScatteringByteChannelTests<ScatteringByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.ScatteringByteChannel]

    @Override
    public ScatteringByteChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.ScatteringByteChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.ScatteringByteChannel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.ScatteringByteChannel]

}
