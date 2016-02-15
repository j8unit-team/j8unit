package org.j8unit.repository.javax.swing.undo;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.undo.UndoManager class javax.swing.undo.UndoManager}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link UndoManagerClassTests}.
 * </p>
 *
 * @see javax.swing.undo.UndoManager class javax.swing.undo.UndoManager (the hereby targeted class-under-test class)
 * @see UndoManagerClassTests UndoManagerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UndoManagerTests<SUT extends javax.swing.undo.UndoManager>
extends org.j8unit.repository.javax.swing.event.UndoableEditListenerTests<SUT>, CompoundEditTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#canRedo() public synchronized boolean
     * javax.swing.undo.UndoManager.canRedo()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#canRedo() public synchronized boolean
     * javax.swing.undo.UndoManager.canRedo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#canRedo() public synchronized boolean javax.swing.undo.UndoManager.canRedo()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_canRedo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#addEdit(javax.swing.undo.UndoableEdit) public synchronized
     * boolean javax.swing.undo.UndoManager.addEdit(javax.swing.undo.UndoableEdit)}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#addEdit(javax.swing.undo.UndoableEdit) public synchronized
     * boolean javax.swing.undo.UndoManager.addEdit(javax.swing.undo.UndoableEdit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#addEdit(javax.swing.undo.UndoableEdit) public synchronized boolean
     *      javax.swing.undo.UndoManager.addEdit(javax.swing.undo.UndoableEdit) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addEdit_UndoableEdit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#redo() public synchronized void
     * javax.swing.undo.UndoManager.redo() throws javax.swing.undo.CannotRedoException}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#redo() public synchronized void
     * javax.swing.undo.UndoManager.redo() throws javax.swing.undo.CannotRedoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#redo() public synchronized void javax.swing.undo.UndoManager.redo() throws
     *      javax.swing.undo.CannotRedoException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_redo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#getLimit() public synchronized int
     * javax.swing.undo.UndoManager.getLimit()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#getLimit() public synchronized int
     * javax.swing.undo.UndoManager.getLimit()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#getLimit() public synchronized int javax.swing.undo.UndoManager.getLimit() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLimit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#discardAllEdits() public synchronized void
     * javax.swing.undo.UndoManager.discardAllEdits()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#discardAllEdits() public synchronized void
     * javax.swing.undo.UndoManager.discardAllEdits()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#discardAllEdits() public synchronized void
     *      javax.swing.undo.UndoManager.discardAllEdits() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_discardAllEdits()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#getRedoPresentationName() public synchronized
     * java.lang.String javax.swing.undo.UndoManager.getRedoPresentationName()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#getRedoPresentationName() public synchronized
     * java.lang.String javax.swing.undo.UndoManager.getRedoPresentationName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#getRedoPresentationName() public synchronized java.lang.String
     *      javax.swing.undo.UndoManager.getRedoPresentationName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getRedoPresentationName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#getUndoOrRedoPresentationName() public synchronized
     * java.lang.String javax.swing.undo.UndoManager.getUndoOrRedoPresentationName()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#getUndoOrRedoPresentationName() public synchronized
     * java.lang.String javax.swing.undo.UndoManager.getUndoOrRedoPresentationName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#getUndoOrRedoPresentationName() public synchronized java.lang.String
     *      javax.swing.undo.UndoManager.getUndoOrRedoPresentationName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUndoOrRedoPresentationName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#undoOrRedo() public synchronized void
     * javax.swing.undo.UndoManager.undoOrRedo() throws
     * javax.swing.undo.CannotRedoException,javax.swing.undo.CannotUndoException}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#undoOrRedo() public synchronized void
     * javax.swing.undo.UndoManager.undoOrRedo() throws
     * javax.swing.undo.CannotRedoException,javax.swing.undo.CannotUndoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#undoOrRedo() public synchronized void javax.swing.undo.UndoManager.undoOrRedo()
     *      throws javax.swing.undo.CannotRedoException,javax.swing.undo.CannotUndoException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_undoOrRedo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#getUndoPresentationName() public synchronized
     * java.lang.String javax.swing.undo.UndoManager.getUndoPresentationName()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#getUndoPresentationName() public synchronized
     * java.lang.String javax.swing.undo.UndoManager.getUndoPresentationName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#getUndoPresentationName() public synchronized java.lang.String
     *      javax.swing.undo.UndoManager.getUndoPresentationName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getUndoPresentationName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#toString() public java.lang.String
     * javax.swing.undo.UndoManager.toString()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#toString() public java.lang.String
     * javax.swing.undo.UndoManager.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#toString() public java.lang.String javax.swing.undo.UndoManager.toString() (the
     *      hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#end() public synchronized void
     * javax.swing.undo.UndoManager.end()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#end() public synchronized void
     * javax.swing.undo.UndoManager.end()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#end() public synchronized void javax.swing.undo.UndoManager.end() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_end()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#canUndoOrRedo() public synchronized boolean
     * javax.swing.undo.UndoManager.canUndoOrRedo()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#canUndoOrRedo() public synchronized boolean
     * javax.swing.undo.UndoManager.canUndoOrRedo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#canUndoOrRedo() public synchronized boolean
     *      javax.swing.undo.UndoManager.canUndoOrRedo() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_canUndoOrRedo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#setLimit(int) public synchronized void
     * javax.swing.undo.UndoManager.setLimit(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#setLimit(int) public synchronized void
     * javax.swing.undo.UndoManager.setLimit(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#setLimit(int) public synchronized void
     *      javax.swing.undo.UndoManager.setLimit(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLimit_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#undoableEditHappened(javax.swing.event.UndoableEditEvent)
     * public void javax.swing.undo.UndoManager.undoableEditHappened(javax.swing.event.UndoableEditEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#undoableEditHappened(javax.swing.event.UndoableEditEvent)
     * public void javax.swing.undo.UndoManager.undoableEditHappened(javax.swing.event.UndoableEditEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#undoableEditHappened(javax.swing.event.UndoableEditEvent) public void
     *      javax.swing.undo.UndoManager.undoableEditHappened(javax.swing.event.UndoableEditEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_undoableEditHappened_UndoableEditEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#canUndo() public synchronized boolean
     * javax.swing.undo.UndoManager.canUndo()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#canUndo() public synchronized boolean
     * javax.swing.undo.UndoManager.canUndo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#canUndo() public synchronized boolean javax.swing.undo.UndoManager.canUndo()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_canUndo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#undo() public synchronized void
     * javax.swing.undo.UndoManager.undo() throws javax.swing.undo.CannotUndoException}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.UndoManager#undo() public synchronized void
     * javax.swing.undo.UndoManager.undo() throws javax.swing.undo.CannotUndoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.UndoManager#undo() public synchronized void javax.swing.undo.UndoManager.undo() throws
     *      javax.swing.undo.CannotUndoException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_undo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
