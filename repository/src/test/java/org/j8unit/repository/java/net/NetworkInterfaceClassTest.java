package org.j8unit.repository.java.net;

import java.net.NetworkInterface;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NetworkInterface} (by simply reusing the
 * J8Unit test interface {@link NetworkInterfaceClassTests}).
 */

@RunWith(J8Unit4.class)
public class NetworkInterfaceClassTest
implements NetworkInterfaceClassTests<NetworkInterface> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.NetworkInterface]

    @Override
    public Class<NetworkInterface> createNewSUT() {
        return NetworkInterface.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.NetworkInterface#getByName(String) public
     * static java.net.NetworkInterface java.net.NetworkInterface.getByName(java.lang.String) throws
     * java.net.SocketException}.
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
    public void test_getByName_String()
    throws Exception {
        // write some test for {@link java.net.NetworkInterface#getByName(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.NetworkInterface#getNetworkInterfaces()
     * public static java.util.Enumeration<java.net.NetworkInterface> java.net.NetworkInterface.getNetworkInterfaces()
     * throws java.net.SocketException}.
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
    public void test_getNetworkInterfaces()
    throws Exception {
        // write some test for {@link java.net.NetworkInterface#getNetworkInterfaces()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.net.NetworkInterface#getByInetAddress(java.net.InetAddress) public static java.net.NetworkInterface
     * java.net.NetworkInterface.getByInetAddress(java.net.InetAddress) throws java.net.SocketException}.
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
    public void test_getByInetAddress_InetAddress()
    throws Exception {
        // write some test for {@link java.net.NetworkInterface#getByInetAddress(java.net.InetAddress)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.NetworkInterface#getByIndex(int) public
     * static java.net.NetworkInterface java.net.NetworkInterface.getByIndex(int) throws java.net.SocketException}.
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
    public void test_getByIndex_int()
    throws Exception {
        // write some test for {@link java.net.NetworkInterface#getByIndex(int)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.NetworkInterface]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.NetworkInterface]

}
