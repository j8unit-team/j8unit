package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CertificateRevokedException class
 * java.security.cert.CertificateRevokedException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link CertificateRevokedExceptionClassTests}.
 * </p>
 *
 * @see java.security.cert.CertificateRevokedException class java.security.cert.CertificateRevokedException (the hereby
 *      targeted class-under-test class)
 * @see CertificateRevokedExceptionClassTests CertificateRevokedExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertificateRevokedExceptionTests<SUT extends java.security.cert.CertificateRevokedException>
extends CertificateExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateRevokedException#getAuthorityName() public
     * javax.security.auth.x500.X500Principal java.security.cert.CertificateRevokedException.getAuthorityName()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateRevokedException#getAuthorityName() public
     * javax.security.auth.x500.X500Principal java.security.cert.CertificateRevokedException.getAuthorityName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateRevokedException#getAuthorityName() public
     *      javax.security.auth.x500.X500Principal java.security.cert.CertificateRevokedException.getAuthorityName()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAuthorityName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateRevokedException#getMessage() public java.lang.String
     * java.security.cert.CertificateRevokedException.getMessage()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateRevokedException#getMessage() public java.lang.String
     * java.security.cert.CertificateRevokedException.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateRevokedException#getMessage() public java.lang.String
     *      java.security.cert.CertificateRevokedException.getMessage() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateRevokedException#getInvalidityDate() public java.util.Date
     * java.security.cert.CertificateRevokedException.getInvalidityDate()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateRevokedException#getInvalidityDate() public java.util.Date
     * java.security.cert.CertificateRevokedException.getInvalidityDate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateRevokedException#getInvalidityDate() public java.util.Date
     *      java.security.cert.CertificateRevokedException.getInvalidityDate() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInvalidityDate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateRevokedException#getExtensions() public
     * java.util.Map<java.lang.String, java.security.cert.Extension>
     * java.security.cert.CertificateRevokedException.getExtensions()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateRevokedException#getExtensions() public java.util.Map
     * java.security.cert.CertificateRevokedException.getExtensions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateRevokedException#getExtensions() public java.util.Map
     *      java.security.cert.CertificateRevokedException.getExtensions() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExtensions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateRevokedException#getRevocationDate() public java.util.Date
     * java.security.cert.CertificateRevokedException.getRevocationDate()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateRevokedException#getRevocationDate() public java.util.Date
     * java.security.cert.CertificateRevokedException.getRevocationDate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateRevokedException#getRevocationDate() public java.util.Date
     *      java.security.cert.CertificateRevokedException.getRevocationDate() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRevocationDate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertificateRevokedException#getRevocationReason() public
     * java.security.cert.CRLReason java.security.cert.CertificateRevokedException.getRevocationReason()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertificateRevokedException#getRevocationReason() public
     * java.security.cert.CRLReason java.security.cert.CertificateRevokedException.getRevocationReason()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertificateRevokedException#getRevocationReason() public java.security.cert.CRLReason
     *      java.security.cert.CertificateRevokedException.getRevocationReason() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRevocationReason()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
