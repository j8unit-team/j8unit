package org.j8unit.repository.javax.rmi.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.rmi.ssl.SslRMIServerSocketFactory class
 * javax.rmi.ssl.SslRMIServerSocketFactory}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SslRMIServerSocketFactoryClassTests}.
 * </p>
 *
 * @see javax.rmi.ssl.SslRMIServerSocketFactory class javax.rmi.ssl.SslRMIServerSocketFactory (the hereby targeted
 *      class-under-test class)
 * @see SslRMIServerSocketFactoryClassTests SslRMIServerSocketFactoryClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SslRMIServerSocketFactoryTests<SUT extends javax.rmi.ssl.SslRMIServerSocketFactory>
extends org.j8unit.repository.java.rmi.server.RMIServerSocketFactoryTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#createServerSocket(int) public
     * java.net.ServerSocket javax.rmi.ssl.SslRMIServerSocketFactory.createServerSocket(int) throws java.io.IOException}
     * .
     *
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#createServerSocket(int) public
     * java.net.ServerSocket javax.rmi.ssl.SslRMIServerSocketFactory.createServerSocket(int) throws java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.rmi.ssl.SslRMIServerSocketFactory#createServerSocket(int) public java.net.ServerSocket
     *      javax.rmi.ssl.SslRMIServerSocketFactory.createServerSocket(int) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createServerSocket_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#getNeedClientAuth() public final boolean
     * javax.rmi.ssl.SslRMIServerSocketFactory.getNeedClientAuth()}.
     *
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#getNeedClientAuth() public final boolean
     * javax.rmi.ssl.SslRMIServerSocketFactory.getNeedClientAuth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.rmi.ssl.SslRMIServerSocketFactory#getNeedClientAuth() public final boolean
     *      javax.rmi.ssl.SslRMIServerSocketFactory.getNeedClientAuth() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNeedClientAuth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#equals(Object) public boolean
     * javax.rmi.ssl.SslRMIServerSocketFactory.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#equals(Object) public boolean
     * javax.rmi.ssl.SslRMIServerSocketFactory.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.rmi.ssl.SslRMIServerSocketFactory#equals(Object) public boolean
     *      javax.rmi.ssl.SslRMIServerSocketFactory.equals(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#hashCode() public int
     * javax.rmi.ssl.SslRMIServerSocketFactory.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#hashCode() public int
     * javax.rmi.ssl.SslRMIServerSocketFactory.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.rmi.ssl.SslRMIServerSocketFactory#hashCode() public int
     *      javax.rmi.ssl.SslRMIServerSocketFactory.hashCode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#getEnabledCipherSuites() public final
     * java.lang.String[] javax.rmi.ssl.SslRMIServerSocketFactory.getEnabledCipherSuites()}.
     *
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#getEnabledCipherSuites() public final
     * java.lang.String[] javax.rmi.ssl.SslRMIServerSocketFactory.getEnabledCipherSuites()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.rmi.ssl.SslRMIServerSocketFactory#getEnabledCipherSuites() public final java.lang.String[]
     *      javax.rmi.ssl.SslRMIServerSocketFactory.getEnabledCipherSuites() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEnabledCipherSuites()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#getEnabledProtocols() public final
     * java.lang.String[] javax.rmi.ssl.SslRMIServerSocketFactory.getEnabledProtocols()}.
     *
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#getEnabledProtocols() public final
     * java.lang.String[] javax.rmi.ssl.SslRMIServerSocketFactory.getEnabledProtocols()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.rmi.ssl.SslRMIServerSocketFactory#getEnabledProtocols() public final java.lang.String[]
     *      javax.rmi.ssl.SslRMIServerSocketFactory.getEnabledProtocols() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEnabledProtocols()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
