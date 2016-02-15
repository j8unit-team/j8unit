package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.X509CRLSelector class
 * java.security.cert.X509CRLSelector}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link X509CRLSelectorClassTests}.
 * </p>
 *
 * @see java.security.cert.X509CRLSelector class java.security.cert.X509CRLSelector (the hereby targeted
 *      class-under-test class)
 * @see X509CRLSelectorClassTests X509CRLSelectorClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface X509CRLSelectorTests<SUT extends java.security.cert.X509CRLSelector>
extends CRLSelectorTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#clone() public java.lang.Object
     * java.security.cert.X509CRLSelector.clone()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#clone() public java.lang.Object
     * java.security.cert.X509CRLSelector.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#clone() public java.lang.Object
     *      java.security.cert.X509CRLSelector.clone() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.X509CRLSelector#toString() public java.lang.String
     * java.security.cert.X509CRLSelector.toString()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#toString() public java.lang.String
     * java.security.cert.X509CRLSelector.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#toString() public java.lang.String
     *      java.security.cert.X509CRLSelector.toString() (the hereby targeted method-under-test)
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
     * Test method for
     * {@link java.security.cert.X509CRLSelector#setCertificateChecking(java.security.cert.X509Certificate) public void
     * java.security.cert.X509CRLSelector.setCertificateChecking(java.security.cert.X509Certificate)}.
     *
     * <p>
     * Test method for
     * {@link java.security.cert.X509CRLSelector#setCertificateChecking(java.security.cert.X509Certificate) public void
     * java.security.cert.X509CRLSelector.setCertificateChecking(java.security.cert.X509Certificate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#setCertificateChecking(java.security.cert.X509Certificate) public void
     *      java.security.cert.X509CRLSelector.setCertificateChecking(java.security.cert.X509Certificate) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCertificateChecking_X509Certificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#addIssuer(javax.security.auth.x500.X500Principal)
     * public void java.security.cert.X509CRLSelector.addIssuer(javax.security.auth.x500.X500Principal)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#addIssuer(javax.security.auth.x500.X500Principal)
     * public void java.security.cert.X509CRLSelector.addIssuer(javax.security.auth.x500.X500Principal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#addIssuer(javax.security.auth.x500.X500Principal) public void
     *      java.security.cert.X509CRLSelector.addIssuer(javax.security.auth.x500.X500Principal) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addIssuer_X500Principal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#setMaxCRLNumber(java.math.BigInteger) public void
     * java.security.cert.X509CRLSelector.setMaxCRLNumber(java.math.BigInteger)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#setMaxCRLNumber(java.math.BigInteger) public void
     * java.security.cert.X509CRLSelector.setMaxCRLNumber(java.math.BigInteger)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#setMaxCRLNumber(java.math.BigInteger) public void
     *      java.security.cert.X509CRLSelector.setMaxCRLNumber(java.math.BigInteger) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMaxCRLNumber_BigInteger()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#addIssuerName(String) public void
     * java.security.cert.X509CRLSelector.addIssuerName(java.lang.String) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#addIssuerName(String) public void
     * java.security.cert.X509CRLSelector.addIssuerName(java.lang.String) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#addIssuerName(String) public void
     *      java.security.cert.X509CRLSelector.addIssuerName(java.lang.String) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addIssuerName_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#addIssuerName(byte[]) public void
     * java.security.cert.X509CRLSelector.addIssuerName(byte[]) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#addIssuerName(byte[]) public void
     * java.security.cert.X509CRLSelector.addIssuerName(byte[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#addIssuerName(byte[]) public void
     *      java.security.cert.X509CRLSelector.addIssuerName(byte[]) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addIssuerName_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#getMinCRL() public java.math.BigInteger
     * java.security.cert.X509CRLSelector.getMinCRL()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#getMinCRL() public java.math.BigInteger
     * java.security.cert.X509CRLSelector.getMinCRL()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#getMinCRL() public java.math.BigInteger
     *      java.security.cert.X509CRLSelector.getMinCRL() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMinCRL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#getDateAndTime() public java.util.Date
     * java.security.cert.X509CRLSelector.getDateAndTime()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#getDateAndTime() public java.util.Date
     * java.security.cert.X509CRLSelector.getDateAndTime()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#getDateAndTime() public java.util.Date
     *      java.security.cert.X509CRLSelector.getDateAndTime() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDateAndTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#setIssuers(java.util.Collection) public void
     * java.security.cert.X509CRLSelector.setIssuers(java.util.Collection<javax.security.auth.x500.X500Principal>)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#setIssuers(java.util.Collection) public void
     * java.security.cert.X509CRLSelector.setIssuers(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#setIssuers(java.util.Collection) public void
     *      java.security.cert.X509CRLSelector.setIssuers(java.util.Collection) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setIssuers_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#setMinCRLNumber(java.math.BigInteger) public void
     * java.security.cert.X509CRLSelector.setMinCRLNumber(java.math.BigInteger)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#setMinCRLNumber(java.math.BigInteger) public void
     * java.security.cert.X509CRLSelector.setMinCRLNumber(java.math.BigInteger)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#setMinCRLNumber(java.math.BigInteger) public void
     *      java.security.cert.X509CRLSelector.setMinCRLNumber(java.math.BigInteger) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMinCRLNumber_BigInteger()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#match(java.security.cert.CRL) public boolean
     * java.security.cert.X509CRLSelector.match(java.security.cert.CRL)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#match(java.security.cert.CRL) public boolean
     * java.security.cert.X509CRLSelector.match(java.security.cert.CRL)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#match(java.security.cert.CRL) public boolean
     *      java.security.cert.X509CRLSelector.match(java.security.cert.CRL) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_match_CRL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#setIssuerNames(java.util.Collection) public void
     * java.security.cert.X509CRLSelector.setIssuerNames(java.util.Collection<?>) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#setIssuerNames(java.util.Collection) public void
     * java.security.cert.X509CRLSelector.setIssuerNames(java.util.Collection) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#setIssuerNames(java.util.Collection) public void
     *      java.security.cert.X509CRLSelector.setIssuerNames(java.util.Collection) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setIssuerNames_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#getCertificateChecking() public
     * java.security.cert.X509Certificate java.security.cert.X509CRLSelector.getCertificateChecking()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#getCertificateChecking() public
     * java.security.cert.X509Certificate java.security.cert.X509CRLSelector.getCertificateChecking()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#getCertificateChecking() public java.security.cert.X509Certificate
     *      java.security.cert.X509CRLSelector.getCertificateChecking() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertificateChecking()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#getMaxCRL() public java.math.BigInteger
     * java.security.cert.X509CRLSelector.getMaxCRL()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#getMaxCRL() public java.math.BigInteger
     * java.security.cert.X509CRLSelector.getMaxCRL()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#getMaxCRL() public java.math.BigInteger
     *      java.security.cert.X509CRLSelector.getMaxCRL() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMaxCRL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#setDateAndTime(java.util.Date) public void
     * java.security.cert.X509CRLSelector.setDateAndTime(java.util.Date)}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#setDateAndTime(java.util.Date) public void
     * java.security.cert.X509CRLSelector.setDateAndTime(java.util.Date)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#setDateAndTime(java.util.Date) public void
     *      java.security.cert.X509CRLSelector.setDateAndTime(java.util.Date) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDateAndTime_Date()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#getIssuerNames() public java.util.Collection
     * <java.lang.Object> java.security.cert.X509CRLSelector.getIssuerNames()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#getIssuerNames() public java.util.Collection
     * java.security.cert.X509CRLSelector.getIssuerNames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#getIssuerNames() public java.util.Collection
     *      java.security.cert.X509CRLSelector.getIssuerNames() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIssuerNames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#getIssuers() public java.util.Collection
     * <javax.security.auth.x500.X500Principal> java.security.cert.X509CRLSelector.getIssuers()}.
     *
     * <p>
     * Test method for {@link java.security.cert.X509CRLSelector#getIssuers() public java.util.Collection
     * java.security.cert.X509CRLSelector.getIssuers()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.X509CRLSelector#getIssuers() public java.util.Collection
     *      java.security.cert.X509CRLSelector.getIssuers() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIssuers()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
