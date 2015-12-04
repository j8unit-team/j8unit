package org.j8unit.repository.javax.swing.text;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.Position interface javax.swing.text.Position}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.PositionClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PositionTests<SUT extends javax.swing.text.Position>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.text.Position$Bias class javax.swing.text.Position$Bias}, containing all
     * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.PositionClassTests.BiasClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BiasTests<SUT extends javax.swing.text.Position.Bias>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.Position.Bias#toString() public java.lang.String
         * javax.swing.text.Position$Bias.toString()}.
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

    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.Position#getOffset() public abstract int
     * javax.swing.text.Position.getOffset()}.
     * </p>
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

}
