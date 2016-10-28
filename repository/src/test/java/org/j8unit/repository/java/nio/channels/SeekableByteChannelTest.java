package org.j8unit.repository.java.nio.channels;

import java.nio.channels.SeekableByteChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SeekableByteChannelTest
implements org.j8unit.repository.java.nio.channels.SeekableByteChannelTests<SeekableByteChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.SeekableByteChannel]

    @Override
    public SeekableByteChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.SeekableByteChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.SeekableByteChannel]

}
