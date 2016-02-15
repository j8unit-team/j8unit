package org.j8unit.repository.java.security.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.spec.MGF1ParameterSpec class
 * java.security.spec.MGF1ParameterSpec}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link MGF1ParameterSpecClassTests}.
 * </p>
 *
 * @see java.security.spec.MGF1ParameterSpec class java.security.spec.MGF1ParameterSpec (the hereby targeted
 *      class-under-test class)
 * @see MGF1ParameterSpecClassTests MGF1ParameterSpecClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MGF1ParameterSpecTests<SUT extends java.security.spec.MGF1ParameterSpec>
extends AlgorithmParameterSpecTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.spec.MGF1ParameterSpec#getDigestAlgorithm() public java.lang.String
     * java.security.spec.MGF1ParameterSpec.getDigestAlgorithm()}.
     *
     * <p>
     * Test method for {@link java.security.spec.MGF1ParameterSpec#getDigestAlgorithm() public java.lang.String
     * java.security.spec.MGF1ParameterSpec.getDigestAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.MGF1ParameterSpec#getDigestAlgorithm() public java.lang.String
     *      java.security.spec.MGF1ParameterSpec.getDigestAlgorithm() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDigestAlgorithm()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
