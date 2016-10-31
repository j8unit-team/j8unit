package org.j8unit.repository.java.nio.channels;

import java.nio.channels.AsynchronousChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AsynchronousChannelTest
implements org.j8unit.repository.java.nio.channels.AsynchronousChannelTests<AsynchronousChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.AsynchronousChannel]

    @Override
    public AsynchronousChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.AsynchronousChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.AsynchronousChannel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.AsynchronousChannel]

}
