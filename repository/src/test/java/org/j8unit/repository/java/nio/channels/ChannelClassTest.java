package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChannelClassTest
implements org.j8unit.repository.java.nio.channels.ChannelClassTests<java.nio.channels.Channel> {

    @Override
    public Class<java.nio.channels.Channel> createNewSUT() {
        return java.nio.channels.Channel.class;
    }

}
