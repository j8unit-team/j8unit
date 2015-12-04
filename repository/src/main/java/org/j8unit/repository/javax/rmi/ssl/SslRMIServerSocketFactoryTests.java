package org.j8unit.repository.javax.rmi.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.rmi.ssl.SslRMIServerSocketFactory class javax.rmi.ssl.SslRMIServerSocketFactory},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.rmi.ssl.SslRMIServerSocketFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SslRMIServerSocketFactoryTests<SUT extends javax.rmi.ssl.SslRMIServerSocketFactory>
extends org.j8unit.repository.java.rmi.server.RMIServerSocketFactoryTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#createServerSocket(int) public
     * java.net.ServerSocket javax.rmi.ssl.SslRMIServerSocketFactory.createServerSocket(int) throws java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createServerSocket_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#equals(java.lang.Object) public boolean
     * javax.rmi.ssl.SslRMIServerSocketFactory.equals(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#getEnabledCipherSuites() public final
     * java.lang.String[] javax.rmi.ssl.SslRMIServerSocketFactory.getEnabledCipherSuites()}.
     * </p>
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
     * </p>
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

    /**
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#getNeedClientAuth() public final boolean
     * javax.rmi.ssl.SslRMIServerSocketFactory.getNeedClientAuth()}.
     * </p>
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
     * Test method for {@link javax.rmi.ssl.SslRMIServerSocketFactory#hashCode() public int
     * javax.rmi.ssl.SslRMIServerSocketFactory.hashCode()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
