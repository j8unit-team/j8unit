package org.j8unit.repository.javax.net;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.net.ServerSocketFactory class javax.net.ServerSocketFactory}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.net.ServerSocketFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ServerSocketFactoryTests<SUT extends javax.net.ServerSocketFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ServerSocketFactory#createServerSocket(int,int) public abstract
     * java.net.ServerSocket javax.net.ServerSocketFactory.createServerSocket(int,int) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createServerSocket_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ServerSocketFactory#createServerSocket(int,int,java.net.InetAddress) public
     * abstract java.net.ServerSocket javax.net.ServerSocketFactory.createServerSocket(int,int,java.net.InetAddress)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createServerSocket_int_int_InetAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ServerSocketFactory#createServerSocket(int) public abstract
     * java.net.ServerSocket javax.net.ServerSocketFactory.createServerSocket(int) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.net.ServerSocketFactory#createServerSocket() public java.net.ServerSocket
     * javax.net.ServerSocketFactory.createServerSocket() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createServerSocket()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
