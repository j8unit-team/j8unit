package org.j8unit.repository.java.nio.channels.spi;

import java.nio.channels.spi.AbstractSelectableChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractSelectableChannelTest
implements org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelTests<AbstractSelectableChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.spi.AbstractSelectableChannel]

    @Override
    public AbstractSelectableChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.spi.AbstractSelectableChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.spi.AbstractSelectableChannel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.spi.AbstractSelectableChannel]

}
