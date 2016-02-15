package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.sampled.CompoundControl class
 * javax.sound.sampled.CompoundControl}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link CompoundControlClassTests}.
 * </p>
 *
 * @see javax.sound.sampled.CompoundControl class javax.sound.sampled.CompoundControl (the hereby targeted
 *      class-under-test class)
 * @see CompoundControlClassTests CompoundControlClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CompoundControlTests<SUT extends javax.sound.sampled.CompoundControl>
extends ControlTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.CompoundControl#getMemberControls() public
     * javax.sound.sampled.Control[] javax.sound.sampled.CompoundControl.getMemberControls()}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.CompoundControl#getMemberControls() public
     * javax.sound.sampled.Control[] javax.sound.sampled.CompoundControl.getMemberControls()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.CompoundControl#getMemberControls() public javax.sound.sampled.Control[]
     *      javax.sound.sampled.CompoundControl.getMemberControls() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMemberControls()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.CompoundControl#toString() public java.lang.String
     * javax.sound.sampled.CompoundControl.toString()}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.CompoundControl#toString() public java.lang.String
     * javax.sound.sampled.CompoundControl.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.CompoundControl#toString() public java.lang.String
     *      javax.sound.sampled.CompoundControl.toString() (the hereby targeted method-under-test)
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
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.sound.sampled.CompoundControl.Type class
     * javax.sound.sampled.CompoundControl$Type}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link CompoundControlClassTests.TypeClassTests}.
     * </p>
     *
     * @see javax.sound.sampled.CompoundControl.Type class javax.sound.sampled.CompoundControl$Type (the hereby targeted
     *      class-under-test class)
     * @see CompoundControlClassTests.TypeClassTests CompoundControlClassTests.TypeClassTests (the complementary j8unit
     *      test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TypeTests<SUT extends javax.sound.sampled.CompoundControl.Type>
    extends ControlTests.TypeTests<SUT> {

    }

}
