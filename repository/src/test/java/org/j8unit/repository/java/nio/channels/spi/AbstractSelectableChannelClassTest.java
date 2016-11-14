package org.j8unit.repository.java.nio.channels.spi;

import java.nio.channels.spi.AbstractSelectableChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractSelectableChannel} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelClassTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractSelectableChannelClassTest
implements AbstractSelectableChannelClassTests<AbstractSelectableChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.spi.AbstractSelectableChannel]

    @Override
    public Class<AbstractSelectableChannel> createNewSUT() {
        return AbstractSelectableChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.spi.AbstractSelectableChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.spi.AbstractSelectableChannel]

}
