package org.j8unit.repository.java.nio.channels;

import java.nio.channels.GatheringByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link GatheringByteChannel} (by simply
 * reusing the J8Unit test interface {@link GatheringByteChannelTests}).
 */

@RunWith(J8Unit4.class)
public class GatheringByteChannelTest
implements GatheringByteChannelTests<GatheringByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.GatheringByteChannel]

    @Override
    public GatheringByteChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.GatheringByteChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.GatheringByteChannel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.GatheringByteChannel]

}
