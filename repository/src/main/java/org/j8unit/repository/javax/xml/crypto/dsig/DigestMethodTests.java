package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.dsig.DigestMethod interface
 * javax.xml.crypto.dsig.DigestMethod}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link DigestMethodClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.dsig.DigestMethod interface javax.xml.crypto.dsig.DigestMethod (the hereby targeted
 *      class-under-test class)
 * @see DigestMethodClassTests DigestMethodClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DigestMethodTests<SUT extends javax.xml.crypto.dsig.DigestMethod>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT>, org.j8unit.repository.javax.xml.crypto.AlgorithmMethodTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.DigestMethod#getParameterSpec() public abstract
     * java.security.spec.AlgorithmParameterSpec javax.xml.crypto.dsig.DigestMethod.getParameterSpec()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.DigestMethod#getParameterSpec() public abstract
     * java.security.spec.AlgorithmParameterSpec javax.xml.crypto.dsig.DigestMethod.getParameterSpec()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.DigestMethod#getParameterSpec() public abstract
     *      java.security.spec.AlgorithmParameterSpec javax.xml.crypto.dsig.DigestMethod.getParameterSpec() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getParameterSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
