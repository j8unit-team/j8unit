package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InterruptibleChannelClassTest
implements org.j8unit.repository.java.nio.channels.InterruptibleChannelClassTests<java.nio.channels.InterruptibleChannel> {

    @Override
    public Class<java.nio.channels.InterruptibleChannel> createNewSUT() {
        return java.nio.channels.InterruptibleChannel.class;
    }

}
