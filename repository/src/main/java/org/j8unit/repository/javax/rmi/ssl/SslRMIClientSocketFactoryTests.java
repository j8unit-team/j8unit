package org.j8unit.repository.javax.rmi.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.rmi.ssl.SslRMIClientSocketFactory class
 * javax.rmi.ssl.SslRMIClientSocketFactory}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SslRMIClientSocketFactoryClassTests}.
 * </p>
 *
 * @see javax.rmi.ssl.SslRMIClientSocketFactory class javax.rmi.ssl.SslRMIClientSocketFactory (the hereby targeted
 *      class-under-test class)
 * @see SslRMIClientSocketFactoryClassTests SslRMIClientSocketFactoryClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SslRMIClientSocketFactoryTests<SUT extends javax.rmi.ssl.SslRMIClientSocketFactory>
extends org.j8unit.repository.java.rmi.server.RMIClientSocketFactoryTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIClientSocketFactory#hashCode() public int
     * javax.rmi.ssl.SslRMIClientSocketFactory.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIClientSocketFactory#hashCode() public int
     * javax.rmi.ssl.SslRMIClientSocketFactory.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.rmi.ssl.SslRMIClientSocketFactory#hashCode() public int
     *      javax.rmi.ssl.SslRMIClientSocketFactory.hashCode() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.rmi.ssl.SslRMIClientSocketFactory#equals(Object) public boolean
     * javax.rmi.ssl.SslRMIClientSocketFactory.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIClientSocketFactory#equals(Object) public boolean
     * javax.rmi.ssl.SslRMIClientSocketFactory.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.rmi.ssl.SslRMIClientSocketFactory#equals(Object) public boolean
     *      javax.rmi.ssl.SslRMIClientSocketFactory.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.rmi.ssl.SslRMIClientSocketFactory#createSocket(String, int) public java.net.Socket
     * javax.rmi.ssl.SslRMIClientSocketFactory.createSocket(java.lang.String,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.rmi.ssl.SslRMIClientSocketFactory#createSocket(String, int) public java.net.Socket
     * javax.rmi.ssl.SslRMIClientSocketFactory.createSocket(java.lang.String,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.rmi.ssl.SslRMIClientSocketFactory#createSocket(String, int) public java.net.Socket
     *      javax.rmi.ssl.SslRMIClientSocketFactory.createSocket(java.lang.String,int) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createSocket_String_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
