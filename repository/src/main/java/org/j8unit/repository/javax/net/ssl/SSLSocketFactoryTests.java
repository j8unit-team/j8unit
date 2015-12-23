package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.net.ssl.SSLSocketFactory class javax.net.ssl.SSLSocketFactory},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.net.ssl.SSLSocketFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.net.ssl.SSLSocketFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.net.ssl.SSLSocketFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SSLSocketFactoryTests<SUT extends javax.net.ssl.SSLSocketFactory>
extends org.j8unit.repository.javax.net.SocketFactoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSocketFactory#createSocket(java.net.Socket, java.io.InputStream, boolean)
     * public java.net.Socket javax.net.ssl.SSLSocketFactory.createSocket(java.net.Socket,java.io.InputStream,boolean)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.SSLSocketFactory#createSocket(java.net.Socket, java.io.InputStream, boolean)
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
     * Test method for
     * {@link javax.net.ssl.SSLSocketFactory#createSocket(java.net.Socket, java.lang.String, int, boolean) public
     * abstract java.net.Socket
     * javax.net.ssl.SSLSocketFactory.createSocket(java.net.Socket,java.lang.String,int,boolean) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.SSLSocketFactory#createSocket(java.net.Socket, java.lang.String, int, boolean)
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.SSLSocketFactory#getDefaultCipherSuites()
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.SSLSocketFactory#getSupportedCipherSuites()
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
