package org.j8unit.repository.java.net;

import java.net.Inet6Address;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Inet6Address} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.Inet6AddressClassTests}).
 */
@RunWith(J8Unit4.class)
public class Inet6AddressClassTest
implements Inet6AddressClassTests<Inet6Address> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.Inet6Address]

    @Override
    public Class<Inet6Address> createNewSUT() {
        return Inet6Address.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.net.Inet6Address#getByAddress(String, byte[], int) public static java.net.Inet6Address
     * java.net.Inet6Address.getByAddress(java.lang.String,byte[],int) throws java.net.UnknownHostException}.
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
    public void test_getByAddress_String_byteArray_int()
    throws Exception {
        // write some test for {@link java.net.Inet6Address#getByAddress(String, byte[], int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.net.Inet6Address#getByAddress(String, byte[], java.net.NetworkInterface) public static
     * java.net.Inet6Address java.net.Inet6Address.getByAddress(java.lang.String,byte[],java.net.NetworkInterface)
     * throws java.net.UnknownHostException}.
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
    public void test_getByAddress_String_byteArray_NetworkInterface()
    throws Exception {
        // write some test for {@link java.net.Inet6Address#getByAddress(String, byte[], java.net.NetworkInterface)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.Inet6Address]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.Inet6Address]

}
