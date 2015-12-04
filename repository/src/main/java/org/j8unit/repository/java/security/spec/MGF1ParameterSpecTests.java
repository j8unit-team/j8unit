package org.j8unit.repository.java.security.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.spec.MGF1ParameterSpec class java.security.spec.MGF1ParameterSpec}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.spec.MGF1ParameterSpecClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MGF1ParameterSpecTests<SUT extends java.security.spec.MGF1ParameterSpec>
extends org.j8unit.repository.java.security.spec.AlgorithmParameterSpecTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.spec.MGF1ParameterSpec#getDigestAlgorithm() public java.lang.String
     * java.security.spec.MGF1ParameterSpec.getDigestAlgorithm()}.
     * </p>
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
