package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.NavigationFilter class
 * javax.swing.text.NavigationFilter}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.NavigationFilterTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.NavigationFilterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.NavigationFilter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NavigationFilterTests<SUT extends javax.swing.text.NavigationFilter>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.NavigationFilter.FilterBypass class
     * javax.swing.text.NavigationFilter$FilterBypass}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.text.NavigationFilterTests.FilterBypassTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.NavigationFilterClassTests.FilterBypassClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.NavigationFilter.FilterBypass
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FilterBypassTests<SUT extends javax.swing.text.NavigationFilter.FilterBypass>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.NavigationFilter.FilterBypass#getCaret() public abstract
         * javax.swing.text.Caret javax.swing.text.NavigationFilter$FilterBypass.getCaret()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.NavigationFilter.FilterBypass#getCaret()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getCaret()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.NavigationFilter.FilterBypass#moveDot(int, javax.swing.text.Position.Bias) public
         * abstract void javax.swing.text.NavigationFilter$FilterBypass.moveDot(int,javax.swing.text.Position$Bias)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.NavigationFilter.FilterBypass#moveDot(int, javax.swing.text.Position.Bias)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_moveDot_int_Bias()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.NavigationFilter.FilterBypass#setDot(int, javax.swing.text.Position.Bias) public
         * abstract void javax.swing.text.NavigationFilter$FilterBypass.setDot(int,javax.swing.text.Position$Bias)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.NavigationFilter.FilterBypass#setDot(int, javax.swing.text.Position.Bias)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setDot_int_Bias()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.NavigationFilter#getNextVisualPositionFrom(javax.swing.text.JTextComponent, int, javax.swing.text.Position.Bias, int, javax.swing.text.Position.Bias[])
     * public int
     * javax.swing.text.NavigationFilter.getNextVisualPositionFrom(javax.swing.text.JTextComponent,int,javax.swing.text.Position$Bias,int,javax.swing.text.Position$Bias[])
     * throws javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.NavigationFilter#getNextVisualPositionFrom(javax.swing.text.JTextComponent, int,
     *             javax.swing.text.Position.Bias, int, javax.swing.text.Position.Bias[])
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNextVisualPositionFrom_JTextComponent_int_Bias_int_BiasArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.NavigationFilter#moveDot(javax.swing.text.NavigationFilter.FilterBypass, int, javax.swing.text.Position.Bias)
     * public void
     * javax.swing.text.NavigationFilter.moveDot(javax.swing.text.NavigationFilter$FilterBypass,int,javax.swing.text.Position$Bias)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.NavigationFilter#moveDot(javax.swing.text.NavigationFilter.FilterBypass, int,
     *             javax.swing.text.Position.Bias)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_moveDot_FilterBypass_int_Bias()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.NavigationFilter#setDot(javax.swing.text.NavigationFilter.FilterBypass, int, javax.swing.text.Position.Bias)
     * public void
     * javax.swing.text.NavigationFilter.setDot(javax.swing.text.NavigationFilter$FilterBypass,int,javax.swing.text.Position$Bias)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.NavigationFilter#setDot(javax.swing.text.NavigationFilter.FilterBypass, int,
     *             javax.swing.text.Position.Bias)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDot_FilterBypass_int_Bias()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
