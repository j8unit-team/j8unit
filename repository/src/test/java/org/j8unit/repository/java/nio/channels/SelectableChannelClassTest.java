package org.j8unit.repository.java.nio.channels;

import java.nio.channels.SelectableChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SelectableChannelClassTest
implements org.j8unit.repository.java.nio.channels.SelectableChannelClassTests<SelectableChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.SelectableChannel]

    @Override
    public Class<SelectableChannel> createNewSUT() {
        return SelectableChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.SelectableChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.SelectableChannel]

}
