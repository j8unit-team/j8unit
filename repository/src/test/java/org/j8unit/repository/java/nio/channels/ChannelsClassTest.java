package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChannelsClassTest
implements org.j8unit.repository.java.nio.channels.ChannelsClassTests<java.nio.channels.Channels> {

    @Override
    public Class<java.nio.channels.Channels> createNewSUT() {
        return java.nio.channels.Channels.class;
    }

}
