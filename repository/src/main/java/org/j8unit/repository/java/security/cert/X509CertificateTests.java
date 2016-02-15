package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.X509Certificate class
 * java.security.cert.X509Certificate}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link X509CertificateClassTests}.
 * </p>
 *
 * @see java.security.cert.X509Certificate class java.security.cert.X509Certificate (the hereby targeted
 *      class-under-test class)
 * @see X509CertificateClassTests X509CertificateClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface X509CertificateTests<SUT extends java.security.cert.X509Certificate>
extends X509ExtensionTests<SUT>, CertificateTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getVersion() public abstract int
     * java.security.cert.X509Certificate.getVersion()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getVersion() public abstract int
     * java.security.cert.X509Certificate.getVersion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getVersion() public abstract int
     *      java.security.cert.X509Certificate.getVersion() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSubjectX500Principal() public
     * javax.security.auth.x500.X500Principal java.security.cert.X509Certificate.getSubjectX500Principal()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSubjectX500Principal() public
     * javax.security.auth.x500.X500Principal java.security.cert.X509Certificate.getSubjectX500Principal()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getSubjectX500Principal() public javax.security.auth.x500.X500Principal
     *      java.security.cert.X509Certificate.getSubjectX500Principal() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSubjectX500Principal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSerialNumber() public abstract java.math.BigInteger
     * java.security.cert.X509Certificate.getSerialNumber()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSerialNumber() public abstract java.math.BigInteger
     * java.security.cert.X509Certificate.getSerialNumber()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getSerialNumber() public abstract java.math.BigInteger
     *      java.security.cert.X509Certificate.getSerialNumber() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSerialNumber()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getIssuerUniqueID() public abstract boolean[]
     * java.security.cert.X509Certificate.getIssuerUniqueID()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getIssuerUniqueID() public abstract boolean[]
     * java.security.cert.X509Certificate.getIssuerUniqueID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getIssuerUniqueID() public abstract boolean[]
     *      java.security.cert.X509Certificate.getIssuerUniqueID() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIssuerUniqueID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getIssuerDN() public abstract java.security.Principal
     * java.security.cert.X509Certificate.getIssuerDN()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getIssuerDN() public abstract java.security.Principal
     * java.security.cert.X509Certificate.getIssuerDN()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getIssuerDN() public abstract java.security.Principal
     *      java.security.cert.X509Certificate.getIssuerDN() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIssuerDN()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getTBSCertificate() public abstract byte[]
     * java.security.cert.X509Certificate.getTBSCertificate() throws java.security.cert.CertificateEncodingException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getTBSCertificate() public abstract byte[]
     * java.security.cert.X509Certificate.getTBSCertificate() throws java.security.cert.CertificateEncodingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getTBSCertificate() public abstract byte[]
     *      java.security.cert.X509Certificate.getTBSCertificate() throws
     *      java.security.cert.CertificateEncodingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTBSCertificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSignature() public abstract byte[]
     * java.security.cert.X509Certificate.getSignature()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSignature() public abstract byte[]
     * java.security.cert.X509Certificate.getSignature()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getSignature() public abstract byte[]
     *      java.security.cert.X509Certificate.getSignature() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSignature()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getExtendedKeyUsage() public java.util.List
     * <java.lang.String> java.security.cert.X509Certificate.getExtendedKeyUsage() throws
     * java.security.cert.CertificateParsingException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getExtendedKeyUsage() public java.util.List
     * java.security.cert.X509Certificate.getExtendedKeyUsage() throws java.security.cert.CertificateParsingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getExtendedKeyUsage() public java.util.List
     *      java.security.cert.X509Certificate.getExtendedKeyUsage() throws
     *      java.security.cert.CertificateParsingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExtendedKeyUsage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSigAlgParams() public abstract byte[]
     * java.security.cert.X509Certificate.getSigAlgParams()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSigAlgParams() public abstract byte[]
     * java.security.cert.X509Certificate.getSigAlgParams()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getSigAlgParams() public abstract byte[]
     *      java.security.cert.X509Certificate.getSigAlgParams() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSigAlgParams()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#checkValidity(java.util.Date) public abstract void
     * java.security.cert.X509Certificate.checkValidity(java.util.Date) throws
     * java.security.cert.CertificateExpiredException,java.security.cert.CertificateNotYetValidException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#checkValidity(java.util.Date) public abstract void
     * java.security.cert.X509Certificate.checkValidity(java.util.Date) throws
     * java.security.cert.CertificateExpiredException,java.security.cert.CertificateNotYetValidException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#checkValidity(java.util.Date) public abstract void
     *      java.security.cert.X509Certificate.checkValidity(java.util.Date) throws
     *      java.security.cert.CertificateExpiredException,java.security.cert.CertificateNotYetValidException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkValidity_Date()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#checkValidity() public abstract void
     * java.security.cert.X509Certificate.checkValidity() throws
     * java.security.cert.CertificateExpiredException,java.security.cert.CertificateNotYetValidException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#checkValidity() public abstract void
     * java.security.cert.X509Certificate.checkValidity() throws
     * java.security.cert.CertificateExpiredException,java.security.cert.CertificateNotYetValidException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#checkValidity() public abstract void
     *      java.security.cert.X509Certificate.checkValidity() throws
     *      java.security.cert.CertificateExpiredException,java.security.cert.CertificateNotYetValidException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkValidity()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSubjectAlternativeNames() public
     * java.util.Collection<java.util.List<?>> java.security.cert.X509Certificate.getSubjectAlternativeNames() throws
     * java.security.cert.CertificateParsingException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSubjectAlternativeNames() public
     * java.util.Collection java.security.cert.X509Certificate.getSubjectAlternativeNames() throws
     * java.security.cert.CertificateParsingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getSubjectAlternativeNames() public java.util.Collection
     *      java.security.cert.X509Certificate.getSubjectAlternativeNames() throws
     *      java.security.cert.CertificateParsingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSubjectAlternativeNames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getKeyUsage() public abstract boolean[]
     * java.security.cert.X509Certificate.getKeyUsage()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getKeyUsage() public abstract boolean[]
     * java.security.cert.X509Certificate.getKeyUsage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getKeyUsage() public abstract boolean[]
     *      java.security.cert.X509Certificate.getKeyUsage() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeyUsage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getIssuerX500Principal() public
     * javax.security.auth.x500.X500Principal java.security.cert.X509Certificate.getIssuerX500Principal()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getIssuerX500Principal() public
     * javax.security.auth.x500.X500Principal java.security.cert.X509Certificate.getIssuerX500Principal()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getIssuerX500Principal() public javax.security.auth.x500.X500Principal
     *      java.security.cert.X509Certificate.getIssuerX500Principal() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIssuerX500Principal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getBasicConstraints() public abstract int
     * java.security.cert.X509Certificate.getBasicConstraints()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getBasicConstraints() public abstract int
     * java.security.cert.X509Certificate.getBasicConstraints()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getBasicConstraints() public abstract int
     *      java.security.cert.X509Certificate.getBasicConstraints() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBasicConstraints()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSigAlgName() public abstract java.lang.String
     * java.security.cert.X509Certificate.getSigAlgName()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSigAlgName() public abstract java.lang.String
     * java.security.cert.X509Certificate.getSigAlgName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getSigAlgName() public abstract java.lang.String
     *      java.security.cert.X509Certificate.getSigAlgName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSigAlgName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getNotBefore() public abstract java.util.Date
     * java.security.cert.X509Certificate.getNotBefore()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getNotBefore() public abstract java.util.Date
     * java.security.cert.X509Certificate.getNotBefore()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getNotBefore() public abstract java.util.Date
     *      java.security.cert.X509Certificate.getNotBefore() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNotBefore()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSubjectUniqueID() public abstract boolean[]
     * java.security.cert.X509Certificate.getSubjectUniqueID()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSubjectUniqueID() public abstract boolean[]
     * java.security.cert.X509Certificate.getSubjectUniqueID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getSubjectUniqueID() public abstract boolean[]
     *      java.security.cert.X509Certificate.getSubjectUniqueID() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSubjectUniqueID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSubjectDN() public abstract java.security.Principal
     * java.security.cert.X509Certificate.getSubjectDN()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSubjectDN() public abstract java.security.Principal
     * java.security.cert.X509Certificate.getSubjectDN()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getSubjectDN() public abstract java.security.Principal
     *      java.security.cert.X509Certificate.getSubjectDN() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSubjectDN()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getIssuerAlternativeNames() public
     * java.util.Collection<java.util.List<?>> java.security.cert.X509Certificate.getIssuerAlternativeNames() throws
     * java.security.cert.CertificateParsingException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getIssuerAlternativeNames() public java.util.Collection
     * java.security.cert.X509Certificate.getIssuerAlternativeNames() throws
     * java.security.cert.CertificateParsingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getIssuerAlternativeNames() public java.util.Collection
     *      java.security.cert.X509Certificate.getIssuerAlternativeNames() throws
     *      java.security.cert.CertificateParsingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIssuerAlternativeNames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#verify(java.security.PublicKey, java.security.Provider)
     * public void java.security.cert.X509Certificate.verify(java.security.PublicKey,java.security.Provider) throws
     * java.security.cert.CertificateException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException,java.security.SignatureException}
     * .
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#verify(java.security.PublicKey, java.security.Provider)
     * public void java.security.cert.X509Certificate.verify(java.security.PublicKey,java.security.Provider) throws
     * java.security.cert.CertificateException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException,java.security.SignatureException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#verify(java.security.PublicKey, java.security.Provider) public void
     *      java.security.cert.X509Certificate.verify(java.security.PublicKey,java.security.Provider) throws
     *      java.security.cert.CertificateException,java.security.NoSuchAlgorithmException,java.security.
     *      InvalidKeyException,java.security.SignatureException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_verify_PublicKey_Provider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getNotAfter() public abstract java.util.Date
     * java.security.cert.X509Certificate.getNotAfter()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getNotAfter() public abstract java.util.Date
     * java.security.cert.X509Certificate.getNotAfter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getNotAfter() public abstract java.util.Date
     *      java.security.cert.X509Certificate.getNotAfter() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNotAfter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSigAlgOID() public abstract java.lang.String
     * java.security.cert.X509Certificate.getSigAlgOID()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509Certificate#getSigAlgOID() public abstract java.lang.String
     * java.security.cert.X509Certificate.getSigAlgOID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509Certificate#getSigAlgOID() public abstract java.lang.String
     *      java.security.cert.X509Certificate.getSigAlgOID() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSigAlgOID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
