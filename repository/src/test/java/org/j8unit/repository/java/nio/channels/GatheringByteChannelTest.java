package org.j8unit.repository.java.nio.channels;

import java.nio.channels.GatheringByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GatheringByteChannelTest
implements org.j8unit.repository.java.nio.channels.GatheringByteChannelTests<GatheringByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.GatheringByteChannel]

    @Override
    public GatheringByteChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.GatheringByteChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.GatheringByteChannel]

}
