package org.j8unit.repository.java.nio.channels;

import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileChannel} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.channels.FileChannelClassTests}).
 */

@RunWith(J8Unit4.class)
public class FileChannelClassTest
implements FileChannelClassTests<FileChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.FileChannel]

    @Override
    public Class<FileChannel> createNewSUT() {
        return FileChannel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.nio.channels.FileChannel#open(java.nio.file.Path, java.nio.file.OpenOption...) public static
     * java.nio.channels.FileChannel java.nio.channels.FileChannel.open(java.nio.file.Path,java.nio.file.OpenOption...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_open_Path_OpenOptionArray()
    throws Exception {
        // write some test for {@link java.nio.channels.FileChannel#open(java.nio.file.Path,
        // java.nio.file.OpenOption...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.nio.channels.FileChannel#open(java.nio.file.Path, java.util.Set, java.nio.file.attribute.FileAttribute...)
     * public static java.nio.channels.FileChannel java.nio.channels.FileChannel.open(java.nio.file.Path,java.util.Set<?
     * extends java.nio.file.OpenOption>,java.nio.file.attribute.FileAttribute<?>...) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_open_Path_Set_FileAttributeArray()
    throws Exception {
        // write some test for {@link java.nio.channels.FileChannel#open(java.nio.file.Path, java.util.Set,
        // java.nio.file.attribute.FileAttribute...)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.FileChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.FileChannel]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link MapMode} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.nio.channels.FileChannelClassTests.MapModeClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class MapModeClassTest
    implements MapModeClassTests<MapMode> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.FileChannel$MapMode]

        @Override
        public Class<MapMode> createNewSUT() {
            return MapMode.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.FileChannel$MapMode]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.FileChannel$MapMode]

    }

}
