package org.j8unit.repository.java.nio.channels.spi;

import java.nio.channels.spi.AbstractInterruptibleChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractInterruptibleChannel} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.channels.spi.AbstractInterruptibleChannelClassTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractInterruptibleChannelClassTest
implements AbstractInterruptibleChannelClassTests<AbstractInterruptibleChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.spi.AbstractInterruptibleChannel]

    @Override
    public Class<AbstractInterruptibleChannel> createNewSUT() {
        return AbstractInterruptibleChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.spi.AbstractInterruptibleChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.spi.AbstractInterruptibleChannel]

}
