package org.j8unit.repository.javax.swing.text.html;

import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLDocument.BlockElement;
import javax.swing.text.html.HTMLDocument.HTMLReader;
import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.TagAction;
import javax.swing.text.html.HTMLDocument.Iterator;
import javax.swing.text.html.HTMLDocument.RunElement;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests;
import org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.BlockElementClassTests;
import org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests;
import org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.BlockActionClassTests;
import org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.CharacterActionClassTests;
import org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.FormActionClassTests;
import org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.HiddenActionClassTests;
import org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.IsindexActionClassTests;
import org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.ParagraphActionClassTests;
import org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.PreActionClassTests;
import org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.SpecialActionClassTests;
import org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests;
import org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.RunElementClassTests;
import org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.ParserCallbackTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link HTMLDocument
 * public class javax.swing.text.html.HTMLDocument}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link HTMLDocumentClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HTMLDocumentTests<SUT extends HTMLDocument>
extends DefaultStyledDocumentTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#insertBeforeEnd(javax.swing.text.Element, String) public void
     * javax.swing.text.html.HTMLDocument.insertBeforeEnd(javax.swing.text.Element,java.lang.String) throws
     * javax.swing.text.BadLocationException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insertBeforeEnd_Element_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#getIterator(javax.swing.text.html.HTML.Tag) public
     * javax.swing.text.html.HTMLDocument$Iterator
     * javax.swing.text.html.HTMLDocument.getIterator(javax.swing.text.html.HTML$Tag)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIterator_Tag()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.text.html.HTMLDocument#getParser()
     * public javax.swing.text.html.HTMLEditorKit$Parser javax.swing.text.html.HTMLDocument.getParser()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParser()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#getPreservesUnknownTags() public boolean
     * javax.swing.text.html.HTMLDocument.getPreservesUnknownTags()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPreservesUnknownTags()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#setParser(javax.swing.text.html.HTMLEditorKit.Parser) public void
     * javax.swing.text.html.HTMLDocument.setParser(javax.swing.text.html.HTMLEditorKit$Parser)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setParser_Parser()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#getElement(javax.swing.text.Element, Object, Object) public
     * javax.swing.text.Element
     * javax.swing.text.html.HTMLDocument.getElement(javax.swing.text.Element,java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElement_Element_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#getElement(String) public javax.swing.text.Element
     * javax.swing.text.html.HTMLDocument.getElement(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElement_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#insertAfterEnd(javax.swing.text.Element, String) public void
     * javax.swing.text.html.HTMLDocument.insertAfterEnd(javax.swing.text.Element,java.lang.String) throws
     * javax.swing.text.BadLocationException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insertAfterEnd_Element_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#setBase(java.net.URL) public void
     * javax.swing.text.html.HTMLDocument.setBase(java.net.URL)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setBase_URL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.text.html.HTMLDocument#getBase() public
     * java.net.URL javax.swing.text.html.HTMLDocument.getBase()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBase()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#insertAfterStart(javax.swing.text.Element, String) public void
     * javax.swing.text.html.HTMLDocument.insertAfterStart(javax.swing.text.Element,java.lang.String) throws
     * javax.swing.text.BadLocationException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insertAfterStart_Element_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#setInnerHTML(javax.swing.text.Element, String) public void
     * javax.swing.text.html.HTMLDocument.setInnerHTML(javax.swing.text.Element,java.lang.String) throws
     * javax.swing.text.BadLocationException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setInnerHTML_Element_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#setParagraphAttributes(int, int, javax.swing.text.AttributeSet, boolean)
     * public void
     * javax.swing.text.html.HTMLDocument.setParagraphAttributes(int,int,javax.swing.text.AttributeSet,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setParagraphAttributes_int_int_AttributeSet_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#getReader(int, int, int, javax.swing.text.html.HTML.Tag) public
     * javax.swing.text.html.HTMLEditorKit$ParserCallback
     * javax.swing.text.html.HTMLDocument.getReader(int,int,int,javax.swing.text.html.HTML$Tag)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReader_int_int_int_Tag()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.text.html.HTMLDocument#getReader(int)
     * public javax.swing.text.html.HTMLEditorKit$ParserCallback javax.swing.text.html.HTMLDocument.getReader(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReader_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#setPreservesUnknownTags(boolean) public void
     * javax.swing.text.html.HTMLDocument.setPreservesUnknownTags(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPreservesUnknownTags_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#processHTMLFrameHyperlinkEvent(javax.swing.text.html.HTMLFrameHyperlinkEvent)
     * public void
     * javax.swing.text.html.HTMLDocument.processHTMLFrameHyperlinkEvent(javax.swing.text.html.HTMLFrameHyperlinkEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_processHTMLFrameHyperlinkEvent_HTMLFrameHyperlinkEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#insertBeforeStart(javax.swing.text.Element, String) public void
     * javax.swing.text.html.HTMLDocument.insertBeforeStart(javax.swing.text.Element,java.lang.String) throws
     * javax.swing.text.BadLocationException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insertBeforeStart_Element_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#getTokenThreshold() public int
     * javax.swing.text.html.HTMLDocument.getTokenThreshold()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTokenThreshold()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#setOuterHTML(javax.swing.text.Element, String) public void
     * javax.swing.text.html.HTMLDocument.setOuterHTML(javax.swing.text.Element,java.lang.String) throws
     * javax.swing.text.BadLocationException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setOuterHTML_Element_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.text.html.HTMLDocument#getStyleSheet()
     * public javax.swing.text.html.StyleSheet javax.swing.text.html.HTMLDocument.getStyleSheet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.html.HTMLDocument#setTokenThreshold(int) public void
     * javax.swing.text.html.HTMLDocument.setTokenThreshold(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTokenThreshold_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument]
    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link HTMLReader
     * public class javax.swing.text.html.HTMLDocument$HTMLReader}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link HTMLReaderClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface HTMLReaderTests<SUT extends HTMLReader>
    extends ParserCallbackTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.HTMLReader#handleText(char[], int) public void
         * javax.swing.text.html.HTMLDocument$HTMLReader.handleText(char[],int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_handleText_charArray_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.HTMLReader#handleEndOfLineString(String) public void
         * javax.swing.text.html.HTMLDocument$HTMLReader.handleEndOfLineString(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.HTMLReader#flush() public void
         * javax.swing.text.html.HTMLDocument$HTMLReader.flush() throws javax.swing.text.BadLocationException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.HTMLReader#handleComment(char[], int) public void
         * javax.swing.text.html.HTMLDocument$HTMLReader.handleComment(char[],int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.HTMLReader#handleSimpleTag(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet, int)
         * public void
         * javax.swing.text.html.HTMLDocument$HTMLReader.handleSimpleTag(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.HTMLReader#handleEndTag(javax.swing.text.html.HTML.Tag, int) public
         * void javax.swing.text.html.HTMLDocument$HTMLReader.handleEndTag(javax.swing.text.html.HTML$Tag,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.HTMLReader#handleStartTag(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet, int)
         * public void
         * javax.swing.text.html.HTMLDocument$HTMLReader.handleStartTag(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_handleStartTag_Tag_MutableAttributeSet_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader]
        /**
         * <p>
         * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test
         * methods targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link BlockAction public class javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction}.
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit also provides a complementary test interface containing the class/type
         * relevant aspects (see {@link BlockActionClassTests}).
         * </p>
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         */

        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface BlockActionTests<SUT extends BlockAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.TagActionTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction]

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction#end(javax.swing.text.html.HTML.Tag)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction.end(javax.swing.text.html.HTML$Tag)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Override
            @Test
            @Category(Draft.class)
            public default void test_end_Tag()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Override
            @Test
            @Category(Draft.class)
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction]
        }

        /**
         * <p>
         * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test
         * methods targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link ParagraphAction public class javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction}.
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit also provides a complementary test interface containing the class/type
         * relevant aspects (see {@link ParagraphActionClassTests}).
         * </p>
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         */

        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface ParagraphActionTests<SUT extends ParagraphAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.BlockActionTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction]

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Override
            @Test
            @Category(Draft.class)
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction#end(javax.swing.text.html.HTML.Tag)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction.end(javax.swing.text.html.HTML$Tag)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Override
            @Test
            @Category(Draft.class)
            public default void test_end_Tag()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction]
        }

        /**
         * <p>
         * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test
         * methods targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link TagAction public class javax.swing.text.html.HTMLDocument$HTMLReader$TagAction}.
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit also provides a complementary test interface containing the class/type
         * relevant aspects (see {@link TagActionClassTests}).
         * </p>
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         */

        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface TagActionTests<SUT extends TagAction>
        extends ObjectTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$TagAction]

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.TagAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$TagAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.TagAction#end(javax.swing.text.html.HTML.Tag) public
             * void javax.swing.text.html.HTMLDocument$HTMLReader$TagAction.end(javax.swing.text.html.HTML$Tag)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public default void test_end_Tag()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$TagAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$TagAction]
        }

        /**
         * <p>
         * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test
         * methods targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link PreAction public class javax.swing.text.html.HTMLDocument$HTMLReader$PreAction}.
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit also provides a complementary test interface containing the class/type
         * relevant aspects (see {@link PreActionClassTests}).
         * </p>
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         */

        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface PreActionTests<SUT extends PreAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.BlockActionTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$PreAction]

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.PreAction#end(javax.swing.text.html.HTML.Tag) public
             * void javax.swing.text.html.HTMLDocument$HTMLReader$PreAction.end(javax.swing.text.html.HTML$Tag)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Override
            @Test
            @Category(Draft.class)
            public default void test_end_Tag()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.PreAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$PreAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Override
            @Test
            @Category(Draft.class)
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$PreAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$PreAction]
        }

        /**
         * <p>
         * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test
         * methods targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link IsindexAction public class javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction}.
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit also provides a complementary test interface containing the class/type
         * relevant aspects (see {@link IsindexActionClassTests}).
         * </p>
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         */

        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface IsindexActionTests<SUT extends IsindexAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.TagActionTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction]

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Override
            @Test
            @Category(Draft.class)
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction]
        }

        /**
         * <p>
         * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test
         * methods targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link SpecialAction public class javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction}.
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit also provides a complementary test interface containing the class/type
         * relevant aspects (see {@link SpecialActionClassTests}).
         * </p>
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         */

        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface SpecialActionTests<SUT extends SpecialAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.TagActionTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction]

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Override
            @Test
            @Category(Draft.class)
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction]
        }

        /**
         * <p>
         * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test
         * methods targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link HiddenAction public class javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction}.
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit also provides a complementary test interface containing the class/type
         * relevant aspects (see {@link HiddenActionClassTests}).
         * </p>
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         */

        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface HiddenActionTests<SUT extends HiddenAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.TagActionTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction]

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction#end(javax.swing.text.html.HTML.Tag)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction.end(javax.swing.text.html.HTML$Tag)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Override
            @Test
            @Category(Draft.class)
            public default void test_end_Tag()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Override
            @Test
            @Category(Draft.class)
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction]
        }

        /**
         * <p>
         * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test
         * methods targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link FormAction public class javax.swing.text.html.HTMLDocument$HTMLReader$FormAction}.
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit also provides a complementary test interface containing the class/type
         * relevant aspects (see {@link FormActionClassTests}).
         * </p>
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         */

        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface FormActionTests<SUT extends FormAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.SpecialActionTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$FormAction]

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.FormAction#end(javax.swing.text.html.HTML.Tag)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$FormAction.end(javax.swing.text.html.HTML$Tag)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Override
            @Test
            @Category(Draft.class)
            public default void test_end_Tag()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.FormAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$FormAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Override
            @Test
            @Category(Draft.class)
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$FormAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$FormAction]
        }

        /**
         * <p>
         * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test
         * methods targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link CharacterAction public class javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction}.
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit also provides a complementary test interface containing the class/type
         * relevant aspects (see {@link CharacterActionClassTests}).
         * </p>
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         */

        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface CharacterActionTests<SUT extends CharacterAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.TagActionTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction]

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction#end(javax.swing.text.html.HTML.Tag)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction.end(javax.swing.text.html.HTML$Tag)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Override
            @Test
            @Category(Draft.class)
            public default void test_end_Tag()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * <p>
             * Test method for the hereby targeted method-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Override
            @Test
            @Category(Draft.class)
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction]

            // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction]
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link BlockElement public class javax.swing.text.html.HTMLDocument$BlockElement}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link BlockElementClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BlockElementTests<SUT extends BlockElement>
    extends BranchElementTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$BlockElement]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.BlockElement#getResolveParent() public
         * javax.swing.text.AttributeSet javax.swing.text.html.HTMLDocument$BlockElement.getResolveParent()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getResolveParent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.BlockElement#getName() public java.lang.String
         * javax.swing.text.html.HTMLDocument$BlockElement.getName()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getName()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$BlockElement]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$BlockElement]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link RunElement
     * public class javax.swing.text.html.HTMLDocument$RunElement}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link RunElementClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RunElementTests<SUT extends RunElement>
    extends LeafElementTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$RunElement]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.RunElement#getName() public java.lang.String
         * javax.swing.text.html.HTMLDocument$RunElement.getName()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getName()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.RunElement#getResolveParent() public javax.swing.text.AttributeSet
         * javax.swing.text.html.HTMLDocument$RunElement.getResolveParent()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getResolveParent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$RunElement]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$RunElement]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Iterator
     * public abstract static class javax.swing.text.html.HTMLDocument$Iterator}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link IteratorClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface IteratorTests<SUT extends Iterator>
    extends ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$Iterator]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.Iterator#getTag() public abstract javax.swing.text.html.HTML$Tag
         * javax.swing.text.html.HTMLDocument$Iterator.getTag()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getTag()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.Iterator#getEndOffset() public abstract int
         * javax.swing.text.html.HTMLDocument$Iterator.getEndOffset()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getEndOffset()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.Iterator#next() public abstract void
         * javax.swing.text.html.HTMLDocument$Iterator.next()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_next()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.Iterator#getAttributes() public abstract
         * javax.swing.text.AttributeSet javax.swing.text.html.HTMLDocument$Iterator.getAttributes()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getAttributes()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.Iterator#getStartOffset() public abstract int
         * javax.swing.text.html.HTMLDocument$Iterator.getStartOffset()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getStartOffset()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.html.HTMLDocument.Iterator#isValid() public abstract boolean
         * javax.swing.text.html.HTMLDocument$Iterator.isValid()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_isValid()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$Iterator]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTMLDocument$Iterator]
    }

}
