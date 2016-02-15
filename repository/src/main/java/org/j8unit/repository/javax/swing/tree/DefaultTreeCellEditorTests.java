package org.j8unit.repository.javax.swing.tree;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.tree.DefaultTreeCellEditor class
 * javax.swing.tree.DefaultTreeCellEditor}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link DefaultTreeCellEditorClassTests}.
 * </p>
 *
 * @see javax.swing.tree.DefaultTreeCellEditor class javax.swing.tree.DefaultTreeCellEditor (the hereby targeted
 *      class-under-test class)
 * @see DefaultTreeCellEditorClassTests DefaultTreeCellEditorClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultTreeCellEditorTests<SUT extends javax.swing.tree.DefaultTreeCellEditor>
extends org.j8unit.repository.java.awt.event.ActionListenerTests<SUT>, TreeCellEditorTests<SUT>,
org.j8unit.repository.javax.swing.event.TreeSelectionListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#cancelCellEditing() public void
     * javax.swing.tree.DefaultTreeCellEditor.cancelCellEditing()}.
     *
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#cancelCellEditing() public void
     * javax.swing.tree.DefaultTreeCellEditor.cancelCellEditing()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor#cancelCellEditing() public void
     *      javax.swing.tree.DefaultTreeCellEditor.cancelCellEditing() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#isCellEditable(java.util.EventObject) public
     * boolean javax.swing.tree.DefaultTreeCellEditor.isCellEditable(java.util.EventObject)}.
     *
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#isCellEditable(java.util.EventObject) public
     * boolean javax.swing.tree.DefaultTreeCellEditor.isCellEditable(java.util.EventObject)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor#isCellEditable(java.util.EventObject) public boolean
     *      javax.swing.tree.DefaultTreeCellEditor.isCellEditable(java.util.EventObject) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#actionPerformed(java.awt.event.ActionEvent) public
     * void javax.swing.tree.DefaultTreeCellEditor.actionPerformed(java.awt.event.ActionEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#actionPerformed(java.awt.event.ActionEvent) public
     * void javax.swing.tree.DefaultTreeCellEditor.actionPerformed(java.awt.event.ActionEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor#actionPerformed(java.awt.event.ActionEvent) public void
     *      javax.swing.tree.DefaultTreeCellEditor.actionPerformed(java.awt.event.ActionEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_actionPerformed_ActionEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#getBorderSelectionColor() public java.awt.Color
     * javax.swing.tree.DefaultTreeCellEditor.getBorderSelectionColor()}.
     *
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#getBorderSelectionColor() public java.awt.Color
     * javax.swing.tree.DefaultTreeCellEditor.getBorderSelectionColor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor#getBorderSelectionColor() public java.awt.Color
     *      javax.swing.tree.DefaultTreeCellEditor.getBorderSelectionColor() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBorderSelectionColor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#getCellEditorListeners() public
     * javax.swing.event.CellEditorListener[] javax.swing.tree.DefaultTreeCellEditor.getCellEditorListeners()}.
     *
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#getCellEditorListeners() public
     * javax.swing.event.CellEditorListener[] javax.swing.tree.DefaultTreeCellEditor.getCellEditorListeners()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor#getCellEditorListeners() public
     *      javax.swing.event.CellEditorListener[] javax.swing.tree.DefaultTreeCellEditor.getCellEditorListeners() (the
     *      hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#setFont(java.awt.Font) public void
     * javax.swing.tree.DefaultTreeCellEditor.setFont(java.awt.Font)}.
     *
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#setFont(java.awt.Font) public void
     * javax.swing.tree.DefaultTreeCellEditor.setFont(java.awt.Font)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor#setFont(java.awt.Font) public void
     *      javax.swing.tree.DefaultTreeCellEditor.setFont(java.awt.Font) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFont_Font()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#setBorderSelectionColor(java.awt.Color) public void
     * javax.swing.tree.DefaultTreeCellEditor.setBorderSelectionColor(java.awt.Color)}.
     *
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#setBorderSelectionColor(java.awt.Color) public void
     * javax.swing.tree.DefaultTreeCellEditor.setBorderSelectionColor(java.awt.Color)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor#setBorderSelectionColor(java.awt.Color) public void
     *      javax.swing.tree.DefaultTreeCellEditor.setBorderSelectionColor(java.awt.Color) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setBorderSelectionColor_Color()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#getFont() public java.awt.Font
     * javax.swing.tree.DefaultTreeCellEditor.getFont()}.
     *
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#getFont() public java.awt.Font
     * javax.swing.tree.DefaultTreeCellEditor.getFont()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor#getFont() public java.awt.Font
     *      javax.swing.tree.DefaultTreeCellEditor.getFont() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFont()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#shouldSelectCell(java.util.EventObject) public
     * boolean javax.swing.tree.DefaultTreeCellEditor.shouldSelectCell(java.util.EventObject)}.
     *
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#shouldSelectCell(java.util.EventObject) public
     * boolean javax.swing.tree.DefaultTreeCellEditor.shouldSelectCell(java.util.EventObject)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor#shouldSelectCell(java.util.EventObject) public boolean
     *      javax.swing.tree.DefaultTreeCellEditor.shouldSelectCell(java.util.EventObject) (the hereby targeted
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
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#valueChanged(javax.swing.event.TreeSelectionEvent)
     * public void javax.swing.tree.DefaultTreeCellEditor.valueChanged(javax.swing.event.TreeSelectionEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#valueChanged(javax.swing.event.TreeSelectionEvent)
     * public void javax.swing.tree.DefaultTreeCellEditor.valueChanged(javax.swing.event.TreeSelectionEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor#valueChanged(javax.swing.event.TreeSelectionEvent) public void
     *      javax.swing.tree.DefaultTreeCellEditor.valueChanged(javax.swing.event.TreeSelectionEvent) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_valueChanged_TreeSelectionEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#getCellEditorValue() public java.lang.Object
     * javax.swing.tree.DefaultTreeCellEditor.getCellEditorValue()}.
     *
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#getCellEditorValue() public java.lang.Object
     * javax.swing.tree.DefaultTreeCellEditor.getCellEditorValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor#getCellEditorValue() public java.lang.Object
     *      javax.swing.tree.DefaultTreeCellEditor.getCellEditorValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCellEditorValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.tree.DefaultTreeCellEditor#removeCellEditorListener(javax.swing.event.CellEditorListener)
     * public void
     * javax.swing.tree.DefaultTreeCellEditor.removeCellEditorListener(javax.swing.event.CellEditorListener)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.tree.DefaultTreeCellEditor#removeCellEditorListener(javax.swing.event.CellEditorListener)
     * public void
     * javax.swing.tree.DefaultTreeCellEditor.removeCellEditorListener(javax.swing.event.CellEditorListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor#removeCellEditorListener(javax.swing.event.CellEditorListener) public
     *      void javax.swing.tree.DefaultTreeCellEditor.removeCellEditorListener(javax.swing.event.CellEditorListener)
     *      (the hereby targeted method-under-test)
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
     * Test method for
     * {@link javax.swing.tree.DefaultTreeCellEditor#addCellEditorListener(javax.swing.event.CellEditorListener) public
     * void javax.swing.tree.DefaultTreeCellEditor.addCellEditorListener(javax.swing.event.CellEditorListener)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.tree.DefaultTreeCellEditor#addCellEditorListener(javax.swing.event.CellEditorListener) public
     * void javax.swing.tree.DefaultTreeCellEditor.addCellEditorListener(javax.swing.event.CellEditorListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor#addCellEditorListener(javax.swing.event.CellEditorListener) public
     *      void javax.swing.tree.DefaultTreeCellEditor.addCellEditorListener(javax.swing.event.CellEditorListener) (the
     *      hereby targeted method-under-test)
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
     * Test method for
     * {@link javax.swing.tree.DefaultTreeCellEditor#getTreeCellEditorComponent(javax.swing.JTree, Object, boolean, boolean, boolean, int)
     * public java.awt.Component
     * javax.swing.tree.DefaultTreeCellEditor.getTreeCellEditorComponent(javax.swing.JTree,java.lang.Object,boolean,boolean,boolean,int)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.swing.tree.DefaultTreeCellEditor#getTreeCellEditorComponent(javax.swing.JTree, Object, boolean, boolean, boolean, int)
     * public java.awt.Component
     * javax.swing.tree.DefaultTreeCellEditor.getTreeCellEditorComponent(javax.swing.JTree,java.lang.Object,boolean,boolean,boolean,int)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor#getTreeCellEditorComponent(javax.swing.JTree, Object, boolean,
     *      boolean, boolean, int) public java.awt.Component
     *      javax.swing.tree.DefaultTreeCellEditor.getTreeCellEditorComponent(javax.swing.JTree,java.lang.Object,boolean
     *      ,boolean,boolean,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getTreeCellEditorComponent_JTree_Object_boolean_boolean_boolean_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#stopCellEditing() public boolean
     * javax.swing.tree.DefaultTreeCellEditor.stopCellEditing()}.
     *
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#stopCellEditing() public boolean
     * javax.swing.tree.DefaultTreeCellEditor.stopCellEditing()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor#stopCellEditing() public boolean
     *      javax.swing.tree.DefaultTreeCellEditor.stopCellEditing() (the hereby targeted method-under-test)
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
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.tree.DefaultTreeCellEditor.EditorContainer class
     * javax.swing.tree.DefaultTreeCellEditor$EditorContainer}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link DefaultTreeCellEditorClassTests.EditorContainerClassTests}.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor.EditorContainer class
     *      javax.swing.tree.DefaultTreeCellEditor$EditorContainer (the hereby targeted class-under-test class)
     * @see DefaultTreeCellEditorClassTests.EditorContainerClassTests
     *      DefaultTreeCellEditorClassTests.EditorContainerClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EditorContainerTests<SUT extends javax.swing.tree.DefaultTreeCellEditor.EditorContainer>
    extends org.j8unit.repository.java.awt.ContainerTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.EditorContainer#paint(java.awt.Graphics) public
         * void javax.swing.tree.DefaultTreeCellEditor$EditorContainer.paint(java.awt.Graphics)}.
         *
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.EditorContainer#paint(java.awt.Graphics) public
         * void javax.swing.tree.DefaultTreeCellEditor$EditorContainer.paint(java.awt.Graphics)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.tree.DefaultTreeCellEditor.EditorContainer#paint(java.awt.Graphics) public void
         *      javax.swing.tree.DefaultTreeCellEditor$EditorContainer.paint(java.awt.Graphics) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paint_Graphics()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.EditorContainer#doLayout() public void
         * javax.swing.tree.DefaultTreeCellEditor$EditorContainer.doLayout()}.
         *
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.EditorContainer#doLayout() public void
         * javax.swing.tree.DefaultTreeCellEditor$EditorContainer.doLayout()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.tree.DefaultTreeCellEditor.EditorContainer#doLayout() public void
         *      javax.swing.tree.DefaultTreeCellEditor$EditorContainer.doLayout() (the hereby targeted
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
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.EditorContainer#EditorContainer() public void
         * javax.swing.tree.DefaultTreeCellEditor$EditorContainer.EditorContainer()}.
         *
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.EditorContainer#EditorContainer() public void
         * javax.swing.tree.DefaultTreeCellEditor$EditorContainer.EditorContainer()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.tree.DefaultTreeCellEditor.EditorContainer#EditorContainer() public void
         *      javax.swing.tree.DefaultTreeCellEditor$EditorContainer.EditorContainer() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_EditorContainer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.EditorContainer#getPreferredSize() public
         * java.awt.Dimension javax.swing.tree.DefaultTreeCellEditor$EditorContainer.getPreferredSize()}.
         *
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.EditorContainer#getPreferredSize() public
         * java.awt.Dimension javax.swing.tree.DefaultTreeCellEditor$EditorContainer.getPreferredSize()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.tree.DefaultTreeCellEditor.EditorContainer#getPreferredSize() public java.awt.Dimension
         *      javax.swing.tree.DefaultTreeCellEditor$EditorContainer.getPreferredSize() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getPreferredSize()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.tree.DefaultTreeCellEditor.DefaultTextField class
     * javax.swing.tree.DefaultTreeCellEditor$DefaultTextField}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link DefaultTreeCellEditorClassTests.DefaultTextFieldClassTests}.
     * </p>
     *
     * @see javax.swing.tree.DefaultTreeCellEditor.DefaultTextField class
     *      javax.swing.tree.DefaultTreeCellEditor$DefaultTextField (the hereby targeted class-under-test class)
     * @see DefaultTreeCellEditorClassTests.DefaultTextFieldClassTests
     *      DefaultTreeCellEditorClassTests.DefaultTextFieldClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DefaultTextFieldTests<SUT extends javax.swing.tree.DefaultTreeCellEditor.DefaultTextField>
    extends org.j8unit.repository.javax.swing.JTextFieldTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#getFont() public java.awt.Font
         * javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.getFont()}.
         *
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#getFont() public java.awt.Font
         * javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.getFont()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#getFont() public java.awt.Font
         *      javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.getFont() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getFont()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#getBorder() public
         * javax.swing.border.Border javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.getBorder()}.
         *
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#getBorder() public
         * javax.swing.border.Border javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.getBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#getBorder() public javax.swing.border.Border
         *      javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.getBorder() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getBorder()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#getPreferredSize() public
         * java.awt.Dimension javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.getPreferredSize()}.
         *
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#getPreferredSize() public
         * java.awt.Dimension javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.getPreferredSize()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#getPreferredSize() public java.awt.Dimension
         *      javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.getPreferredSize() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getPreferredSize()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#setBorder(javax.swing.border.Border) public
         * void javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.setBorder(javax.swing.border.Border)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#setBorder(javax.swing.border.Border) public
         * void javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.setBorder(javax.swing.border.Border)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#setBorder(javax.swing.border.Border) public void
         *      javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.setBorder(javax.swing.border.Border) (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_setBorder_Border()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
