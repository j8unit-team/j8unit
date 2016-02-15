package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.LayerUI class javax.swing.plaf.LayerUI}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link LayerUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.LayerUI class javax.swing.plaf.LayerUI (the hereby targeted class-under-test class)
 * @see LayerUIClassTests LayerUIClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LayerUITests<SUT extends javax.swing.plaf.LayerUI<V>, V extends java.awt.Component>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, ComponentUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#addPropertyChangeListener(java.beans.PropertyChangeListener)
     * public void javax.swing.plaf.LayerUI.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#addPropertyChangeListener(java.beans.PropertyChangeListener)
     * public void javax.swing.plaf.LayerUI.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#addPropertyChangeListener(java.beans.PropertyChangeListener) public void
     *      javax.swing.plaf.LayerUI.addPropertyChangeListener(java.beans.PropertyChangeListener) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addPropertyChangeListener_PropertyChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.LayerUI#addPropertyChangeListener(String, java.beans.PropertyChangeListener) public void
     * javax.swing.plaf.LayerUI.addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.LayerUI#addPropertyChangeListener(String, java.beans.PropertyChangeListener) public void
     * javax.swing.plaf.LayerUI.addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#addPropertyChangeListener(String, java.beans.PropertyChangeListener) public void
     *      javax.swing.plaf.LayerUI.addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addPropertyChangeListener_String_PropertyChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#doLayout(javax.swing.JLayer) public void
     * javax.swing.plaf.LayerUI.doLayout(javax.swing.JLayer<? extends V>)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#doLayout(javax.swing.JLayer) public void
     * javax.swing.plaf.LayerUI.doLayout(javax.swing.JLayer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#doLayout(javax.swing.JLayer) public void
     *      javax.swing.plaf.LayerUI.doLayout(javax.swing.JLayer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doLayout_JLayer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.LayerUI.uninstallUI(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.LayerUI.uninstallUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#uninstallUI(javax.swing.JComponent) public void
     *      javax.swing.plaf.LayerUI.uninstallUI(javax.swing.JComponent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_uninstallUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#paintImmediately(int, int, int, int, javax.swing.JLayer) public
     * void javax.swing.plaf.LayerUI.paintImmediately(int,int,int,int,javax.swing.JLayer<? extends V>)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#paintImmediately(int, int, int, int, javax.swing.JLayer) public
     * void javax.swing.plaf.LayerUI.paintImmediately(int,int,int,int,javax.swing.JLayer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#paintImmediately(int, int, int, int, javax.swing.JLayer) public void
     *      javax.swing.plaf.LayerUI.paintImmediately(int,int,int,int,javax.swing.JLayer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paintImmediately_int_int_int_int_JLayer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#getMinimumSize(javax.swing.JComponent) public java.awt.Dimension
     * javax.swing.plaf.LayerUI.getMinimumSize(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#getMinimumSize(javax.swing.JComponent) public java.awt.Dimension
     * javax.swing.plaf.LayerUI.getMinimumSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#getMinimumSize(javax.swing.JComponent) public java.awt.Dimension
     *      javax.swing.plaf.LayerUI.getMinimumSize(javax.swing.JComponent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMinimumSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#getBaselineResizeBehavior(javax.swing.JComponent) public
     * java.awt.Component$BaselineResizeBehavior
     * javax.swing.plaf.LayerUI.getBaselineResizeBehavior(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#getBaselineResizeBehavior(javax.swing.JComponent) public
     * java.awt.Component$BaselineResizeBehavior
     * javax.swing.plaf.LayerUI.getBaselineResizeBehavior(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#getBaselineResizeBehavior(javax.swing.JComponent) public
     *      java.awt.Component$BaselineResizeBehavior
     *      javax.swing.plaf.LayerUI.getBaselineResizeBehavior(javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getBaselineResizeBehavior_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#getPreferredSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.LayerUI.getPreferredSize(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#getPreferredSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.LayerUI.getPreferredSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#getPreferredSize(javax.swing.JComponent) public java.awt.Dimension
     *      javax.swing.plaf.LayerUI.getPreferredSize(javax.swing.JComponent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getPreferredSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.LayerUI.installUI(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.LayerUI.installUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#installUI(javax.swing.JComponent) public void
     *      javax.swing.plaf.LayerUI.installUI(javax.swing.JComponent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_installUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#getBaseline(javax.swing.JComponent, int, int) public int
     * javax.swing.plaf.LayerUI.getBaseline(javax.swing.JComponent,int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#getBaseline(javax.swing.JComponent, int, int) public int
     * javax.swing.plaf.LayerUI.getBaseline(javax.swing.JComponent,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#getBaseline(javax.swing.JComponent, int, int) public int
     *      javax.swing.plaf.LayerUI.getBaseline(javax.swing.JComponent,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getBaseline_JComponent_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.LayerUI#removePropertyChangeListener(String, java.beans.PropertyChangeListener) public
     * void javax.swing.plaf.LayerUI.removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.LayerUI#removePropertyChangeListener(String, java.beans.PropertyChangeListener) public
     * void javax.swing.plaf.LayerUI.removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#removePropertyChangeListener(String, java.beans.PropertyChangeListener) public void
     *      javax.swing.plaf.LayerUI.removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removePropertyChangeListener_String_PropertyChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#removePropertyChangeListener(java.beans.PropertyChangeListener)
     * public void javax.swing.plaf.LayerUI.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#removePropertyChangeListener(java.beans.PropertyChangeListener)
     * public void javax.swing.plaf.LayerUI.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#removePropertyChangeListener(java.beans.PropertyChangeListener) public void
     *      javax.swing.plaf.LayerUI.removePropertyChangeListener(java.beans.PropertyChangeListener) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removePropertyChangeListener_PropertyChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#eventDispatched(java.awt.AWTEvent, javax.swing.JLayer) public
     * void javax.swing.plaf.LayerUI.eventDispatched(java.awt.AWTEvent,javax.swing.JLayer<? extends V>)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#eventDispatched(java.awt.AWTEvent, javax.swing.JLayer) public
     * void javax.swing.plaf.LayerUI.eventDispatched(java.awt.AWTEvent,javax.swing.JLayer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#eventDispatched(java.awt.AWTEvent, javax.swing.JLayer) public void
     *      javax.swing.plaf.LayerUI.eventDispatched(java.awt.AWTEvent,javax.swing.JLayer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_eventDispatched_AWTEvent_JLayer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.LayerUI#applyPropertyChange(java.beans.PropertyChangeEvent, javax.swing.JLayer) public
     * void javax.swing.plaf.LayerUI.applyPropertyChange(java.beans.PropertyChangeEvent,javax.swing.JLayer<? extends
     * V>)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.LayerUI#applyPropertyChange(java.beans.PropertyChangeEvent, javax.swing.JLayer) public
     * void javax.swing.plaf.LayerUI.applyPropertyChange(java.beans.PropertyChangeEvent,javax.swing.JLayer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#applyPropertyChange(java.beans.PropertyChangeEvent, javax.swing.JLayer) public void
     *      javax.swing.plaf.LayerUI.applyPropertyChange(java.beans.PropertyChangeEvent,javax.swing.JLayer) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_applyPropertyChange_PropertyChangeEvent_JLayer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#paint(java.awt.Graphics, javax.swing.JComponent) public void
     * javax.swing.plaf.LayerUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#paint(java.awt.Graphics, javax.swing.JComponent) public void
     * javax.swing.plaf.LayerUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#paint(java.awt.Graphics, javax.swing.JComponent) public void
     *      javax.swing.plaf.LayerUI.paint(java.awt.Graphics,javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_paint_Graphics_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#updateUI(javax.swing.JLayer) public void
     * javax.swing.plaf.LayerUI.updateUI(javax.swing.JLayer<? extends V>)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#updateUI(javax.swing.JLayer) public void
     * javax.swing.plaf.LayerUI.updateUI(javax.swing.JLayer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#updateUI(javax.swing.JLayer) public void
     *      javax.swing.plaf.LayerUI.updateUI(javax.swing.JLayer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_updateUI_JLayer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#getMaximumSize(javax.swing.JComponent) public java.awt.Dimension
     * javax.swing.plaf.LayerUI.getMaximumSize(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#getMaximumSize(javax.swing.JComponent) public java.awt.Dimension
     * javax.swing.plaf.LayerUI.getMaximumSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#getMaximumSize(javax.swing.JComponent) public java.awt.Dimension
     *      javax.swing.plaf.LayerUI.getMaximumSize(javax.swing.JComponent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMaximumSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#getPropertyChangeListeners(String) public
     * java.beans.PropertyChangeListener[] javax.swing.plaf.LayerUI.getPropertyChangeListeners(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#getPropertyChangeListeners(String) public
     * java.beans.PropertyChangeListener[] javax.swing.plaf.LayerUI.getPropertyChangeListeners(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#getPropertyChangeListeners(String) public java.beans.PropertyChangeListener[]
     *      javax.swing.plaf.LayerUI.getPropertyChangeListeners(java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPropertyChangeListeners_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#getPropertyChangeListeners() public
     * java.beans.PropertyChangeListener[] javax.swing.plaf.LayerUI.getPropertyChangeListeners()}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.LayerUI#getPropertyChangeListeners() public
     * java.beans.PropertyChangeListener[] javax.swing.plaf.LayerUI.getPropertyChangeListeners()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.LayerUI#getPropertyChangeListeners() public java.beans.PropertyChangeListener[]
     *      javax.swing.plaf.LayerUI.getPropertyChangeListeners() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPropertyChangeListeners()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
