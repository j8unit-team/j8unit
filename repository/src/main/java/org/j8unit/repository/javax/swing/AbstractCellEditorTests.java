package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.AbstractCellEditor class javax.swing.AbstractCellEditor}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link AbstractCellEditorClassTests}.
 * </p>
 *
 * @see javax.swing.AbstractCellEditor class javax.swing.AbstractCellEditor (the hereby targeted class-under-test class)
 * @see AbstractCellEditorClassTests AbstractCellEditorClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractCellEditorTests<SUT extends javax.swing.AbstractCellEditor>
extends CellEditorTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.AbstractCellEditor#shouldSelectCell(java.util.EventObject) public boolean
     * javax.swing.AbstractCellEditor.shouldSelectCell(java.util.EventObject)}.
     *
     * <p>
     * Test method for {@link javax.swing.AbstractCellEditor#shouldSelectCell(java.util.EventObject) public boolean
     * javax.swing.AbstractCellEditor.shouldSelectCell(java.util.EventObject)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.AbstractCellEditor#shouldSelectCell(java.util.EventObject) public boolean
     *      javax.swing.AbstractCellEditor.shouldSelectCell(java.util.EventObject) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_shouldSelectCell_EventObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.AbstractCellEditor#cancelCellEditing() public void
     * javax.swing.AbstractCellEditor.cancelCellEditing()}.
     *
     * <p>
     * Test method for {@link javax.swing.AbstractCellEditor#cancelCellEditing() public void
     * javax.swing.AbstractCellEditor.cancelCellEditing()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.AbstractCellEditor#cancelCellEditing() public void
     *      javax.swing.AbstractCellEditor.cancelCellEditing() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_cancelCellEditing()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.AbstractCellEditor#isCellEditable(java.util.EventObject) public boolean
     * javax.swing.AbstractCellEditor.isCellEditable(java.util.EventObject)}.
     *
     * <p>
     * Test method for {@link javax.swing.AbstractCellEditor#isCellEditable(java.util.EventObject) public boolean
     * javax.swing.AbstractCellEditor.isCellEditable(java.util.EventObject)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.AbstractCellEditor#isCellEditable(java.util.EventObject) public boolean
     *      javax.swing.AbstractCellEditor.isCellEditable(java.util.EventObject) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isCellEditable_EventObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.AbstractCellEditor#removeCellEditorListener(javax.swing.event.CellEditorListener) public void
     * javax.swing.AbstractCellEditor.removeCellEditorListener(javax.swing.event.CellEditorListener)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.AbstractCellEditor#removeCellEditorListener(javax.swing.event.CellEditorListener) public void
     * javax.swing.AbstractCellEditor.removeCellEditorListener(javax.swing.event.CellEditorListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.AbstractCellEditor#removeCellEditorListener(javax.swing.event.CellEditorListener) public void
     *      javax.swing.AbstractCellEditor.removeCellEditorListener(javax.swing.event.CellEditorListener) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeCellEditorListener_CellEditorListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.AbstractCellEditor#addCellEditorListener(javax.swing.event.CellEditorListener)
     * public void javax.swing.AbstractCellEditor.addCellEditorListener(javax.swing.event.CellEditorListener)}.
     *
     * <p>
     * Test method for {@link javax.swing.AbstractCellEditor#addCellEditorListener(javax.swing.event.CellEditorListener)
     * public void javax.swing.AbstractCellEditor.addCellEditorListener(javax.swing.event.CellEditorListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.AbstractCellEditor#addCellEditorListener(javax.swing.event.CellEditorListener) public void
     *      javax.swing.AbstractCellEditor.addCellEditorListener(javax.swing.event.CellEditorListener) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addCellEditorListener_CellEditorListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.AbstractCellEditor#stopCellEditing() public boolean
     * javax.swing.AbstractCellEditor.stopCellEditing()}.
     *
     * <p>
     * Test method for {@link javax.swing.AbstractCellEditor#stopCellEditing() public boolean
     * javax.swing.AbstractCellEditor.stopCellEditing()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.AbstractCellEditor#stopCellEditing() public boolean
     *      javax.swing.AbstractCellEditor.stopCellEditing() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_stopCellEditing()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.AbstractCellEditor#getCellEditorListeners() public
     * javax.swing.event.CellEditorListener[] javax.swing.AbstractCellEditor.getCellEditorListeners()}.
     *
     * <p>
     * Test method for {@link javax.swing.AbstractCellEditor#getCellEditorListeners() public
     * javax.swing.event.CellEditorListener[] javax.swing.AbstractCellEditor.getCellEditorListeners()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.AbstractCellEditor#getCellEditorListeners() public javax.swing.event.CellEditorListener[]
     *      javax.swing.AbstractCellEditor.getCellEditorListeners() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCellEditorListeners()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
