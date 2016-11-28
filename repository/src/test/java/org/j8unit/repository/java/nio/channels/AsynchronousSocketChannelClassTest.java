package org.j8unit.repository.java.nio.channels;

import java.nio.channels.AsynchronousSocketChannel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AsynchronousSocketChannel} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.channels.AsynchronousSocketChannelClassTests}).
 */
@RunWith(J8Unit4.class)
public class AsynchronousSocketChannelClassTest
implements AsynchronousSocketChannelClassTests<AsynchronousSocketChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.AsynchronousSocketChannel]

    @Override
    public Class<AsynchronousSocketChannel> createNewSUT() {
        return AsynchronousSocketChannel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.nio.channels.AsynchronousSocketChannel#open(java.nio.channels.AsynchronousChannelGroup) public static
     * java.nio.channels.AsynchronousSocketChannel
     * java.nio.channels.AsynchronousSocketChannel.open(java.nio.channels.AsynchronousChannelGroup) throws
     * java.io.IOException}.
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
    public void test_open_AsynchronousChannelGroup()
    throws Exception {
        // write some test for {@link
        // java.nio.channels.AsynchronousSocketChannel#open(java.nio.channels.AsynchronousChannelGroup)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.channels.AsynchronousSocketChannel#open()
     * public static java.nio.channels.AsynchronousSocketChannel java.nio.channels.AsynchronousSocketChannel.open()
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
    public void test_open()
    throws Exception {
        // write some test for {@link java.nio.channels.AsynchronousSocketChannel#open()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.AsynchronousSocketChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.AsynchronousSocketChannel]

}
