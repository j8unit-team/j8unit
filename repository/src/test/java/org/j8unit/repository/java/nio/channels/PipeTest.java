package org.j8unit.repository.java.nio.channels;

import java.nio.channels.Pipe;
import java.nio.channels.Pipe.SinkChannel;
import java.nio.channels.Pipe.SourceChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PipeTest
implements org.j8unit.repository.java.nio.channels.PipeTests<Pipe> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.Pipe]

    @Override
    public Pipe createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.Pipe], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.Pipe]

    @RunWith(J8Unit4.class)
    public static class SinkChannelTest
    implements org.j8unit.repository.java.nio.channels.PipeTests.SinkChannelTests<SinkChannel> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.Pipe$SinkChannel]

        @Override
        public SinkChannel createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.Pipe.SinkChannel], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.Pipe$SinkChannel]

    }

    @RunWith(J8Unit4.class)
    public static class SourceChannelTest
    implements org.j8unit.repository.java.nio.channels.PipeTests.SourceChannelTests<SourceChannel> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.Pipe$SourceChannel]

        @Override
        public SourceChannel createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.Pipe.SourceChannel], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.Pipe$SourceChannel]

    }

}
