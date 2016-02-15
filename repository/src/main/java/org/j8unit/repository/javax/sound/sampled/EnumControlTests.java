package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.sampled.EnumControl class javax.sound.sampled.EnumControl}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link EnumControlClassTests}.
 * </p>
 *
 * @see javax.sound.sampled.EnumControl class javax.sound.sampled.EnumControl (the hereby targeted class-under-test
 *      class)
 * @see EnumControlClassTests EnumControlClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EnumControlTests<SUT extends javax.sound.sampled.EnumControl>
extends ControlTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.EnumControl#getValue() public java.lang.Object
     * javax.sound.sampled.EnumControl.getValue()}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.EnumControl#getValue() public java.lang.Object
     * javax.sound.sampled.EnumControl.getValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.EnumControl#getValue() public java.lang.Object
     *      javax.sound.sampled.EnumControl.getValue() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sound.sampled.EnumControl#setValue(Object) public void
     * javax.sound.sampled.EnumControl.setValue(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.EnumControl#setValue(Object) public void
     * javax.sound.sampled.EnumControl.setValue(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.EnumControl#setValue(Object) public void
     *      javax.sound.sampled.EnumControl.setValue(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setValue_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.EnumControl#getValues() public java.lang.Object[]
     * javax.sound.sampled.EnumControl.getValues()}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.EnumControl#getValues() public java.lang.Object[]
     * javax.sound.sampled.EnumControl.getValues()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.EnumControl#getValues() public java.lang.Object[]
     *      javax.sound.sampled.EnumControl.getValues() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getValues()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.EnumControl#toString() public java.lang.String
     * javax.sound.sampled.EnumControl.toString()}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.EnumControl#toString() public java.lang.String
     * javax.sound.sampled.EnumControl.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.EnumControl#toString() public java.lang.String
     *      javax.sound.sampled.EnumControl.toString() (the hereby targeted method-under-test)
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
     * non-{@code static} methods) of {@linkplain javax.sound.sampled.EnumControl.Type class
     * javax.sound.sampled.EnumControl$Type}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link EnumControlClassTests.TypeClassTests}.
     * </p>
     *
     * @see javax.sound.sampled.EnumControl.Type class javax.sound.sampled.EnumControl$Type (the hereby targeted
     *      class-under-test class)
     * @see EnumControlClassTests.TypeClassTests EnumControlClassTests.TypeClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TypeTests<SUT extends javax.sound.sampled.EnumControl.Type>
    extends ControlTests.TypeTests<SUT> {

    }

}
