package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.JTable class javax.swing.JTable}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link JTableClassTests}.
 * </p>
 *
 * @see javax.swing.JTable class javax.swing.JTable (the hereby targeted class-under-test class)
 * @see JTableClassTests JTableClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JTableTests<SUT extends javax.swing.JTable>
extends org.j8unit.repository.javax.swing.event.TableModelListenerTests<SUT>, ScrollableTests<SUT>,
org.j8unit.repository.javax.swing.event.TableColumnModelListenerTests<SUT>, org.j8unit.repository.javax.swing.event.ListSelectionListenerTests<SUT>,
org.j8unit.repository.javax.swing.event.CellEditorListenerTests<SUT>, org.j8unit.repository.javax.accessibility.AccessibleTests<SUT>,
org.j8unit.repository.javax.swing.event.RowSorterListenerTests<SUT>, JComponentTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#removeNotify() public void javax.swing.JTable.removeNotify()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#removeNotify() public void javax.swing.JTable.removeNotify()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#removeNotify() public void javax.swing.JTable.removeNotify() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeNotify()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setModel(javax.swing.table.TableModel) public void
     * javax.swing.JTable.setModel(javax.swing.table.TableModel)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setModel(javax.swing.table.TableModel) public void
     * javax.swing.JTable.setModel(javax.swing.table.TableModel)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setModel(javax.swing.table.TableModel) public void
     *      javax.swing.JTable.setModel(javax.swing.table.TableModel) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setModel_TableModel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setDefaultEditor(Class, javax.swing.table.TableCellEditor) public void
     * javax.swing.JTable.setDefaultEditor(java.lang.Class<?>,javax.swing.table.TableCellEditor)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setDefaultEditor(Class, javax.swing.table.TableCellEditor) public void
     * javax.swing.JTable.setDefaultEditor(java.lang.Class,javax.swing.table.TableCellEditor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setDefaultEditor(Class, javax.swing.table.TableCellEditor) public void
     *      javax.swing.JTable.setDefaultEditor(java.lang.Class,javax.swing.table.TableCellEditor) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDefaultEditor_Class_TableCellEditor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getAutoCreateColumnsFromModel() public boolean
     * javax.swing.JTable.getAutoCreateColumnsFromModel()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getAutoCreateColumnsFromModel() public boolean
     * javax.swing.JTable.getAutoCreateColumnsFromModel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getAutoCreateColumnsFromModel() public boolean
     *      javax.swing.JTable.getAutoCreateColumnsFromModel() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAutoCreateColumnsFromModel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setDragEnabled(boolean) public void
     * javax.swing.JTable.setDragEnabled(boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setDragEnabled(boolean) public void
     * javax.swing.JTable.setDragEnabled(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setDragEnabled(boolean) public void javax.swing.JTable.setDragEnabled(boolean) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDragEnabled_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getUI() public javax.swing.plaf.TableUI javax.swing.JTable.getUI()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getUI() public javax.swing.plaf.TableUI javax.swing.JTable.getUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getUI() public javax.swing.plaf.TableUI javax.swing.JTable.getUI() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setDefaultRenderer(Class, javax.swing.table.TableCellRenderer) public
     * void javax.swing.JTable.setDefaultRenderer(java.lang.Class<?>,javax.swing.table.TableCellRenderer)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setDefaultRenderer(Class, javax.swing.table.TableCellRenderer) public
     * void javax.swing.JTable.setDefaultRenderer(java.lang.Class,javax.swing.table.TableCellRenderer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setDefaultRenderer(Class, javax.swing.table.TableCellRenderer) public void
     *      javax.swing.JTable.setDefaultRenderer(java.lang.Class,javax.swing.table.TableCellRenderer) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDefaultRenderer_Class_TableCellRenderer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#moveColumn(int, int) public void
     * javax.swing.JTable.moveColumn(int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#moveColumn(int, int) public void
     * javax.swing.JTable.moveColumn(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#moveColumn(int, int) public void javax.swing.JTable.moveColumn(int,int) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_moveColumn_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#selectAll() public void javax.swing.JTable.selectAll()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#selectAll() public void javax.swing.JTable.selectAll()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#selectAll() public void javax.swing.JTable.selectAll() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_selectAll()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setColumnSelectionAllowed(boolean) public void
     * javax.swing.JTable.setColumnSelectionAllowed(boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setColumnSelectionAllowed(boolean) public void
     * javax.swing.JTable.setColumnSelectionAllowed(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setColumnSelectionAllowed(boolean) public void
     *      javax.swing.JTable.setColumnSelectionAllowed(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setColumnSelectionAllowed_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setEditingColumn(int) public void
     * javax.swing.JTable.setEditingColumn(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setEditingColumn(int) public void
     * javax.swing.JTable.setEditingColumn(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setEditingColumn(int) public void javax.swing.JTable.setEditingColumn(int) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setEditingColumn_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setAutoResizeMode(int) public void
     * javax.swing.JTable.setAutoResizeMode(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setAutoResizeMode(int) public void
     * javax.swing.JTable.setAutoResizeMode(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setAutoResizeMode(int) public void javax.swing.JTable.setAutoResizeMode(int) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAutoResizeMode_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getColumnCount() public int javax.swing.JTable.getColumnCount()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getColumnCount() public int javax.swing.JTable.getColumnCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getColumnCount() public int javax.swing.JTable.getColumnCount() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getColumnCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#changeSelection(int, int, boolean, boolean) public void
     * javax.swing.JTable.changeSelection(int,int,boolean,boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#changeSelection(int, int, boolean, boolean) public void
     * javax.swing.JTable.changeSelection(int,int,boolean,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#changeSelection(int, int, boolean, boolean) public void
     *      javax.swing.JTable.changeSelection(int,int,boolean,boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_changeSelection_int_int_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getCellRenderer(int, int) public javax.swing.table.TableCellRenderer
     * javax.swing.JTable.getCellRenderer(int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getCellRenderer(int, int) public javax.swing.table.TableCellRenderer
     * javax.swing.JTable.getCellRenderer(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getCellRenderer(int, int) public javax.swing.table.TableCellRenderer
     *      javax.swing.JTable.getCellRenderer(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCellRenderer_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectedRowCount() public int
     * javax.swing.JTable.getSelectedRowCount()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectedRowCount() public int
     * javax.swing.JTable.getSelectedRowCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getSelectedRowCount() public int javax.swing.JTable.getSelectedRowCount() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSelectedRowCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getSurrendersFocusOnKeystroke() public boolean
     * javax.swing.JTable.getSurrendersFocusOnKeystroke()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getSurrendersFocusOnKeystroke() public boolean
     * javax.swing.JTable.getSurrendersFocusOnKeystroke()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getSurrendersFocusOnKeystroke() public boolean
     *      javax.swing.JTable.getSurrendersFocusOnKeystroke() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSurrendersFocusOnKeystroke()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getModel() public javax.swing.table.TableModel
     * javax.swing.JTable.getModel()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getModel() public javax.swing.table.TableModel
     * javax.swing.JTable.getModel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getModel() public javax.swing.table.TableModel javax.swing.JTable.getModel() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getModel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getScrollableTracksViewportHeight() public boolean
     * javax.swing.JTable.getScrollableTracksViewportHeight()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getScrollableTracksViewportHeight() public boolean
     * javax.swing.JTable.getScrollableTracksViewportHeight()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getScrollableTracksViewportHeight() public boolean
     *      javax.swing.JTable.getScrollableTracksViewportHeight() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getScrollableTracksViewportHeight()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getDropMode() public final javax.swing.DropMode
     * javax.swing.JTable.getDropMode()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getDropMode() public final javax.swing.DropMode
     * javax.swing.JTable.getDropMode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getDropMode() public final javax.swing.DropMode javax.swing.JTable.getDropMode() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDropMode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#editCellAt(int, int, java.util.EventObject) public boolean
     * javax.swing.JTable.editCellAt(int,int,java.util.EventObject)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#editCellAt(int, int, java.util.EventObject) public boolean
     * javax.swing.JTable.editCellAt(int,int,java.util.EventObject)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#editCellAt(int, int, java.util.EventObject) public boolean
     *      javax.swing.JTable.editCellAt(int,int,java.util.EventObject) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_editCellAt_int_int_EventObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#editCellAt(int, int) public boolean
     * javax.swing.JTable.editCellAt(int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#editCellAt(int, int) public boolean
     * javax.swing.JTable.editCellAt(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#editCellAt(int, int) public boolean javax.swing.JTable.editCellAt(int,int) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_editCellAt_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getDragEnabled() public boolean javax.swing.JTable.getDragEnabled()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getDragEnabled() public boolean javax.swing.JTable.getDragEnabled()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getDragEnabled() public boolean javax.swing.JTable.getDragEnabled() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDragEnabled()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setRowSelectionInterval(int, int) public void
     * javax.swing.JTable.setRowSelectionInterval(int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setRowSelectionInterval(int, int) public void
     * javax.swing.JTable.setRowSelectionInterval(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setRowSelectionInterval(int, int) public void
     *      javax.swing.JTable.setRowSelectionInterval(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRowSelectionInterval_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#doLayout() public void javax.swing.JTable.doLayout()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#doLayout() public void javax.swing.JTable.doLayout()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#doLayout() public void javax.swing.JTable.doLayout() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_doLayout()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#isColumnSelected(int) public boolean
     * javax.swing.JTable.isColumnSelected(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#isColumnSelected(int) public boolean
     * javax.swing.JTable.isColumnSelected(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#isColumnSelected(int) public boolean javax.swing.JTable.isColumnSelected(int) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isColumnSelected_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#addColumnSelectionInterval(int, int) public void
     * javax.swing.JTable.addColumnSelectionInterval(int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#addColumnSelectionInterval(int, int) public void
     * javax.swing.JTable.addColumnSelectionInterval(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#addColumnSelectionInterval(int, int) public void
     *      javax.swing.JTable.addColumnSelectionInterval(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addColumnSelectionInterval_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setSelectionBackground(java.awt.Color) public void
     * javax.swing.JTable.setSelectionBackground(java.awt.Color)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setSelectionBackground(java.awt.Color) public void
     * javax.swing.JTable.setSelectionBackground(java.awt.Color)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setSelectionBackground(java.awt.Color) public void
     *      javax.swing.JTable.setSelectionBackground(java.awt.Color) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSelectionBackground_Color()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#removeColumnSelectionInterval(int, int) public void
     * javax.swing.JTable.removeColumnSelectionInterval(int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#removeColumnSelectionInterval(int, int) public void
     * javax.swing.JTable.removeColumnSelectionInterval(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#removeColumnSelectionInterval(int, int) public void
     *      javax.swing.JTable.removeColumnSelectionInterval(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeColumnSelectionInterval_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectedColumnCount() public int
     * javax.swing.JTable.getSelectedColumnCount()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectedColumnCount() public int
     * javax.swing.JTable.getSelectedColumnCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getSelectedColumnCount() public int javax.swing.JTable.getSelectedColumnCount() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSelectedColumnCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setFillsViewportHeight(boolean) public void
     * javax.swing.JTable.setFillsViewportHeight(boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setFillsViewportHeight(boolean) public void
     * javax.swing.JTable.setFillsViewportHeight(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setFillsViewportHeight(boolean) public void
     *      javax.swing.JTable.setFillsViewportHeight(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFillsViewportHeight_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.JTable#getPrintable(javax.swing.JTable.PrintMode, java.text.MessageFormat, java.text.MessageFormat)
     * public java.awt.print.Printable
     * javax.swing.JTable.getPrintable(javax.swing.JTable$PrintMode,java.text.MessageFormat,java.text.MessageFormat)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.JTable#getPrintable(javax.swing.JTable.PrintMode, java.text.MessageFormat, java.text.MessageFormat)
     * public java.awt.print.Printable
     * javax.swing.JTable.getPrintable(javax.swing.JTable$PrintMode,java.text.MessageFormat,java.text.MessageFormat)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getPrintable(javax.swing.JTable.PrintMode, java.text.MessageFormat,
     *      java.text.MessageFormat) public java.awt.print.Printable
     *      javax.swing.JTable.getPrintable(javax.swing.JTable$PrintMode,java.text.MessageFormat,java.text.
     *      MessageFormat) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrintable_PrintMode_MessageFormat_MessageFormat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#editingCanceled(javax.swing.event.ChangeEvent) public void
     * javax.swing.JTable.editingCanceled(javax.swing.event.ChangeEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#editingCanceled(javax.swing.event.ChangeEvent) public void
     * javax.swing.JTable.editingCanceled(javax.swing.event.ChangeEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#editingCanceled(javax.swing.event.ChangeEvent) public void
     *      javax.swing.JTable.editingCanceled(javax.swing.event.ChangeEvent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_editingCanceled_ChangeEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getDefaultEditor(Class) public javax.swing.table.TableCellEditor
     * javax.swing.JTable.getDefaultEditor(java.lang.Class<?>)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getDefaultEditor(Class) public javax.swing.table.TableCellEditor
     * javax.swing.JTable.getDefaultEditor(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getDefaultEditor(Class) public javax.swing.table.TableCellEditor
     *      javax.swing.JTable.getDefaultEditor(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultEditor_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getEditingColumn() public int javax.swing.JTable.getEditingColumn()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getEditingColumn() public int javax.swing.JTable.getEditingColumn()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getEditingColumn() public int javax.swing.JTable.getEditingColumn() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEditingColumn()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setPreferredScrollableViewportSize(java.awt.Dimension) public void
     * javax.swing.JTable.setPreferredScrollableViewportSize(java.awt.Dimension)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setPreferredScrollableViewportSize(java.awt.Dimension) public void
     * javax.swing.JTable.setPreferredScrollableViewportSize(java.awt.Dimension)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setPreferredScrollableViewportSize(java.awt.Dimension) public void
     *      javax.swing.JTable.setPreferredScrollableViewportSize(java.awt.Dimension) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPreferredScrollableViewportSize_Dimension()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setGridColor(java.awt.Color) public void
     * javax.swing.JTable.setGridColor(java.awt.Color)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setGridColor(java.awt.Color) public void
     * javax.swing.JTable.setGridColor(java.awt.Color)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setGridColor(java.awt.Color) public void javax.swing.JTable.setGridColor(java.awt.Color)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setGridColor_Color()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getShowHorizontalLines() public boolean
     * javax.swing.JTable.getShowHorizontalLines()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getShowHorizontalLines() public boolean
     * javax.swing.JTable.getShowHorizontalLines()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getShowHorizontalLines() public boolean javax.swing.JTable.getShowHorizontalLines() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getShowHorizontalLines()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#convertRowIndexToView(int) public int
     * javax.swing.JTable.convertRowIndexToView(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#convertRowIndexToView(int) public int
     * javax.swing.JTable.convertRowIndexToView(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#convertRowIndexToView(int) public int javax.swing.JTable.convertRowIndexToView(int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_convertRowIndexToView_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectedRow() public int javax.swing.JTable.getSelectedRow()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectedRow() public int javax.swing.JTable.getSelectedRow()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getSelectedRow() public int javax.swing.JTable.getSelectedRow() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSelectedRow()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#print(javax.swing.JTable.PrintMode) public boolean
     * javax.swing.JTable.print(javax.swing.JTable$PrintMode) throws java.awt.print.PrinterException}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#print(javax.swing.JTable.PrintMode) public boolean
     * javax.swing.JTable.print(javax.swing.JTable$PrintMode) throws java.awt.print.PrinterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#print(javax.swing.JTable.PrintMode) public boolean
     *      javax.swing.JTable.print(javax.swing.JTable$PrintMode) throws java.awt.print.PrinterException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_print_PrintMode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#print() public boolean javax.swing.JTable.print() throws
     * java.awt.print.PrinterException}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#print() public boolean javax.swing.JTable.print() throws
     * java.awt.print.PrinterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#print() public boolean javax.swing.JTable.print() throws java.awt.print.PrinterException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_print()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.JTable#print(javax.swing.JTable.PrintMode, java.text.MessageFormat, java.text.MessageFormat, boolean, javax.print.attribute.PrintRequestAttributeSet, boolean)
     * public boolean
     * javax.swing.JTable.print(javax.swing.JTable$PrintMode,java.text.MessageFormat,java.text.MessageFormat,boolean,javax.print.attribute.PrintRequestAttributeSet,boolean)
     * throws java.awt.print.PrinterException,java.awt.HeadlessException}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.JTable#print(javax.swing.JTable.PrintMode, java.text.MessageFormat, java.text.MessageFormat, boolean, javax.print.attribute.PrintRequestAttributeSet, boolean)
     * public boolean
     * javax.swing.JTable.print(javax.swing.JTable$PrintMode,java.text.MessageFormat,java.text.MessageFormat,boolean,javax.print.attribute.PrintRequestAttributeSet,boolean)
     * throws java.awt.print.PrinterException,java.awt.HeadlessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#print(javax.swing.JTable.PrintMode, java.text.MessageFormat, java.text.MessageFormat,
     *      boolean, javax.print.attribute.PrintRequestAttributeSet, boolean) public boolean
     *      javax.swing.JTable.print(javax.swing.JTable$PrintMode,java.text.MessageFormat,java.text.MessageFormat,
     *      boolean,javax.print.attribute.PrintRequestAttributeSet,boolean) throws
     *      java.awt.print.PrinterException,java.awt.HeadlessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_print_PrintMode_MessageFormat_MessageFormat_boolean_PrintRequestAttributeSet_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.JTable#print(javax.swing.JTable.PrintMode, java.text.MessageFormat, java.text.MessageFormat, boolean, javax.print.attribute.PrintRequestAttributeSet, boolean, javax.print.PrintService)
     * public boolean
     * javax.swing.JTable.print(javax.swing.JTable$PrintMode,java.text.MessageFormat,java.text.MessageFormat,boolean,javax.print.attribute.PrintRequestAttributeSet,boolean,javax.print.PrintService)
     * throws java.awt.print.PrinterException,java.awt.HeadlessException}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.JTable#print(javax.swing.JTable.PrintMode, java.text.MessageFormat, java.text.MessageFormat, boolean, javax.print.attribute.PrintRequestAttributeSet, boolean, javax.print.PrintService)
     * public boolean
     * javax.swing.JTable.print(javax.swing.JTable$PrintMode,java.text.MessageFormat,java.text.MessageFormat,boolean,javax.print.attribute.PrintRequestAttributeSet,boolean,javax.print.PrintService)
     * throws java.awt.print.PrinterException,java.awt.HeadlessException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#print(javax.swing.JTable.PrintMode, java.text.MessageFormat, java.text.MessageFormat,
     *      boolean, javax.print.attribute.PrintRequestAttributeSet, boolean, javax.print.PrintService) public boolean
     *      javax.swing.JTable.print(javax.swing.JTable$PrintMode,java.text.MessageFormat,java.text.MessageFormat,
     *      boolean,javax.print.attribute.PrintRequestAttributeSet,boolean,javax.print.PrintService) throws
     *      java.awt.print.PrinterException,java.awt.HeadlessException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_print_PrintMode_MessageFormat_MessageFormat_boolean_PrintRequestAttributeSet_boolean_PrintService()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.JTable#print(javax.swing.JTable.PrintMode, java.text.MessageFormat, java.text.MessageFormat)
     * public boolean
     * javax.swing.JTable.print(javax.swing.JTable$PrintMode,java.text.MessageFormat,java.text.MessageFormat) throws
     * java.awt.print.PrinterException}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.JTable#print(javax.swing.JTable.PrintMode, java.text.MessageFormat, java.text.MessageFormat)
     * public boolean
     * javax.swing.JTable.print(javax.swing.JTable$PrintMode,java.text.MessageFormat,java.text.MessageFormat) throws
     * java.awt.print.PrinterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#print(javax.swing.JTable.PrintMode, java.text.MessageFormat, java.text.MessageFormat)
     *      public boolean
     *      javax.swing.JTable.print(javax.swing.JTable$PrintMode,java.text.MessageFormat,java.text.MessageFormat)
     *      throws java.awt.print.PrinterException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_print_PrintMode_MessageFormat_MessageFormat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setAutoCreateColumnsFromModel(boolean) public void
     * javax.swing.JTable.setAutoCreateColumnsFromModel(boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setAutoCreateColumnsFromModel(boolean) public void
     * javax.swing.JTable.setAutoCreateColumnsFromModel(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setAutoCreateColumnsFromModel(boolean) public void
     *      javax.swing.JTable.setAutoCreateColumnsFromModel(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAutoCreateColumnsFromModel_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setUI(javax.swing.plaf.TableUI) public void
     * javax.swing.JTable.setUI(javax.swing.plaf.TableUI)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setUI(javax.swing.plaf.TableUI) public void
     * javax.swing.JTable.setUI(javax.swing.plaf.TableUI)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setUI(javax.swing.plaf.TableUI) public void
     *      javax.swing.JTable.setUI(javax.swing.plaf.TableUI) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setUI_TableUI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getFillsViewportHeight() public boolean
     * javax.swing.JTable.getFillsViewportHeight()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getFillsViewportHeight() public boolean
     * javax.swing.JTable.getFillsViewportHeight()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getFillsViewportHeight() public boolean javax.swing.JTable.getFillsViewportHeight() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFillsViewportHeight()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getRowMargin() public int javax.swing.JTable.getRowMargin()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getRowMargin() public int javax.swing.JTable.getRowMargin()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getRowMargin() public int javax.swing.JTable.getRowMargin() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRowMargin()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getCellRect(int, int, boolean) public java.awt.Rectangle
     * javax.swing.JTable.getCellRect(int,int,boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getCellRect(int, int, boolean) public java.awt.Rectangle
     * javax.swing.JTable.getCellRect(int,int,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getCellRect(int, int, boolean) public java.awt.Rectangle
     *      javax.swing.JTable.getCellRect(int,int,boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCellRect_int_int_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#isCellEditable(int, int) public boolean
     * javax.swing.JTable.isCellEditable(int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#isCellEditable(int, int) public boolean
     * javax.swing.JTable.isCellEditable(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#isCellEditable(int, int) public boolean javax.swing.JTable.isCellEditable(int,int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isCellEditable_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#addRowSelectionInterval(int, int) public void
     * javax.swing.JTable.addRowSelectionInterval(int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#addRowSelectionInterval(int, int) public void
     * javax.swing.JTable.addRowSelectionInterval(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#addRowSelectionInterval(int, int) public void
     *      javax.swing.JTable.addRowSelectionInterval(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addRowSelectionInterval_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getPreferredScrollableViewportSize() public java.awt.Dimension
     * javax.swing.JTable.getPreferredScrollableViewportSize()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getPreferredScrollableViewportSize() public java.awt.Dimension
     * javax.swing.JTable.getPreferredScrollableViewportSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getPreferredScrollableViewportSize() public java.awt.Dimension
     *      javax.swing.JTable.getPreferredScrollableViewportSize() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getPreferredScrollableViewportSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#sizeColumnsToFit(int) public void
     * javax.swing.JTable.sizeColumnsToFit(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#sizeColumnsToFit(int) public void
     * javax.swing.JTable.sizeColumnsToFit(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#sizeColumnsToFit(int) public void javax.swing.JTable.sizeColumnsToFit(int) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sizeColumnsToFit_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#sizeColumnsToFit(boolean) public void
     * javax.swing.JTable.sizeColumnsToFit(boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#sizeColumnsToFit(boolean) public void
     * javax.swing.JTable.sizeColumnsToFit(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#sizeColumnsToFit(boolean) public void javax.swing.JTable.sizeColumnsToFit(boolean) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sizeColumnsToFit_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#rowAtPoint(java.awt.Point) public int
     * javax.swing.JTable.rowAtPoint(java.awt.Point)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#rowAtPoint(java.awt.Point) public int
     * javax.swing.JTable.rowAtPoint(java.awt.Point)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#rowAtPoint(java.awt.Point) public int javax.swing.JTable.rowAtPoint(java.awt.Point) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rowAtPoint_Point()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getAccessibleContext() public javax.accessibility.AccessibleContext
     * javax.swing.JTable.getAccessibleContext()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getAccessibleContext() public javax.accessibility.AccessibleContext
     * javax.swing.JTable.getAccessibleContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getAccessibleContext() public javax.accessibility.AccessibleContext
     *      javax.swing.JTable.getAccessibleContext() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAccessibleContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectionBackground() public java.awt.Color
     * javax.swing.JTable.getSelectionBackground()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectionBackground() public java.awt.Color
     * javax.swing.JTable.getSelectionBackground()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getSelectionBackground() public java.awt.Color
     *      javax.swing.JTable.getSelectionBackground() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSelectionBackground()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#sorterChanged(javax.swing.event.RowSorterEvent) public void
     * javax.swing.JTable.sorterChanged(javax.swing.event.RowSorterEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#sorterChanged(javax.swing.event.RowSorterEvent) public void
     * javax.swing.JTable.sorterChanged(javax.swing.event.RowSorterEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#sorterChanged(javax.swing.event.RowSorterEvent) public void
     *      javax.swing.JTable.sorterChanged(javax.swing.event.RowSorterEvent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_sorterChanged_RowSorterEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#valueChanged(javax.swing.event.ListSelectionEvent) public void
     * javax.swing.JTable.valueChanged(javax.swing.event.ListSelectionEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#valueChanged(javax.swing.event.ListSelectionEvent) public void
     * javax.swing.JTable.valueChanged(javax.swing.event.ListSelectionEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#valueChanged(javax.swing.event.ListSelectionEvent) public void
     *      javax.swing.JTable.valueChanged(javax.swing.event.ListSelectionEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_valueChanged_ListSelectionEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#isEditing() public boolean javax.swing.JTable.isEditing()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#isEditing() public boolean javax.swing.JTable.isEditing()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#isEditing() public boolean javax.swing.JTable.isEditing() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isEditing()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#columnAdded(javax.swing.event.TableColumnModelEvent) public void
     * javax.swing.JTable.columnAdded(javax.swing.event.TableColumnModelEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#columnAdded(javax.swing.event.TableColumnModelEvent) public void
     * javax.swing.JTable.columnAdded(javax.swing.event.TableColumnModelEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#columnAdded(javax.swing.event.TableColumnModelEvent) public void
     *      javax.swing.JTable.columnAdded(javax.swing.event.TableColumnModelEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_columnAdded_TableColumnModelEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectedColumns() public int[]
     * javax.swing.JTable.getSelectedColumns()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectedColumns() public int[]
     * javax.swing.JTable.getSelectedColumns()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getSelectedColumns() public int[] javax.swing.JTable.getSelectedColumns() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSelectedColumns()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setRowHeight(int, int) public void
     * javax.swing.JTable.setRowHeight(int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setRowHeight(int, int) public void
     * javax.swing.JTable.setRowHeight(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setRowHeight(int, int) public void javax.swing.JTable.setRowHeight(int,int) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRowHeight_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setRowHeight(int) public void javax.swing.JTable.setRowHeight(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setRowHeight(int) public void javax.swing.JTable.setRowHeight(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setRowHeight(int) public void javax.swing.JTable.setRowHeight(int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRowHeight_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getScrollableUnitIncrement(java.awt.Rectangle, int, int) public int
     * javax.swing.JTable.getScrollableUnitIncrement(java.awt.Rectangle,int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getScrollableUnitIncrement(java.awt.Rectangle, int, int) public int
     * javax.swing.JTable.getScrollableUnitIncrement(java.awt.Rectangle,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getScrollableUnitIncrement(java.awt.Rectangle, int, int) public int
     *      javax.swing.JTable.getScrollableUnitIncrement(java.awt.Rectangle,int,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getScrollableUnitIncrement_Rectangle_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getValueAt(int, int) public java.lang.Object
     * javax.swing.JTable.getValueAt(int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getValueAt(int, int) public java.lang.Object
     * javax.swing.JTable.getValueAt(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getValueAt(int, int) public java.lang.Object javax.swing.JTable.getValueAt(int,int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getValueAt_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setRowSorter(javax.swing.RowSorter) public void
     * javax.swing.JTable.setRowSorter(javax.swing.RowSorter<? extends javax.swing.table.TableModel>)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setRowSorter(javax.swing.RowSorter) public void
     * javax.swing.JTable.setRowSorter(javax.swing.RowSorter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setRowSorter(javax.swing.RowSorter) public void
     *      javax.swing.JTable.setRowSorter(javax.swing.RowSorter) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRowSorter_RowSorter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectedRows() public int[] javax.swing.JTable.getSelectedRows()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectedRows() public int[] javax.swing.JTable.getSelectedRows()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getSelectedRows() public int[] javax.swing.JTable.getSelectedRows() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSelectedRows()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#updateUI() public void javax.swing.JTable.updateUI()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#updateUI() public void javax.swing.JTable.updateUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#updateUI() public void javax.swing.JTable.updateUI() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_updateUI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getScrollableBlockIncrement(java.awt.Rectangle, int, int) public int
     * javax.swing.JTable.getScrollableBlockIncrement(java.awt.Rectangle,int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getScrollableBlockIncrement(java.awt.Rectangle, int, int) public int
     * javax.swing.JTable.getScrollableBlockIncrement(java.awt.Rectangle,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getScrollableBlockIncrement(java.awt.Rectangle, int, int) public int
     *      javax.swing.JTable.getScrollableBlockIncrement(java.awt.Rectangle,int,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getScrollableBlockIncrement_Rectangle_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setColumnModel(javax.swing.table.TableColumnModel) public void
     * javax.swing.JTable.setColumnModel(javax.swing.table.TableColumnModel)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setColumnModel(javax.swing.table.TableColumnModel) public void
     * javax.swing.JTable.setColumnModel(javax.swing.table.TableColumnModel)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setColumnModel(javax.swing.table.TableColumnModel) public void
     *      javax.swing.JTable.setColumnModel(javax.swing.table.TableColumnModel) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setColumnModel_TableColumnModel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getUIClassID() public java.lang.String
     * javax.swing.JTable.getUIClassID()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getUIClassID() public java.lang.String
     * javax.swing.JTable.getUIClassID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getUIClassID() public java.lang.String javax.swing.JTable.getUIClassID() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getUIClassID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setValueAt(Object, int, int) public void
     * javax.swing.JTable.setValueAt(java.lang.Object,int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setValueAt(Object, int, int) public void
     * javax.swing.JTable.setValueAt(java.lang.Object,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setValueAt(Object, int, int) public void
     *      javax.swing.JTable.setValueAt(java.lang.Object,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setValueAt_Object_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#columnMoved(javax.swing.event.TableColumnModelEvent) public void
     * javax.swing.JTable.columnMoved(javax.swing.event.TableColumnModelEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#columnMoved(javax.swing.event.TableColumnModelEvent) public void
     * javax.swing.JTable.columnMoved(javax.swing.event.TableColumnModelEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#columnMoved(javax.swing.event.TableColumnModelEvent) public void
     *      javax.swing.JTable.columnMoved(javax.swing.event.TableColumnModelEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_columnMoved_TableColumnModelEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#columnRemoved(javax.swing.event.TableColumnModelEvent) public void
     * javax.swing.JTable.columnRemoved(javax.swing.event.TableColumnModelEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#columnRemoved(javax.swing.event.TableColumnModelEvent) public void
     * javax.swing.JTable.columnRemoved(javax.swing.event.TableColumnModelEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#columnRemoved(javax.swing.event.TableColumnModelEvent) public void
     *      javax.swing.JTable.columnRemoved(javax.swing.event.TableColumnModelEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_columnRemoved_TableColumnModelEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setRowSelectionAllowed(boolean) public void
     * javax.swing.JTable.setRowSelectionAllowed(boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setRowSelectionAllowed(boolean) public void
     * javax.swing.JTable.setRowSelectionAllowed(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setRowSelectionAllowed(boolean) public void
     *      javax.swing.JTable.setRowSelectionAllowed(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRowSelectionAllowed_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getRowHeight() public int javax.swing.JTable.getRowHeight()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getRowHeight() public int javax.swing.JTable.getRowHeight()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getRowHeight() public int javax.swing.JTable.getRowHeight() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRowHeight()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getRowHeight(int) public int javax.swing.JTable.getRowHeight(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getRowHeight(int) public int javax.swing.JTable.getRowHeight(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getRowHeight(int) public int javax.swing.JTable.getRowHeight(int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRowHeight_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#tableChanged(javax.swing.event.TableModelEvent) public void
     * javax.swing.JTable.tableChanged(javax.swing.event.TableModelEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#tableChanged(javax.swing.event.TableModelEvent) public void
     * javax.swing.JTable.tableChanged(javax.swing.event.TableModelEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#tableChanged(javax.swing.event.TableModelEvent) public void
     *      javax.swing.JTable.tableChanged(javax.swing.event.TableModelEvent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_tableChanged_TableModelEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setShowGrid(boolean) public void
     * javax.swing.JTable.setShowGrid(boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setShowGrid(boolean) public void
     * javax.swing.JTable.setShowGrid(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setShowGrid(boolean) public void javax.swing.JTable.setShowGrid(boolean) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setShowGrid_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getShowVerticalLines() public boolean
     * javax.swing.JTable.getShowVerticalLines()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getShowVerticalLines() public boolean
     * javax.swing.JTable.getShowVerticalLines()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getShowVerticalLines() public boolean javax.swing.JTable.getShowVerticalLines() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getShowVerticalLines()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getAutoCreateRowSorter() public boolean
     * javax.swing.JTable.getAutoCreateRowSorter()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getAutoCreateRowSorter() public boolean
     * javax.swing.JTable.getAutoCreateRowSorter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getAutoCreateRowSorter() public boolean javax.swing.JTable.getAutoCreateRowSorter() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAutoCreateRowSorter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setRowMargin(int) public void javax.swing.JTable.setRowMargin(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setRowMargin(int) public void javax.swing.JTable.setRowMargin(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setRowMargin(int) public void javax.swing.JTable.setRowMargin(int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRowMargin_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setSelectionModel(javax.swing.ListSelectionModel) public void
     * javax.swing.JTable.setSelectionModel(javax.swing.ListSelectionModel)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setSelectionModel(javax.swing.ListSelectionModel) public void
     * javax.swing.JTable.setSelectionModel(javax.swing.ListSelectionModel)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setSelectionModel(javax.swing.ListSelectionModel) public void
     *      javax.swing.JTable.setSelectionModel(javax.swing.ListSelectionModel) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSelectionModel_ListSelectionModel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getGridColor() public java.awt.Color javax.swing.JTable.getGridColor()}
     * .
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getGridColor() public java.awt.Color javax.swing.JTable.getGridColor()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getGridColor() public java.awt.Color javax.swing.JTable.getGridColor() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGridColor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setShowVerticalLines(boolean) public void
     * javax.swing.JTable.setShowVerticalLines(boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setShowVerticalLines(boolean) public void
     * javax.swing.JTable.setShowVerticalLines(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setShowVerticalLines(boolean) public void
     *      javax.swing.JTable.setShowVerticalLines(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setShowVerticalLines_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getColumnModel() public javax.swing.table.TableColumnModel
     * javax.swing.JTable.getColumnModel()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getColumnModel() public javax.swing.table.TableColumnModel
     * javax.swing.JTable.getColumnModel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getColumnModel() public javax.swing.table.TableColumnModel
     *      javax.swing.JTable.getColumnModel() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getColumnModel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setSelectionMode(int) public void
     * javax.swing.JTable.setSelectionMode(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setSelectionMode(int) public void
     * javax.swing.JTable.setSelectionMode(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setSelectionMode(int) public void javax.swing.JTable.setSelectionMode(int) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSelectionMode_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setCellEditor(javax.swing.table.TableCellEditor) public void
     * javax.swing.JTable.setCellEditor(javax.swing.table.TableCellEditor)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setCellEditor(javax.swing.table.TableCellEditor) public void
     * javax.swing.JTable.setCellEditor(javax.swing.table.TableCellEditor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setCellEditor(javax.swing.table.TableCellEditor) public void
     *      javax.swing.JTable.setCellEditor(javax.swing.table.TableCellEditor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCellEditor_TableCellEditor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setColumnSelectionInterval(int, int) public void
     * javax.swing.JTable.setColumnSelectionInterval(int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setColumnSelectionInterval(int, int) public void
     * javax.swing.JTable.setColumnSelectionInterval(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setColumnSelectionInterval(int, int) public void
     *      javax.swing.JTable.setColumnSelectionInterval(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setColumnSelectionInterval_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectedColumn() public int javax.swing.JTable.getSelectedColumn()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectedColumn() public int javax.swing.JTable.getSelectedColumn()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getSelectedColumn() public int javax.swing.JTable.getSelectedColumn() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSelectedColumn()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getTableHeader() public javax.swing.table.JTableHeader
     * javax.swing.JTable.getTableHeader()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getTableHeader() public javax.swing.table.JTableHeader
     * javax.swing.JTable.getTableHeader()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getTableHeader() public javax.swing.table.JTableHeader
     *      javax.swing.JTable.getTableHeader() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTableHeader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#addColumn(javax.swing.table.TableColumn) public void
     * javax.swing.JTable.addColumn(javax.swing.table.TableColumn)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#addColumn(javax.swing.table.TableColumn) public void
     * javax.swing.JTable.addColumn(javax.swing.table.TableColumn)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#addColumn(javax.swing.table.TableColumn) public void
     *      javax.swing.JTable.addColumn(javax.swing.table.TableColumn) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addColumn_TableColumn()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#isCellSelected(int, int) public boolean
     * javax.swing.JTable.isCellSelected(int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#isCellSelected(int, int) public boolean
     * javax.swing.JTable.isCellSelected(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#isCellSelected(int, int) public boolean javax.swing.JTable.isCellSelected(int,int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isCellSelected_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#editingStopped(javax.swing.event.ChangeEvent) public void
     * javax.swing.JTable.editingStopped(javax.swing.event.ChangeEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#editingStopped(javax.swing.event.ChangeEvent) public void
     * javax.swing.JTable.editingStopped(javax.swing.event.ChangeEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#editingStopped(javax.swing.event.ChangeEvent) public void
     *      javax.swing.JTable.editingStopped(javax.swing.event.ChangeEvent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_editingStopped_ChangeEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getRowCount() public int javax.swing.JTable.getRowCount()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getRowCount() public int javax.swing.JTable.getRowCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getRowCount() public int javax.swing.JTable.getRowCount() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRowCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectionModel() public javax.swing.ListSelectionModel
     * javax.swing.JTable.getSelectionModel()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectionModel() public javax.swing.ListSelectionModel
     * javax.swing.JTable.getSelectionModel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getSelectionModel() public javax.swing.ListSelectionModel
     *      javax.swing.JTable.getSelectionModel() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSelectionModel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getColumn(Object) public javax.swing.table.TableColumn
     * javax.swing.JTable.getColumn(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getColumn(Object) public javax.swing.table.TableColumn
     * javax.swing.JTable.getColumn(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getColumn(Object) public javax.swing.table.TableColumn
     *      javax.swing.JTable.getColumn(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getColumn_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getDropLocation() public final javax.swing.JTable$DropLocation
     * javax.swing.JTable.getDropLocation()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getDropLocation() public final javax.swing.JTable$DropLocation
     * javax.swing.JTable.getDropLocation()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getDropLocation() public final javax.swing.JTable$DropLocation
     *      javax.swing.JTable.getDropLocation() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDropLocation()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getCellSelectionEnabled() public boolean
     * javax.swing.JTable.getCellSelectionEnabled()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getCellSelectionEnabled() public boolean
     * javax.swing.JTable.getCellSelectionEnabled()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getCellSelectionEnabled() public boolean javax.swing.JTable.getCellSelectionEnabled()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCellSelectionEnabled()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#convertColumnIndexToModel(int) public int
     * javax.swing.JTable.convertColumnIndexToModel(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#convertColumnIndexToModel(int) public int
     * javax.swing.JTable.convertColumnIndexToModel(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#convertColumnIndexToModel(int) public int
     *      javax.swing.JTable.convertColumnIndexToModel(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_convertColumnIndexToModel_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#removeRowSelectionInterval(int, int) public void
     * javax.swing.JTable.removeRowSelectionInterval(int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#removeRowSelectionInterval(int, int) public void
     * javax.swing.JTable.removeRowSelectionInterval(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#removeRowSelectionInterval(int, int) public void
     *      javax.swing.JTable.removeRowSelectionInterval(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeRowSelectionInterval_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getUpdateSelectionOnSort() public boolean
     * javax.swing.JTable.getUpdateSelectionOnSort()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getUpdateSelectionOnSort() public boolean
     * javax.swing.JTable.getUpdateSelectionOnSort()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getUpdateSelectionOnSort() public boolean javax.swing.JTable.getUpdateSelectionOnSort()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUpdateSelectionOnSort()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#prepareEditor(javax.swing.table.TableCellEditor, int, int) public
     * java.awt.Component javax.swing.JTable.prepareEditor(javax.swing.table.TableCellEditor,int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#prepareEditor(javax.swing.table.TableCellEditor, int, int) public
     * java.awt.Component javax.swing.JTable.prepareEditor(javax.swing.table.TableCellEditor,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#prepareEditor(javax.swing.table.TableCellEditor, int, int) public java.awt.Component
     *      javax.swing.JTable.prepareEditor(javax.swing.table.TableCellEditor,int,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_prepareEditor_TableCellEditor_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setSelectionForeground(java.awt.Color) public void
     * javax.swing.JTable.setSelectionForeground(java.awt.Color)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setSelectionForeground(java.awt.Color) public void
     * javax.swing.JTable.setSelectionForeground(java.awt.Color)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setSelectionForeground(java.awt.Color) public void
     *      javax.swing.JTable.setSelectionForeground(java.awt.Color) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSelectionForeground_Color()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getDefaultRenderer(Class) public javax.swing.table.TableCellRenderer
     * javax.swing.JTable.getDefaultRenderer(java.lang.Class<?>)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getDefaultRenderer(Class) public javax.swing.table.TableCellRenderer
     * javax.swing.JTable.getDefaultRenderer(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getDefaultRenderer(Class) public javax.swing.table.TableCellRenderer
     *      javax.swing.JTable.getDefaultRenderer(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultRenderer_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#columnMarginChanged(javax.swing.event.ChangeEvent) public void
     * javax.swing.JTable.columnMarginChanged(javax.swing.event.ChangeEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#columnMarginChanged(javax.swing.event.ChangeEvent) public void
     * javax.swing.JTable.columnMarginChanged(javax.swing.event.ChangeEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#columnMarginChanged(javax.swing.event.ChangeEvent) public void
     *      javax.swing.JTable.columnMarginChanged(javax.swing.event.ChangeEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_columnMarginChanged_ChangeEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getColumnSelectionAllowed() public boolean
     * javax.swing.JTable.getColumnSelectionAllowed()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getColumnSelectionAllowed() public boolean
     * javax.swing.JTable.getColumnSelectionAllowed()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getColumnSelectionAllowed() public boolean javax.swing.JTable.getColumnSelectionAllowed()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getColumnSelectionAllowed()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setEditingRow(int) public void javax.swing.JTable.setEditingRow(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setEditingRow(int) public void javax.swing.JTable.setEditingRow(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setEditingRow(int) public void javax.swing.JTable.setEditingRow(int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setEditingRow_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#clearSelection() public void javax.swing.JTable.clearSelection()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#clearSelection() public void javax.swing.JTable.clearSelection()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#clearSelection() public void javax.swing.JTable.clearSelection() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clearSelection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getEditingRow() public int javax.swing.JTable.getEditingRow()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getEditingRow() public int javax.swing.JTable.getEditingRow()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getEditingRow() public int javax.swing.JTable.getEditingRow() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEditingRow()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#prepareRenderer(javax.swing.table.TableCellRenderer, int, int) public
     * java.awt.Component javax.swing.JTable.prepareRenderer(javax.swing.table.TableCellRenderer,int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#prepareRenderer(javax.swing.table.TableCellRenderer, int, int) public
     * java.awt.Component javax.swing.JTable.prepareRenderer(javax.swing.table.TableCellRenderer,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#prepareRenderer(javax.swing.table.TableCellRenderer, int, int) public java.awt.Component
     *      javax.swing.JTable.prepareRenderer(javax.swing.table.TableCellRenderer,int,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_prepareRenderer_TableCellRenderer_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getColumnClass(int) public java.lang.Class
     * <?> javax.swing.JTable.getColumnClass(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getColumnClass(int) public java.lang.Class
     * javax.swing.JTable.getColumnClass(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getColumnClass(int) public java.lang.Class javax.swing.JTable.getColumnClass(int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getColumnClass_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getRowSorter() public javax.swing.RowSorter<? extends
     * javax.swing.table.TableModel> javax.swing.JTable.getRowSorter()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getRowSorter() public javax.swing.RowSorter
     * javax.swing.JTable.getRowSorter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getRowSorter() public javax.swing.RowSorter javax.swing.JTable.getRowSorter() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRowSorter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getScrollableTracksViewportWidth() public boolean
     * javax.swing.JTable.getScrollableTracksViewportWidth()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getScrollableTracksViewportWidth() public boolean
     * javax.swing.JTable.getScrollableTracksViewportWidth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getScrollableTracksViewportWidth() public boolean
     *      javax.swing.JTable.getScrollableTracksViewportWidth() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getScrollableTracksViewportWidth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#convertColumnIndexToView(int) public int
     * javax.swing.JTable.convertColumnIndexToView(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#convertColumnIndexToView(int) public int
     * javax.swing.JTable.convertColumnIndexToView(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#convertColumnIndexToView(int) public int javax.swing.JTable.convertColumnIndexToView(int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_convertColumnIndexToView_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setAutoCreateRowSorter(boolean) public void
     * javax.swing.JTable.setAutoCreateRowSorter(boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setAutoCreateRowSorter(boolean) public void
     * javax.swing.JTable.setAutoCreateRowSorter(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setAutoCreateRowSorter(boolean) public void
     *      javax.swing.JTable.setAutoCreateRowSorter(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAutoCreateRowSorter_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getToolTipText(java.awt.event.MouseEvent) public java.lang.String
     * javax.swing.JTable.getToolTipText(java.awt.event.MouseEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getToolTipText(java.awt.event.MouseEvent) public java.lang.String
     * javax.swing.JTable.getToolTipText(java.awt.event.MouseEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getToolTipText(java.awt.event.MouseEvent) public java.lang.String
     *      javax.swing.JTable.getToolTipText(java.awt.event.MouseEvent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getToolTipText_MouseEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#removeColumn(javax.swing.table.TableColumn) public void
     * javax.swing.JTable.removeColumn(javax.swing.table.TableColumn)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#removeColumn(javax.swing.table.TableColumn) public void
     * javax.swing.JTable.removeColumn(javax.swing.table.TableColumn)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#removeColumn(javax.swing.table.TableColumn) public void
     *      javax.swing.JTable.removeColumn(javax.swing.table.TableColumn) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeColumn_TableColumn()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setCellSelectionEnabled(boolean) public void
     * javax.swing.JTable.setCellSelectionEnabled(boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setCellSelectionEnabled(boolean) public void
     * javax.swing.JTable.setCellSelectionEnabled(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setCellSelectionEnabled(boolean) public void
     *      javax.swing.JTable.setCellSelectionEnabled(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCellSelectionEnabled_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setDropMode(javax.swing.DropMode) public final void
     * javax.swing.JTable.setDropMode(javax.swing.DropMode)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setDropMode(javax.swing.DropMode) public final void
     * javax.swing.JTable.setDropMode(javax.swing.DropMode)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setDropMode(javax.swing.DropMode) public final void
     *      javax.swing.JTable.setDropMode(javax.swing.DropMode) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDropMode_DropMode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#columnSelectionChanged(javax.swing.event.ListSelectionEvent) public
     * void javax.swing.JTable.columnSelectionChanged(javax.swing.event.ListSelectionEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#columnSelectionChanged(javax.swing.event.ListSelectionEvent) public
     * void javax.swing.JTable.columnSelectionChanged(javax.swing.event.ListSelectionEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#columnSelectionChanged(javax.swing.event.ListSelectionEvent) public void
     *      javax.swing.JTable.columnSelectionChanged(javax.swing.event.ListSelectionEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_columnSelectionChanged_ListSelectionEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#addNotify() public void javax.swing.JTable.addNotify()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#addNotify() public void javax.swing.JTable.addNotify()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#addNotify() public void javax.swing.JTable.addNotify() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addNotify()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setIntercellSpacing(java.awt.Dimension) public void
     * javax.swing.JTable.setIntercellSpacing(java.awt.Dimension)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setIntercellSpacing(java.awt.Dimension) public void
     * javax.swing.JTable.setIntercellSpacing(java.awt.Dimension)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setIntercellSpacing(java.awt.Dimension) public void
     *      javax.swing.JTable.setIntercellSpacing(java.awt.Dimension) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setIntercellSpacing_Dimension()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setTableHeader(javax.swing.table.JTableHeader) public void
     * javax.swing.JTable.setTableHeader(javax.swing.table.JTableHeader)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setTableHeader(javax.swing.table.JTableHeader) public void
     * javax.swing.JTable.setTableHeader(javax.swing.table.JTableHeader)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setTableHeader(javax.swing.table.JTableHeader) public void
     *      javax.swing.JTable.setTableHeader(javax.swing.table.JTableHeader) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTableHeader_JTableHeader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getEditorComponent() public java.awt.Component
     * javax.swing.JTable.getEditorComponent()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getEditorComponent() public java.awt.Component
     * javax.swing.JTable.getEditorComponent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getEditorComponent() public java.awt.Component javax.swing.JTable.getEditorComponent()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEditorComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getRowSelectionAllowed() public boolean
     * javax.swing.JTable.getRowSelectionAllowed()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getRowSelectionAllowed() public boolean
     * javax.swing.JTable.getRowSelectionAllowed()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getRowSelectionAllowed() public boolean javax.swing.JTable.getRowSelectionAllowed() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRowSelectionAllowed()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setSurrendersFocusOnKeystroke(boolean) public void
     * javax.swing.JTable.setSurrendersFocusOnKeystroke(boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setSurrendersFocusOnKeystroke(boolean) public void
     * javax.swing.JTable.setSurrendersFocusOnKeystroke(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setSurrendersFocusOnKeystroke(boolean) public void
     *      javax.swing.JTable.setSurrendersFocusOnKeystroke(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSurrendersFocusOnKeystroke_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getCellEditor() public javax.swing.table.TableCellEditor
     * javax.swing.JTable.getCellEditor()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getCellEditor() public javax.swing.table.TableCellEditor
     * javax.swing.JTable.getCellEditor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getCellEditor() public javax.swing.table.TableCellEditor
     *      javax.swing.JTable.getCellEditor() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCellEditor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getCellEditor(int, int) public javax.swing.table.TableCellEditor
     * javax.swing.JTable.getCellEditor(int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getCellEditor(int, int) public javax.swing.table.TableCellEditor
     * javax.swing.JTable.getCellEditor(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getCellEditor(int, int) public javax.swing.table.TableCellEditor
     *      javax.swing.JTable.getCellEditor(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCellEditor_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#isRowSelected(int) public boolean
     * javax.swing.JTable.isRowSelected(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#isRowSelected(int) public boolean
     * javax.swing.JTable.isRowSelected(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#isRowSelected(int) public boolean javax.swing.JTable.isRowSelected(int) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRowSelected_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#convertRowIndexToModel(int) public int
     * javax.swing.JTable.convertRowIndexToModel(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#convertRowIndexToModel(int) public int
     * javax.swing.JTable.convertRowIndexToModel(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#convertRowIndexToModel(int) public int javax.swing.JTable.convertRowIndexToModel(int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_convertRowIndexToModel_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setUpdateSelectionOnSort(boolean) public void
     * javax.swing.JTable.setUpdateSelectionOnSort(boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setUpdateSelectionOnSort(boolean) public void
     * javax.swing.JTable.setUpdateSelectionOnSort(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setUpdateSelectionOnSort(boolean) public void
     *      javax.swing.JTable.setUpdateSelectionOnSort(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setUpdateSelectionOnSort_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getAutoResizeMode() public int javax.swing.JTable.getAutoResizeMode()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getAutoResizeMode() public int javax.swing.JTable.getAutoResizeMode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getAutoResizeMode() public int javax.swing.JTable.getAutoResizeMode() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAutoResizeMode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getColumnName(int) public java.lang.String
     * javax.swing.JTable.getColumnName(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getColumnName(int) public java.lang.String
     * javax.swing.JTable.getColumnName(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getColumnName(int) public java.lang.String javax.swing.JTable.getColumnName(int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getColumnName_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getIntercellSpacing() public java.awt.Dimension
     * javax.swing.JTable.getIntercellSpacing()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getIntercellSpacing() public java.awt.Dimension
     * javax.swing.JTable.getIntercellSpacing()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getIntercellSpacing() public java.awt.Dimension javax.swing.JTable.getIntercellSpacing()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIntercellSpacing()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#removeEditor() public void javax.swing.JTable.removeEditor()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#removeEditor() public void javax.swing.JTable.removeEditor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#removeEditor() public void javax.swing.JTable.removeEditor() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeEditor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#createDefaultColumnsFromModel() public void
     * javax.swing.JTable.createDefaultColumnsFromModel()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#createDefaultColumnsFromModel() public void
     * javax.swing.JTable.createDefaultColumnsFromModel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#createDefaultColumnsFromModel() public void
     *      javax.swing.JTable.createDefaultColumnsFromModel() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createDefaultColumnsFromModel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#columnAtPoint(java.awt.Point) public int
     * javax.swing.JTable.columnAtPoint(java.awt.Point)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#columnAtPoint(java.awt.Point) public int
     * javax.swing.JTable.columnAtPoint(java.awt.Point)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#columnAtPoint(java.awt.Point) public int javax.swing.JTable.columnAtPoint(java.awt.Point)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_columnAtPoint_Point()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectionForeground() public java.awt.Color
     * javax.swing.JTable.getSelectionForeground()}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#getSelectionForeground() public java.awt.Color
     * javax.swing.JTable.getSelectionForeground()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#getSelectionForeground() public java.awt.Color
     *      javax.swing.JTable.getSelectionForeground() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSelectionForeground()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JTable#setShowHorizontalLines(boolean) public void
     * javax.swing.JTable.setShowHorizontalLines(boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.JTable#setShowHorizontalLines(boolean) public void
     * javax.swing.JTable.setShowHorizontalLines(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JTable#setShowHorizontalLines(boolean) public void
     *      javax.swing.JTable.setShowHorizontalLines(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setShowHorizontalLines_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.JTable.PrintMode class javax.swing.JTable$PrintMode}. The
     * complementary j8unit test interface containing the class relevant aspects is
     * {@link JTableClassTests.PrintModeClassTests}.
     * </p>
     *
     * @see javax.swing.JTable.PrintMode class javax.swing.JTable$PrintMode (the hereby targeted class-under-test class)
     * @see JTableClassTests.PrintModeClassTests JTableClassTests.PrintModeClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PrintModeTests<SUT extends javax.swing.JTable.PrintMode>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.swing.JTable.PrintMode> {

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.JTable.DropLocation class javax.swing.JTable$DropLocation}
     * . The complementary j8unit test interface containing the class relevant aspects is
     * {@link JTableClassTests.DropLocationClassTests}.
     * </p>
     *
     * @see javax.swing.JTable.DropLocation class javax.swing.JTable$DropLocation (the hereby targeted class-under-test
     *      class)
     * @see JTableClassTests.DropLocationClassTests JTableClassTests.DropLocationClassTests (the complementary j8unit
     *      test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DropLocationTests<SUT extends javax.swing.JTable.DropLocation>
    extends TransferHandlerTests.DropLocationTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.JTable.DropLocation#isInsertRow() public boolean
         * javax.swing.JTable$DropLocation.isInsertRow()}.
         *
         * <p>
         * Test method for {@link javax.swing.JTable.DropLocation#isInsertRow() public boolean
         * javax.swing.JTable$DropLocation.isInsertRow()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.JTable.DropLocation#isInsertRow() public boolean
         *      javax.swing.JTable$DropLocation.isInsertRow() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_isInsertRow()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.JTable.DropLocation#isInsertColumn() public boolean
         * javax.swing.JTable$DropLocation.isInsertColumn()}.
         *
         * <p>
         * Test method for {@link javax.swing.JTable.DropLocation#isInsertColumn() public boolean
         * javax.swing.JTable$DropLocation.isInsertColumn()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.JTable.DropLocation#isInsertColumn() public boolean
         *      javax.swing.JTable$DropLocation.isInsertColumn() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_isInsertColumn()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.JTable.DropLocation#getRow() public int
         * javax.swing.JTable$DropLocation.getRow()}.
         *
         * <p>
         * Test method for {@link javax.swing.JTable.DropLocation#getRow() public int
         * javax.swing.JTable$DropLocation.getRow()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.JTable.DropLocation#getRow() public int javax.swing.JTable$DropLocation.getRow() (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getRow()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.JTable.DropLocation#getColumn() public int
         * javax.swing.JTable$DropLocation.getColumn()}.
         *
         * <p>
         * Test method for {@link javax.swing.JTable.DropLocation#getColumn() public int
         * javax.swing.JTable$DropLocation.getColumn()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.JTable.DropLocation#getColumn() public int javax.swing.JTable$DropLocation.getColumn() (the
         *      hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getColumn()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.JTable.DropLocation#toString() public java.lang.String
         * javax.swing.JTable$DropLocation.toString()}.
         *
         * <p>
         * Test method for {@link javax.swing.JTable.DropLocation#toString() public java.lang.String
         * javax.swing.JTable$DropLocation.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.JTable.DropLocation#toString() public java.lang.String
         *      javax.swing.JTable$DropLocation.toString() (the hereby targeted method-under-test)
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

    }

}
