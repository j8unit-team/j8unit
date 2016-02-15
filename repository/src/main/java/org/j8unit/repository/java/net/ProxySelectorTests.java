package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.net.ProxySelector class java.net.ProxySelector}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ProxySelectorClassTests}.
 * </p>
 *
 * @see java.net.ProxySelector class java.net.ProxySelector (the hereby targeted class-under-test class)
 * @see ProxySelectorClassTests ProxySelectorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ProxySelectorTests<SUT extends java.net.ProxySelector>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.net.ProxySelector#select(java.net.URI) public abstract java.util.List
     * <java.net.Proxy> java.net.ProxySelector.select(java.net.URI)}.
     *
     * <p>
     * Test method for {@link java.net.ProxySelector#select(java.net.URI) public abstract java.util.List
     * java.net.ProxySelector.select(java.net.URI)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.ProxySelector#select(java.net.URI) public abstract java.util.List
     *      java.net.ProxySelector.select(java.net.URI) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_select_URI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.net.ProxySelector#connectFailed(java.net.URI, java.net.SocketAddress, java.io.IOException) public
     * abstract void java.net.ProxySelector.connectFailed(java.net.URI,java.net.SocketAddress,java.io.IOException)}.
     *
     * <p>
     * Test method for
     * {@link java.net.ProxySelector#connectFailed(java.net.URI, java.net.SocketAddress, java.io.IOException) public
     * abstract void java.net.ProxySelector.connectFailed(java.net.URI,java.net.SocketAddress,java.io.IOException)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.ProxySelector#connectFailed(java.net.URI, java.net.SocketAddress, java.io.IOException) public
     *      abstract void java.net.ProxySelector.connectFailed(java.net.URI,java.net.SocketAddress,java.io.IOException)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_connectFailed_URI_SocketAddress_IOException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
