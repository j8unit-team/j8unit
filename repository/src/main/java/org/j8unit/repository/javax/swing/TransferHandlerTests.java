package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.TransferHandler class javax.swing.TransferHandler}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.TransferHandlerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransferHandlerTests<SUT extends javax.swing.TransferHandler>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.TransferHandler$DropLocation class javax.swing.TransferHandler$DropLocation},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.TransferHandlerClassTests.DropLocationClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DropLocationTests<SUT extends javax.swing.TransferHandler.DropLocation>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.TransferHandler.DropLocation#getDropPoint() public final java.awt.Point
         * javax.swing.TransferHandler$DropLocation.getDropPoint()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getDropPoint()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.TransferHandler.DropLocation#toString() public java.lang.String
         * javax.swing.TransferHandler$DropLocation.toString()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.TransferHandler$TransferSupport class
     * javax.swing.TransferHandler$TransferSupport}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.TransferHandlerClassTests.TransferSupportClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TransferSupportTests<SUT extends javax.swing.TransferHandler.TransferSupport>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.TransferHandler.TransferSupport#getComponent() public java.awt.Component
         * javax.swing.TransferHandler$TransferSupport.getComponent()}.
         * </p>
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
         * Test method for {@link javax.swing.TransferHandler.TransferSupport#getDataFlavors() public
         * java.awt.datatransfer.DataFlavor[] javax.swing.TransferHandler$TransferSupport.getDataFlavors()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getDataFlavors()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.TransferHandler.TransferSupport#getDropAction() public int
         * javax.swing.TransferHandler$TransferSupport.getDropAction()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getDropAction()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.TransferHandler.TransferSupport#getDropLocation() public
         * javax.swing.TransferHandler$DropLocation javax.swing.TransferHandler$TransferSupport.getDropLocation()}.
         * </p>
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
         * Test method for {@link javax.swing.TransferHandler.TransferSupport#getSourceDropActions() public int
         * javax.swing.TransferHandler$TransferSupport.getSourceDropActions()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getSourceDropActions()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.TransferHandler.TransferSupport#getTransferable() public
         * java.awt.datatransfer.Transferable javax.swing.TransferHandler$TransferSupport.getTransferable()}.
         * </p>
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
         * Test method for {@link javax.swing.TransferHandler.TransferSupport#getUserDropAction() public int
         * javax.swing.TransferHandler$TransferSupport.getUserDropAction()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getUserDropAction()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.TransferHandler.TransferSupport#isDataFlavorSupported(java.awt.datatransfer.DataFlavor)
         * public boolean
         * javax.swing.TransferHandler$TransferSupport.isDataFlavorSupported(java.awt.datatransfer.DataFlavor)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_isDataFlavorSupported_DataFlavor()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.TransferHandler.TransferSupport#isDrop() public boolean
         * javax.swing.TransferHandler$TransferSupport.isDrop()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_isDrop()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.TransferHandler.TransferSupport#setDropAction(int) public void
         * javax.swing.TransferHandler$TransferSupport.setDropAction(int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setDropAction_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.TransferHandler.TransferSupport#setShowDropLocation(boolean) public void
         * javax.swing.TransferHandler$TransferSupport.setShowDropLocation(boolean)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setShowDropLocation_boolean()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.TransferHandler#canImport(javax.swing.JComponent,java.awt.datatransfer.DataFlavor[]) public
     * boolean javax.swing.TransferHandler.canImport(javax.swing.JComponent,java.awt.datatransfer.DataFlavor[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_canImport_JComponent_DataFlavorArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.TransferHandler#canImport(javax.swing.TransferHandler.TransferSupport) public
     * boolean javax.swing.TransferHandler.canImport(javax.swing.TransferHandler$TransferSupport)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_canImport_TransferSupport()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.TransferHandler#exportAsDrag(javax.swing.JComponent,java.awt.event.InputEvent,int) public void
     * javax.swing.TransferHandler.exportAsDrag(javax.swing.JComponent,java.awt.event.InputEvent,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exportAsDrag_JComponent_InputEvent_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.TransferHandler#exportToClipboard(javax.swing.JComponent,java.awt.datatransfer.Clipboard,int)
     * public void
     * javax.swing.TransferHandler.exportToClipboard(javax.swing.JComponent,java.awt.datatransfer.Clipboard,int) throws
     * java.lang.IllegalStateException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exportToClipboard_JComponent_Clipboard_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.TransferHandler#getDragImage() public java.awt.Image
     * javax.swing.TransferHandler.getDragImage()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDragImage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.TransferHandler#getDragImageOffset() public java.awt.Point
     * javax.swing.TransferHandler.getDragImageOffset()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDragImageOffset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.TransferHandler#getSourceActions(javax.swing.JComponent) public int
     * javax.swing.TransferHandler.getSourceActions(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSourceActions_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.TransferHandler#getVisualRepresentation(java.awt.datatransfer.Transferable)
     * public javax.swing.Icon javax.swing.TransferHandler.getVisualRepresentation(java.awt.datatransfer.Transferable)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getVisualRepresentation_Transferable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.TransferHandler#importData(javax.swing.JComponent,java.awt.datatransfer.Transferable) public
     * boolean javax.swing.TransferHandler.importData(javax.swing.JComponent,java.awt.datatransfer.Transferable)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_importData_JComponent_Transferable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.TransferHandler#importData(javax.swing.TransferHandler.TransferSupport) public
     * boolean javax.swing.TransferHandler.importData(javax.swing.TransferHandler$TransferSupport)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_importData_TransferSupport()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.TransferHandler#setDragImage(java.awt.Image) public void
     * javax.swing.TransferHandler.setDragImage(java.awt.Image)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDragImage_Image()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.TransferHandler#setDragImageOffset(java.awt.Point) public void
     * javax.swing.TransferHandler.setDragImageOffset(java.awt.Point)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDragImageOffset_Point()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
