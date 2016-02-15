package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.X509CertSelector class
 * java.security.cert.X509CertSelector}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link X509CertSelectorClassTests}.
 * </p>
 *
 * @see java.security.cert.X509CertSelector class java.security.cert.X509CertSelector (the hereby targeted
 *      class-under-test class)
 * @see X509CertSelectorClassTests X509CertSelectorClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface X509CertSelectorTests<SUT extends java.security.cert.X509CertSelector>
extends CertSelectorTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSubjectPublicKey(byte[]) public void
     * java.security.cert.X509CertSelector.setSubjectPublicKey(byte[]) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSubjectPublicKey(byte[]) public void
     * java.security.cert.X509CertSelector.setSubjectPublicKey(byte[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setSubjectPublicKey(byte[]) public void
     *      java.security.cert.X509CertSelector.setSubjectPublicKey(byte[]) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSubjectPublicKey_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSubjectPublicKey(java.security.PublicKey) public
     * void java.security.cert.X509CertSelector.setSubjectPublicKey(java.security.PublicKey)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSubjectPublicKey(java.security.PublicKey) public
     * void java.security.cert.X509CertSelector.setSubjectPublicKey(java.security.PublicKey)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setSubjectPublicKey(java.security.PublicKey) public void
     *      java.security.cert.X509CertSelector.setSubjectPublicKey(java.security.PublicKey) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSubjectPublicKey_PublicKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSerialNumber() public java.math.BigInteger
     * java.security.cert.X509CertSelector.getSerialNumber()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSerialNumber() public java.math.BigInteger
     * java.security.cert.X509CertSelector.getSerialNumber()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getSerialNumber() public java.math.BigInteger
     *      java.security.cert.X509CertSelector.getSerialNumber() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.X509CertSelector#getIssuerAsBytes() public byte[]
     * java.security.cert.X509CertSelector.getIssuerAsBytes() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getIssuerAsBytes() public byte[]
     * java.security.cert.X509CertSelector.getIssuerAsBytes() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getIssuerAsBytes() public byte[]
     *      java.security.cert.X509CertSelector.getIssuerAsBytes() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIssuerAsBytes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSubjectKeyIdentifier(byte[]) public void
     * java.security.cert.X509CertSelector.setSubjectKeyIdentifier(byte[])}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSubjectKeyIdentifier(byte[]) public void
     * java.security.cert.X509CertSelector.setSubjectKeyIdentifier(byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setSubjectKeyIdentifier(byte[]) public void
     *      java.security.cert.X509CertSelector.setSubjectKeyIdentifier(byte[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSubjectKeyIdentifier_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getPrivateKeyValid() public java.util.Date
     * java.security.cert.X509CertSelector.getPrivateKeyValid()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getPrivateKeyValid() public java.util.Date
     * java.security.cert.X509CertSelector.getPrivateKeyValid()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getPrivateKeyValid() public java.util.Date
     *      java.security.cert.X509CertSelector.getPrivateKeyValid() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrivateKeyValid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSubjectPublicKey() public java.security.PublicKey
     * java.security.cert.X509CertSelector.getSubjectPublicKey()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSubjectPublicKey() public java.security.PublicKey
     * java.security.cert.X509CertSelector.getSubjectPublicKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getSubjectPublicKey() public java.security.PublicKey
     *      java.security.cert.X509CertSelector.getSubjectPublicKey() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSubjectPublicKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getPolicy() public java.util.Set
     * <java.lang.String> java.security.cert.X509CertSelector.getPolicy()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getPolicy() public java.util.Set
     * java.security.cert.X509CertSelector.getPolicy()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getPolicy() public java.util.Set
     *      java.security.cert.X509CertSelector.getPolicy() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPolicy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setBasicConstraints(int) public void
     * java.security.cert.X509CertSelector.setBasicConstraints(int)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setBasicConstraints(int) public void
     * java.security.cert.X509CertSelector.setBasicConstraints(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setBasicConstraints(int) public void
     *      java.security.cert.X509CertSelector.setBasicConstraints(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setBasicConstraints_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getExtendedKeyUsage() public java.util.Set
     * <java.lang.String> java.security.cert.X509CertSelector.getExtendedKeyUsage()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getExtendedKeyUsage() public java.util.Set
     * java.security.cert.X509CertSelector.getExtendedKeyUsage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getExtendedKeyUsage() public java.util.Set
     *      java.security.cert.X509CertSelector.getExtendedKeyUsage() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.X509CertSelector#setExtendedKeyUsage(java.util.Set) public void
     * java.security.cert.X509CertSelector.setExtendedKeyUsage(java.util.Set<java.lang.String>) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setExtendedKeyUsage(java.util.Set) public void
     * java.security.cert.X509CertSelector.setExtendedKeyUsage(java.util.Set) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setExtendedKeyUsage(java.util.Set) public void
     *      java.security.cert.X509CertSelector.setExtendedKeyUsage(java.util.Set) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setExtendedKeyUsage_Set()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getIssuerAsString() public java.lang.String
     * java.security.cert.X509CertSelector.getIssuerAsString()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getIssuerAsString() public java.lang.String
     * java.security.cert.X509CertSelector.getIssuerAsString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getIssuerAsString() public java.lang.String
     *      java.security.cert.X509CertSelector.getIssuerAsString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIssuerAsString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSubjectAlternativeNames(java.util.Collection)
     * public void java.security.cert.X509CertSelector.setSubjectAlternativeNames(java.util.Collection<java.util.List
     * <?>>) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSubjectAlternativeNames(java.util.Collection)
     * public void java.security.cert.X509CertSelector.setSubjectAlternativeNames(java.util.Collection) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setSubjectAlternativeNames(java.util.Collection) public void
     *      java.security.cert.X509CertSelector.setSubjectAlternativeNames(java.util.Collection) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSubjectAlternativeNames_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setIssuer(javax.security.auth.x500.X500Principal)
     * public void java.security.cert.X509CertSelector.setIssuer(javax.security.auth.x500.X500Principal)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setIssuer(javax.security.auth.x500.X500Principal)
     * public void java.security.cert.X509CertSelector.setIssuer(javax.security.auth.x500.X500Principal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setIssuer(javax.security.auth.x500.X500Principal) public void
     *      java.security.cert.X509CertSelector.setIssuer(javax.security.auth.x500.X500Principal) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setIssuer_X500Principal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setIssuer(String) public void
     * java.security.cert.X509CertSelector.setIssuer(java.lang.String) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setIssuer(String) public void
     * java.security.cert.X509CertSelector.setIssuer(java.lang.String) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setIssuer(String) public void
     *      java.security.cert.X509CertSelector.setIssuer(java.lang.String) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setIssuer_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setIssuer(byte[]) public void
     * java.security.cert.X509CertSelector.setIssuer(byte[]) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setIssuer(byte[]) public void
     * java.security.cert.X509CertSelector.setIssuer(byte[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setIssuer(byte[]) public void
     *      java.security.cert.X509CertSelector.setIssuer(byte[]) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setIssuer_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setMatchAllSubjectAltNames(boolean) public void
     * java.security.cert.X509CertSelector.setMatchAllSubjectAltNames(boolean)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setMatchAllSubjectAltNames(boolean) public void
     * java.security.cert.X509CertSelector.setMatchAllSubjectAltNames(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setMatchAllSubjectAltNames(boolean) public void
     *      java.security.cert.X509CertSelector.setMatchAllSubjectAltNames(boolean) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMatchAllSubjectAltNames_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSubjectAsString() public java.lang.String
     * java.security.cert.X509CertSelector.getSubjectAsString()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSubjectAsString() public java.lang.String
     * java.security.cert.X509CertSelector.getSubjectAsString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getSubjectAsString() public java.lang.String
     *      java.security.cert.X509CertSelector.getSubjectAsString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSubjectAsString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setPrivateKeyValid(java.util.Date) public void
     * java.security.cert.X509CertSelector.setPrivateKeyValid(java.util.Date)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setPrivateKeyValid(java.util.Date) public void
     * java.security.cert.X509CertSelector.setPrivateKeyValid(java.util.Date)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setPrivateKeyValid(java.util.Date) public void
     *      java.security.cert.X509CertSelector.setPrivateKeyValid(java.util.Date) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPrivateKeyValid_Date()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSubject(byte[]) public void
     * java.security.cert.X509CertSelector.setSubject(byte[]) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSubject(byte[]) public void
     * java.security.cert.X509CertSelector.setSubject(byte[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setSubject(byte[]) public void
     *      java.security.cert.X509CertSelector.setSubject(byte[]) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSubject_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSubject(String) public void
     * java.security.cert.X509CertSelector.setSubject(java.lang.String) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSubject(String) public void
     * java.security.cert.X509CertSelector.setSubject(java.lang.String) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setSubject(String) public void
     *      java.security.cert.X509CertSelector.setSubject(java.lang.String) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSubject_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSubject(javax.security.auth.x500.X500Principal)
     * public void java.security.cert.X509CertSelector.setSubject(javax.security.auth.x500.X500Principal)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSubject(javax.security.auth.x500.X500Principal)
     * public void java.security.cert.X509CertSelector.setSubject(javax.security.auth.x500.X500Principal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setSubject(javax.security.auth.x500.X500Principal) public void
     *      java.security.cert.X509CertSelector.setSubject(javax.security.auth.x500.X500Principal) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSubject_X500Principal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSubject() public
     * javax.security.auth.x500.X500Principal java.security.cert.X509CertSelector.getSubject()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSubject() public
     * javax.security.auth.x500.X500Principal java.security.cert.X509CertSelector.getSubject()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getSubject() public javax.security.auth.x500.X500Principal
     *      java.security.cert.X509CertSelector.getSubject() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSubject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getAuthorityKeyIdentifier() public byte[]
     * java.security.cert.X509CertSelector.getAuthorityKeyIdentifier()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getAuthorityKeyIdentifier() public byte[]
     * java.security.cert.X509CertSelector.getAuthorityKeyIdentifier()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getAuthorityKeyIdentifier() public byte[]
     *      java.security.cert.X509CertSelector.getAuthorityKeyIdentifier() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAuthorityKeyIdentifier()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setPolicy(java.util.Set) public void
     * java.security.cert.X509CertSelector.setPolicy(java.util.Set<java.lang.String>) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setPolicy(java.util.Set) public void
     * java.security.cert.X509CertSelector.setPolicy(java.util.Set) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setPolicy(java.util.Set) public void
     *      java.security.cert.X509CertSelector.setPolicy(java.util.Set) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPolicy_Set()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getBasicConstraints() public int
     * java.security.cert.X509CertSelector.getBasicConstraints()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getBasicConstraints() public int
     * java.security.cert.X509CertSelector.getBasicConstraints()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getBasicConstraints() public int
     *      java.security.cert.X509CertSelector.getBasicConstraints() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.X509CertSelector#setSubjectPublicKeyAlgID(String) public void
     * java.security.cert.X509CertSelector.setSubjectPublicKeyAlgID(java.lang.String) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSubjectPublicKeyAlgID(String) public void
     * java.security.cert.X509CertSelector.setSubjectPublicKeyAlgID(java.lang.String) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setSubjectPublicKeyAlgID(String) public void
     *      java.security.cert.X509CertSelector.setSubjectPublicKeyAlgID(java.lang.String) throws java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSubjectPublicKeyAlgID_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSubjectPublicKeyAlgID() public java.lang.String
     * java.security.cert.X509CertSelector.getSubjectPublicKeyAlgID()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSubjectPublicKeyAlgID() public java.lang.String
     * java.security.cert.X509CertSelector.getSubjectPublicKeyAlgID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getSubjectPublicKeyAlgID() public java.lang.String
     *      java.security.cert.X509CertSelector.getSubjectPublicKeyAlgID() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSubjectPublicKeyAlgID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setNameConstraints(byte[]) public void
     * java.security.cert.X509CertSelector.setNameConstraints(byte[]) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setNameConstraints(byte[]) public void
     * java.security.cert.X509CertSelector.setNameConstraints(byte[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setNameConstraints(byte[]) public void
     *      java.security.cert.X509CertSelector.setNameConstraints(byte[]) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNameConstraints_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setKeyUsage(boolean[]) public void
     * java.security.cert.X509CertSelector.setKeyUsage(boolean[])}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setKeyUsage(boolean[]) public void
     * java.security.cert.X509CertSelector.setKeyUsage(boolean[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setKeyUsage(boolean[]) public void
     *      java.security.cert.X509CertSelector.setKeyUsage(boolean[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setKeyUsage_booleanArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSerialNumber(java.math.BigInteger) public void
     * java.security.cert.X509CertSelector.setSerialNumber(java.math.BigInteger)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setSerialNumber(java.math.BigInteger) public void
     * java.security.cert.X509CertSelector.setSerialNumber(java.math.BigInteger)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setSerialNumber(java.math.BigInteger) public void
     *      java.security.cert.X509CertSelector.setSerialNumber(java.math.BigInteger) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSerialNumber_BigInteger()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getIssuer() public
     * javax.security.auth.x500.X500Principal java.security.cert.X509CertSelector.getIssuer()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getIssuer() public
     * javax.security.auth.x500.X500Principal java.security.cert.X509CertSelector.getIssuer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getIssuer() public javax.security.auth.x500.X500Principal
     *      java.security.cert.X509CertSelector.getIssuer() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIssuer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setPathToNames(java.util.Collection) public void
     * java.security.cert.X509CertSelector.setPathToNames(java.util.Collection<java.util.List<?>>) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setPathToNames(java.util.Collection) public void
     * java.security.cert.X509CertSelector.setPathToNames(java.util.Collection) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setPathToNames(java.util.Collection) public void
     *      java.security.cert.X509CertSelector.setPathToNames(java.util.Collection) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPathToNames_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#match(java.security.cert.Certificate) public boolean
     * java.security.cert.X509CertSelector.match(java.security.cert.Certificate)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#match(java.security.cert.Certificate) public boolean
     * java.security.cert.X509CertSelector.match(java.security.cert.Certificate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#match(java.security.cert.Certificate) public boolean
     *      java.security.cert.X509CertSelector.match(java.security.cert.Certificate) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_match_Certificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#addSubjectAlternativeName(int, byte[]) public void
     * java.security.cert.X509CertSelector.addSubjectAlternativeName(int,byte[]) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#addSubjectAlternativeName(int, byte[]) public void
     * java.security.cert.X509CertSelector.addSubjectAlternativeName(int,byte[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#addSubjectAlternativeName(int, byte[]) public void
     *      java.security.cert.X509CertSelector.addSubjectAlternativeName(int,byte[]) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addSubjectAlternativeName_int_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#addSubjectAlternativeName(int, String) public void
     * java.security.cert.X509CertSelector.addSubjectAlternativeName(int,java.lang.String) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#addSubjectAlternativeName(int, String) public void
     * java.security.cert.X509CertSelector.addSubjectAlternativeName(int,java.lang.String) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#addSubjectAlternativeName(int, String) public void
     *      java.security.cert.X509CertSelector.addSubjectAlternativeName(int,java.lang.String) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addSubjectAlternativeName_int_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getCertificateValid() public java.util.Date
     * java.security.cert.X509CertSelector.getCertificateValid()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getCertificateValid() public java.util.Date
     * java.security.cert.X509CertSelector.getCertificateValid()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getCertificateValid() public java.util.Date
     *      java.security.cert.X509CertSelector.getCertificateValid() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertificateValid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setAuthorityKeyIdentifier(byte[]) public void
     * java.security.cert.X509CertSelector.setAuthorityKeyIdentifier(byte[])}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setAuthorityKeyIdentifier(byte[]) public void
     * java.security.cert.X509CertSelector.setAuthorityKeyIdentifier(byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setAuthorityKeyIdentifier(byte[]) public void
     *      java.security.cert.X509CertSelector.setAuthorityKeyIdentifier(byte[]) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAuthorityKeyIdentifier_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#toString() public java.lang.String
     * java.security.cert.X509CertSelector.toString()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#toString() public java.lang.String
     * java.security.cert.X509CertSelector.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#toString() public java.lang.String
     *      java.security.cert.X509CertSelector.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#clone() public java.lang.Object
     * java.security.cert.X509CertSelector.clone()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#clone() public java.lang.Object
     * java.security.cert.X509CertSelector.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#clone() public java.lang.Object
     *      java.security.cert.X509CertSelector.clone() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#addPathToName(int, String) public void
     * java.security.cert.X509CertSelector.addPathToName(int,java.lang.String) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#addPathToName(int, String) public void
     * java.security.cert.X509CertSelector.addPathToName(int,java.lang.String) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#addPathToName(int, String) public void
     *      java.security.cert.X509CertSelector.addPathToName(int,java.lang.String) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addPathToName_int_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#addPathToName(int, byte[]) public void
     * java.security.cert.X509CertSelector.addPathToName(int,byte[]) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#addPathToName(int, byte[]) public void
     * java.security.cert.X509CertSelector.addPathToName(int,byte[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#addPathToName(int, byte[]) public void
     *      java.security.cert.X509CertSelector.addPathToName(int,byte[]) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addPathToName_int_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getMatchAllSubjectAltNames() public boolean
     * java.security.cert.X509CertSelector.getMatchAllSubjectAltNames()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getMatchAllSubjectAltNames() public boolean
     * java.security.cert.X509CertSelector.getMatchAllSubjectAltNames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getMatchAllSubjectAltNames() public boolean
     *      java.security.cert.X509CertSelector.getMatchAllSubjectAltNames() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMatchAllSubjectAltNames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setCertificate(java.security.cert.X509Certificate)
     * public void java.security.cert.X509CertSelector.setCertificate(java.security.cert.X509Certificate)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setCertificate(java.security.cert.X509Certificate)
     * public void java.security.cert.X509CertSelector.setCertificate(java.security.cert.X509Certificate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setCertificate(java.security.cert.X509Certificate) public void
     *      java.security.cert.X509CertSelector.setCertificate(java.security.cert.X509Certificate) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCertificate_X509Certificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getNameConstraints() public byte[]
     * java.security.cert.X509CertSelector.getNameConstraints()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getNameConstraints() public byte[]
     * java.security.cert.X509CertSelector.getNameConstraints()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getNameConstraints() public byte[]
     *      java.security.cert.X509CertSelector.getNameConstraints() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNameConstraints()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSubjectKeyIdentifier() public byte[]
     * java.security.cert.X509CertSelector.getSubjectKeyIdentifier()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSubjectKeyIdentifier() public byte[]
     * java.security.cert.X509CertSelector.getSubjectKeyIdentifier()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getSubjectKeyIdentifier() public byte[]
     *      java.security.cert.X509CertSelector.getSubjectKeyIdentifier() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSubjectKeyIdentifier()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setCertificateValid(java.util.Date) public void
     * java.security.cert.X509CertSelector.setCertificateValid(java.util.Date)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#setCertificateValid(java.util.Date) public void
     * java.security.cert.X509CertSelector.setCertificateValid(java.util.Date)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#setCertificateValid(java.util.Date) public void
     *      java.security.cert.X509CertSelector.setCertificateValid(java.util.Date) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCertificateValid_Date()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSubjectAsBytes() public byte[]
     * java.security.cert.X509CertSelector.getSubjectAsBytes() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSubjectAsBytes() public byte[]
     * java.security.cert.X509CertSelector.getSubjectAsBytes() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getSubjectAsBytes() public byte[]
     *      java.security.cert.X509CertSelector.getSubjectAsBytes() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSubjectAsBytes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getCertificate() public
     * java.security.cert.X509Certificate java.security.cert.X509CertSelector.getCertificate()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getCertificate() public
     * java.security.cert.X509Certificate java.security.cert.X509CertSelector.getCertificate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getCertificate() public java.security.cert.X509Certificate
     *      java.security.cert.X509CertSelector.getCertificate() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getKeyUsage() public boolean[]
     * java.security.cert.X509CertSelector.getKeyUsage()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getKeyUsage() public boolean[]
     * java.security.cert.X509CertSelector.getKeyUsage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getKeyUsage() public boolean[]
     *      java.security.cert.X509CertSelector.getKeyUsage() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.X509CertSelector#getPathToNames() public
     * java.util.Collection<java.util.List<?>> java.security.cert.X509CertSelector.getPathToNames()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getPathToNames() public java.util.Collection
     * java.security.cert.X509CertSelector.getPathToNames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getPathToNames() public java.util.Collection
     *      java.security.cert.X509CertSelector.getPathToNames() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPathToNames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSubjectAlternativeNames() public
     * java.util.Collection<java.util.List<?>> java.security.cert.X509CertSelector.getSubjectAlternativeNames()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CertSelector#getSubjectAlternativeNames() public
     * java.util.Collection java.security.cert.X509CertSelector.getSubjectAlternativeNames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CertSelector#getSubjectAlternativeNames() public java.util.Collection
     *      java.security.cert.X509CertSelector.getSubjectAlternativeNames() (the hereby targeted method-under-test)
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

}
