package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.KeyboardFocusManager class java.awt.KeyboardFocusManager}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link KeyboardFocusManagerClassTests}.
 * </p>
 *
 * @see java.awt.KeyboardFocusManager class java.awt.KeyboardFocusManager (the hereby targeted class-under-test class)
 * @see KeyboardFocusManagerClassTests KeyboardFocusManagerClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyboardFocusManagerTests<SUT extends java.awt.KeyboardFocusManager>
extends KeyEventDispatcherTests<SUT>, KeyEventPostProcessorTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#addKeyEventPostProcessor(java.awt.KeyEventPostProcessor)
     * public void java.awt.KeyboardFocusManager.addKeyEventPostProcessor(java.awt.KeyEventPostProcessor)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#addKeyEventPostProcessor(java.awt.KeyEventPostProcessor)
     * public void java.awt.KeyboardFocusManager.addKeyEventPostProcessor(java.awt.KeyEventPostProcessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#addKeyEventPostProcessor(java.awt.KeyEventPostProcessor) public void
     *      java.awt.KeyboardFocusManager.addKeyEventPostProcessor(java.awt.KeyEventPostProcessor) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addKeyEventPostProcessor_KeyEventPostProcessor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#removeKeyEventPostProcessor(java.awt.KeyEventPostProcessor)
     * public void java.awt.KeyboardFocusManager.removeKeyEventPostProcessor(java.awt.KeyEventPostProcessor)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#removeKeyEventPostProcessor(java.awt.KeyEventPostProcessor)
     * public void java.awt.KeyboardFocusManager.removeKeyEventPostProcessor(java.awt.KeyEventPostProcessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#removeKeyEventPostProcessor(java.awt.KeyEventPostProcessor) public void
     *      java.awt.KeyboardFocusManager.removeKeyEventPostProcessor(java.awt.KeyEventPostProcessor) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeKeyEventPostProcessor_KeyEventPostProcessor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#redispatchEvent(java.awt.Component, java.awt.AWTEvent)
     * public final void java.awt.KeyboardFocusManager.redispatchEvent(java.awt.Component,java.awt.AWTEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#redispatchEvent(java.awt.Component, java.awt.AWTEvent)
     * public final void java.awt.KeyboardFocusManager.redispatchEvent(java.awt.Component,java.awt.AWTEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#redispatchEvent(java.awt.Component, java.awt.AWTEvent) public final void
     *      java.awt.KeyboardFocusManager.redispatchEvent(java.awt.Component,java.awt.AWTEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_redispatchEvent_Component_AWTEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#removeKeyEventDispatcher(java.awt.KeyEventDispatcher) public
     * void java.awt.KeyboardFocusManager.removeKeyEventDispatcher(java.awt.KeyEventDispatcher)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#removeKeyEventDispatcher(java.awt.KeyEventDispatcher) public
     * void java.awt.KeyboardFocusManager.removeKeyEventDispatcher(java.awt.KeyEventDispatcher)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#removeKeyEventDispatcher(java.awt.KeyEventDispatcher) public void
     *      java.awt.KeyboardFocusManager.removeKeyEventDispatcher(java.awt.KeyEventDispatcher) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeKeyEventDispatcher_KeyEventDispatcher()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getFocusOwner() public java.awt.Component
     * java.awt.KeyboardFocusManager.getFocusOwner()}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getFocusOwner() public java.awt.Component
     * java.awt.KeyboardFocusManager.getFocusOwner()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#getFocusOwner() public java.awt.Component
     *      java.awt.KeyboardFocusManager.getFocusOwner() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFocusOwner()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#clearGlobalFocusOwner() public void
     * java.awt.KeyboardFocusManager.clearGlobalFocusOwner() throws java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#clearGlobalFocusOwner() public void
     * java.awt.KeyboardFocusManager.clearGlobalFocusOwner() throws java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#clearGlobalFocusOwner() public void
     *      java.awt.KeyboardFocusManager.clearGlobalFocusOwner() throws java.lang.SecurityException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clearGlobalFocusOwner()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#focusPreviousComponent(java.awt.Component) public abstract
     * void java.awt.KeyboardFocusManager.focusPreviousComponent(java.awt.Component)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#focusPreviousComponent(java.awt.Component) public abstract
     * void java.awt.KeyboardFocusManager.focusPreviousComponent(java.awt.Component)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#focusPreviousComponent(java.awt.Component) public abstract void
     *      java.awt.KeyboardFocusManager.focusPreviousComponent(java.awt.Component) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_focusPreviousComponent_Component()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#focusPreviousComponent() public final void
     * java.awt.KeyboardFocusManager.focusPreviousComponent()}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#focusPreviousComponent() public final void
     * java.awt.KeyboardFocusManager.focusPreviousComponent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#focusPreviousComponent() public final void
     *      java.awt.KeyboardFocusManager.focusPreviousComponent() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_focusPreviousComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.KeyboardFocusManager#removeVetoableChangeListener(java.beans.VetoableChangeListener) public void
     * java.awt.KeyboardFocusManager.removeVetoableChangeListener(java.beans.VetoableChangeListener)}.
     *
     * <p>
     * Test method for
     * {@link java.awt.KeyboardFocusManager#removeVetoableChangeListener(java.beans.VetoableChangeListener) public void
     * java.awt.KeyboardFocusManager.removeVetoableChangeListener(java.beans.VetoableChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#removeVetoableChangeListener(java.beans.VetoableChangeListener) public void
     *      java.awt.KeyboardFocusManager.removeVetoableChangeListener(java.beans.VetoableChangeListener) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeVetoableChangeListener_VetoableChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.KeyboardFocusManager#removeVetoableChangeListener(String, java.beans.VetoableChangeListener)
     * public void
     * java.awt.KeyboardFocusManager.removeVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)}.
     *
     * <p>
     * Test method for
     * {@link java.awt.KeyboardFocusManager#removeVetoableChangeListener(String, java.beans.VetoableChangeListener)
     * public void
     * java.awt.KeyboardFocusManager.removeVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#removeVetoableChangeListener(String, java.beans.VetoableChangeListener) public
     *      void java.awt.KeyboardFocusManager.removeVetoableChangeListener(java.lang.String,java.beans.
     *      VetoableChangeListener) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeVetoableChangeListener_String_VetoableChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#dispatchEvent(java.awt.AWTEvent) public abstract boolean
     * java.awt.KeyboardFocusManager.dispatchEvent(java.awt.AWTEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#dispatchEvent(java.awt.AWTEvent) public abstract boolean
     * java.awt.KeyboardFocusManager.dispatchEvent(java.awt.AWTEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#dispatchEvent(java.awt.AWTEvent) public abstract boolean
     *      java.awt.KeyboardFocusManager.dispatchEvent(java.awt.AWTEvent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dispatchEvent_AWTEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getPropertyChangeListeners(String) public synchronized
     * java.beans.PropertyChangeListener[] java.awt.KeyboardFocusManager.getPropertyChangeListeners(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getPropertyChangeListeners(String) public synchronized
     * java.beans.PropertyChangeListener[] java.awt.KeyboardFocusManager.getPropertyChangeListeners(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#getPropertyChangeListeners(String) public synchronized
     *      java.beans.PropertyChangeListener[]
     *      java.awt.KeyboardFocusManager.getPropertyChangeListeners(java.lang.String) (the hereby targeted
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
     * Test method for {@link java.awt.KeyboardFocusManager#getPropertyChangeListeners() public synchronized
     * java.beans.PropertyChangeListener[] java.awt.KeyboardFocusManager.getPropertyChangeListeners()}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getPropertyChangeListeners() public synchronized
     * java.beans.PropertyChangeListener[] java.awt.KeyboardFocusManager.getPropertyChangeListeners()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#getPropertyChangeListeners() public synchronized
     *      java.beans.PropertyChangeListener[] java.awt.KeyboardFocusManager.getPropertyChangeListeners() (the hereby
     *      targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getDefaultFocusTraversalPolicy() public synchronized
     * java.awt.FocusTraversalPolicy java.awt.KeyboardFocusManager.getDefaultFocusTraversalPolicy()}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getDefaultFocusTraversalPolicy() public synchronized
     * java.awt.FocusTraversalPolicy java.awt.KeyboardFocusManager.getDefaultFocusTraversalPolicy()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#getDefaultFocusTraversalPolicy() public synchronized
     *      java.awt.FocusTraversalPolicy java.awt.KeyboardFocusManager.getDefaultFocusTraversalPolicy() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultFocusTraversalPolicy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getPermanentFocusOwner() public java.awt.Component
     * java.awt.KeyboardFocusManager.getPermanentFocusOwner()}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getPermanentFocusOwner() public java.awt.Component
     * java.awt.KeyboardFocusManager.getPermanentFocusOwner()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#getPermanentFocusOwner() public java.awt.Component
     *      java.awt.KeyboardFocusManager.getPermanentFocusOwner() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPermanentFocusOwner()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.KeyboardFocusManager#removePropertyChangeListener(java.beans.PropertyChangeListener) public void
     * java.awt.KeyboardFocusManager.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for
     * {@link java.awt.KeyboardFocusManager#removePropertyChangeListener(java.beans.PropertyChangeListener) public void
     * java.awt.KeyboardFocusManager.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#removePropertyChangeListener(java.beans.PropertyChangeListener) public void
     *      java.awt.KeyboardFocusManager.removePropertyChangeListener(java.beans.PropertyChangeListener) (the hereby
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
     * Test method for
     * {@link java.awt.KeyboardFocusManager#removePropertyChangeListener(String, java.beans.PropertyChangeListener)
     * public void
     * java.awt.KeyboardFocusManager.removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for
     * {@link java.awt.KeyboardFocusManager#removePropertyChangeListener(String, java.beans.PropertyChangeListener)
     * public void
     * java.awt.KeyboardFocusManager.removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#removePropertyChangeListener(String, java.beans.PropertyChangeListener) public
     *      void java.awt.KeyboardFocusManager.removePropertyChangeListener(java.lang.String,java.beans.
     *      PropertyChangeListener) (the hereby targeted method-under-test)
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
     * Test method for {@link java.awt.KeyboardFocusManager#getActiveWindow() public java.awt.Window
     * java.awt.KeyboardFocusManager.getActiveWindow()}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getActiveWindow() public java.awt.Window
     * java.awt.KeyboardFocusManager.getActiveWindow()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#getActiveWindow() public java.awt.Window
     *      java.awt.KeyboardFocusManager.getActiveWindow() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getActiveWindow()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getVetoableChangeListeners(String) public synchronized
     * java.beans.VetoableChangeListener[] java.awt.KeyboardFocusManager.getVetoableChangeListeners(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getVetoableChangeListeners(String) public synchronized
     * java.beans.VetoableChangeListener[] java.awt.KeyboardFocusManager.getVetoableChangeListeners(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#getVetoableChangeListeners(String) public synchronized
     *      java.beans.VetoableChangeListener[]
     *      java.awt.KeyboardFocusManager.getVetoableChangeListeners(java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getVetoableChangeListeners_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getVetoableChangeListeners() public synchronized
     * java.beans.VetoableChangeListener[] java.awt.KeyboardFocusManager.getVetoableChangeListeners()}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getVetoableChangeListeners() public synchronized
     * java.beans.VetoableChangeListener[] java.awt.KeyboardFocusManager.getVetoableChangeListeners()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#getVetoableChangeListeners() public synchronized
     *      java.beans.VetoableChangeListener[] java.awt.KeyboardFocusManager.getVetoableChangeListeners() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getVetoableChangeListeners()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#upFocusCycle() public final void
     * java.awt.KeyboardFocusManager.upFocusCycle()}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#upFocusCycle() public final void
     * java.awt.KeyboardFocusManager.upFocusCycle()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#upFocusCycle() public final void java.awt.KeyboardFocusManager.upFocusCycle()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_upFocusCycle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#upFocusCycle(java.awt.Component) public abstract void
     * java.awt.KeyboardFocusManager.upFocusCycle(java.awt.Component)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#upFocusCycle(java.awt.Component) public abstract void
     * java.awt.KeyboardFocusManager.upFocusCycle(java.awt.Component)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#upFocusCycle(java.awt.Component) public abstract void
     *      java.awt.KeyboardFocusManager.upFocusCycle(java.awt.Component) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_upFocusCycle_Component()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getCurrentFocusCycleRoot() public java.awt.Container
     * java.awt.KeyboardFocusManager.getCurrentFocusCycleRoot()}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getCurrentFocusCycleRoot() public java.awt.Container
     * java.awt.KeyboardFocusManager.getCurrentFocusCycleRoot()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#getCurrentFocusCycleRoot() public java.awt.Container
     *      java.awt.KeyboardFocusManager.getCurrentFocusCycleRoot() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCurrentFocusCycleRoot()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.KeyboardFocusManager#addPropertyChangeListener(String, java.beans.PropertyChangeListener) public
     * void java.awt.KeyboardFocusManager.addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.awt.KeyboardFocusManager#addPropertyChangeListener(String, java.beans.PropertyChangeListener) public
     * void java.awt.KeyboardFocusManager.addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#addPropertyChangeListener(String, java.beans.PropertyChangeListener) public
     *      void
     *      java.awt.KeyboardFocusManager.addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.awt.KeyboardFocusManager#addPropertyChangeListener(java.beans.PropertyChangeListener)
     * public void java.awt.KeyboardFocusManager.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#addPropertyChangeListener(java.beans.PropertyChangeListener)
     * public void java.awt.KeyboardFocusManager.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#addPropertyChangeListener(java.beans.PropertyChangeListener) public void
     *      java.awt.KeyboardFocusManager.addPropertyChangeListener(java.beans.PropertyChangeListener) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.awt.KeyboardFocusManager#getDefaultFocusTraversalKeys(int) public java.util.Set
     * <java.awt.AWTKeyStroke> java.awt.KeyboardFocusManager.getDefaultFocusTraversalKeys(int)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getDefaultFocusTraversalKeys(int) public java.util.Set
     * java.awt.KeyboardFocusManager.getDefaultFocusTraversalKeys(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#getDefaultFocusTraversalKeys(int) public java.util.Set
     *      java.awt.KeyboardFocusManager.getDefaultFocusTraversalKeys(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultFocusTraversalKeys_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#setDefaultFocusTraversalKeys(int, java.util.Set) public void
     * java.awt.KeyboardFocusManager.setDefaultFocusTraversalKeys(int,java.util.Set<? extends java.awt.AWTKeyStroke>)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#setDefaultFocusTraversalKeys(int, java.util.Set) public void
     * java.awt.KeyboardFocusManager.setDefaultFocusTraversalKeys(int,java.util.Set)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#setDefaultFocusTraversalKeys(int, java.util.Set) public void
     *      java.awt.KeyboardFocusManager.setDefaultFocusTraversalKeys(int,java.util.Set) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDefaultFocusTraversalKeys_int_Set()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#setGlobalCurrentFocusCycleRoot(java.awt.Container) public
     * void java.awt.KeyboardFocusManager.setGlobalCurrentFocusCycleRoot(java.awt.Container) throws
     * java.lang.SecurityException}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#setGlobalCurrentFocusCycleRoot(java.awt.Container) public
     * void java.awt.KeyboardFocusManager.setGlobalCurrentFocusCycleRoot(java.awt.Container) throws
     * java.lang.SecurityException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#setGlobalCurrentFocusCycleRoot(java.awt.Container) public void
     *      java.awt.KeyboardFocusManager.setGlobalCurrentFocusCycleRoot(java.awt.Container) throws
     *      java.lang.SecurityException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setGlobalCurrentFocusCycleRoot_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#addKeyEventDispatcher(java.awt.KeyEventDispatcher) public
     * void java.awt.KeyboardFocusManager.addKeyEventDispatcher(java.awt.KeyEventDispatcher)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#addKeyEventDispatcher(java.awt.KeyEventDispatcher) public
     * void java.awt.KeyboardFocusManager.addKeyEventDispatcher(java.awt.KeyEventDispatcher)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#addKeyEventDispatcher(java.awt.KeyEventDispatcher) public void
     *      java.awt.KeyboardFocusManager.addKeyEventDispatcher(java.awt.KeyEventDispatcher) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addKeyEventDispatcher_KeyEventDispatcher()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.KeyboardFocusManager#addVetoableChangeListener(String, java.beans.VetoableChangeListener) public
     * void java.awt.KeyboardFocusManager.addVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.awt.KeyboardFocusManager#addVetoableChangeListener(String, java.beans.VetoableChangeListener) public
     * void java.awt.KeyboardFocusManager.addVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#addVetoableChangeListener(String, java.beans.VetoableChangeListener) public
     *      void
     *      java.awt.KeyboardFocusManager.addVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addVetoableChangeListener_String_VetoableChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#addVetoableChangeListener(java.beans.VetoableChangeListener)
     * public void java.awt.KeyboardFocusManager.addVetoableChangeListener(java.beans.VetoableChangeListener)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#addVetoableChangeListener(java.beans.VetoableChangeListener)
     * public void java.awt.KeyboardFocusManager.addVetoableChangeListener(java.beans.VetoableChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#addVetoableChangeListener(java.beans.VetoableChangeListener) public void
     *      java.awt.KeyboardFocusManager.addVetoableChangeListener(java.beans.VetoableChangeListener) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addVetoableChangeListener_VetoableChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getFocusedWindow() public java.awt.Window
     * java.awt.KeyboardFocusManager.getFocusedWindow()}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#getFocusedWindow() public java.awt.Window
     * java.awt.KeyboardFocusManager.getFocusedWindow()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#getFocusedWindow() public java.awt.Window
     *      java.awt.KeyboardFocusManager.getFocusedWindow() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFocusedWindow()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#postProcessKeyEvent(java.awt.event.KeyEvent) public abstract
     * boolean java.awt.KeyboardFocusManager.postProcessKeyEvent(java.awt.event.KeyEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#postProcessKeyEvent(java.awt.event.KeyEvent) public abstract
     * boolean java.awt.KeyboardFocusManager.postProcessKeyEvent(java.awt.event.KeyEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#postProcessKeyEvent(java.awt.event.KeyEvent) public abstract boolean
     *      java.awt.KeyboardFocusManager.postProcessKeyEvent(java.awt.event.KeyEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_postProcessKeyEvent_KeyEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#focusNextComponent(java.awt.Component) public abstract void
     * java.awt.KeyboardFocusManager.focusNextComponent(java.awt.Component)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#focusNextComponent(java.awt.Component) public abstract void
     * java.awt.KeyboardFocusManager.focusNextComponent(java.awt.Component)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#focusNextComponent(java.awt.Component) public abstract void
     *      java.awt.KeyboardFocusManager.focusNextComponent(java.awt.Component) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_focusNextComponent_Component()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#focusNextComponent() public final void
     * java.awt.KeyboardFocusManager.focusNextComponent()}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#focusNextComponent() public final void
     * java.awt.KeyboardFocusManager.focusNextComponent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#focusNextComponent() public final void
     *      java.awt.KeyboardFocusManager.focusNextComponent() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_focusNextComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#dispatchKeyEvent(java.awt.event.KeyEvent) public abstract
     * boolean java.awt.KeyboardFocusManager.dispatchKeyEvent(java.awt.event.KeyEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#dispatchKeyEvent(java.awt.event.KeyEvent) public abstract
     * boolean java.awt.KeyboardFocusManager.dispatchKeyEvent(java.awt.event.KeyEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#dispatchKeyEvent(java.awt.event.KeyEvent) public abstract boolean
     *      java.awt.KeyboardFocusManager.dispatchKeyEvent(java.awt.event.KeyEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_dispatchKeyEvent_KeyEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#clearFocusOwner() public void
     * java.awt.KeyboardFocusManager.clearFocusOwner()}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#clearFocusOwner() public void
     * java.awt.KeyboardFocusManager.clearFocusOwner()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#clearFocusOwner() public void java.awt.KeyboardFocusManager.clearFocusOwner()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clearFocusOwner()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.KeyboardFocusManager#setDefaultFocusTraversalPolicy(java.awt.FocusTraversalPolicy) public void
     * java.awt.KeyboardFocusManager.setDefaultFocusTraversalPolicy(java.awt.FocusTraversalPolicy)}.
     *
     * <p>
     * Test method for
     * {@link java.awt.KeyboardFocusManager#setDefaultFocusTraversalPolicy(java.awt.FocusTraversalPolicy) public void
     * java.awt.KeyboardFocusManager.setDefaultFocusTraversalPolicy(java.awt.FocusTraversalPolicy)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#setDefaultFocusTraversalPolicy(java.awt.FocusTraversalPolicy) public void
     *      java.awt.KeyboardFocusManager.setDefaultFocusTraversalPolicy(java.awt.FocusTraversalPolicy) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDefaultFocusTraversalPolicy_FocusTraversalPolicy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#downFocusCycle() public final void
     * java.awt.KeyboardFocusManager.downFocusCycle()}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#downFocusCycle() public final void
     * java.awt.KeyboardFocusManager.downFocusCycle()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#downFocusCycle() public final void
     *      java.awt.KeyboardFocusManager.downFocusCycle() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_downFocusCycle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#downFocusCycle(java.awt.Container) public abstract void
     * java.awt.KeyboardFocusManager.downFocusCycle(java.awt.Container)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#downFocusCycle(java.awt.Container) public abstract void
     * java.awt.KeyboardFocusManager.downFocusCycle(java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#downFocusCycle(java.awt.Container) public abstract void
     *      java.awt.KeyboardFocusManager.downFocusCycle(java.awt.Container) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_downFocusCycle_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#processKeyEvent(java.awt.Component, java.awt.event.KeyEvent)
     * public abstract void java.awt.KeyboardFocusManager.processKeyEvent(java.awt.Component,java.awt.event.KeyEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.KeyboardFocusManager#processKeyEvent(java.awt.Component, java.awt.event.KeyEvent)
     * public abstract void java.awt.KeyboardFocusManager.processKeyEvent(java.awt.Component,java.awt.event.KeyEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.KeyboardFocusManager#processKeyEvent(java.awt.Component, java.awt.event.KeyEvent) public abstract
     *      void java.awt.KeyboardFocusManager.processKeyEvent(java.awt.Component,java.awt.event.KeyEvent) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_processKeyEvent_Component_KeyEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
