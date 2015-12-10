package org.j8unit.repository.javax.swing.text.html;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.html.HTMLDocument class javax.swing.text.html.HTMLDocument}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HTMLDocumentClassTests<SUT extends javax.swing.text.html.HTMLDocument>
extends org.j8unit.repository.javax.swing.text.DefaultStyledDocumentClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTMLDocument$BlockElement class
     * javax.swing.text.html.HTMLDocument$BlockElement}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.BlockElementTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.BlockElementTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BlockElementClassTests<SUT extends javax.swing.text.html.HTMLDocument.BlockElement>
    extends org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.BranchElementClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.text.html.HTMLDocument.BlockElement#BlockElement(javax.swing.text.html.HTMLDocument,javax.swing.text.Element,javax.swing.text.AttributeSet)
         * public
         * javax.swing.text.html.HTMLDocument$BlockElement(javax.swing.text.html.HTMLDocument,javax.swing.text.Element,javax.swing.text.AttributeSet)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_BlockElement_HTMLDocument_Element_AttributeSet()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.html.HTMLDocument.BlockElement sut = null; // = new
                                                                              // BlockElement(javax.swing.text.html.HTMLDocument,javax.swing.text.Element,javax.swing.text.AttributeSet);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.html.HTMLDocument.BlockElement.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTMLDocument$HTMLReader class
     * javax.swing.text.html.HTMLDocument$HTMLReader}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface HTMLReaderClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader>
    extends org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.ParserCallbackClassTests<SUT> {

        /**
         * <p>
         * Test class for {@link javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction class
         * javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction}, containing all class relevant test methods (at
         * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart
         * test class containing the instance relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.BlockActionTests}.
         * </p>
         *
         * <p>
         * In addition, there may be assertions concerning the class itself. For example,
         * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS,
         * Sec.&thinsp;9.6.1</a> Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides
         * a corresponding, inheritable test method:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
         * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
         * runtime constraints and further class specific requirements.
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.BlockActionTests
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface BlockActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests<SUT> {

            /**
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction#BlockAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction(javax.swing.text.html.HTMLDocument$HTMLReader)}
             * .
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public default void create_BlockAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction sut = null; // = new
                                                                                            // BlockAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            @Override
            @Test
            public default void testBaseTypeIsAssignableFromCurrentType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue(javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Test class for {@link javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction class
         * javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction}, containing all class relevant test methods
         * (at least the test methods of accessible constructors and of accessible {@code static} methods). The
         * counterpart test class containing the instance relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.CharacterActionTests}.
         * </p>
         *
         * <p>
         * In addition, there may be assertions concerning the class itself. For example,
         * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS,
         * Sec.&thinsp;9.6.1</a> Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides
         * a corresponding, inheritable test method:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
         * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
         * runtime constraints and further class specific requirements.
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.CharacterActionTests
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface CharacterActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests<SUT> {

            /**
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction#CharacterAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction(javax.swing.text.html.HTMLDocument$HTMLReader)}
             * .
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public default void create_CharacterAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction sut = null; // = new
                                                                                                // CharacterAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            @Override
            @Test
            public default void testBaseTypeIsAssignableFromCurrentType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue(javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Test class for {@link javax.swing.text.html.HTMLDocument$HTMLReader$FormAction class
         * javax.swing.text.html.HTMLDocument$HTMLReader$FormAction}, containing all class relevant test methods (at
         * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart
         * test class containing the instance relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.FormActionTests}.
         * </p>
         *
         * <p>
         * In addition, there may be assertions concerning the class itself. For example,
         * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS,
         * Sec.&thinsp;9.6.1</a> Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides
         * a corresponding, inheritable test method:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
         * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
         * runtime constraints and further class specific requirements.
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.FormActionTests
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface FormActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.FormAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.SpecialActionClassTests<SUT> {

            /**
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.FormAction#FormAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$FormAction(javax.swing.text.html.HTMLDocument$HTMLReader)}.
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public default void create_FormAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final javax.swing.text.html.HTMLDocument.HTMLReader.FormAction sut = null; // = new
                                                                                           // FormAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            @Override
            @Test
            public default void testBaseTypeIsAssignableFromCurrentType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue(javax.swing.text.html.HTMLDocument.HTMLReader.FormAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Test class for {@link javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction class
         * javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction}, containing all class relevant test methods (at
         * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart
         * test class containing the instance relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.HiddenActionTests}.
         * </p>
         *
         * <p>
         * In addition, there may be assertions concerning the class itself. For example,
         * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS,
         * Sec.&thinsp;9.6.1</a> Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides
         * a corresponding, inheritable test method:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
         * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
         * runtime constraints and further class specific requirements.
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.HiddenActionTests
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface HiddenActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests<SUT> {

            /**
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction#HiddenAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction(javax.swing.text.html.HTMLDocument$HTMLReader)}
             * .
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public default void create_HiddenAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction sut = null; // = new
                                                                                             // HiddenAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            @Override
            @Test
            public default void testBaseTypeIsAssignableFromCurrentType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue(javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Test class for {@link javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction class
         * javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction}, containing all class relevant test methods (at
         * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart
         * test class containing the instance relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.IsindexActionTests}.
         * </p>
         *
         * <p>
         * In addition, there may be assertions concerning the class itself. For example,
         * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS,
         * Sec.&thinsp;9.6.1</a> Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides
         * a corresponding, inheritable test method:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
         * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
         * runtime constraints and further class specific requirements.
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.IsindexActionTests
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface IsindexActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests<SUT> {

            /**
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction#IsindexAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction(javax.swing.text.html.HTMLDocument$HTMLReader)}
             * .
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public default void create_IsindexAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction sut = null; // = new
                                                                                              // IsindexAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            @Override
            @Test
            public default void testBaseTypeIsAssignableFromCurrentType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue(javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Test class for {@link javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction class
         * javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction}, containing all class relevant test methods
         * (at least the test methods of accessible constructors and of accessible {@code static} methods). The
         * counterpart test class containing the instance relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.ParagraphActionTests}.
         * </p>
         *
         * <p>
         * In addition, there may be assertions concerning the class itself. For example,
         * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS,
         * Sec.&thinsp;9.6.1</a> Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides
         * a corresponding, inheritable test method:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
         * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
         * runtime constraints and further class specific requirements.
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.ParagraphActionTests
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface ParagraphActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.BlockActionClassTests<SUT> {

            /**
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction#ParagraphAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction(javax.swing.text.html.HTMLDocument$HTMLReader)}
             * .
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public default void create_ParagraphAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction sut = null; // = new
                                                                                                // ParagraphAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            @Override
            @Test
            public default void testBaseTypeIsAssignableFromCurrentType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue(javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Test class for {@link javax.swing.text.html.HTMLDocument$HTMLReader$PreAction class
         * javax.swing.text.html.HTMLDocument$HTMLReader$PreAction}, containing all class relevant test methods (at
         * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart
         * test class containing the instance relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.PreActionTests}.
         * </p>
         *
         * <p>
         * In addition, there may be assertions concerning the class itself. For example,
         * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS,
         * Sec.&thinsp;9.6.1</a> Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides
         * a corresponding, inheritable test method:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
         * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
         * runtime constraints and further class specific requirements.
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.PreActionTests
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface PreActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.PreAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.BlockActionClassTests<SUT> {

            /**
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.PreAction#PreAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$PreAction(javax.swing.text.html.HTMLDocument$HTMLReader)}.
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public default void create_PreAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final javax.swing.text.html.HTMLDocument.HTMLReader.PreAction sut = null; // = new
                                                                                          // PreAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            @Override
            @Test
            public default void testBaseTypeIsAssignableFromCurrentType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue(javax.swing.text.html.HTMLDocument.HTMLReader.PreAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Test class for {@link javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction class
         * javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction}, containing all class relevant test methods (at
         * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart
         * test class containing the instance relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.SpecialActionTests}.
         * </p>
         *
         * <p>
         * In addition, there may be assertions concerning the class itself. For example,
         * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS,
         * Sec.&thinsp;9.6.1</a> Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides
         * a corresponding, inheritable test method:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
         * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
         * runtime constraints and further class specific requirements.
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.SpecialActionTests
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface SpecialActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests<SUT> {

            /**
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction#SpecialAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction(javax.swing.text.html.HTMLDocument$HTMLReader)}
             * .
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public default void create_SpecialAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction sut = null; // = new
                                                                                              // SpecialAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            @Override
            @Test
            public default void testBaseTypeIsAssignableFromCurrentType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue(javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Test class for {@link javax.swing.text.html.HTMLDocument$HTMLReader$TagAction class
         * javax.swing.text.html.HTMLDocument$HTMLReader$TagAction}, containing all class relevant test methods (at
         * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart
         * test class containing the instance relevant test methods is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.TagActionTests}.
         * </p>
         *
         * <p>
         * In addition, there may be assertions concerning the class itself. For example,
         * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS,
         * Sec.&thinsp;9.6.1</a> Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides
         * a corresponding, inheritable test method:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
         * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
         * runtime constraints and further class specific requirements.
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.TagActionTests
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface TagActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.TagAction>
        extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

            /**
             * Test method for
             * {@link javax.swing.text.html.HTMLDocument.HTMLReader.TagAction#TagAction(javax.swing.text.html.HTMLDocument.HTMLReader)
             * public
             * javax.swing.text.html.HTMLDocument$HTMLReader$TagAction(javax.swing.text.html.HTMLDocument$HTMLReader)}.
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public default void create_TagAction_HTMLReader()
            throws Exception {
                // create new instance
                @SuppressWarnings("unused")
                final javax.swing.text.html.HTMLDocument.HTMLReader.TagAction sut = null; // = new
                                                                                          // TagAction(javax.swing.text.html.HTMLDocument.HTMLReader);
            }

            @Override
            @Test
            public default void testBaseTypeIsAssignableFromCurrentType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue(javax.swing.text.html.HTMLDocument.HTMLReader.TagAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * Test method for
         * {@link javax.swing.text.html.HTMLDocument.HTMLReader#HTMLReader(javax.swing.text.html.HTMLDocument,int)
         * public javax.swing.text.html.HTMLDocument$HTMLReader(javax.swing.text.html.HTMLDocument,int)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_HTMLReader_HTMLDocument_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.html.HTMLDocument.HTMLReader sut = null; // = new
                                                                            // HTMLReader(javax.swing.text.html.HTMLDocument,int);
        }

        /**
         * Test method for
         * {@link javax.swing.text.html.HTMLDocument.HTMLReader#HTMLReader(javax.swing.text.html.HTMLDocument,int,int,int,javax.swing.text.html.HTML.Tag)
         * public
         * javax.swing.text.html.HTMLDocument$HTMLReader(javax.swing.text.html.HTMLDocument,int,int,int,javax.swing.text.html.HTML$Tag)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_HTMLReader_HTMLDocument_int_int_int_Tag()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.html.HTMLDocument.HTMLReader sut = null; // = new
                                                                            // HTMLReader(javax.swing.text.html.HTMLDocument,int,int,int,javax.swing.text.html.HTML.Tag);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.html.HTMLDocument.HTMLReader.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTMLDocument$Iterator class
     * javax.swing.text.html.HTMLDocument$Iterator}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.IteratorTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.IteratorTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface IteratorClassTests<SUT extends javax.swing.text.html.HTMLDocument.Iterator>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.text.html.HTMLDocument.Iterator#Iterator() public
         * javax.swing.text.html.HTMLDocument$Iterator()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Iterator()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.html.HTMLDocument.Iterator sut = null; // = new Iterator();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.html.HTMLDocument.Iterator.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.HTMLDocument$RunElement class
     * javax.swing.text.html.HTMLDocument$RunElement}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.RunElementTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.RunElementTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RunElementClassTests<SUT extends javax.swing.text.html.HTMLDocument.RunElement>
    extends org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.LeafElementClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.text.html.HTMLDocument.RunElement#RunElement(javax.swing.text.html.HTMLDocument,javax.swing.text.Element,javax.swing.text.AttributeSet,int,int)
         * public
         * javax.swing.text.html.HTMLDocument$RunElement(javax.swing.text.html.HTMLDocument,javax.swing.text.Element,javax.swing.text.AttributeSet,int,int)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_RunElement_HTMLDocument_Element_AttributeSet_int_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.html.HTMLDocument.RunElement sut = null; // = new
                                                                            // RunElement(javax.swing.text.html.HTMLDocument,javax.swing.text.Element,javax.swing.text.AttributeSet,int,int);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.html.HTMLDocument.RunElement.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link javax.swing.text.html.HTMLDocument#HTMLDocument() public
     * javax.swing.text.html.HTMLDocument()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HTMLDocument()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.html.HTMLDocument sut = null; // = new HTMLDocument();
    }

    /**
     * Test method for
     * {@link javax.swing.text.html.HTMLDocument#HTMLDocument(javax.swing.text.AbstractDocument.Content,javax.swing.text.html.StyleSheet)
     * public
     * javax.swing.text.html.HTMLDocument(javax.swing.text.AbstractDocument$Content,javax.swing.text.html.StyleSheet)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HTMLDocument_Content_StyleSheet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.html.HTMLDocument sut = null; // = new
                                                             // HTMLDocument(javax.swing.text.AbstractDocument.Content,javax.swing.text.html.StyleSheet);
    }

    /**
     * Test method for {@link javax.swing.text.html.HTMLDocument#HTMLDocument(javax.swing.text.html.StyleSheet) public
     * javax.swing.text.html.HTMLDocument(javax.swing.text.html.StyleSheet)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HTMLDocument_StyleSheet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.html.HTMLDocument sut = null; // = new HTMLDocument(javax.swing.text.html.StyleSheet);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.html.HTMLDocument.class.isAssignableFrom(sut));
    }

}
