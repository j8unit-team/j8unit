package org.j8unit.repository.java.net;

import java.net.DatagramSocket;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DatagramSocket} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.DatagramSocketClassTests}).
 */
@RunWith(J8Unit4.class)
public class DatagramSocketClassTest
implements DatagramSocketClassTests<DatagramSocket> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.DatagramSocket]

    @Override
    public Class<DatagramSocket> createNewSUT() {
        return DatagramSocket.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.DatagramSocket#DatagramSocket(int)
     * public java.net.DatagramSocket(int) throws java.net.SocketException}.
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
    public void create_DatagramSocket_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DatagramSocket sut = null; // = new DatagramSocket(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.DatagramSocket#DatagramSocket(java.net.SocketAddress) public
     * java.net.DatagramSocket(java.net.SocketAddress) throws java.net.SocketException}.
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
    public void create_DatagramSocket_SocketAddress()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DatagramSocket sut = null; // = new DatagramSocket(java.net.SocketAddress);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.DatagramSocket#DatagramSocket() public
     * java.net.DatagramSocket() throws java.net.SocketException}.
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
    public void create_DatagramSocket()
    throws Exception {
        // create new instance
        try (final DatagramSocket sut = new DatagramSocket()) {}
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.DatagramSocket#DatagramSocket(int, java.net.InetAddress) public
     * java.net.DatagramSocket(int,java.net.InetAddress) throws java.net.SocketException}.
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
    public void create_DatagramSocket_int_InetAddress()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DatagramSocket sut = null; // = new DatagramSocket(int, java.net.InetAddress);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.net.DatagramSocket#setDatagramSocketImplFactory(java.net.DatagramSocketImplFactory) public static
     * synchronized void java.net.DatagramSocket.setDatagramSocketImplFactory(java.net.DatagramSocketImplFactory) throws
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
    public void test_setDatagramSocketImplFactory_DatagramSocketImplFactory()
    throws Exception {
        // write some test for {@link
        // java.net.DatagramSocket#setDatagramSocketImplFactory(java.net.DatagramSocketImplFactory)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.DatagramSocket]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.DatagramSocket]

}
