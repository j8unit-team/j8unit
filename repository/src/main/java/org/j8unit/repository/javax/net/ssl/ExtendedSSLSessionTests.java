package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.ExtendedSSLSession class javax.net.ssl.ExtendedSSLSession}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link ExtendedSSLSessionClassTests}
 * .
 * </p>
 *
 * @see javax.net.ssl.ExtendedSSLSession class javax.net.ssl.ExtendedSSLSession (the hereby targeted class-under-test
 *      class)
 * @see ExtendedSSLSessionClassTests ExtendedSSLSessionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExtendedSSLSessionTests<SUT extends javax.net.ssl.ExtendedSSLSession>
extends SSLSessionTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.ExtendedSSLSession#getPeerSupportedSignatureAlgorithms() public abstract
     * java.lang.String[] javax.net.ssl.ExtendedSSLSession.getPeerSupportedSignatureAlgorithms()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.ExtendedSSLSession#getPeerSupportedSignatureAlgorithms() public abstract
     * java.lang.String[] javax.net.ssl.ExtendedSSLSession.getPeerSupportedSignatureAlgorithms()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.ExtendedSSLSession#getPeerSupportedSignatureAlgorithms() public abstract java.lang.String[]
     *      javax.net.ssl.ExtendedSSLSession.getPeerSupportedSignatureAlgorithms() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPeerSupportedSignatureAlgorithms()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.ExtendedSSLSession#getLocalSupportedSignatureAlgorithms() public abstract
     * java.lang.String[] javax.net.ssl.ExtendedSSLSession.getLocalSupportedSignatureAlgorithms()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.ExtendedSSLSession#getLocalSupportedSignatureAlgorithms() public abstract
     * java.lang.String[] javax.net.ssl.ExtendedSSLSession.getLocalSupportedSignatureAlgorithms()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.ExtendedSSLSession#getLocalSupportedSignatureAlgorithms() public abstract java.lang.String[]
     *      javax.net.ssl.ExtendedSSLSession.getLocalSupportedSignatureAlgorithms() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocalSupportedSignatureAlgorithms()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.ExtendedSSLSession#getRequestedServerNames() public java.util.List
     * <javax.net.ssl.SNIServerName> javax.net.ssl.ExtendedSSLSession.getRequestedServerNames()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.ExtendedSSLSession#getRequestedServerNames() public java.util.List
     * javax.net.ssl.ExtendedSSLSession.getRequestedServerNames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.ExtendedSSLSession#getRequestedServerNames() public java.util.List
     *      javax.net.ssl.ExtendedSSLSession.getRequestedServerNames() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRequestedServerNames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
