package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CertStore class java.security.cert.CertStore}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link CertStoreClassTests}.
 * </p>
 *
 * @see java.security.cert.CertStore class java.security.cert.CertStore (the hereby targeted class-under-test class)
 * @see CertStoreClassTests CertStoreClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertStoreTests<SUT extends java.security.cert.CertStore>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertStore#getType() public final java.lang.String
     * java.security.cert.CertStore.getType()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertStore#getType() public final java.lang.String
     * java.security.cert.CertStore.getType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertStore#getType() public final java.lang.String java.security.cert.CertStore.getType()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.CertStore#getCRLs(java.security.cert.CRLSelector) public final
     * java.util.Collection<? extends java.security.cert.CRL>
     * java.security.cert.CertStore.getCRLs(java.security.cert.CRLSelector) throws
     * java.security.cert.CertStoreException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertStore#getCRLs(java.security.cert.CRLSelector) public final
     * java.util.Collection java.security.cert.CertStore.getCRLs(java.security.cert.CRLSelector) throws
     * java.security.cert.CertStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertStore#getCRLs(java.security.cert.CRLSelector) public final java.util.Collection
     *      java.security.cert.CertStore.getCRLs(java.security.cert.CRLSelector) throws
     *      java.security.cert.CertStoreException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCRLs_CRLSelector()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertStore#getCertStoreParameters() public final
     * java.security.cert.CertStoreParameters java.security.cert.CertStore.getCertStoreParameters()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertStore#getCertStoreParameters() public final
     * java.security.cert.CertStoreParameters java.security.cert.CertStore.getCertStoreParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertStore#getCertStoreParameters() public final java.security.cert.CertStoreParameters
     *      java.security.cert.CertStore.getCertStoreParameters() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertStoreParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertStore#getCertificates(java.security.cert.CertSelector) public final
     * java.util.Collection<? extends java.security.cert.Certificate>
     * java.security.cert.CertStore.getCertificates(java.security.cert.CertSelector) throws
     * java.security.cert.CertStoreException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertStore#getCertificates(java.security.cert.CertSelector) public final
     * java.util.Collection java.security.cert.CertStore.getCertificates(java.security.cert.CertSelector) throws
     * java.security.cert.CertStoreException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertStore#getCertificates(java.security.cert.CertSelector) public final
     *      java.util.Collection java.security.cert.CertStore.getCertificates(java.security.cert.CertSelector) throws
     *      java.security.cert.CertStoreException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertificates_CertSelector()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertStore#getProvider() public final java.security.Provider
     * java.security.cert.CertStore.getProvider()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertStore#getProvider() public final java.security.Provider
     * java.security.cert.CertStore.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertStore#getProvider() public final java.security.Provider
     *      java.security.cert.CertStore.getProvider() (the hereby targeted method-under-test)
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
