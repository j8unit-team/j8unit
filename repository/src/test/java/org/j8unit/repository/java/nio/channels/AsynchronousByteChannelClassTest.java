package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AsynchronousByteChannelClassTest
implements org.j8unit.repository.java.nio.channels.AsynchronousByteChannelClassTests<java.nio.channels.AsynchronousByteChannel> {

    @Override
    public Class<java.nio.channels.AsynchronousByteChannel> createNewSUT() {
        return java.nio.channels.AsynchronousByteChannel.class;
    }

}
