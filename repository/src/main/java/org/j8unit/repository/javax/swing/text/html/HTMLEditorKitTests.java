package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.html.HTMLEditorKit class javax.swing.text.html.HTMLEditorKit}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HTMLEditorKitTests<SUT extends javax.swing.text.html.HTMLEditorKit>
extends org.j8unit.repository.javax.accessibility.AccessibleTests<SUT>, org.j8unit.repository.javax.swing.text.StyledEditorKitTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTMLEditorKit$HTMLFactory class
     * javax.swing.text.html.HTMLEditorKit$HTMLFactory}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.HTMLFactoryClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface HTMLFactoryTests<SUT extends javax.swing.text.html.HTMLEditorKit.HTMLFactory>
    extends org.j8unit.repository.javax.swing.text.ViewFactoryTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTMLEditorKit.HTMLFactory#create(javax.swing.text.Element)
         * public javax.swing.text.View
         * javax.swing.text.html.HTMLEditorKit$HTMLFactory.create(javax.swing.text.Element)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_create_Element()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTMLEditorKit$HTMLTextAction class
     * javax.swing.text.html.HTMLEditorKit$HTMLTextAction}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.HTMLTextActionClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface HTMLTextActionTests<SUT extends javax.swing.text.html.HTMLEditorKit.HTMLTextAction>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitTests.StyledTextActionTests<SUT> {

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction class
     * javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.InsertHTMLTextActionClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface InsertHTMLTextActionTests<SUT extends javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction>
    extends org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.HTMLTextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction.actionPerformed(java.awt.event.ActionEvent)}.
         * </p>
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
     * Test class for {@link javax.swing.text.html.HTMLEditorKit$LinkController class
     * javax.swing.text.html.HTMLEditorKit$LinkController}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.LinkControllerClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface LinkControllerTests<SUT extends javax.swing.text.html.HTMLEditorKit.LinkController>
    extends org.j8unit.repository.java.awt.event.MouseMotionListenerTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
    org.j8unit.repository.java.awt.event.MouseAdapterTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.html.HTMLEditorKit.LinkController#mouseClicked(java.awt.event.MouseEvent) public void
         * javax.swing.text.html.HTMLEditorKit$LinkController.mouseClicked(java.awt.event.MouseEvent)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_mouseClicked_MouseEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.html.HTMLEditorKit.LinkController#mouseDragged(java.awt.event.MouseEvent) public void
         * javax.swing.text.html.HTMLEditorKit$LinkController.mouseDragged(java.awt.event.MouseEvent)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_mouseDragged_MouseEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.html.HTMLEditorKit.LinkController#mouseMoved(java.awt.event.MouseEvent) public void
         * javax.swing.text.html.HTMLEditorKit$LinkController.mouseMoved(java.awt.event.MouseEvent)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_mouseMoved_MouseEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTMLEditorKit$ParserCallback class
     * javax.swing.text.html.HTMLEditorKit$ParserCallback}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.ParserCallbackClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ParserCallbackTests<SUT extends javax.swing.text.html.HTMLEditorKit.ParserCallback>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTMLEditorKit.ParserCallback#flush() public void
         * javax.swing.text.html.HTMLEditorKit$ParserCallback.flush() throws javax.swing.text.BadLocationException}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_flush()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTMLEditorKit.ParserCallback#handleComment(char[],int) public
         * void javax.swing.text.html.HTMLEditorKit$ParserCallback.handleComment(char[],int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_handleComment_charArray_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.html.HTMLEditorKit.ParserCallback#handleEndOfLineString(java.lang.String) public void
         * javax.swing.text.html.HTMLEditorKit$ParserCallback.handleEndOfLineString(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_handleEndOfLineString_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.html.HTMLEditorKit.ParserCallback#handleEndTag(javax.swing.text.html.HTML.Tag,int)
         * public void
         * javax.swing.text.html.HTMLEditorKit$ParserCallback.handleEndTag(javax.swing.text.html.HTML$Tag,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_handleEndTag_Tag_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTMLEditorKit.ParserCallback#handleError(java.lang.String,int)
         * public void javax.swing.text.html.HTMLEditorKit$ParserCallback.handleError(java.lang.String,int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_handleError_String_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.html.HTMLEditorKit.ParserCallback#handleSimpleTag(javax.swing.text.html.HTML.Tag,javax.swing.text.MutableAttributeSet,int)
         * public void
         * javax.swing.text.html.HTMLEditorKit$ParserCallback.handleSimpleTag(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet,int)}
         * .
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_handleSimpleTag_Tag_MutableAttributeSet_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.html.HTMLEditorKit.ParserCallback#handleStartTag(javax.swing.text.html.HTML.Tag,javax.swing.text.MutableAttributeSet,int)
         * public void
         * javax.swing.text.html.HTMLEditorKit$ParserCallback.handleStartTag(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet,int)}
         * .
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_handleStartTag_Tag_MutableAttributeSet_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTMLEditorKit.ParserCallback#handleText(char[],int) public void
         * javax.swing.text.html.HTMLEditorKit$ParserCallback.handleText(char[],int)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_handleText_charArray_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTMLEditorKit$Parser class
     * javax.swing.text.html.HTMLEditorKit$Parser}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.ParserClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ParserTests<SUT extends javax.swing.text.html.HTMLEditorKit.Parser>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.html.HTMLEditorKit.Parser#parse(java.io.Reader,javax.swing.text.html.HTMLEditorKit.ParserCallback,boolean)
         * public abstract void
         * javax.swing.text.html.HTMLEditorKit$Parser.parse(java.io.Reader,javax.swing.text.html.HTMLEditorKit$ParserCallback,boolean)
         * throws java.io.IOException}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_parse_Reader_ParserCallback_boolean()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#clone() public java.lang.Object
     * javax.swing.text.html.HTMLEditorKit.clone()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#createDefaultDocument() public
     * javax.swing.text.Document javax.swing.text.html.HTMLEditorKit.createDefaultDocument()}.
     * </p>
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
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#deinstall(javax.swing.JEditorPane) public void
     * javax.swing.text.html.HTMLEditorKit.deinstall(javax.swing.JEditorPane)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_deinstall_JEditorPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#getAccessibleContext() public
     * javax.accessibility.AccessibleContext javax.swing.text.html.HTMLEditorKit.getAccessibleContext()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getAccessibleContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#getActions() public javax.swing.Action[]
     * javax.swing.text.html.HTMLEditorKit.getActions()}.
     * </p>
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
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#getContentType() public java.lang.String
     * javax.swing.text.html.HTMLEditorKit.getContentType()}.
     * </p>
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
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#getDefaultCursor() public java.awt.Cursor
     * javax.swing.text.html.HTMLEditorKit.getDefaultCursor()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultCursor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#getInputAttributes() public
     * javax.swing.text.MutableAttributeSet javax.swing.text.html.HTMLEditorKit.getInputAttributes()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getInputAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#getLinkCursor() public java.awt.Cursor
     * javax.swing.text.html.HTMLEditorKit.getLinkCursor()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLinkCursor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#getStyleSheet() public
     * javax.swing.text.html.StyleSheet javax.swing.text.html.HTMLEditorKit.getStyleSheet()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStyleSheet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#getViewFactory() public javax.swing.text.ViewFactory
     * javax.swing.text.html.HTMLEditorKit.getViewFactory()}.
     * </p>
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
     * {@link javax.swing.text.html.HTMLEditorKit#insertHTML(javax.swing.text.html.HTMLDocument,int,java.lang.String,int,int,javax.swing.text.html.HTML.Tag)
     * public void
     * javax.swing.text.html.HTMLEditorKit.insertHTML(javax.swing.text.html.HTMLDocument,int,java.lang.String,int,int,javax.swing.text.html.HTML$Tag)
     * throws javax.swing.text.BadLocationException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insertHTML_HTMLDocument_int_String_int_int_Tag()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#install(javax.swing.JEditorPane) public void
     * javax.swing.text.html.HTMLEditorKit.install(javax.swing.JEditorPane)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_install_JEditorPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#isAutoFormSubmission() public boolean
     * javax.swing.text.html.HTMLEditorKit.isAutoFormSubmission()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAutoFormSubmission()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#read(java.io.Reader,javax.swing.text.Document,int)
     * public void javax.swing.text.html.HTMLEditorKit.read(java.io.Reader,javax.swing.text.Document,int) throws
     * java.io.IOException,javax.swing.text.BadLocationException}.
     * </p>
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
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#setAutoFormSubmission(boolean) public void
     * javax.swing.text.html.HTMLEditorKit.setAutoFormSubmission(boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAutoFormSubmission_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#setDefaultCursor(java.awt.Cursor) public void
     * javax.swing.text.html.HTMLEditorKit.setDefaultCursor(java.awt.Cursor)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDefaultCursor_Cursor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#setLinkCursor(java.awt.Cursor) public void
     * javax.swing.text.html.HTMLEditorKit.setLinkCursor(java.awt.Cursor)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLinkCursor_Cursor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLEditorKit#setStyleSheet(javax.swing.text.html.StyleSheet) public
     * void javax.swing.text.html.HTMLEditorKit.setStyleSheet(javax.swing.text.html.StyleSheet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setStyleSheet_StyleSheet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.html.HTMLEditorKit#write(java.io.Writer,javax.swing.text.Document,int,int) public void
     * javax.swing.text.html.HTMLEditorKit.write(java.io.Writer,javax.swing.text.Document,int,int) throws
     * java.io.IOException,javax.swing.text.BadLocationException}.
     * </p>
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
