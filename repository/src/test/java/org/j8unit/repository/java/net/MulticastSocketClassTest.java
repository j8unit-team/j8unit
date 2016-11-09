package org.j8unit.repository.java.net;

import java.net.MulticastSocket;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MulticastSocket} (by simply reusing the
 * J8Unit test interface {@link MulticastSocketClassTests}).
 */

@RunWith(J8Unit4.class)
public class MulticastSocketClassTest
implements MulticastSocketClassTests<MulticastSocket> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.MulticastSocket]

    @Override
    public Class<MulticastSocket> createNewSUT() {
        return MulticastSocket.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.MulticastSocket#MulticastSocket()
     * public java.net.MulticastSocket() throws java.io.IOException}.
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
    public void create_MulticastSocket()
    throws Exception {
        // create new instance
        final MulticastSocket sut = new MulticastSocket();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.MulticastSocket#MulticastSocket(java.net.SocketAddress) public
     * java.net.MulticastSocket(java.net.SocketAddress) throws java.io.IOException}.
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
    public void create_MulticastSocket_SocketAddress()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MulticastSocket sut = null; // = new MulticastSocket(java.net.SocketAddress);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.MulticastSocket#MulticastSocket(int)
     * public java.net.MulticastSocket(int) throws java.io.IOException}.
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
    public void create_MulticastSocket_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MulticastSocket sut = null; // = new MulticastSocket(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.MulticastSocket]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.MulticastSocket]

}
