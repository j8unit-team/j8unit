package org.j8unit.repository.javax.net;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.net.SocketFactory class javax.net.SocketFactory}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.net.SocketFactoryClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SocketFactoryTests<SUT extends javax.net.SocketFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.SocketFactory#createSocket() public java.net.Socket
     * javax.net.SocketFactory.createSocket() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSocket()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.SocketFactory#createSocket(java.net.InetAddress,int) public abstract
     * java.net.Socket javax.net.SocketFactory.createSocket(java.net.InetAddress,int) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSocket_InetAddress_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.SocketFactory#createSocket(java.net.InetAddress,int,java.net.InetAddress,int)
     * public abstract java.net.Socket
     * javax.net.SocketFactory.createSocket(java.net.InetAddress,int,java.net.InetAddress,int) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSocket_InetAddress_int_InetAddress_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.SocketFactory#createSocket(java.lang.String,int) public abstract java.net.Socket
     * javax.net.SocketFactory.createSocket(java.lang.String,int) throws
     * java.io.IOException,java.net.UnknownHostException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSocket_String_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.SocketFactory#createSocket(java.lang.String,int,java.net.InetAddress,int) public
     * abstract java.net.Socket javax.net.SocketFactory.createSocket(java.lang.String,int,java.net.InetAddress,int)
     * throws java.io.IOException,java.net.UnknownHostException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSocket_String_int_InetAddress_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
