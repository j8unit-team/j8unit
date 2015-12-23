package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicScrollPaneUI class
 * javax.swing.plaf.basic.BasicScrollPaneUI}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.basic.BasicScrollPaneUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicScrollPaneUITests<SUT extends javax.swing.plaf.basic.BasicScrollPaneUI>
extends org.j8unit.repository.javax.swing.ScrollPaneConstantsTests<SUT>, org.j8unit.repository.javax.swing.plaf.ScrollPaneUITests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener class
     * javax.swing.plaf.basic.BasicScrollPaneUI$HSBChangeListener}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.HSBChangeListenerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUIClassTests.HSBChangeListenerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface HSBChangeListenerTests<SUT extends javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener>
    extends org.j8unit.repository.javax.swing.event.ChangeListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener#stateChanged(javax.swing.event.ChangeEvent)
         * public void
         * javax.swing.plaf.basic.BasicScrollPaneUI$HSBChangeListener.stateChanged(javax.swing.event.ChangeEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener#stateChanged(javax.swing.event.
         *             ChangeEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_stateChanged_ChangeEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler
     * class javax.swing.plaf.basic.BasicScrollPaneUI$PropertyChangeHandler}, containing all instance relevant test
     * methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface
     * containing the class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.PropertyChangeHandlerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUIClassTests.PropertyChangeHandlerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyChangeHandlerTests<SUT extends javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler#propertyChange(java.beans.PropertyChangeEvent)
         * public void
         * javax.swing.plaf.basic.BasicScrollPaneUI$PropertyChangeHandler.propertyChange(java.beans.PropertyChangeEvent)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler#propertyChange(java.beans.
         *             PropertyChangeEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_propertyChange_PropertyChangeEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler
     * class javax.swing.plaf.basic.BasicScrollPaneUI$ViewportChangeHandler}, containing all instance relevant test
     * methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface
     * containing the class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.ViewportChangeHandlerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUIClassTests.ViewportChangeHandlerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ViewportChangeHandlerTests<SUT extends javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler>
    extends org.j8unit.repository.javax.swing.event.ChangeListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler#stateChanged(javax.swing.event.ChangeEvent)
         * public void
         * javax.swing.plaf.basic.BasicScrollPaneUI$ViewportChangeHandler.stateChanged(javax.swing.event.ChangeEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler#stateChanged(javax.swing.event.
         *             ChangeEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_stateChanged_ChangeEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener class
     * javax.swing.plaf.basic.BasicScrollPaneUI$VSBChangeListener}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.VSBChangeListenerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUIClassTests.VSBChangeListenerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface VSBChangeListenerTests<SUT extends javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener>
    extends org.j8unit.repository.javax.swing.event.ChangeListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener#stateChanged(javax.swing.event.ChangeEvent)
         * public void
         * javax.swing.plaf.basic.BasicScrollPaneUI$VSBChangeListener.stateChanged(javax.swing.event.ChangeEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener#stateChanged(javax.swing.event.
         *             ChangeEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_stateChanged_ChangeEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicScrollPaneUI#getBaseline(javax.swing.JComponent, int, int)
     * public int javax.swing.plaf.basic.BasicScrollPaneUI.getBaseline(javax.swing.JComponent,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicScrollPaneUI#getBaseline(javax.swing.JComponent, int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getBaseline_JComponent_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicScrollPaneUI#getBaselineResizeBehavior(javax.swing.JComponent)
     * public java.awt.Component$BaselineResizeBehavior
     * javax.swing.plaf.basic.BasicScrollPaneUI.getBaselineResizeBehavior(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicScrollPaneUI#getBaselineResizeBehavior(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getBaselineResizeBehavior_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicScrollPaneUI#getMaximumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicScrollPaneUI.getMaximumSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicScrollPaneUI#getMaximumSize(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMaximumSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicScrollPaneUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicScrollPaneUI.installUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicScrollPaneUI#installUI(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_installUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicScrollPaneUI#paint(java.awt.Graphics, javax.swing.JComponent)
     * public void javax.swing.plaf.basic.BasicScrollPaneUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicScrollPaneUI#paint(java.awt.Graphics, javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_paint_Graphics_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicScrollPaneUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicScrollPaneUI.uninstallUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicScrollPaneUI#uninstallUI(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_uninstallUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
