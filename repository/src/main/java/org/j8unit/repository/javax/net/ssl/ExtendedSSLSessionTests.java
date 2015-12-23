package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.net.ssl.ExtendedSSLSession class
 * javax.net.ssl.ExtendedSSLSession}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.net.ssl.ExtendedSSLSessionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.net.ssl.ExtendedSSLSessionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.net.ssl.ExtendedSSLSession
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExtendedSSLSessionTests<SUT extends javax.net.ssl.ExtendedSSLSession>
extends org.j8unit.repository.javax.net.ssl.SSLSessionTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.ExtendedSSLSession#getLocalSupportedSignatureAlgorithms() public abstract
     * java.lang.String[] javax.net.ssl.ExtendedSSLSession.getLocalSupportedSignatureAlgorithms()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.ExtendedSSLSession#getLocalSupportedSignatureAlgorithms()
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
     * Test method for {@link javax.net.ssl.ExtendedSSLSession#getPeerSupportedSignatureAlgorithms() public abstract
     * java.lang.String[] javax.net.ssl.ExtendedSSLSession.getPeerSupportedSignatureAlgorithms()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.ExtendedSSLSession#getPeerSupportedSignatureAlgorithms()
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
     * Test method for {@link javax.net.ssl.ExtendedSSLSession#getRequestedServerNames() public java.util.List
     * javax.net.ssl.ExtendedSSLSession.getRequestedServerNames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.ExtendedSSLSession#getRequestedServerNames()
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
