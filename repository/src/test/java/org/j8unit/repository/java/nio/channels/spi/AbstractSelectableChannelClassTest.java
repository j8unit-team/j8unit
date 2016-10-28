package org.j8unit.repository.java.nio.channels.spi;

import java.nio.channels.spi.AbstractSelectableChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractSelectableChannelClassTest
implements org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelClassTests<AbstractSelectableChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.spi.AbstractSelectableChannel]

    @Override
    public Class<AbstractSelectableChannel> createNewSUT() {
        return AbstractSelectableChannel.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.spi.AbstractSelectableChannel]

}
