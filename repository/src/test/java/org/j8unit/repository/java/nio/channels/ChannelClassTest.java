package org.j8unit.repository.java.nio.channels;

import java.nio.channels.Channel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Channel} (by simply reusing the J8Unit
 * test interface {@link ChannelClassTests}).
 */

@RunWith(J8Unit4.class)
public class ChannelClassTest
implements ChannelClassTests<Channel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.Channel]

    @Override
    public Class<Channel> createNewSUT() {
        return Channel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.Channel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.Channel]

}
