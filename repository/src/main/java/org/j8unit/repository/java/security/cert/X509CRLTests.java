package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.X509CRL class java.security.cert.X509CRL}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link X509CRLClassTests}.
 * </p>
 *
 * @see java.security.cert.X509CRL class java.security.cert.X509CRL (the hereby targeted class-under-test class)
 * @see X509CRLClassTests X509CRLClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface X509CRLTests<SUT extends java.security.cert.X509CRL>
extends X509ExtensionTests<SUT>, CRLTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getSignature() public abstract byte[]
     * java.security.cert.X509CRL.getSignature()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getSignature() public abstract byte[]
     * java.security.cert.X509CRL.getSignature()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#getSignature() public abstract byte[] java.security.cert.X509CRL.getSignature()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.X509CRL#getSigAlgParams() public abstract byte[]
     * java.security.cert.X509CRL.getSigAlgParams()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getSigAlgParams() public abstract byte[]
     * java.security.cert.X509CRL.getSigAlgParams()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#getSigAlgParams() public abstract byte[]
     *      java.security.cert.X509CRL.getSigAlgParams() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.X509CRL#getVersion() public abstract int
     * java.security.cert.X509CRL.getVersion()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getVersion() public abstract int
     * java.security.cert.X509CRL.getVersion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#getVersion() public abstract int java.security.cert.X509CRL.getVersion() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.X509CRL#getRevokedCertificates() public abstract java.util.Set<?
     * extends java.security.cert.X509CRLEntry> java.security.cert.X509CRL.getRevokedCertificates()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getRevokedCertificates() public abstract java.util.Set
     * java.security.cert.X509CRL.getRevokedCertificates()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#getRevokedCertificates() public abstract java.util.Set
     *      java.security.cert.X509CRL.getRevokedCertificates() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRevokedCertificates()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getEncoded() public abstract byte[]
     * java.security.cert.X509CRL.getEncoded() throws java.security.cert.CRLException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getEncoded() public abstract byte[]
     * java.security.cert.X509CRL.getEncoded() throws java.security.cert.CRLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#getEncoded() public abstract byte[] java.security.cert.X509CRL.getEncoded()
     *      throws java.security.cert.CRLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEncoded()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getIssuerDN() public abstract java.security.Principal
     * java.security.cert.X509CRL.getIssuerDN()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getIssuerDN() public abstract java.security.Principal
     * java.security.cert.X509CRL.getIssuerDN()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#getIssuerDN() public abstract java.security.Principal
     *      java.security.cert.X509CRL.getIssuerDN() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.X509CRL#getNextUpdate() public abstract java.util.Date
     * java.security.cert.X509CRL.getNextUpdate()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getNextUpdate() public abstract java.util.Date
     * java.security.cert.X509CRL.getNextUpdate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#getNextUpdate() public abstract java.util.Date
     *      java.security.cert.X509CRL.getNextUpdate() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNextUpdate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getRevokedCertificate(java.security.cert.X509Certificate)
     * public java.security.cert.X509CRLEntry
     * java.security.cert.X509CRL.getRevokedCertificate(java.security.cert.X509Certificate)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getRevokedCertificate(java.security.cert.X509Certificate)
     * public java.security.cert.X509CRLEntry
     * java.security.cert.X509CRL.getRevokedCertificate(java.security.cert.X509Certificate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#getRevokedCertificate(java.security.cert.X509Certificate) public
     *      java.security.cert.X509CRLEntry
     *      java.security.cert.X509CRL.getRevokedCertificate(java.security.cert.X509Certificate) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRevokedCertificate_X509Certificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getRevokedCertificate(java.math.BigInteger) public abstract
     * java.security.cert.X509CRLEntry java.security.cert.X509CRL.getRevokedCertificate(java.math.BigInteger)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getRevokedCertificate(java.math.BigInteger) public abstract
     * java.security.cert.X509CRLEntry java.security.cert.X509CRL.getRevokedCertificate(java.math.BigInteger)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#getRevokedCertificate(java.math.BigInteger) public abstract
     *      java.security.cert.X509CRLEntry java.security.cert.X509CRL.getRevokedCertificate(java.math.BigInteger) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRevokedCertificate_BigInteger()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getTBSCertList() public abstract byte[]
     * java.security.cert.X509CRL.getTBSCertList() throws java.security.cert.CRLException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getTBSCertList() public abstract byte[]
     * java.security.cert.X509CRL.getTBSCertList() throws java.security.cert.CRLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#getTBSCertList() public abstract byte[]
     *      java.security.cert.X509CRL.getTBSCertList() throws java.security.cert.CRLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTBSCertList()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRL#verify(java.security.PublicKey) public abstract void
     * java.security.cert.X509CRL.verify(java.security.PublicKey) throws
     * java.security.cert.CRLException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException,java.security.NoSuchProviderException,java.security.SignatureException}
     * .
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#verify(java.security.PublicKey) public abstract void
     * java.security.cert.X509CRL.verify(java.security.PublicKey) throws
     * java.security.cert.CRLException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException,java.security.NoSuchProviderException,java.security.SignatureException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#verify(java.security.PublicKey) public abstract void
     *      java.security.cert.X509CRL.verify(java.security.PublicKey) throws
     *      java.security.cert.CRLException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException,
     *      java.security.NoSuchProviderException,java.security.SignatureException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_verify_PublicKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRL#verify(java.security.PublicKey, java.security.Provider) public
     * void java.security.cert.X509CRL.verify(java.security.PublicKey,java.security.Provider) throws
     * java.security.cert.CRLException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException,java.security.SignatureException}
     * .
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#verify(java.security.PublicKey, java.security.Provider) public
     * void java.security.cert.X509CRL.verify(java.security.PublicKey,java.security.Provider) throws
     * java.security.cert.CRLException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException,java.security.SignatureException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#verify(java.security.PublicKey, java.security.Provider) public void
     *      java.security.cert.X509CRL.verify(java.security.PublicKey,java.security.Provider) throws
     *      java.security.cert.CRLException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException,
     *      java.security.SignatureException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.security.cert.X509CRL#verify(java.security.PublicKey, String) public abstract void
     * java.security.cert.X509CRL.verify(java.security.PublicKey,java.lang.String) throws
     * java.security.cert.CRLException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException,java.security.NoSuchProviderException,java.security.SignatureException}
     * .
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#verify(java.security.PublicKey, String) public abstract void
     * java.security.cert.X509CRL.verify(java.security.PublicKey,java.lang.String) throws
     * java.security.cert.CRLException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException,java.security.NoSuchProviderException,java.security.SignatureException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#verify(java.security.PublicKey, String) public abstract void
     *      java.security.cert.X509CRL.verify(java.security.PublicKey,java.lang.String) throws
     *      java.security.cert.CRLException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException,
     *      java.security.NoSuchProviderException,java.security.SignatureException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_verify_PublicKey_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getSigAlgOID() public abstract java.lang.String
     * java.security.cert.X509CRL.getSigAlgOID()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getSigAlgOID() public abstract java.lang.String
     * java.security.cert.X509CRL.getSigAlgOID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#getSigAlgOID() public abstract java.lang.String
     *      java.security.cert.X509CRL.getSigAlgOID() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getThisUpdate() public abstract java.util.Date
     * java.security.cert.X509CRL.getThisUpdate()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getThisUpdate() public abstract java.util.Date
     * java.security.cert.X509CRL.getThisUpdate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#getThisUpdate() public abstract java.util.Date
     *      java.security.cert.X509CRL.getThisUpdate() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getThisUpdate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getIssuerX500Principal() public
     * javax.security.auth.x500.X500Principal java.security.cert.X509CRL.getIssuerX500Principal()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getIssuerX500Principal() public
     * javax.security.auth.x500.X500Principal java.security.cert.X509CRL.getIssuerX500Principal()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#getIssuerX500Principal() public javax.security.auth.x500.X500Principal
     *      java.security.cert.X509CRL.getIssuerX500Principal() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.X509CRL#getSigAlgName() public abstract java.lang.String
     * java.security.cert.X509CRL.getSigAlgName()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#getSigAlgName() public abstract java.lang.String
     * java.security.cert.X509CRL.getSigAlgName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#getSigAlgName() public abstract java.lang.String
     *      java.security.cert.X509CRL.getSigAlgName() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.X509CRL#hashCode() public int java.security.cert.X509CRL.hashCode()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#hashCode() public int java.security.cert.X509CRL.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#hashCode() public int java.security.cert.X509CRL.hashCode() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.security.cert.X509CRL#equals(Object) public boolean
     * java.security.cert.X509CRL.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRL#equals(Object) public boolean
     * java.security.cert.X509CRL.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRL#equals(Object) public boolean java.security.cert.X509CRL.equals(java.lang.Object)
     *      (the hereby targeted method-under-test)
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

}
