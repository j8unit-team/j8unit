package org.j8unit.repository.java.awt.dnd;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.dnd.DragSourceContext class java.awt.dnd.DragSourceContext}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DragSourceContextClassTests}.
 * </p>
 *
 * @see java.awt.dnd.DragSourceContext class java.awt.dnd.DragSourceContext (the hereby targeted class-under-test class)
 * @see DragSourceContextClassTests DragSourceContextClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DragSourceContextTests<SUT extends java.awt.dnd.DragSourceContext>
extends DragSourceListenerTests<SUT>, DragSourceMotionListenerTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#getDragSource() public java.awt.dnd.DragSource
     * java.awt.dnd.DragSourceContext.getDragSource()}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#getDragSource() public java.awt.dnd.DragSource
     * java.awt.dnd.DragSourceContext.getDragSource()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#getDragSource() public java.awt.dnd.DragSource
     *      java.awt.dnd.DragSourceContext.getDragSource() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDragSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#dragMouseMoved(java.awt.dnd.DragSourceDragEvent) public
     * void java.awt.dnd.DragSourceContext.dragMouseMoved(java.awt.dnd.DragSourceDragEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#dragMouseMoved(java.awt.dnd.DragSourceDragEvent) public
     * void java.awt.dnd.DragSourceContext.dragMouseMoved(java.awt.dnd.DragSourceDragEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#dragMouseMoved(java.awt.dnd.DragSourceDragEvent) public void
     *      java.awt.dnd.DragSourceContext.dragMouseMoved(java.awt.dnd.DragSourceDragEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_dragMouseMoved_DragSourceDragEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#dragExit(java.awt.dnd.DragSourceEvent) public void
     * java.awt.dnd.DragSourceContext.dragExit(java.awt.dnd.DragSourceEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#dragExit(java.awt.dnd.DragSourceEvent) public void
     * java.awt.dnd.DragSourceContext.dragExit(java.awt.dnd.DragSourceEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#dragExit(java.awt.dnd.DragSourceEvent) public void
     *      java.awt.dnd.DragSourceContext.dragExit(java.awt.dnd.DragSourceEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_dragExit_DragSourceEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#getComponent() public java.awt.Component
     * java.awt.dnd.DragSourceContext.getComponent()}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#getComponent() public java.awt.Component
     * java.awt.dnd.DragSourceContext.getComponent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#getComponent() public java.awt.Component
     *      java.awt.dnd.DragSourceContext.getComponent() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#dragOver(java.awt.dnd.DragSourceDragEvent) public void
     * java.awt.dnd.DragSourceContext.dragOver(java.awt.dnd.DragSourceDragEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#dragOver(java.awt.dnd.DragSourceDragEvent) public void
     * java.awt.dnd.DragSourceContext.dragOver(java.awt.dnd.DragSourceDragEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#dragOver(java.awt.dnd.DragSourceDragEvent) public void
     *      java.awt.dnd.DragSourceContext.dragOver(java.awt.dnd.DragSourceDragEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_dragOver_DragSourceDragEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#setCursor(java.awt.Cursor) public synchronized void
     * java.awt.dnd.DragSourceContext.setCursor(java.awt.Cursor)}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#setCursor(java.awt.Cursor) public synchronized void
     * java.awt.dnd.DragSourceContext.setCursor(java.awt.Cursor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#setCursor(java.awt.Cursor) public synchronized void
     *      java.awt.dnd.DragSourceContext.setCursor(java.awt.Cursor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCursor_Cursor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#dragEnter(java.awt.dnd.DragSourceDragEvent) public void
     * java.awt.dnd.DragSourceContext.dragEnter(java.awt.dnd.DragSourceDragEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#dragEnter(java.awt.dnd.DragSourceDragEvent) public void
     * java.awt.dnd.DragSourceContext.dragEnter(java.awt.dnd.DragSourceDragEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#dragEnter(java.awt.dnd.DragSourceDragEvent) public void
     *      java.awt.dnd.DragSourceContext.dragEnter(java.awt.dnd.DragSourceDragEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_dragEnter_DragSourceDragEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#getCursor() public java.awt.Cursor
     * java.awt.dnd.DragSourceContext.getCursor()}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#getCursor() public java.awt.Cursor
     * java.awt.dnd.DragSourceContext.getCursor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#getCursor() public java.awt.Cursor java.awt.dnd.DragSourceContext.getCursor()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCursor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#removeDragSourceListener(java.awt.dnd.DragSourceListener)
     * public synchronized void
     * java.awt.dnd.DragSourceContext.removeDragSourceListener(java.awt.dnd.DragSourceListener)}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#removeDragSourceListener(java.awt.dnd.DragSourceListener)
     * public synchronized void
     * java.awt.dnd.DragSourceContext.removeDragSourceListener(java.awt.dnd.DragSourceListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#removeDragSourceListener(java.awt.dnd.DragSourceListener) public synchronized
     *      void java.awt.dnd.DragSourceContext.removeDragSourceListener(java.awt.dnd.DragSourceListener) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeDragSourceListener_DragSourceListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#getTrigger() public java.awt.dnd.DragGestureEvent
     * java.awt.dnd.DragSourceContext.getTrigger()}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#getTrigger() public java.awt.dnd.DragGestureEvent
     * java.awt.dnd.DragSourceContext.getTrigger()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#getTrigger() public java.awt.dnd.DragGestureEvent
     *      java.awt.dnd.DragSourceContext.getTrigger() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTrigger()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#getTransferable() public java.awt.datatransfer.Transferable
     * java.awt.dnd.DragSourceContext.getTransferable()}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#getTransferable() public java.awt.datatransfer.Transferable
     * java.awt.dnd.DragSourceContext.getTransferable()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#getTransferable() public java.awt.datatransfer.Transferable
     *      java.awt.dnd.DragSourceContext.getTransferable() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTransferable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#getSourceActions() public int
     * java.awt.dnd.DragSourceContext.getSourceActions()}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#getSourceActions() public int
     * java.awt.dnd.DragSourceContext.getSourceActions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#getSourceActions() public int
     *      java.awt.dnd.DragSourceContext.getSourceActions() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSourceActions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#addDragSourceListener(java.awt.dnd.DragSourceListener)
     * public synchronized void java.awt.dnd.DragSourceContext.addDragSourceListener(java.awt.dnd.DragSourceListener)
     * throws java.util.TooManyListenersException}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#addDragSourceListener(java.awt.dnd.DragSourceListener)
     * public synchronized void java.awt.dnd.DragSourceContext.addDragSourceListener(java.awt.dnd.DragSourceListener)
     * throws java.util.TooManyListenersException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#addDragSourceListener(java.awt.dnd.DragSourceListener) public synchronized
     *      void java.awt.dnd.DragSourceContext.addDragSourceListener(java.awt.dnd.DragSourceListener) throws
     *      java.util.TooManyListenersException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addDragSourceListener_DragSourceListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#dragDropEnd(java.awt.dnd.DragSourceDropEvent) public void
     * java.awt.dnd.DragSourceContext.dragDropEnd(java.awt.dnd.DragSourceDropEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#dragDropEnd(java.awt.dnd.DragSourceDropEvent) public void
     * java.awt.dnd.DragSourceContext.dragDropEnd(java.awt.dnd.DragSourceDropEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#dragDropEnd(java.awt.dnd.DragSourceDropEvent) public void
     *      java.awt.dnd.DragSourceContext.dragDropEnd(java.awt.dnd.DragSourceDropEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_dragDropEnd_DragSourceDropEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#dropActionChanged(java.awt.dnd.DragSourceDragEvent) public
     * void java.awt.dnd.DragSourceContext.dropActionChanged(java.awt.dnd.DragSourceDragEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#dropActionChanged(java.awt.dnd.DragSourceDragEvent) public
     * void java.awt.dnd.DragSourceContext.dropActionChanged(java.awt.dnd.DragSourceDragEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#dropActionChanged(java.awt.dnd.DragSourceDragEvent) public void
     *      java.awt.dnd.DragSourceContext.dropActionChanged(java.awt.dnd.DragSourceDragEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_dropActionChanged_DragSourceDragEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#transferablesFlavorsChanged() public void
     * java.awt.dnd.DragSourceContext.transferablesFlavorsChanged()}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceContext#transferablesFlavorsChanged() public void
     * java.awt.dnd.DragSourceContext.transferablesFlavorsChanged()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceContext#transferablesFlavorsChanged() public void
     *      java.awt.dnd.DragSourceContext.transferablesFlavorsChanged() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transferablesFlavorsChanged()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
