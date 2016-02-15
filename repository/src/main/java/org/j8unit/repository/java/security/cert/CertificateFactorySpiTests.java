package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CertificateFactorySpi class
 * java.security.cert.CertificateFactorySpi}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CertificateFactorySpiClassTests}.
 * </p>
 *
 * @see java.security.cert.CertificateFactorySpi class java.security.cert.CertificateFactorySpi (the hereby targeted
 *      class-under-test class)
 * @see CertificateFactorySpiClassTests CertificateFactorySpiClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertificateFactorySpiTests<SUT extends java.security.cert.CertificateFactorySpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactorySpi#engineGenerateCertificate(java.io.InputStream)
     * public abstract java.security.cert.Certificate
     * java.security.cert.CertificateFactorySpi.engineGenerateCertificate(java.io.InputStream) throws
     * java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactorySpi#engineGenerateCertificate(java.io.InputStream)
     * public abstract java.security.cert.Certificate
     * java.security.cert.CertificateFactorySpi.engineGenerateCertificate(java.io.InputStream) throws
     * java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactorySpi#engineGenerateCertificate(java.io.InputStream) public abstract
     *      java.security.cert.Certificate
     *      java.security.cert.CertificateFactorySpi.engineGenerateCertificate(java.io.InputStream) throws
     *      java.security.cert.CertificateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGenerateCertificate_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactorySpi#engineGenerateCertificates(java.io.InputStream)
     * public abstract java.util.Collection<? extends java.security.cert.Certificate>
     * java.security.cert.CertificateFactorySpi.engineGenerateCertificates(java.io.InputStream) throws
     * java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactorySpi#engineGenerateCertificates(java.io.InputStream)
     * public abstract java.util.Collection
     * java.security.cert.CertificateFactorySpi.engineGenerateCertificates(java.io.InputStream) throws
     * java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactorySpi#engineGenerateCertificates(java.io.InputStream) public abstract
     *      java.util.Collection
     *      java.security.cert.CertificateFactorySpi.engineGenerateCertificates(java.io.InputStream) throws
     *      java.security.cert.CertificateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGenerateCertificates_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactorySpi#engineGetCertPathEncodings() public
     * java.util.Iterator<java.lang.String> java.security.cert.CertificateFactorySpi.engineGetCertPathEncodings()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactorySpi#engineGetCertPathEncodings() public
     * java.util.Iterator java.security.cert.CertificateFactorySpi.engineGetCertPathEncodings()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactorySpi#engineGetCertPathEncodings() public java.util.Iterator
     *      java.security.cert.CertificateFactorySpi.engineGetCertPathEncodings() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGetCertPathEncodings()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactorySpi#engineGenerateCertPath(java.util.List) public
     * java.security.cert.CertPath java.security.cert.CertificateFactorySpi.engineGenerateCertPath(java.util.List<?
     * extends java.security.cert.Certificate>) throws java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactorySpi#engineGenerateCertPath(java.util.List) public
     * java.security.cert.CertPath java.security.cert.CertificateFactorySpi.engineGenerateCertPath(java.util.List)
     * throws java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactorySpi#engineGenerateCertPath(java.util.List) public
     *      java.security.cert.CertPath java.security.cert.CertificateFactorySpi.engineGenerateCertPath(java.util.List)
     *      throws java.security.cert.CertificateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGenerateCertPath_List()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactorySpi#engineGenerateCertPath(java.io.InputStream)
     * public java.security.cert.CertPath
     * java.security.cert.CertificateFactorySpi.engineGenerateCertPath(java.io.InputStream) throws
     * java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactorySpi#engineGenerateCertPath(java.io.InputStream)
     * public java.security.cert.CertPath
     * java.security.cert.CertificateFactorySpi.engineGenerateCertPath(java.io.InputStream) throws
     * java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactorySpi#engineGenerateCertPath(java.io.InputStream) public
     *      java.security.cert.CertPath
     *      java.security.cert.CertificateFactorySpi.engineGenerateCertPath(java.io.InputStream) throws
     *      java.security.cert.CertificateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGenerateCertPath_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.cert.CertificateFactorySpi#engineGenerateCertPath(java.io.InputStream, String) public
     * java.security.cert.CertPath
     * java.security.cert.CertificateFactorySpi.engineGenerateCertPath(java.io.InputStream,java.lang.String) throws
     * java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for
     * {@link java.security.cert.CertificateFactorySpi#engineGenerateCertPath(java.io.InputStream, String) public
     * java.security.cert.CertPath
     * java.security.cert.CertificateFactorySpi.engineGenerateCertPath(java.io.InputStream,java.lang.String) throws
     * java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactorySpi#engineGenerateCertPath(java.io.InputStream, String) public
     *      java.security.cert.CertPath
     *      java.security.cert.CertificateFactorySpi.engineGenerateCertPath(java.io.InputStream,java.lang.String) throws
     *      java.security.cert.CertificateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGenerateCertPath_InputStream_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactorySpi#engineGenerateCRLs(java.io.InputStream) public
     * abstract java.util.Collection<? extends java.security.cert.CRL>
     * java.security.cert.CertificateFactorySpi.engineGenerateCRLs(java.io.InputStream) throws
     * java.security.cert.CRLException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactorySpi#engineGenerateCRLs(java.io.InputStream) public
     * abstract java.util.Collection java.security.cert.CertificateFactorySpi.engineGenerateCRLs(java.io.InputStream)
     * throws java.security.cert.CRLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactorySpi#engineGenerateCRLs(java.io.InputStream) public abstract
     *      java.util.Collection java.security.cert.CertificateFactorySpi.engineGenerateCRLs(java.io.InputStream) throws
     *      java.security.cert.CRLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGenerateCRLs_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactorySpi#engineGenerateCRL(java.io.InputStream) public
     * abstract java.security.cert.CRL java.security.cert.CertificateFactorySpi.engineGenerateCRL(java.io.InputStream)
     * throws java.security.cert.CRLException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactorySpi#engineGenerateCRL(java.io.InputStream) public
     * abstract java.security.cert.CRL java.security.cert.CertificateFactorySpi.engineGenerateCRL(java.io.InputStream)
     * throws java.security.cert.CRLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactorySpi#engineGenerateCRL(java.io.InputStream) public abstract
     *      java.security.cert.CRL java.security.cert.CertificateFactorySpi.engineGenerateCRL(java.io.InputStream)
     *      throws java.security.cert.CRLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGenerateCRL_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
