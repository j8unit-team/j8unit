package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.net.ssl.SSLSocketFactory class javax.net.ssl.SSLSocketFactory}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.net.ssl.SSLSocketFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SSLSocketFactoryTests<SUT extends javax.net.ssl.SSLSocketFactory>
extends org.j8unit.repository.javax.net.SocketFactoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocketFactory#createSocket(java.net.Socket,java.io.InputStream,boolean)
     * public java.net.Socket javax.net.ssl.SSLSocketFactory.createSocket(java.net.Socket,java.io.InputStream,boolean)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSocket_Socket_InputStream_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocketFactory#createSocket(java.net.Socket,java.lang.String,int,boolean)
     * public abstract java.net.Socket
     * javax.net.ssl.SSLSocketFactory.createSocket(java.net.Socket,java.lang.String,int,boolean) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSocket_Socket_String_int_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocketFactory#getDefaultCipherSuites() public abstract java.lang.String[]
     * javax.net.ssl.SSLSocketFactory.getDefaultCipherSuites()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultCipherSuites()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocketFactory#getSupportedCipherSuites() public abstract
     * java.lang.String[] javax.net.ssl.SSLSocketFactory.getSupportedCipherSuites()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSupportedCipherSuites()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
