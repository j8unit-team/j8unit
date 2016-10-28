package org.j8unit.repository.java.nio.channels;

import java.nio.channels.InterruptibleChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InterruptibleChannelTest
implements org.j8unit.repository.java.nio.channels.InterruptibleChannelTests<InterruptibleChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.InterruptibleChannel]

    @Override
    public InterruptibleChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.InterruptibleChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.InterruptibleChannel]

}
