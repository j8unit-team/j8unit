package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.DefaultEditorKit class
 * javax.swing.text.DefaultEditorKit}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.DefaultEditorKit
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultEditorKitTests<SUT extends javax.swing.text.DefaultEditorKit>
extends org.j8unit.repository.javax.swing.text.EditorKitTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.BeepAction class
     * javax.swing.text.DefaultEditorKit$BeepAction}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.BeepActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.BeepActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit.BeepAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BeepActionTests<SUT extends javax.swing.text.DefaultEditorKit.BeepAction>
    extends org.j8unit.repository.javax.swing.text.TextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.DefaultEditorKit.BeepAction#actionPerformed(java.awt.event.ActionEvent) public void
         * javax.swing.text.DefaultEditorKit$BeepAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.DefaultEditorKit.BeepAction#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.CopyAction class
     * javax.swing.text.DefaultEditorKit$CopyAction}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.CopyActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.CopyActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit.CopyAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CopyActionTests<SUT extends javax.swing.text.DefaultEditorKit.CopyAction>
    extends org.j8unit.repository.javax.swing.text.TextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.DefaultEditorKit.CopyAction#actionPerformed(java.awt.event.ActionEvent) public void
         * javax.swing.text.DefaultEditorKit$CopyAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.DefaultEditorKit.CopyAction#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.CutAction class
     * javax.swing.text.DefaultEditorKit$CutAction}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.CutActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.CutActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit.CutAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CutActionTests<SUT extends javax.swing.text.DefaultEditorKit.CutAction>
    extends org.j8unit.repository.javax.swing.text.TextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.DefaultEditorKit.CutAction#actionPerformed(java.awt.event.ActionEvent) public void
         * javax.swing.text.DefaultEditorKit$CutAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.DefaultEditorKit.CutAction#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction class
     * javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.DefaultKeyTypedActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.DefaultKeyTypedActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DefaultKeyTypedActionTests<SUT extends javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction>
    extends org.j8unit.repository.javax.swing.text.TextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction#actionPerformed(java.awt.event.
         *             ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.InsertBreakAction class
     * javax.swing.text.DefaultEditorKit$InsertBreakAction}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.InsertBreakActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.InsertBreakActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit.InsertBreakAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InsertBreakActionTests<SUT extends javax.swing.text.DefaultEditorKit.InsertBreakAction>
    extends org.j8unit.repository.javax.swing.text.TextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.DefaultEditorKit.InsertBreakAction#actionPerformed(java.awt.event.ActionEvent) public
         * void javax.swing.text.DefaultEditorKit$InsertBreakAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.DefaultEditorKit.InsertBreakAction#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.InsertContentAction class
     * javax.swing.text.DefaultEditorKit$InsertContentAction}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.InsertContentActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.InsertContentActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit.InsertContentAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InsertContentActionTests<SUT extends javax.swing.text.DefaultEditorKit.InsertContentAction>
    extends org.j8unit.repository.javax.swing.text.TextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.DefaultEditorKit.InsertContentAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.text.DefaultEditorKit$InsertContentAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.DefaultEditorKit.InsertContentAction#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.InsertTabAction class
     * javax.swing.text.DefaultEditorKit$InsertTabAction}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.InsertTabActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.InsertTabActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit.InsertTabAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InsertTabActionTests<SUT extends javax.swing.text.DefaultEditorKit.InsertTabAction>
    extends org.j8unit.repository.javax.swing.text.TextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.DefaultEditorKit.InsertTabAction#actionPerformed(java.awt.event.ActionEvent) public
         * void javax.swing.text.DefaultEditorKit$InsertTabAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.DefaultEditorKit.InsertTabAction#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.PasteAction class
     * javax.swing.text.DefaultEditorKit$PasteAction}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitTests.PasteActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.PasteActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit.PasteAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PasteActionTests<SUT extends javax.swing.text.DefaultEditorKit.PasteAction>
    extends org.j8unit.repository.javax.swing.text.TextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.DefaultEditorKit.PasteAction#actionPerformed(java.awt.event.ActionEvent) public void
         * javax.swing.text.DefaultEditorKit$PasteAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.DefaultEditorKit.PasteAction#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultEditorKit#createCaret() public javax.swing.text.Caret
     * javax.swing.text.DefaultEditorKit.createCaret()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit#createCaret()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createCaret()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultEditorKit#createDefaultDocument() public javax.swing.text.Document
     * javax.swing.text.DefaultEditorKit.createDefaultDocument()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit#createDefaultDocument()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createDefaultDocument()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultEditorKit#getActions() public javax.swing.Action[]
     * javax.swing.text.DefaultEditorKit.getActions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit#getActions()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getActions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultEditorKit#getContentType() public java.lang.String
     * javax.swing.text.DefaultEditorKit.getContentType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit#getContentType()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getContentType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultEditorKit#getViewFactory() public javax.swing.text.ViewFactory
     * javax.swing.text.DefaultEditorKit.getViewFactory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit#getViewFactory()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getViewFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.DefaultEditorKit#read(java.io.InputStream, javax.swing.text.Document, int) public void
     * javax.swing.text.DefaultEditorKit.read(java.io.InputStream,javax.swing.text.Document,int) throws
     * java.io.IOException,javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit#read(java.io.InputStream, javax.swing.text.Document, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_read_InputStream_Document_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultEditorKit#read(java.io.Reader, javax.swing.text.Document, int)
     * public void javax.swing.text.DefaultEditorKit.read(java.io.Reader,javax.swing.text.Document,int) throws
     * java.io.IOException,javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit#read(java.io.Reader, javax.swing.text.Document, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_read_Reader_Document_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.DefaultEditorKit#write(java.io.OutputStream, javax.swing.text.Document, int, int) public
     * void javax.swing.text.DefaultEditorKit.write(java.io.OutputStream,javax.swing.text.Document,int,int) throws
     * java.io.IOException,javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit#write(java.io.OutputStream, javax.swing.text.Document, int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_write_OutputStream_Document_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.DefaultEditorKit#write(java.io.Writer, javax.swing.text.Document, int, int) public void
     * javax.swing.text.DefaultEditorKit.write(java.io.Writer,javax.swing.text.Document,int,int) throws
     * java.io.IOException,javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.DefaultEditorKit#write(java.io.Writer, javax.swing.text.Document, int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_write_Writer_Document_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
