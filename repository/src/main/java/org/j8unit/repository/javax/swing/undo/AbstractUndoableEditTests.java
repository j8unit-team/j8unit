package org.j8unit.repository.javax.swing.undo;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.undo.AbstractUndoableEdit class
 * javax.swing.undo.AbstractUndoableEdit}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link AbstractUndoableEditClassTests}.
 * </p>
 *
 * @see javax.swing.undo.AbstractUndoableEdit class javax.swing.undo.AbstractUndoableEdit (the hereby targeted
 *      class-under-test class)
 * @see AbstractUndoableEditClassTests AbstractUndoableEditClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractUndoableEditTests<SUT extends javax.swing.undo.AbstractUndoableEdit>
extends UndoableEditTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#redo() public void
     * javax.swing.undo.AbstractUndoableEdit.redo() throws javax.swing.undo.CannotRedoException}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#redo() public void
     * javax.swing.undo.AbstractUndoableEdit.redo() throws javax.swing.undo.CannotRedoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.AbstractUndoableEdit#redo() public void javax.swing.undo.AbstractUndoableEdit.redo() throws
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
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#toString() public java.lang.String
     * javax.swing.undo.AbstractUndoableEdit.toString()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#toString() public java.lang.String
     * javax.swing.undo.AbstractUndoableEdit.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.AbstractUndoableEdit#toString() public java.lang.String
     *      javax.swing.undo.AbstractUndoableEdit.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#addEdit(javax.swing.undo.UndoableEdit) public
     * boolean javax.swing.undo.AbstractUndoableEdit.addEdit(javax.swing.undo.UndoableEdit)}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#addEdit(javax.swing.undo.UndoableEdit) public
     * boolean javax.swing.undo.AbstractUndoableEdit.addEdit(javax.swing.undo.UndoableEdit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.AbstractUndoableEdit#addEdit(javax.swing.undo.UndoableEdit) public boolean
     *      javax.swing.undo.AbstractUndoableEdit.addEdit(javax.swing.undo.UndoableEdit) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#getUndoPresentationName() public java.lang.String
     * javax.swing.undo.AbstractUndoableEdit.getUndoPresentationName()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#getUndoPresentationName() public java.lang.String
     * javax.swing.undo.AbstractUndoableEdit.getUndoPresentationName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.AbstractUndoableEdit#getUndoPresentationName() public java.lang.String
     *      javax.swing.undo.AbstractUndoableEdit.getUndoPresentationName() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#getRedoPresentationName() public java.lang.String
     * javax.swing.undo.AbstractUndoableEdit.getRedoPresentationName()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#getRedoPresentationName() public java.lang.String
     * javax.swing.undo.AbstractUndoableEdit.getRedoPresentationName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.AbstractUndoableEdit#getRedoPresentationName() public java.lang.String
     *      javax.swing.undo.AbstractUndoableEdit.getRedoPresentationName() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#canRedo() public boolean
     * javax.swing.undo.AbstractUndoableEdit.canRedo()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#canRedo() public boolean
     * javax.swing.undo.AbstractUndoableEdit.canRedo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.AbstractUndoableEdit#canRedo() public boolean
     *      javax.swing.undo.AbstractUndoableEdit.canRedo() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#replaceEdit(javax.swing.undo.UndoableEdit) public
     * boolean javax.swing.undo.AbstractUndoableEdit.replaceEdit(javax.swing.undo.UndoableEdit)}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#replaceEdit(javax.swing.undo.UndoableEdit) public
     * boolean javax.swing.undo.AbstractUndoableEdit.replaceEdit(javax.swing.undo.UndoableEdit)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.AbstractUndoableEdit#replaceEdit(javax.swing.undo.UndoableEdit) public boolean
     *      javax.swing.undo.AbstractUndoableEdit.replaceEdit(javax.swing.undo.UndoableEdit) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_replaceEdit_UndoableEdit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#undo() public void
     * javax.swing.undo.AbstractUndoableEdit.undo() throws javax.swing.undo.CannotUndoException}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#undo() public void
     * javax.swing.undo.AbstractUndoableEdit.undo() throws javax.swing.undo.CannotUndoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.AbstractUndoableEdit#undo() public void javax.swing.undo.AbstractUndoableEdit.undo() throws
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

    /**
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#canUndo() public boolean
     * javax.swing.undo.AbstractUndoableEdit.canUndo()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#canUndo() public boolean
     * javax.swing.undo.AbstractUndoableEdit.canUndo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.AbstractUndoableEdit#canUndo() public boolean
     *      javax.swing.undo.AbstractUndoableEdit.canUndo() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#die() public void
     * javax.swing.undo.AbstractUndoableEdit.die()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#die() public void
     * javax.swing.undo.AbstractUndoableEdit.die()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.AbstractUndoableEdit#die() public void javax.swing.undo.AbstractUndoableEdit.die() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_die()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#isSignificant() public boolean
     * javax.swing.undo.AbstractUndoableEdit.isSignificant()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#isSignificant() public boolean
     * javax.swing.undo.AbstractUndoableEdit.isSignificant()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.AbstractUndoableEdit#isSignificant() public boolean
     *      javax.swing.undo.AbstractUndoableEdit.isSignificant() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isSignificant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#getPresentationName() public java.lang.String
     * javax.swing.undo.AbstractUndoableEdit.getPresentationName()}.
     *
     * <p>
     * Test method for {@link javax.swing.undo.AbstractUndoableEdit#getPresentationName() public java.lang.String
     * javax.swing.undo.AbstractUndoableEdit.getPresentationName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.undo.AbstractUndoableEdit#getPresentationName() public java.lang.String
     *      javax.swing.undo.AbstractUndoableEdit.getPresentationName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getPresentationName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
