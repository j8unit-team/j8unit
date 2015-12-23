package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sound.sampled.CompoundControl class
 * javax.sound.sampled.CompoundControl}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sound.sampled.CompoundControlTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sound.sampled.CompoundControlClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sound.sampled.CompoundControl
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CompoundControlTests<SUT extends javax.sound.sampled.CompoundControl>
extends org.j8unit.repository.javax.sound.sampled.ControlTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.sound.sampled.CompoundControl.Type class
     * javax.sound.sampled.CompoundControl$Type}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.sound.sampled.CompoundControlTests.TypeTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.sound.sampled.CompoundControlClassTests.TypeClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.sound.sampled.CompoundControl.Type
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TypeTests<SUT extends javax.sound.sampled.CompoundControl.Type>
    extends org.j8unit.repository.javax.sound.sampled.ControlTests.TypeTests<SUT> {

    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.CompoundControl#getMemberControls() public
     * javax.sound.sampled.Control[] javax.sound.sampled.CompoundControl.getMemberControls()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.CompoundControl#getMemberControls()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.CompoundControl#toString()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
