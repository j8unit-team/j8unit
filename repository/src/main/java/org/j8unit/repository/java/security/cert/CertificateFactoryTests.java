package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CertificateFactory class
 * java.security.cert.CertificateFactory}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link CertificateFactoryClassTests}.
 * </p>
 *
 * @see java.security.cert.CertificateFactory class java.security.cert.CertificateFactory (the hereby targeted
 *      class-under-test class)
 * @see CertificateFactoryClassTests CertificateFactoryClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertificateFactoryTests<SUT extends java.security.cert.CertificateFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#getType() public final java.lang.String
     * java.security.cert.CertificateFactory.getType()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#getType() public final java.lang.String
     * java.security.cert.CertificateFactory.getType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactory#getType() public final java.lang.String
     *      java.security.cert.CertificateFactory.getType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#getCertPathEncodings() public final
     * java.util.Iterator<java.lang.String> java.security.cert.CertificateFactory.getCertPathEncodings()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#getCertPathEncodings() public final
     * java.util.Iterator java.security.cert.CertificateFactory.getCertPathEncodings()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactory#getCertPathEncodings() public final java.util.Iterator
     *      java.security.cert.CertificateFactory.getCertPathEncodings() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertPathEncodings()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#generateCertificates(java.io.InputStream) public
     * final java.util.Collection<? extends java.security.cert.Certificate>
     * java.security.cert.CertificateFactory.generateCertificates(java.io.InputStream) throws
     * java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#generateCertificates(java.io.InputStream) public
     * final java.util.Collection java.security.cert.CertificateFactory.generateCertificates(java.io.InputStream) throws
     * java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactory#generateCertificates(java.io.InputStream) public final
     *      java.util.Collection java.security.cert.CertificateFactory.generateCertificates(java.io.InputStream) throws
     *      java.security.cert.CertificateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateCertificates_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#generateCertPath(java.io.InputStream) public final
     * java.security.cert.CertPath java.security.cert.CertificateFactory.generateCertPath(java.io.InputStream) throws
     * java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#generateCertPath(java.io.InputStream) public final
     * java.security.cert.CertPath java.security.cert.CertificateFactory.generateCertPath(java.io.InputStream) throws
     * java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactory#generateCertPath(java.io.InputStream) public final
     *      java.security.cert.CertPath java.security.cert.CertificateFactory.generateCertPath(java.io.InputStream)
     *      throws java.security.cert.CertificateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateCertPath_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#generateCertPath(java.io.InputStream, String) public
     * final java.security.cert.CertPath
     * java.security.cert.CertificateFactory.generateCertPath(java.io.InputStream,java.lang.String) throws
     * java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#generateCertPath(java.io.InputStream, String) public
     * final java.security.cert.CertPath
     * java.security.cert.CertificateFactory.generateCertPath(java.io.InputStream,java.lang.String) throws
     * java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactory#generateCertPath(java.io.InputStream, String) public final
     *      java.security.cert.CertPath
     *      java.security.cert.CertificateFactory.generateCertPath(java.io.InputStream,java.lang.String) throws
     *      java.security.cert.CertificateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateCertPath_InputStream_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#generateCertPath(java.util.List) public final
     * java.security.cert.CertPath java.security.cert.CertificateFactory.generateCertPath(java.util.List<? extends
     * java.security.cert.Certificate>) throws java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#generateCertPath(java.util.List) public final
     * java.security.cert.CertPath java.security.cert.CertificateFactory.generateCertPath(java.util.List) throws
     * java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactory#generateCertPath(java.util.List) public final
     *      java.security.cert.CertPath java.security.cert.CertificateFactory.generateCertPath(java.util.List) throws
     *      java.security.cert.CertificateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateCertPath_List()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#generateCertificate(java.io.InputStream) public
     * final java.security.cert.Certificate
     * java.security.cert.CertificateFactory.generateCertificate(java.io.InputStream) throws
     * java.security.cert.CertificateException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#generateCertificate(java.io.InputStream) public
     * final java.security.cert.Certificate
     * java.security.cert.CertificateFactory.generateCertificate(java.io.InputStream) throws
     * java.security.cert.CertificateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactory#generateCertificate(java.io.InputStream) public final
     *      java.security.cert.Certificate
     *      java.security.cert.CertificateFactory.generateCertificate(java.io.InputStream) throws
     *      java.security.cert.CertificateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateCertificate_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#generateCRL(java.io.InputStream) public final
     * java.security.cert.CRL java.security.cert.CertificateFactory.generateCRL(java.io.InputStream) throws
     * java.security.cert.CRLException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#generateCRL(java.io.InputStream) public final
     * java.security.cert.CRL java.security.cert.CertificateFactory.generateCRL(java.io.InputStream) throws
     * java.security.cert.CRLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactory#generateCRL(java.io.InputStream) public final java.security.cert.CRL
     *      java.security.cert.CertificateFactory.generateCRL(java.io.InputStream) throws
     *      java.security.cert.CRLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateCRL_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#generateCRLs(java.io.InputStream) public final
     * java.util.Collection<? extends java.security.cert.CRL>
     * java.security.cert.CertificateFactory.generateCRLs(java.io.InputStream) throws java.security.cert.CRLException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#generateCRLs(java.io.InputStream) public final
     * java.util.Collection java.security.cert.CertificateFactory.generateCRLs(java.io.InputStream) throws
     * java.security.cert.CRLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactory#generateCRLs(java.io.InputStream) public final java.util.Collection
     *      java.security.cert.CertificateFactory.generateCRLs(java.io.InputStream) throws
     *      java.security.cert.CRLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateCRLs_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#getProvider() public final java.security.Provider
     * java.security.cert.CertificateFactory.getProvider()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateFactory#getProvider() public final java.security.Provider
     * java.security.cert.CertificateFactory.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateFactory#getProvider() public final java.security.Provider
     *      java.security.cert.CertificateFactory.getProvider() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProvider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
