package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.FlowView class javax.swing.text.FlowView}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.FlowViewTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.FlowViewClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.FlowView
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FlowViewTests<SUT extends javax.swing.text.FlowView>
extends org.j8unit.repository.javax.swing.text.BoxViewTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.FlowView.FlowStrategy class
     * javax.swing.text.FlowView$FlowStrategy}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.FlowViewTests.FlowStrategyTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.FlowViewClassTests.FlowStrategyClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.FlowView.FlowStrategy
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FlowStrategyTests<SUT extends javax.swing.text.FlowView.FlowStrategy>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.FlowView.FlowStrategy#changedUpdate(javax.swing.text.FlowView, javax.swing.event.DocumentEvent, java.awt.Rectangle)
         * public void
         * javax.swing.text.FlowView$FlowStrategy.changedUpdate(javax.swing.text.FlowView,javax.swing.event.DocumentEvent,java.awt.Rectangle)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.FlowView.FlowStrategy#changedUpdate(javax.swing.text.FlowView,
         *             javax.swing.event.DocumentEvent, java.awt.Rectangle)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_changedUpdate_FlowView_DocumentEvent_Rectangle()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.FlowView.FlowStrategy#insertUpdate(javax.swing.text.FlowView, javax.swing.event.DocumentEvent, java.awt.Rectangle)
         * public void
         * javax.swing.text.FlowView$FlowStrategy.insertUpdate(javax.swing.text.FlowView,javax.swing.event.DocumentEvent,java.awt.Rectangle)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.FlowView.FlowStrategy#insertUpdate(javax.swing.text.FlowView,
         *             javax.swing.event.DocumentEvent, java.awt.Rectangle)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_insertUpdate_FlowView_DocumentEvent_Rectangle()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.FlowView.FlowStrategy#layout(javax.swing.text.FlowView) public void
         * javax.swing.text.FlowView$FlowStrategy.layout(javax.swing.text.FlowView)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.FlowView.FlowStrategy#layout(javax.swing.text.FlowView)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_layout_FlowView()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.FlowView.FlowStrategy#removeUpdate(javax.swing.text.FlowView, javax.swing.event.DocumentEvent, java.awt.Rectangle)
         * public void
         * javax.swing.text.FlowView$FlowStrategy.removeUpdate(javax.swing.text.FlowView,javax.swing.event.DocumentEvent,java.awt.Rectangle)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.FlowView.FlowStrategy#removeUpdate(javax.swing.text.FlowView,
         *             javax.swing.event.DocumentEvent, java.awt.Rectangle)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_removeUpdate_FlowView_DocumentEvent_Rectangle()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.FlowView#changedUpdate(javax.swing.event.DocumentEvent, java.awt.Shape, javax.swing.text.ViewFactory)
     * public void
     * javax.swing.text.FlowView.changedUpdate(javax.swing.event.DocumentEvent,java.awt.Shape,javax.swing.text.ViewFactory)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.FlowView#changedUpdate(javax.swing.event.DocumentEvent, java.awt.Shape,
     *             javax.swing.text.ViewFactory)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_changedUpdate_DocumentEvent_Shape_ViewFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.FlowView#getFlowAxis() public int
     * javax.swing.text.FlowView.getFlowAxis()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.FlowView#getFlowAxis()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlowAxis()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.FlowView#getFlowSpan(int) public int
     * javax.swing.text.FlowView.getFlowSpan(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.FlowView#getFlowSpan(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlowSpan_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.FlowView#getFlowStart(int) public int
     * javax.swing.text.FlowView.getFlowStart(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.FlowView#getFlowStart(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlowStart_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.FlowView#insertUpdate(javax.swing.event.DocumentEvent, java.awt.Shape, javax.swing.text.ViewFactory)
     * public void
     * javax.swing.text.FlowView.insertUpdate(javax.swing.event.DocumentEvent,java.awt.Shape,javax.swing.text.ViewFactory)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.FlowView#insertUpdate(javax.swing.event.DocumentEvent, java.awt.Shape,
     *             javax.swing.text.ViewFactory)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_insertUpdate_DocumentEvent_Shape_ViewFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.FlowView#removeUpdate(javax.swing.event.DocumentEvent, java.awt.Shape, javax.swing.text.ViewFactory)
     * public void
     * javax.swing.text.FlowView.removeUpdate(javax.swing.event.DocumentEvent,java.awt.Shape,javax.swing.text.ViewFactory)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.FlowView#removeUpdate(javax.swing.event.DocumentEvent, java.awt.Shape,
     *             javax.swing.text.ViewFactory)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeUpdate_DocumentEvent_Shape_ViewFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.FlowView#setParent(javax.swing.text.View) public void
     * javax.swing.text.FlowView.setParent(javax.swing.text.View)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.FlowView#setParent(javax.swing.text.View)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setParent_View()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
