package org.j8unit.repository.java.nio.channels.spi;

import java.nio.channels.spi.AbstractInterruptibleChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractInterruptibleChannel} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.channels.spi.AbstractInterruptibleChannelTests}).
 */
@RunWith(J8Unit4.class)
public class AbstractInterruptibleChannelTest
implements AbstractInterruptibleChannelTests<AbstractInterruptibleChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.spi.AbstractInterruptibleChannel]

    @Override
    public AbstractInterruptibleChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.spi.AbstractInterruptibleChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.spi.AbstractInterruptibleChannel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.spi.AbstractInterruptibleChannel]

}
