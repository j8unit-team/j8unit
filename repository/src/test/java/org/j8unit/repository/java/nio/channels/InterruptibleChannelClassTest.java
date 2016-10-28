package org.j8unit.repository.java.nio.channels;

import java.nio.channels.InterruptibleChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InterruptibleChannelClassTest
implements org.j8unit.repository.java.nio.channels.InterruptibleChannelClassTests<InterruptibleChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.InterruptibleChannel]

    @Override
    public Class<InterruptibleChannel> createNewSUT() {
        return InterruptibleChannel.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.InterruptibleChannel]

}
