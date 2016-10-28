package org.j8unit.repository.java.nio.channels;

import java.nio.channels.ScatteringByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScatteringByteChannelTest
implements org.j8unit.repository.java.nio.channels.ScatteringByteChannelTests<ScatteringByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.ScatteringByteChannel]

    @Override
    public ScatteringByteChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.ScatteringByteChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.ScatteringByteChannel]

}
