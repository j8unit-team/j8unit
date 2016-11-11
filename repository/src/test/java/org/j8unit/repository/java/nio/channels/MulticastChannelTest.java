package org.j8unit.repository.java.nio.channels;

import java.nio.channels.MulticastChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MulticastChannel} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.nio.channels.MulticastChannelTests}).
 */

@RunWith(J8Unit4.class)
public class MulticastChannelTest
implements MulticastChannelTests<MulticastChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.MulticastChannel]

    @Override
    public MulticastChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.MulticastChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.MulticastChannel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.MulticastChannel]

}
