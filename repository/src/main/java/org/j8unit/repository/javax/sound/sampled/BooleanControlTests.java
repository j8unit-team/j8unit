package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.sampled.BooleanControl class
 * javax.sound.sampled.BooleanControl}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link BooleanControlClassTests}.
 * </p>
 *
 * @see javax.sound.sampled.BooleanControl class javax.sound.sampled.BooleanControl (the hereby targeted
 *      class-under-test class)
 * @see BooleanControlClassTests BooleanControlClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BooleanControlTests<SUT extends javax.sound.sampled.BooleanControl>
extends ControlTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.BooleanControl#getStateLabel(boolean) public java.lang.String
     * javax.sound.sampled.BooleanControl.getStateLabel(boolean)}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.BooleanControl#getStateLabel(boolean) public java.lang.String
     * javax.sound.sampled.BooleanControl.getStateLabel(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.BooleanControl#getStateLabel(boolean) public java.lang.String
     *      javax.sound.sampled.BooleanControl.getStateLabel(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStateLabel_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.BooleanControl#getValue() public boolean
     * javax.sound.sampled.BooleanControl.getValue()}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.BooleanControl#getValue() public boolean
     * javax.sound.sampled.BooleanControl.getValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.BooleanControl#getValue() public boolean javax.sound.sampled.BooleanControl.getValue()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.BooleanControl#setValue(boolean) public void
     * javax.sound.sampled.BooleanControl.setValue(boolean)}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.BooleanControl#setValue(boolean) public void
     * javax.sound.sampled.BooleanControl.setValue(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.BooleanControl#setValue(boolean) public void
     *      javax.sound.sampled.BooleanControl.setValue(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setValue_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.BooleanControl#toString() public java.lang.String
     * javax.sound.sampled.BooleanControl.toString()}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.BooleanControl#toString() public java.lang.String
     * javax.sound.sampled.BooleanControl.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.BooleanControl#toString() public java.lang.String
     *      javax.sound.sampled.BooleanControl.toString() (the hereby targeted method-under-test)
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
     * non-{@code static} methods) of {@linkplain javax.sound.sampled.BooleanControl.Type class
     * javax.sound.sampled.BooleanControl$Type}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link BooleanControlClassTests.TypeClassTests}.
     * </p>
     *
     * @see javax.sound.sampled.BooleanControl.Type class javax.sound.sampled.BooleanControl$Type (the hereby targeted
     *      class-under-test class)
     * @see BooleanControlClassTests.TypeClassTests BooleanControlClassTests.TypeClassTests (the complementary j8unit
     *      test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TypeTests<SUT extends javax.sound.sampled.BooleanControl.Type>
    extends ControlTests.TypeTests<SUT> {

    }

}
