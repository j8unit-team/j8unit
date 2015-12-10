package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PipeClassTest
implements org.j8unit.repository.java.nio.channels.PipeClassTests<java.nio.channels.Pipe> {

    @RunWith(J8Unit4.class)
    public static class SinkChannelClassTest
    implements org.j8unit.repository.java.nio.channels.PipeClassTests.SinkChannelClassTests<java.nio.channels.Pipe.SinkChannel> {

        @Override
        public Class<java.nio.channels.Pipe.SinkChannel> createNewSUT() {
            return java.nio.channels.Pipe.SinkChannel.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class SourceChannelClassTest
    implements org.j8unit.repository.java.nio.channels.PipeClassTests.SourceChannelClassTests<java.nio.channels.Pipe.SourceChannel> {

        @Override
        public Class<java.nio.channels.Pipe.SourceChannel> createNewSUT() {
            return java.nio.channels.Pipe.SourceChannel.class;
        }

    }

    @Override
    public Class<java.nio.channels.Pipe> createNewSUT() {
        return java.nio.channels.Pipe.class;
    }

}
