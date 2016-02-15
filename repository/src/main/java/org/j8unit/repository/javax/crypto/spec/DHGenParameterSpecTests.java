package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.spec.DHGenParameterSpec class
 * javax.crypto.spec.DHGenParameterSpec}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link DHGenParameterSpecClassTests}.
 * </p>
 *
 * @see javax.crypto.spec.DHGenParameterSpec class javax.crypto.spec.DHGenParameterSpec (the hereby targeted
 *      class-under-test class)
 * @see DHGenParameterSpecClassTests DHGenParameterSpecClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DHGenParameterSpecTests<SUT extends javax.crypto.spec.DHGenParameterSpec>
extends org.j8unit.repository.java.security.spec.AlgorithmParameterSpecTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.DHGenParameterSpec#getPrimeSize() public int
     * javax.crypto.spec.DHGenParameterSpec.getPrimeSize()}.
     *
     * <p>
     * Test method for {@link javax.crypto.spec.DHGenParameterSpec#getPrimeSize() public int
     * javax.crypto.spec.DHGenParameterSpec.getPrimeSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.spec.DHGenParameterSpec#getPrimeSize() public int
     *      javax.crypto.spec.DHGenParameterSpec.getPrimeSize() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrimeSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.DHGenParameterSpec#getExponentSize() public int
     * javax.crypto.spec.DHGenParameterSpec.getExponentSize()}.
     *
     * <p>
     * Test method for {@link javax.crypto.spec.DHGenParameterSpec#getExponentSize() public int
     * javax.crypto.spec.DHGenParameterSpec.getExponentSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.spec.DHGenParameterSpec#getExponentSize() public int
     *      javax.crypto.spec.DHGenParameterSpec.getExponentSize() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExponentSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
