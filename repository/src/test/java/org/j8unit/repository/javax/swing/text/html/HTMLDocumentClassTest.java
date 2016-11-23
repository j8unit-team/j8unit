package org.j8unit.repository.javax.swing.text.html;

import static org.junit.Assert.fail;
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
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLDocument} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLDocumentClassTest
implements HTMLDocumentClassTests<HTMLDocument> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument]

    @Override
    public Class<HTMLDocument> createNewSUT() {
        return HTMLDocument.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.html.HTMLDocument#HTMLDocument(javax.swing.text.html.StyleSheet) public
     * javax.swing.text.html.HTMLDocument(javax.swing.text.html.StyleSheet)}.
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
    public void create_HTMLDocument_StyleSheet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final HTMLDocument sut = null; // = new HTMLDocument(javax.swing.text.html.StyleSheet);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.html.HTMLDocument#HTMLDocument() public javax.swing.text.html.HTMLDocument()}.
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
    public void create_HTMLDocument()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final HTMLDocument sut = new HTMLDocument();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.html.HTMLDocument#HTMLDocument(javax.swing.text.AbstractDocument.Content, javax.swing.text.html.StyleSheet)
     * public
     * javax.swing.text.html.HTMLDocument(javax.swing.text.AbstractDocument$Content,javax.swing.text.html.StyleSheet)}.
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
    public void create_HTMLDocument_Content_StyleSheet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final HTMLDocument sut = null; // = new HTMLDocument(javax.swing.text.AbstractDocument.Content,
                                       // javax.swing.text.html.StyleSheet);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link RunElement} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.RunElementClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class RunElementClassTest
    implements RunElementClassTests<RunElement> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$RunElement]

        @Override
        public Class<RunElement> createNewSUT() {
            return RunElement.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.html.HTMLDocument.RunElement#RunElement(javax.swing.text.html.HTMLDocument, javax.swing.text.Element, javax.swing.text.AttributeSet, int, int)
         * public
         * javax.swing.text.html.HTMLDocument$RunElement(javax.swing.text.html.HTMLDocument,javax.swing.text.Element,javax.swing.text.AttributeSet,int,int)}.
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
        public void create_RunElement_HTMLDocument_Element_AttributeSet_int_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final RunElement sut = null; // = new RunElement(javax.swing.text.html.HTMLDocument,
                                         // javax.swing.text.Element, javax.swing.text.AttributeSet, int, int);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$RunElement]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$RunElement]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLReader} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class HTMLReaderClassTest
    implements HTMLReaderClassTests<HTMLReader> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader]

        @Override
        public Class<HTMLReader> createNewSUT() {
            return HTMLReader.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.html.HTMLDocument.HTMLReader#HTMLReader(javax.swing.text.html.HTMLDocument, int, int, int, javax.swing.text.html.HTML.Tag)
         * public
         * javax.swing.text.html.HTMLDocument$HTMLReader(javax.swing.text.html.HTMLDocument,int,int,int,javax.swing.text.html.HTML$Tag)}.
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
        public void create_HTMLReader_HTMLDocument_int_int_int_Tag()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final HTMLReader sut = null; // = new HTMLReader(javax.swing.text.html.HTMLDocument, int, int, int,
                                         // javax.swing.text.html.HTML.Tag);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.html.HTMLDocument.HTMLReader#HTMLReader(javax.swing.text.html.HTMLDocument, int)
         * public javax.swing.text.html.HTMLDocument$HTMLReader(javax.swing.text.html.HTMLDocument,int)}.
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
        public void create_HTMLReader_HTMLDocument_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final HTMLReader sut = null; // = new HTMLReader(javax.swing.text.html.HTMLDocument, int);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader]

        /**
         * Specific JUnit test class to proof the type relevant aspects of type {@link SpecialAction} (by simply reusing
         * the J8Unit test interface
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.SpecialActionClassTests}).
         */

        @RunWith(J8Unit4.class)
        public static class SpecialActionClassTest
        implements SpecialActionClassTests<SpecialAction> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction]

            @Override
            public Class<SpecialAction> createNewSUT() {
                return SpecialAction.class;
            }

            /**
             * <p>
             * Test method for the hereby targeted constructor-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction#SpecialAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction(javax.swing.text.html.HTMLDocument$HTMLReader)}.
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
            public void create_SpecialAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final SpecialAction sut = null; // = new SpecialAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction]

        }

        /**
         * Specific JUnit test class to proof the type relevant aspects of type {@link IsindexAction} (by simply reusing
         * the J8Unit test interface
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.IsindexActionClassTests}).
         */

        @RunWith(J8Unit4.class)
        public static class IsindexActionClassTest
        implements IsindexActionClassTests<IsindexAction> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction]

            @Override
            public Class<IsindexAction> createNewSUT() {
                return IsindexAction.class;
            }

            /**
             * <p>
             * Test method for the hereby targeted constructor-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction#IsindexAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction(javax.swing.text.html.HTMLDocument$HTMLReader)}.
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
            public void create_IsindexAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final IsindexAction sut = null; // = new IsindexAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction]

        }

        /**
         * Specific JUnit test class to proof the type relevant aspects of type {@link TagAction} (by simply reusing the
         * J8Unit test interface
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests}).
         */

        @RunWith(J8Unit4.class)
        public static class TagActionClassTest
        implements TagActionClassTests<TagAction> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$TagAction]

            @Override
            public Class<TagAction> createNewSUT() {
                return TagAction.class;
            }

            /**
             * <p>
             * Test method for the hereby targeted constructor-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.TagAction#TagAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$TagAction(javax.swing.text.html.HTMLDocument$HTMLReader)}.
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
            public void create_TagAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final TagAction sut = null; // = new TagAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$TagAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$TagAction]

        }

        /**
         * Specific JUnit test class to proof the type relevant aspects of type {@link PreAction} (by simply reusing the
         * J8Unit test interface
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.PreActionClassTests}).
         */

        @RunWith(J8Unit4.class)
        public static class PreActionClassTest
        implements PreActionClassTests<PreAction> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$PreAction]

            @Override
            public Class<PreAction> createNewSUT() {
                return PreAction.class;
            }

            /**
             * <p>
             * Test method for the hereby targeted constructor-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.PreAction#PreAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$PreAction(javax.swing.text.html.HTMLDocument$HTMLReader)}.
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
            public void create_PreAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final PreAction sut = null; // = new PreAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$PreAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$PreAction]

        }

        /**
         * Specific JUnit test class to proof the type relevant aspects of type {@link HiddenAction} (by simply reusing
         * the J8Unit test interface
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.HiddenActionClassTests}).
         */

        @RunWith(J8Unit4.class)
        public static class HiddenActionClassTest
        implements HiddenActionClassTests<HiddenAction> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction]

            @Override
            public Class<HiddenAction> createNewSUT() {
                return HiddenAction.class;
            }

            /**
             * <p>
             * Test method for the hereby targeted constructor-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction#HiddenAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction(javax.swing.text.html.HTMLDocument$HTMLReader)}.
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
            public void create_HiddenAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final HiddenAction sut = null; // = new HiddenAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction]

        }

        /**
         * Specific JUnit test class to proof the type relevant aspects of type {@link BlockAction} (by simply reusing
         * the J8Unit test interface
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.BlockActionClassTests}).
         */

        @RunWith(J8Unit4.class)
        public static class BlockActionClassTest
        implements BlockActionClassTests<BlockAction> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction]

            @Override
            public Class<BlockAction> createNewSUT() {
                return BlockAction.class;
            }

            /**
             * <p>
             * Test method for the hereby targeted constructor-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction#BlockAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction(javax.swing.text.html.HTMLDocument$HTMLReader)}.
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
            public void create_BlockAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final BlockAction sut = null; // = new BlockAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction]

        }

        /**
         * Specific JUnit test class to proof the type relevant aspects of type {@link FormAction} (by simply reusing
         * the J8Unit test interface
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.FormActionClassTests}).
         */

        @RunWith(J8Unit4.class)
        public static class FormActionClassTest
        implements FormActionClassTests<FormAction> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$FormAction]

            @Override
            public Class<FormAction> createNewSUT() {
                return FormAction.class;
            }

            /**
             * <p>
             * Test method for the hereby targeted constructor-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.FormAction#FormAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$FormAction(javax.swing.text.html.HTMLDocument$HTMLReader)}.
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
            public void create_FormAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final FormAction sut = null; // = new FormAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$FormAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$FormAction]

        }

        /**
         * Specific JUnit test class to proof the type relevant aspects of type {@link CharacterAction} (by simply
         * reusing the J8Unit test interface
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.CharacterActionClassTests}).
         */

        @RunWith(J8Unit4.class)
        public static class CharacterActionClassTest
        implements CharacterActionClassTests<CharacterAction> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction]

            @Override
            public Class<CharacterAction> createNewSUT() {
                return CharacterAction.class;
            }

            /**
             * <p>
             * Test method for the hereby targeted constructor-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction#CharacterAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction(javax.swing.text.html.HTMLDocument$HTMLReader)}.
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
            public void create_CharacterAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final CharacterAction sut = null; // = new
                                                  // CharacterAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction]

        }

        /**
         * Specific JUnit test class to proof the type relevant aspects of type {@link ParagraphAction} (by simply
         * reusing the J8Unit test interface
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.ParagraphActionClassTests}).
         */

        @RunWith(J8Unit4.class)
        public static class ParagraphActionClassTest
        implements ParagraphActionClassTests<ParagraphAction> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction]

            @Override
            public Class<ParagraphAction> createNewSUT() {
                return ParagraphAction.class;
            }

            /**
             * <p>
             * Test method for the hereby targeted constructor-under-test
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction#ParagraphAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction(javax.swing.text.html.HTMLDocument$HTMLReader)}.
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
            public void create_ParagraphAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final ParagraphAction sut = null; // = new
                                                  // ParagraphAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction]

        }

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link BlockElement} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.BlockElementClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class BlockElementClassTest
    implements BlockElementClassTests<BlockElement> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$BlockElement]

        @Override
        public Class<BlockElement> createNewSUT() {
            return BlockElement.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.html.HTMLDocument.BlockElement#BlockElement(javax.swing.text.html.HTMLDocument, javax.swing.text.Element, javax.swing.text.AttributeSet)
         * public
         * javax.swing.text.html.HTMLDocument$BlockElement(javax.swing.text.html.HTMLDocument,javax.swing.text.Element,javax.swing.text.AttributeSet)}.
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
        public void create_BlockElement_HTMLDocument_Element_AttributeSet()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final BlockElement sut = null; // = new BlockElement(javax.swing.text.html.HTMLDocument,
                                           // javax.swing.text.Element, javax.swing.text.AttributeSet);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$BlockElement]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$BlockElement]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Iterator} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.IteratorClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class IteratorClassTest
    implements IteratorClassTests<Iterator> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$Iterator]

        @Override
        public Class<Iterator> createNewSUT() {
            return Iterator.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.html.HTMLDocument.Iterator#Iterator() public
         * javax.swing.text.html.HTMLDocument$Iterator()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("Cannot construct an abstract class!")
        @Test
        @Category(Draft.class)
        public void create_Iterator()
        throws Exception {
            fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$Iterator]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$Iterator]

    }

}
