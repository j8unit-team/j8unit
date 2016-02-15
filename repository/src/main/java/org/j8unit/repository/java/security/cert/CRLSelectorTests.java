package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CRLSelector interface java.security.cert.CRLSelector}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link CRLSelectorClassTests}.
 * </p>
 *
 * @see java.security.cert.CRLSelector interface java.security.cert.CRLSelector (the hereby targeted class-under-test
 *      class)
 * @see CRLSelectorClassTests CRLSelectorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CRLSelectorTests<SUT extends java.security.cert.CRLSelector>
extends org.j8unit.repository.java.lang.CloneableTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CRLSelector#clone() public abstract java.lang.Object
     * java.security.cert.CRLSelector.clone()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CRLSelector#clone() public abstract java.lang.Object
     * java.security.cert.CRLSelector.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CRLSelector#clone() public abstract java.lang.Object
     *      java.security.cert.CRLSelector.clone() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.security.cert.CRLSelector#match(java.security.cert.CRL) public abstract boolean
     * java.security.cert.CRLSelector.match(java.security.cert.CRL)}.
     *
     * <p>
     * Test method for {@link java.security.cert.CRLSelector#match(java.security.cert.CRL) public abstract boolean
     * java.security.cert.CRLSelector.match(java.security.cert.CRL)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CRLSelector#match(java.security.cert.CRL) public abstract boolean
     *      java.security.cert.CRLSelector.match(java.security.cert.CRL) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_match_CRL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
