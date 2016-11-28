package org.j8unit.repository.java.nio.channels;

import java.nio.channels.SocketChannel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SocketChannel} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.channels.SocketChannelClassTests}).
 */
@RunWith(J8Unit4.class)
public class SocketChannelClassTest
implements SocketChannelClassTests<SocketChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.SocketChannel]

    @Override
    public Class<SocketChannel> createNewSUT() {
        return SocketChannel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.channels.SocketChannel#open() public static
     * java.nio.channels.SocketChannel java.nio.channels.SocketChannel.open() throws java.io.IOException}.
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
        // write some test for {@link java.nio.channels.SocketChannel#open()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.nio.channels.SocketChannel#open(java.net.SocketAddress) public static java.nio.channels.SocketChannel
     * java.nio.channels.SocketChannel.open(java.net.SocketAddress) throws java.io.IOException}.
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
    public void test_open_SocketAddress()
    throws Exception {
        // write some test for {@link java.nio.channels.SocketChannel#open(java.net.SocketAddress)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.SocketChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.SocketChannel]

}
