package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.PKIXCertPathValidatorResult class
 * java.security.cert.PKIXCertPathValidatorResult}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link PKIXCertPathValidatorResultClassTests}.
 * </p>
 *
 * @see java.security.cert.PKIXCertPathValidatorResult class java.security.cert.PKIXCertPathValidatorResult (the hereby
 *      targeted class-under-test class)
 * @see PKIXCertPathValidatorResultClassTests PKIXCertPathValidatorResultClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PKIXCertPathValidatorResultTests<SUT extends java.security.cert.PKIXCertPathValidatorResult>
extends CertPathValidatorResultTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathValidatorResult#getPublicKey() public
     * java.security.PublicKey java.security.cert.PKIXCertPathValidatorResult.getPublicKey()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathValidatorResult#getPublicKey() public
     * java.security.PublicKey java.security.cert.PKIXCertPathValidatorResult.getPublicKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXCertPathValidatorResult#getPublicKey() public java.security.PublicKey
     *      java.security.cert.PKIXCertPathValidatorResult.getPublicKey() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPublicKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathValidatorResult#toString() public java.lang.String
     * java.security.cert.PKIXCertPathValidatorResult.toString()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathValidatorResult#toString() public java.lang.String
     * java.security.cert.PKIXCertPathValidatorResult.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXCertPathValidatorResult#toString() public java.lang.String
     *      java.security.cert.PKIXCertPathValidatorResult.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.PKIXCertPathValidatorResult#getPolicyTree() public
     * java.security.cert.PolicyNode java.security.cert.PKIXCertPathValidatorResult.getPolicyTree()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathValidatorResult#getPolicyTree() public
     * java.security.cert.PolicyNode java.security.cert.PKIXCertPathValidatorResult.getPolicyTree()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXCertPathValidatorResult#getPolicyTree() public java.security.cert.PolicyNode
     *      java.security.cert.PKIXCertPathValidatorResult.getPolicyTree() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPolicyTree()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathValidatorResult#clone() public java.lang.Object
     * java.security.cert.PKIXCertPathValidatorResult.clone()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathValidatorResult#clone() public java.lang.Object
     * java.security.cert.PKIXCertPathValidatorResult.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXCertPathValidatorResult#clone() public java.lang.Object
     *      java.security.cert.PKIXCertPathValidatorResult.clone() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.PKIXCertPathValidatorResult#getTrustAnchor() public
     * java.security.cert.TrustAnchor java.security.cert.PKIXCertPathValidatorResult.getTrustAnchor()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathValidatorResult#getTrustAnchor() public
     * java.security.cert.TrustAnchor java.security.cert.PKIXCertPathValidatorResult.getTrustAnchor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXCertPathValidatorResult#getTrustAnchor() public java.security.cert.TrustAnchor
     *      java.security.cert.PKIXCertPathValidatorResult.getTrustAnchor() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTrustAnchor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
