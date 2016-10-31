package org.j8unit.repository.java.net;

import java.net.Proxy;
import java.net.Proxy.Type;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProxyClassTest
implements org.j8unit.repository.java.net.ProxyClassTests<Proxy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.Proxy]

    @Override
    public Class<Proxy> createNewSUT() {
        return Proxy.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.Proxy#Proxy(java.net.Proxy.Type, java.net.SocketAddress) public
     * java.net.Proxy(java.net.Proxy$Type,java.net.SocketAddress)}.
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
    public void create_Proxy_Type_SocketAddress()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Proxy sut = null; // = new Proxy(java.net.Proxy.Type, java.net.SocketAddress);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.Proxy]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.Proxy]

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.java.net.ProxyClassTests.TypeClassTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.Proxy$Type]

        @Override
        public Class<Type> createNewSUT() {
            return Type.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.net.Proxy.Type#valueOf(String) public
         * static java.net.Proxy$Type java.net.Proxy$Type.valueOf(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link java.net.Proxy.Type#valueOf(String)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.net.Proxy.Type#values() public static
         * java.net.Proxy$Type[] java.net.Proxy$Type.values()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_values()
        throws Exception {
            // write some test for {@link java.net.Proxy.Type#values()}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.Proxy$Type]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.net.Proxy$Type]

    }

}
