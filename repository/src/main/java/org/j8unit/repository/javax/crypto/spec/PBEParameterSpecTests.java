package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.spec.PBEParameterSpec class
 * javax.crypto.spec.PBEParameterSpec}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link PBEParameterSpecClassTests}.
 * </p>
 *
 * @see javax.crypto.spec.PBEParameterSpec class javax.crypto.spec.PBEParameterSpec (the hereby targeted
 *      class-under-test class)
 * @see PBEParameterSpecClassTests PBEParameterSpecClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PBEParameterSpecTests<SUT extends javax.crypto.spec.PBEParameterSpec>
extends org.j8unit.repository.java.security.spec.AlgorithmParameterSpecTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.PBEParameterSpec#getSalt() public byte[]
     * javax.crypto.spec.PBEParameterSpec.getSalt()}.
     *
     * <p>
     * Test method for {@link javax.crypto.spec.PBEParameterSpec#getSalt() public byte[]
     * javax.crypto.spec.PBEParameterSpec.getSalt()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.spec.PBEParameterSpec#getSalt() public byte[] javax.crypto.spec.PBEParameterSpec.getSalt() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSalt()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.PBEParameterSpec#getParameterSpec() public
     * java.security.spec.AlgorithmParameterSpec javax.crypto.spec.PBEParameterSpec.getParameterSpec()}.
     *
     * <p>
     * Test method for {@link javax.crypto.spec.PBEParameterSpec#getParameterSpec() public
     * java.security.spec.AlgorithmParameterSpec javax.crypto.spec.PBEParameterSpec.getParameterSpec()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.spec.PBEParameterSpec#getParameterSpec() public java.security.spec.AlgorithmParameterSpec
     *      javax.crypto.spec.PBEParameterSpec.getParameterSpec() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameterSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.PBEParameterSpec#getIterationCount() public int
     * javax.crypto.spec.PBEParameterSpec.getIterationCount()}.
     *
     * <p>
     * Test method for {@link javax.crypto.spec.PBEParameterSpec#getIterationCount() public int
     * javax.crypto.spec.PBEParameterSpec.getIterationCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.spec.PBEParameterSpec#getIterationCount() public int
     *      javax.crypto.spec.PBEParameterSpec.getIterationCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIterationCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
