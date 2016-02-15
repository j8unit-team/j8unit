package org.j8unit.repository.javax.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.cert.X509Certificate class
 * javax.security.cert.X509Certificate}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link X509CertificateClassTests}.
 * </p>
 *
 * @see javax.security.cert.X509Certificate class javax.security.cert.X509Certificate (the hereby targeted
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
public abstract interface X509CertificateTests<SUT extends javax.security.cert.X509Certificate>
extends CertificateTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.cert.X509Certificate#getSigAlgOID() public abstract java.lang.String
     * javax.security.cert.X509Certificate.getSigAlgOID()}.
     *
     * <p>
     * Test method for {@link javax.security.cert.X509Certificate#getSigAlgOID() public abstract java.lang.String
     * javax.security.cert.X509Certificate.getSigAlgOID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.X509Certificate#getSigAlgOID() public abstract java.lang.String
     *      javax.security.cert.X509Certificate.getSigAlgOID() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.cert.X509Certificate#getSigAlgParams() public abstract byte[]
     * javax.security.cert.X509Certificate.getSigAlgParams()}.
     *
     * <p>
     * Test method for {@link javax.security.cert.X509Certificate#getSigAlgParams() public abstract byte[]
     * javax.security.cert.X509Certificate.getSigAlgParams()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.X509Certificate#getSigAlgParams() public abstract byte[]
     *      javax.security.cert.X509Certificate.getSigAlgParams() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.cert.X509Certificate#checkValidity() public abstract void
     * javax.security.cert.X509Certificate.checkValidity() throws
     * javax.security.cert.CertificateExpiredException,javax.security.cert.CertificateNotYetValidException}.
     *
     * <p>
     * Test method for {@link javax.security.cert.X509Certificate#checkValidity() public abstract void
     * javax.security.cert.X509Certificate.checkValidity() throws
     * javax.security.cert.CertificateExpiredException,javax.security.cert.CertificateNotYetValidException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.X509Certificate#checkValidity() public abstract void
     *      javax.security.cert.X509Certificate.checkValidity() throws
     *      javax.security.cert.CertificateExpiredException,javax.security.cert.CertificateNotYetValidException (the
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
     * Test method for {@link javax.security.cert.X509Certificate#checkValidity(java.util.Date) public abstract void
     * javax.security.cert.X509Certificate.checkValidity(java.util.Date) throws
     * javax.security.cert.CertificateExpiredException,javax.security.cert.CertificateNotYetValidException}.
     *
     * <p>
     * Test method for {@link javax.security.cert.X509Certificate#checkValidity(java.util.Date) public abstract void
     * javax.security.cert.X509Certificate.checkValidity(java.util.Date) throws
     * javax.security.cert.CertificateExpiredException,javax.security.cert.CertificateNotYetValidException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.X509Certificate#checkValidity(java.util.Date) public abstract void
     *      javax.security.cert.X509Certificate.checkValidity(java.util.Date) throws
     *      javax.security.cert.CertificateExpiredException,javax.security.cert.CertificateNotYetValidException (the
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
     * Test method for {@link javax.security.cert.X509Certificate#getNotAfter() public abstract java.util.Date
     * javax.security.cert.X509Certificate.getNotAfter()}.
     *
     * <p>
     * Test method for {@link javax.security.cert.X509Certificate#getNotAfter() public abstract java.util.Date
     * javax.security.cert.X509Certificate.getNotAfter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.X509Certificate#getNotAfter() public abstract java.util.Date
     *      javax.security.cert.X509Certificate.getNotAfter() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.cert.X509Certificate#getSigAlgName() public abstract java.lang.String
     * javax.security.cert.X509Certificate.getSigAlgName()}.
     *
     * <p>
     * Test method for {@link javax.security.cert.X509Certificate#getSigAlgName() public abstract java.lang.String
     * javax.security.cert.X509Certificate.getSigAlgName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.X509Certificate#getSigAlgName() public abstract java.lang.String
     *      javax.security.cert.X509Certificate.getSigAlgName() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.cert.X509Certificate#getNotBefore() public abstract java.util.Date
     * javax.security.cert.X509Certificate.getNotBefore()}.
     *
     * <p>
     * Test method for {@link javax.security.cert.X509Certificate#getNotBefore() public abstract java.util.Date
     * javax.security.cert.X509Certificate.getNotBefore()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.X509Certificate#getNotBefore() public abstract java.util.Date
     *      javax.security.cert.X509Certificate.getNotBefore() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.cert.X509Certificate#getIssuerDN() public abstract java.security.Principal
     * javax.security.cert.X509Certificate.getIssuerDN()}.
     *
     * <p>
     * Test method for {@link javax.security.cert.X509Certificate#getIssuerDN() public abstract java.security.Principal
     * javax.security.cert.X509Certificate.getIssuerDN()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.X509Certificate#getIssuerDN() public abstract java.security.Principal
     *      javax.security.cert.X509Certificate.getIssuerDN() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.cert.X509Certificate#getSubjectDN() public abstract java.security.Principal
     * javax.security.cert.X509Certificate.getSubjectDN()}.
     *
     * <p>
     * Test method for {@link javax.security.cert.X509Certificate#getSubjectDN() public abstract java.security.Principal
     * javax.security.cert.X509Certificate.getSubjectDN()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.X509Certificate#getSubjectDN() public abstract java.security.Principal
     *      javax.security.cert.X509Certificate.getSubjectDN() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.cert.X509Certificate#getVersion() public abstract int
     * javax.security.cert.X509Certificate.getVersion()}.
     *
     * <p>
     * Test method for {@link javax.security.cert.X509Certificate#getVersion() public abstract int
     * javax.security.cert.X509Certificate.getVersion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.X509Certificate#getVersion() public abstract int
     *      javax.security.cert.X509Certificate.getVersion() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.cert.X509Certificate#getSerialNumber() public abstract java.math.BigInteger
     * javax.security.cert.X509Certificate.getSerialNumber()}.
     *
     * <p>
     * Test method for {@link javax.security.cert.X509Certificate#getSerialNumber() public abstract java.math.BigInteger
     * javax.security.cert.X509Certificate.getSerialNumber()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.X509Certificate#getSerialNumber() public abstract java.math.BigInteger
     *      javax.security.cert.X509Certificate.getSerialNumber() (the hereby targeted method-under-test)
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

}
