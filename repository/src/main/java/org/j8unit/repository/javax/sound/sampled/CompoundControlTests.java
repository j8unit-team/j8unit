package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sound.sampled.CompoundControl class javax.sound.sampled.CompoundControl}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sound.sampled.CompoundControlClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CompoundControlTests<SUT extends javax.sound.sampled.CompoundControl>
extends org.j8unit.repository.javax.sound.sampled.ControlTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.CompoundControl#getMemberControls() public
     * javax.sound.sampled.Control[] javax.sound.sampled.CompoundControl.getMemberControls()}.
     * </p>
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
     * </p>
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

    /**
     * <p>
     * Test class for {@link javax.sound.sampled.CompoundControl$Type class javax.sound.sampled.CompoundControl$Type},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.sound.sampled.CompoundControlClassTests.TypeClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TypeTests<SUT extends javax.sound.sampled.CompoundControl.Type>
    extends org.j8unit.repository.javax.sound.sampled.ControlTests.TypeTests<SUT> {

    }

}
