package org.j8unit.repository.java.nio.channels;

import java.nio.channels.InterruptibleChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InterruptibleChannel} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.nio.channels.InterruptibleChannelClassTests}).
 */

@RunWith(J8Unit4.class)
public class InterruptibleChannelClassTest
implements InterruptibleChannelClassTests<InterruptibleChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.InterruptibleChannel]

    @Override
    public Class<InterruptibleChannel> createNewSUT() {
        return InterruptibleChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.InterruptibleChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.InterruptibleChannel]

}
