package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.Box class javax.swing.Box}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test
 * interface containing the class relevant test methods is {@link org.j8unit.repository.javax.swing.BoxTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.BoxClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.Box
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BoxTests<SUT extends javax.swing.Box>
extends org.j8unit.repository.javax.accessibility.AccessibleTests<SUT>, org.j8unit.repository.javax.swing.JComponentTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.Box.Filler class javax.swing.Box$Filler}, containing
     * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart
     * J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.BoxTests.FillerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.BoxClassTests.FillerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.Box.Filler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FillerTests<SUT extends javax.swing.Box.Filler>
    extends org.j8unit.repository.javax.accessibility.AccessibleTests<SUT>, org.j8unit.repository.javax.swing.JComponentTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.Box.Filler#changeShape(java.awt.Dimension, java.awt.Dimension, java.awt.Dimension) public
         * void javax.swing.Box$Filler.changeShape(java.awt.Dimension,java.awt.Dimension,java.awt.Dimension)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.Box.Filler#changeShape(java.awt.Dimension, java.awt.Dimension, java.awt.Dimension)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_changeShape_Dimension_Dimension_Dimension()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.Box.Filler#getAccessibleContext() public
         * javax.accessibility.AccessibleContext javax.swing.Box$Filler.getAccessibleContext()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.Box.Filler#getAccessibleContext()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getAccessibleContext()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.Box#getAccessibleContext() public javax.accessibility.AccessibleContext
     * javax.swing.Box.getAccessibleContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.Box#getAccessibleContext()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getAccessibleContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.Box#setLayout(java.awt.LayoutManager) public void
     * javax.swing.Box.setLayout(java.awt.LayoutManager)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.Box#setLayout(java.awt.LayoutManager)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setLayout_LayoutManager()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
