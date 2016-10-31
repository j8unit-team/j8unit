package org.j8unit.repository.java.net;

import java.net.ServerSocket;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerSocketClassTest
implements org.j8unit.repository.java.net.ServerSocketClassTests<ServerSocket> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.ServerSocket]

    @Override
    public Class<ServerSocket> createNewSUT() {
        return ServerSocket.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.ServerSocket#ServerSocket() public
     * java.net.ServerSocket() throws java.io.IOException}.
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
    public void create_ServerSocket()
    throws Exception {
        // create new instance
        final ServerSocket sut = new ServerSocket();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.ServerSocket#ServerSocket(int, int, java.net.InetAddress) public
     * java.net.ServerSocket(int,int,java.net.InetAddress) throws java.io.IOException}.
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
    public void create_ServerSocket_int_int_InetAddress()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServerSocket sut = null; // = new ServerSocket(int, int, java.net.InetAddress);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.ServerSocket#ServerSocket(int, int)
     * public java.net.ServerSocket(int,int) throws java.io.IOException}.
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
    public void create_ServerSocket_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServerSocket sut = null; // = new ServerSocket(int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.ServerSocket#ServerSocket(int) public
     * java.net.ServerSocket(int) throws java.io.IOException}.
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
    public void create_ServerSocket_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServerSocket sut = null; // = new ServerSocket(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.net.ServerSocket#setSocketFactory(java.net.SocketImplFactory) public static synchronized void
     * java.net.ServerSocket.setSocketFactory(java.net.SocketImplFactory) throws java.io.IOException}.
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
    public void test_setSocketFactory_SocketImplFactory()
    throws Exception {
        // write some test for {@link java.net.ServerSocket#setSocketFactory(java.net.SocketImplFactory)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.ServerSocket]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.ServerSocket]

}
