package org.j8unit.repository.java.nio.channels;

import java.nio.channels.MulticastChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MulticastChannel} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.channels.MulticastChannelClassTests}).
 */

@RunWith(J8Unit4.class)
public class MulticastChannelClassTest
implements MulticastChannelClassTests<MulticastChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.MulticastChannel]

    @Override
    public Class<MulticastChannel> createNewSUT() {
        return MulticastChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.MulticastChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.MulticastChannel]

}
