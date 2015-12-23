package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileChannelClassTest
implements org.j8unit.repository.java.nio.channels.FileChannelClassTests<java.nio.channels.FileChannel> {

    @Override
    public Class<java.nio.channels.FileChannel> createNewSUT() {
        return java.nio.channels.FileChannel.class;
    }

    @RunWith(J8Unit4.class)
    public static class MapModeClassTest
    implements org.j8unit.repository.java.nio.channels.FileChannelClassTests.MapModeClassTests<java.nio.channels.FileChannel.MapMode> {

        @Override
        public Class<java.nio.channels.FileChannel.MapMode> createNewSUT() {
            return java.nio.channels.FileChannel.MapMode.class;
        }

    }

}
