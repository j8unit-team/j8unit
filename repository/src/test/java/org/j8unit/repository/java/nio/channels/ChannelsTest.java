package org.j8unit.repository.java.nio.channels;

import java.nio.channels.Channels;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Channels} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.channels.ChannelsTests}).
 */

@RunWith(J8Unit4.class)
public class ChannelsTest
implements ChannelsTests<Channels> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.Channels]

    @Override
    public Channels createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.channels.Channels], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.Channels]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.Channels]

}
