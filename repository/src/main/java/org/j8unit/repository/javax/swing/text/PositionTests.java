package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.Position interface javax.swing.text.Position}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PositionClassTests}.
 * </p>
 *
 * @see javax.swing.text.Position interface javax.swing.text.Position (the hereby targeted class-under-test class)
 * @see PositionClassTests PositionClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PositionTests<SUT extends javax.swing.text.Position>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.Position#getOffset() public abstract int
     * javax.swing.text.Position.getOffset()}.
     *
     * <p>
     * Test method for {@link javax.swing.text.Position#getOffset() public abstract int
     * javax.swing.text.Position.getOffset()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.Position#getOffset() public abstract int javax.swing.text.Position.getOffset() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOffset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.text.Position.Bias class javax.swing.text.Position$Bias}.
     * The complementary j8unit test interface containing the class relevant aspects is
     * {@link PositionClassTests.BiasClassTests}.
     * </p>
     *
     * @see javax.swing.text.Position.Bias class javax.swing.text.Position$Bias (the hereby targeted class-under-test
     *      class)
     * @see PositionClassTests.BiasClassTests PositionClassTests.BiasClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BiasTests<SUT extends javax.swing.text.Position.Bias>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.Position.Bias#toString() public java.lang.String
         * javax.swing.text.Position$Bias.toString()}.
         *
         * <p>
         * Test method for {@link javax.swing.text.Position.Bias#toString() public java.lang.String
         * javax.swing.text.Position$Bias.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.text.Position.Bias#toString() public java.lang.String
         *      javax.swing.text.Position$Bias.toString() (the hereby targeted method-under-test)
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

    }

}
