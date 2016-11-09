package org.j8unit.repository.java.nio.channels;

import java.nio.channels.Pipe;
import java.nio.channels.Pipe.SinkChannel;
import java.nio.channels.Pipe.SourceChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Pipe} (by simply reusing the J8Unit
 * test interface {@link PipeTests}).
 */

@RunWith(J8Unit4.class)
public class PipeTest
implements PipeTests<Pipe> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.Pipe]

    @Override
    public Pipe createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.Pipe], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.Pipe]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.Pipe]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link SourceChannel} (by simply reusing
     * the J8Unit test interface {@link SourceChannelTests}).
     */

    @RunWith(J8Unit4.class)
    public static class SourceChannelTest
    implements SourceChannelTests<SourceChannel> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.Pipe$SourceChannel]

        @Override
        public SourceChannel createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.Pipe.SourceChannel], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.Pipe$SourceChannel]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.Pipe$SourceChannel]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link SinkChannel} (by simply reusing
     * the J8Unit test interface {@link SinkChannelTests}).
     */

    @RunWith(J8Unit4.class)
    public static class SinkChannelTest
    implements SinkChannelTests<SinkChannel> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.Pipe$SinkChannel]

        @Override
        public SinkChannel createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.Pipe.SinkChannel], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.Pipe$SinkChannel]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.Pipe$SinkChannel]

    }

}
