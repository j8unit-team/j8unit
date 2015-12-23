package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.HTMLDocument class
 * javax.swing.text.html.HTMLDocument}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.html.HTMLDocument
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HTMLDocumentTests<SUT extends javax.swing.text.html.HTMLDocument>
extends org.j8unit.repository.javax.swing.text.DefaultStyledDocumentTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.BlockElement class
     * javax.swing.text.html.HTMLDocument$BlockElement}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.BlockElementTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.BlockElementClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument.BlockElement
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BlockElementTests<SUT extends javax.swing.text.html.HTMLDocument.BlockElement>
    extends org.j8unit.repository.javax.swing.text.AbstractDocumentTests.BranchElementTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTMLDocument.BlockElement#getName() public java.lang.String
         * javax.swing.text.html.HTMLDocument$BlockElement.getName()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.BlockElement#getName()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getName()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTMLDocument.BlockElement#getResolveParent() public
         * javax.swing.text.AttributeSet javax.swing.text.html.HTMLDocument$BlockElement.getResolveParent()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.BlockElement#getResolveParent()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getResolveParent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader class
     * javax.swing.text.html.HTMLDocument$HTMLReader}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface HTMLReaderTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader>
    extends org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.ParserCallbackTests<SUT> {

        /**
         * <p>
         * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction
         * class javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction}, containing all instance relevant test
         * methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface
         * containing the class relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.BlockActionTests}.
         * </p>
         *
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.
         *      BlockActionClassTests
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface BlockActionTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.TagActionTests<SUT> {

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction#end(javax.swing.text.html.HTML.Tag)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction.end(javax.swing.text.html.HTML$Tag)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction#end(javax.swing.text.html.HTML.Tag)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            @Override
            public default void test_end_Tag()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}
             * .
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction#start(javax.swing.text.html.HTML.
             *             Tag, javax.swing.text.MutableAttributeSet)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            @Override
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

        }

        /**
         * <p>
         * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction
         * class javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction}, containing all instance relevant test
         * methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface
         * containing the class relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.CharacterActionTests}.
         * </p>
         *
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.
         *      CharacterActionClassTests
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface CharacterActionTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.TagActionTests<SUT> {

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction#end(javax.swing.text.html.HTML.Tag)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction.end(javax.swing.text.html.HTML$Tag)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction#end(javax.swing.text.html.HTML.
             *             Tag)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            @Override
            public default void test_end_Tag()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}
             * .
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction#start(javax.swing.text.html.
             *             HTML.Tag, javax.swing.text.MutableAttributeSet)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            @Override
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

        }

        /**
         * <p>
         * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.FormAction class
         * javax.swing.text.html.HTMLDocument$HTMLReader$FormAction}, containing all instance relevant test methods
         * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing
         * the class relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.FormActionTests}.
         * </p>
         *
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.
         *      FormActionClassTests
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.FormAction
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface FormActionTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.FormAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.SpecialActionTests<SUT> {

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.FormAction#end(javax.swing.text.html.HTML.Tag)
             * public void javax.swing.text.html.HTMLDocument$HTMLReader$FormAction.end(javax.swing.text.html.HTML$Tag)}
             * .
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.FormAction#end(javax.swing.text.html.HTML.Tag)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            @Override
            public default void test_end_Tag()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.FormAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$FormAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}
             * .
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.FormAction#start(javax.swing.text.html.HTML.
             *             Tag, javax.swing.text.MutableAttributeSet)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            @Override
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

        }

        /**
         * <p>
         * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction
         * class javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction}, containing all instance relevant test
         * methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface
         * containing the class relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.HiddenActionTests}.
         * </p>
         *
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.
         *      HiddenActionClassTests
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface HiddenActionTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.TagActionTests<SUT> {

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction#end(javax.swing.text.html.HTML.Tag)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction.end(javax.swing.text.html.HTML$Tag)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction#end(javax.swing.text.html.HTML.
             *             Tag)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            @Override
            public default void test_end_Tag()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}
             * .
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction#start(javax.swing.text.html.HTML.
             *             Tag, javax.swing.text.MutableAttributeSet)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            @Override
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

        }

        /**
         * <p>
         * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction
         * class javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction}, containing all instance relevant test
         * methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface
         * containing the class relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.IsindexActionTests}.
         * </p>
         *
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.
         *      IsindexActionClassTests
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface IsindexActionTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.TagActionTests<SUT> {

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}
             * .
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction#start(javax.swing.text.html.HTML.
             *             Tag, javax.swing.text.MutableAttributeSet)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            @Override
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

        }

        /**
         * <p>
         * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction
         * class javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction}, containing all instance relevant test
         * methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface
         * containing the class relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.ParagraphActionTests}.
         * </p>
         *
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.
         *      ParagraphActionClassTests
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface ParagraphActionTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.BlockActionTests<SUT> {

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction#end(javax.swing.text.html.HTML.Tag)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction.end(javax.swing.text.html.HTML$Tag)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction#end(javax.swing.text.html.HTML.
             *             Tag)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            @Override
            public default void test_end_Tag()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}
             * .
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction#start(javax.swing.text.html.
             *             HTML.Tag, javax.swing.text.MutableAttributeSet)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            @Override
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

        }

        /**
         * <p>
         * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.PreAction class
         * javax.swing.text.html.HTMLDocument$HTMLReader$PreAction}, containing all instance relevant test methods
         * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing
         * the class relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.PreActionTests}.
         * </p>
         *
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.
         *      PreActionClassTests
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.PreAction
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface PreActionTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.PreAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.BlockActionTests<SUT> {

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.PreAction#end(javax.swing.text.html.HTML.Tag) public
             * void javax.swing.text.html.HTMLDocument$HTMLReader$PreAction.end(javax.swing.text.html.HTML$Tag)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.PreAction#end(javax.swing.text.html.HTML.Tag)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            @Override
            public default void test_end_Tag()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.PreAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$PreAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}
             * .
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.PreAction#start(javax.swing.text.html.HTML.Tag,
             *             javax.swing.text.MutableAttributeSet)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            @Override
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

        }

        /**
         * <p>
         * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction
         * class javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction}, containing all instance relevant test
         * methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface
         * containing the class relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.SpecialActionTests}.
         * </p>
         *
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.
         *      SpecialActionClassTests
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface SpecialActionTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.TagActionTests<SUT> {

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}
             * .
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction#start(javax.swing.text.html.HTML.
             *             Tag, javax.swing.text.MutableAttributeSet)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            @Override
            public default void test_start_Tag_MutableAttributeSet()
            throws Exception {
                // query fresh subject-under-test
                final SUT sut = this.createNewSUT();
                assert sut != null;
            }

        }

        /**
         * <p>
         * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.TagAction class
         * javax.swing.text.html.HTMLDocument$HTMLReader$TagAction}, containing all instance relevant test methods
         * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing
         * the class relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.TagActionTests}.
         * </p>
         *
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.
         *      TagActionClassTests
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.TagAction
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface TagActionTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.TagAction>
        extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.TagAction#end(javax.swing.text.html.HTML.Tag) public
             * void javax.swing.text.html.HTMLDocument$HTMLReader$TagAction.end(javax.swing.text.html.HTML$Tag)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.TagAction#end(javax.swing.text.html.HTML.Tag)
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

            /**
             * <p>
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.TagAction#start(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
             * public void
             * javax.swing.text.html.HTMLDocument$HTMLReader$TagAction.start(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet)}
             * .
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader.TagAction#start(javax.swing.text.html.HTML.Tag,
             *             javax.swing.text.MutableAttributeSet)
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

        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTMLDocument.HTMLReader#flush() public void
         * javax.swing.text.html.HTMLDocument$HTMLReader.flush() throws javax.swing.text.BadLocationException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader#flush()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_flush()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTMLDocument.HTMLReader#handleComment(char[], int) public void
         * javax.swing.text.html.HTMLDocument$HTMLReader.handleComment(char[],int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader#handleComment(char[], int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_handleComment_charArray_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTMLDocument.HTMLReader#handleEndOfLineString(java.lang.String)
         * public void javax.swing.text.html.HTMLDocument$HTMLReader.handleEndOfLineString(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader#handleEndOfLineString(java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_handleEndOfLineString_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.html.HTMLDocument.HTMLReader#handleEndTag(javax.swing.text.html.HTML.Tag, int) public
         * void javax.swing.text.html.HTMLDocument$HTMLReader.handleEndTag(javax.swing.text.html.HTML$Tag,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader#handleEndTag(javax.swing.text.html.HTML.Tag, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_handleEndTag_Tag_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.html.HTMLDocument.HTMLReader#handleSimpleTag(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet, int)
         * public void
         * javax.swing.text.html.HTMLDocument$HTMLReader.handleSimpleTag(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader#handleSimpleTag(javax.swing.text.html.HTML.Tag,
         *             javax.swing.text.MutableAttributeSet, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_handleSimpleTag_Tag_MutableAttributeSet_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.html.HTMLDocument.HTMLReader#handleStartTag(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet, int)
         * public void
         * javax.swing.text.html.HTMLDocument$HTMLReader.handleStartTag(javax.swing.text.html.HTML$Tag,javax.swing.text.MutableAttributeSet,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader#handleStartTag(javax.swing.text.html.HTML.Tag,
         *             javax.swing.text.MutableAttributeSet, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_handleStartTag_Tag_MutableAttributeSet_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTMLDocument.HTMLReader#handleText(char[], int) public void
         * javax.swing.text.html.HTMLDocument$HTMLReader.handleText(char[],int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.HTMLReader#handleText(char[], int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_handleText_charArray_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.Iterator class
     * javax.swing.text.html.HTMLDocument$Iterator}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.IteratorTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.IteratorClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument.Iterator
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface IteratorTests<SUT extends javax.swing.text.html.HTMLDocument.Iterator>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTMLDocument.Iterator#getAttributes() public abstract
         * javax.swing.text.AttributeSet javax.swing.text.html.HTMLDocument$Iterator.getAttributes()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.Iterator#getAttributes()
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
         * Test method for {@link javax.swing.text.html.HTMLDocument.Iterator#getEndOffset() public abstract int
         * javax.swing.text.html.HTMLDocument$Iterator.getEndOffset()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.Iterator#getEndOffset()
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
         * Test method for {@link javax.swing.text.html.HTMLDocument.Iterator#getStartOffset() public abstract int
         * javax.swing.text.html.HTMLDocument$Iterator.getStartOffset()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.Iterator#getStartOffset()
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
         * Test method for {@link javax.swing.text.html.HTMLDocument.Iterator#getTag() public abstract
         * javax.swing.text.html.HTML$Tag javax.swing.text.html.HTMLDocument$Iterator.getTag()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.Iterator#getTag()
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
         * Test method for {@link javax.swing.text.html.HTMLDocument.Iterator#isValid() public abstract boolean
         * javax.swing.text.html.HTMLDocument$Iterator.isValid()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.Iterator#isValid()
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

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTMLDocument.Iterator#next() public abstract void
         * javax.swing.text.html.HTMLDocument$Iterator.next()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.Iterator#next()
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

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.RunElement class
     * javax.swing.text.html.HTMLDocument$RunElement}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.RunElementTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.RunElementClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument.RunElement
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RunElementTests<SUT extends javax.swing.text.html.HTMLDocument.RunElement>
    extends org.j8unit.repository.javax.swing.text.AbstractDocumentTests.LeafElementTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTMLDocument.RunElement#getName() public java.lang.String
         * javax.swing.text.html.HTMLDocument$RunElement.getName()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.RunElement#getName()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getName()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.text.html.HTMLDocument.RunElement#getResolveParent() public
         * javax.swing.text.AttributeSet javax.swing.text.html.HTMLDocument$RunElement.getResolveParent()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.html.HTMLDocument.RunElement#getResolveParent()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getResolveParent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLDocument#getBase() public java.net.URL
     * javax.swing.text.html.HTMLDocument.getBase()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#getBase()
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
     * Test method for
     * {@link javax.swing.text.html.HTMLDocument#getElement(javax.swing.text.Element, java.lang.Object, java.lang.Object)
     * public javax.swing.text.Element
     * javax.swing.text.html.HTMLDocument.getElement(javax.swing.text.Element,java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#getElement(javax.swing.text.Element, java.lang.Object,
     *             java.lang.Object)
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
     * Test method for {@link javax.swing.text.html.HTMLDocument#getElement(java.lang.String) public
     * javax.swing.text.Element javax.swing.text.html.HTMLDocument.getElement(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#getElement(java.lang.String)
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
     * Test method for {@link javax.swing.text.html.HTMLDocument#getIterator(javax.swing.text.html.HTML.Tag) public
     * javax.swing.text.html.HTMLDocument$Iterator
     * javax.swing.text.html.HTMLDocument.getIterator(javax.swing.text.html.HTML$Tag)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#getIterator(javax.swing.text.html.HTML.Tag)
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
     * Test method for {@link javax.swing.text.html.HTMLDocument#getParser() public
     * javax.swing.text.html.HTMLEditorKit$Parser javax.swing.text.html.HTMLDocument.getParser()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#getParser()
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
     * Test method for {@link javax.swing.text.html.HTMLDocument#getPreservesUnknownTags() public boolean
     * javax.swing.text.html.HTMLDocument.getPreservesUnknownTags()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#getPreservesUnknownTags()
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
     * Test method for {@link javax.swing.text.html.HTMLDocument#getReader(int) public
     * javax.swing.text.html.HTMLEditorKit$ParserCallback javax.swing.text.html.HTMLDocument.getReader(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#getReader(int)
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
     * Test method for
     * {@link javax.swing.text.html.HTMLDocument#getReader(int, int, int, javax.swing.text.html.HTML.Tag) public
     * javax.swing.text.html.HTMLEditorKit$ParserCallback
     * javax.swing.text.html.HTMLDocument.getReader(int,int,int,javax.swing.text.html.HTML$Tag)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#getReader(int, int, int, javax.swing.text.html.HTML.Tag)
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
     * Test method for {@link javax.swing.text.html.HTMLDocument#getStyleSheet() public javax.swing.text.html.StyleSheet
     * javax.swing.text.html.HTMLDocument.getStyleSheet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#getStyleSheet()
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
     * Test method for {@link javax.swing.text.html.HTMLDocument#getTokenThreshold() public int
     * javax.swing.text.html.HTMLDocument.getTokenThreshold()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#getTokenThreshold()
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
     * Test method for
     * {@link javax.swing.text.html.HTMLDocument#insertAfterEnd(javax.swing.text.Element, java.lang.String) public void
     * javax.swing.text.html.HTMLDocument.insertAfterEnd(javax.swing.text.Element,java.lang.String) throws
     * javax.swing.text.BadLocationException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#insertAfterEnd(javax.swing.text.Element, java.lang.String)
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
     * Test method for
     * {@link javax.swing.text.html.HTMLDocument#insertAfterStart(javax.swing.text.Element, java.lang.String) public
     * void javax.swing.text.html.HTMLDocument.insertAfterStart(javax.swing.text.Element,java.lang.String) throws
     * javax.swing.text.BadLocationException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#insertAfterStart(javax.swing.text.Element, java.lang.String)
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
     * Test method for
     * {@link javax.swing.text.html.HTMLDocument#insertBeforeEnd(javax.swing.text.Element, java.lang.String) public void
     * javax.swing.text.html.HTMLDocument.insertBeforeEnd(javax.swing.text.Element,java.lang.String) throws
     * javax.swing.text.BadLocationException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#insertBeforeEnd(javax.swing.text.Element, java.lang.String)
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
     * Test method for
     * {@link javax.swing.text.html.HTMLDocument#insertBeforeStart(javax.swing.text.Element, java.lang.String) public
     * void javax.swing.text.html.HTMLDocument.insertBeforeStart(javax.swing.text.Element,java.lang.String) throws
     * javax.swing.text.BadLocationException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#insertBeforeStart(javax.swing.text.Element, java.lang.String)
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
     * Test method for
     * {@link javax.swing.text.html.HTMLDocument#processHTMLFrameHyperlinkEvent(javax.swing.text.html.HTMLFrameHyperlinkEvent)
     * public void
     * javax.swing.text.html.HTMLDocument.processHTMLFrameHyperlinkEvent(javax.swing.text.html.HTMLFrameHyperlinkEvent)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#processHTMLFrameHyperlinkEvent(javax.swing.text.html.
     *             HTMLFrameHyperlinkEvent)
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
     * Test method for {@link javax.swing.text.html.HTMLDocument#setBase(java.net.URL) public void
     * javax.swing.text.html.HTMLDocument.setBase(java.net.URL)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#setBase(java.net.URL)
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
     * Test method for
     * {@link javax.swing.text.html.HTMLDocument#setInnerHTML(javax.swing.text.Element, java.lang.String) public void
     * javax.swing.text.html.HTMLDocument.setInnerHTML(javax.swing.text.Element,java.lang.String) throws
     * javax.swing.text.BadLocationException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#setInnerHTML(javax.swing.text.Element, java.lang.String)
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
     * Test method for
     * {@link javax.swing.text.html.HTMLDocument#setOuterHTML(javax.swing.text.Element, java.lang.String) public void
     * javax.swing.text.html.HTMLDocument.setOuterHTML(javax.swing.text.Element,java.lang.String) throws
     * javax.swing.text.BadLocationException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#setOuterHTML(javax.swing.text.Element, java.lang.String)
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
     * Test method for
     * {@link javax.swing.text.html.HTMLDocument#setParagraphAttributes(int, int, javax.swing.text.AttributeSet, boolean)
     * public void
     * javax.swing.text.html.HTMLDocument.setParagraphAttributes(int,int,javax.swing.text.AttributeSet,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#setParagraphAttributes(int, int, javax.swing.text.AttributeSet,
     *             boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setParagraphAttributes_int_int_AttributeSet_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLDocument#setParser(javax.swing.text.html.HTMLEditorKit.Parser)
     * public void javax.swing.text.html.HTMLDocument.setParser(javax.swing.text.html.HTMLEditorKit$Parser)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#setParser(javax.swing.text.html.HTMLEditorKit.Parser)
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
     * Test method for {@link javax.swing.text.html.HTMLDocument#setPreservesUnknownTags(boolean) public void
     * javax.swing.text.html.HTMLDocument.setPreservesUnknownTags(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#setPreservesUnknownTags(boolean)
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
     * Test method for {@link javax.swing.text.html.HTMLDocument#setTokenThreshold(int) public void
     * javax.swing.text.html.HTMLDocument.setTokenThreshold(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.HTMLDocument#setTokenThreshold(int)
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

}
