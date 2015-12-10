package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SelectableChannelClassTest
implements org.j8unit.repository.java.nio.channels.SelectableChannelClassTests<java.nio.channels.SelectableChannel> {

    @Override
    public Class<java.nio.channels.SelectableChannel> createNewSUT() {
        return java.nio.channels.SelectableChannel.class;
    }

}
