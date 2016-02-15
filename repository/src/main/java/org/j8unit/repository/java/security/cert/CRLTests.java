package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CRL class java.security.cert.CRL}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link CRLClassTests}.
 * </p>
 *
 * @see java.security.cert.CRL class java.security.cert.CRL (the hereby targeted class-under-test class)
 * @see CRLClassTests CRLClassTests (the complementary j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CRLTests<SUT extends java.security.cert.CRL>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CRL#toString() public abstract java.lang.String
     * java.security.cert.CRL.toString()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CRL#toString() public abstract java.lang.String
     * java.security.cert.CRL.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CRL#toString() public abstract java.lang.String java.security.cert.CRL.toString() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.CRL#getType() public final java.lang.String
     * java.security.cert.CRL.getType()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CRL#getType() public final java.lang.String
     * java.security.cert.CRL.getType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CRL#getType() public final java.lang.String java.security.cert.CRL.getType() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.security.cert.CRL#isRevoked(java.security.cert.Certificate) public abstract boolean
     * java.security.cert.CRL.isRevoked(java.security.cert.Certificate)}.
     *
     * <p>
     * Test method for {@link java.security.cert.CRL#isRevoked(java.security.cert.Certificate) public abstract boolean
     * java.security.cert.CRL.isRevoked(java.security.cert.Certificate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CRL#isRevoked(java.security.cert.Certificate) public abstract boolean
     *      java.security.cert.CRL.isRevoked(java.security.cert.Certificate) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRevoked_Certificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
