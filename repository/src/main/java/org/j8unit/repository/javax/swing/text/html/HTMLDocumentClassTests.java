package org.j8unit.repository.javax.swing.text.html;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface for {@linkplain javax.swing.text.html.HTMLDocument class
 * javax.swing.text.html.HTMLDocument}, containing all type relevant aspects (e.&thinsp;g., runtime constraints and
 * further type specific requirements). (In addition, the runtime type of this j8unit test interface's generic type is
 * verified by {@link #verifyGenericType()}).
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
 * complementarySetup test interface containing the instance relevant aspects (see {@link HTMLDocumentTests}).
 * </p>
 *
 * <p>
 * <strong>What? Testing the class itself? What is it good for?</strong>
 * </p>
 *
 * <p>
 * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides corresponding, reusable test
 * methods:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()},
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()},
 * and {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}.
 * </p>
 *
 * <p>
 * The complementary j8unit test interface containing the instance relevant aspects is {@link HTMLDocumentTests}.
 * </p>
 *
 * @see javax.swing.text.html.HTMLDocument class javax.swing.text.html.HTMLDocument (the hereby targeted
 *      class-under-test class)
 * @see HTMLDocumentTests HTMLDocumentTests (The complementary j8unit test interface containing the instance relevant
 *      test methods)
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HTMLDocumentClassTests<SUT extends javax.swing.text.html.HTMLDocument>
extends org.j8unit.repository.javax.swing.text.DefaultStyledDocumentClassTests<SUT> {

    /**
     * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class) (the
     *      hereby targeted method-under-test)
     *
     * @since 0.9.2
     */
    @Override
    @BeforeClass
    public default void verifyGenericType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.html.HTMLDocument.class!",
                   javax.swing.text.html.HTMLDocument.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.RunElement class
     * javax.swing.text.html.HTMLDocument$RunElement}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link HTMLDocumentTests.RunElementTests}).
     * </p>
     *
     * <p>
     * <strong>What? Testing the class itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides corresponding, reusable
     * test methods:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
     * ,
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
     * , and
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}.
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link HTMLDocumentTests.RunElementTests}.
     * </p>
     *
     * @see javax.swing.text.html.HTMLDocument.RunElement class javax.swing.text.html.HTMLDocument$RunElement (the
     *      hereby targeted class-under-test class)
     * @see HTMLDocumentTests.RunElementTests HTMLDocumentTests.RunElementTests (The complementary j8unit test interface
     *      containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RunElementClassTests<SUT extends javax.swing.text.html.HTMLDocument.RunElement>
    extends org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.LeafElementClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.html.HTMLDocument.RunElement.class!",
                       javax.swing.text.html.HTMLDocument.RunElement.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader class
     * javax.swing.text.html.HTMLDocument$HTMLReader}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link HTMLDocumentTests.HTMLReaderTests}).
     * </p>
     *
     * <p>
     * <strong>What? Testing the class itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides corresponding, reusable
     * test methods:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
     * ,
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
     * , and
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}.
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link HTMLDocumentTests.HTMLReaderTests}.
     * </p>
     *
     * @see javax.swing.text.html.HTMLDocument.HTMLReader class javax.swing.text.html.HTMLDocument$HTMLReader (the
     *      hereby targeted class-under-test class)
     * @see HTMLDocumentTests.HTMLReaderTests HTMLDocumentTests.HTMLReaderTests (The complementary j8unit test interface
     *      containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface HTMLReaderClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader>
    extends HTMLEditorKitClassTests.ParserCallbackClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.html.HTMLDocument.HTMLReader.class!",
                       javax.swing.text.html.HTMLDocument.HTMLReader.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Reusable j8unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction
         * class javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction}, containing all type relevant aspects
         * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
         * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit provides this reusable test interface covering type relevant aspects as
         * well as a complementarySetup test interface containing the instance relevant aspects (see
         * {@link HTMLDocumentTests.HTMLReaderTests.SpecialActionTests}).
         * </p>
         *
         * <p>
         * <strong>What? Testing the class itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For
         * example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS,
         * Sec.&thinsp;9.6.1</a>). Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
         * provides corresponding, reusable test methods:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
         * ,
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
         * , and
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}
         * .
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link HTMLDocumentTests.HTMLReaderTests.SpecialActionTests}.
         * </p>
         *
         * @see javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction class
         *      javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction (the hereby targeted class-under-test class)
         * @see HTMLDocumentTests.HTMLReaderTests.SpecialActionTests
         *      HTMLDocumentTests.HTMLReaderTests.SpecialActionTests (The complementary j8unit test interface containing
         *      the instance relevant test methods)
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface SpecialActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction>
        extends HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests<SUT> {

            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @BeforeClass
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction.class!",
                           javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Reusable j8unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction
         * class javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction}, containing all type relevant aspects
         * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
         * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit provides this reusable test interface covering type relevant aspects as
         * well as a complementarySetup test interface containing the instance relevant aspects (see
         * {@link HTMLDocumentTests.HTMLReaderTests.CharacterActionTests}).
         * </p>
         *
         * <p>
         * <strong>What? Testing the class itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For
         * example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS,
         * Sec.&thinsp;9.6.1</a>). Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
         * provides corresponding, reusable test methods:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
         * ,
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
         * , and
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}
         * .
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link HTMLDocumentTests.HTMLReaderTests.CharacterActionTests}.
         * </p>
         *
         * @see javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction class
         *      javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction (the hereby targeted class-under-test
         *      class)
         * @see HTMLDocumentTests.HTMLReaderTests.CharacterActionTests
         *      HTMLDocumentTests.HTMLReaderTests.CharacterActionTests (The complementary j8unit test interface
         *      containing the instance relevant test methods)
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface CharacterActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction>
        extends HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests<SUT> {

            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @BeforeClass
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction.class!",
                           javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Reusable j8unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.TagAction class
         * javax.swing.text.html.HTMLDocument$HTMLReader$TagAction}, containing all type relevant aspects (e.&thinsp;g.,
         * runtime constraints and further type specific requirements). (In addition, the runtime type of this j8unit
         * test interface's generic type is verified by {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit provides this reusable test interface covering type relevant aspects as
         * well as a complementarySetup test interface containing the instance relevant aspects (see
         * {@link HTMLDocumentTests.HTMLReaderTests.TagActionTests}).
         * </p>
         *
         * <p>
         * <strong>What? Testing the class itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For
         * example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS,
         * Sec.&thinsp;9.6.1</a>). Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
         * provides corresponding, reusable test methods:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
         * ,
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
         * , and
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}
         * .
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link HTMLDocumentTests.HTMLReaderTests.TagActionTests}.
         * </p>
         *
         * @see javax.swing.text.html.HTMLDocument.HTMLReader.TagAction class
         *      javax.swing.text.html.HTMLDocument$HTMLReader$TagAction (the hereby targeted class-under-test class)
         * @see HTMLDocumentTests.HTMLReaderTests.TagActionTests HTMLDocumentTests.HTMLReaderTests.TagActionTests (The
         *      complementary j8unit test interface containing the instance relevant test methods)
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface TagActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.TagAction>
        extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @BeforeClass
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.html.HTMLDocument.HTMLReader.TagAction.class!",
                           javax.swing.text.html.HTMLDocument.HTMLReader.TagAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Reusable j8unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction
         * class javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction}, containing all type relevant aspects
         * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
         * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit provides this reusable test interface covering type relevant aspects as
         * well as a complementarySetup test interface containing the instance relevant aspects (see
         * {@link HTMLDocumentTests.HTMLReaderTests.ParagraphActionTests}).
         * </p>
         *
         * <p>
         * <strong>What? Testing the class itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For
         * example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS,
         * Sec.&thinsp;9.6.1</a>). Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
         * provides corresponding, reusable test methods:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
         * ,
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
         * , and
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}
         * .
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link HTMLDocumentTests.HTMLReaderTests.ParagraphActionTests}.
         * </p>
         *
         * @see javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction class
         *      javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction (the hereby targeted class-under-test
         *      class)
         * @see HTMLDocumentTests.HTMLReaderTests.ParagraphActionTests
         *      HTMLDocumentTests.HTMLReaderTests.ParagraphActionTests (The complementary j8unit test interface
         *      containing the instance relevant test methods)
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface ParagraphActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction>
        extends HTMLDocumentClassTests.HTMLReaderClassTests.BlockActionClassTests<SUT> {

            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @BeforeClass
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction.class!",
                           javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Reusable j8unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction
         * class javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction}, containing all type relevant aspects
         * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
         * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit provides this reusable test interface covering type relevant aspects as
         * well as a complementarySetup test interface containing the instance relevant aspects (see
         * {@link HTMLDocumentTests.HTMLReaderTests.BlockActionTests}).
         * </p>
         *
         * <p>
         * <strong>What? Testing the class itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For
         * example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS,
         * Sec.&thinsp;9.6.1</a>). Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
         * provides corresponding, reusable test methods:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
         * ,
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
         * , and
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}
         * .
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link HTMLDocumentTests.HTMLReaderTests.BlockActionTests}.
         * </p>
         *
         * @see javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction class
         *      javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction (the hereby targeted class-under-test class)
         * @see HTMLDocumentTests.HTMLReaderTests.BlockActionTests HTMLDocumentTests.HTMLReaderTests.BlockActionTests
         *      (The complementary j8unit test interface containing the instance relevant test methods)
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface BlockActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction>
        extends HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests<SUT> {

            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @BeforeClass
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction.class!",
                           javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Reusable j8unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.FormAction class
         * javax.swing.text.html.HTMLDocument$HTMLReader$FormAction}, containing all type relevant aspects
         * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
         * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit provides this reusable test interface covering type relevant aspects as
         * well as a complementarySetup test interface containing the instance relevant aspects (see
         * {@link HTMLDocumentTests.HTMLReaderTests.FormActionTests}).
         * </p>
         *
         * <p>
         * <strong>What? Testing the class itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For
         * example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS,
         * Sec.&thinsp;9.6.1</a>). Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
         * provides corresponding, reusable test methods:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
         * ,
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
         * , and
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}
         * .
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link HTMLDocumentTests.HTMLReaderTests.FormActionTests}.
         * </p>
         *
         * @see javax.swing.text.html.HTMLDocument.HTMLReader.FormAction class
         *      javax.swing.text.html.HTMLDocument$HTMLReader$FormAction (the hereby targeted class-under-test class)
         * @see HTMLDocumentTests.HTMLReaderTests.FormActionTests HTMLDocumentTests.HTMLReaderTests.FormActionTests (The
         *      complementary j8unit test interface containing the instance relevant test methods)
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface FormActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.FormAction>
        extends HTMLDocumentClassTests.HTMLReaderClassTests.SpecialActionClassTests<SUT> {

            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @BeforeClass
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.html.HTMLDocument.HTMLReader.FormAction.class!",
                           javax.swing.text.html.HTMLDocument.HTMLReader.FormAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Reusable j8unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction
         * class javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction}, containing all type relevant aspects
         * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
         * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit provides this reusable test interface covering type relevant aspects as
         * well as a complementarySetup test interface containing the instance relevant aspects (see
         * {@link HTMLDocumentTests.HTMLReaderTests.IsindexActionTests}).
         * </p>
         *
         * <p>
         * <strong>What? Testing the class itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For
         * example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS,
         * Sec.&thinsp;9.6.1</a>). Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
         * provides corresponding, reusable test methods:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
         * ,
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
         * , and
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}
         * .
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link HTMLDocumentTests.HTMLReaderTests.IsindexActionTests}.
         * </p>
         *
         * @see javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction class
         *      javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction (the hereby targeted class-under-test class)
         * @see HTMLDocumentTests.HTMLReaderTests.IsindexActionTests
         *      HTMLDocumentTests.HTMLReaderTests.IsindexActionTests (The complementary j8unit test interface containing
         *      the instance relevant test methods)
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface IsindexActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction>
        extends HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests<SUT> {

            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @BeforeClass
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction.class!",
                           javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Reusable j8unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction
         * class javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction}, containing all type relevant aspects
         * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
         * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit provides this reusable test interface covering type relevant aspects as
         * well as a complementarySetup test interface containing the instance relevant aspects (see
         * {@link HTMLDocumentTests.HTMLReaderTests.HiddenActionTests}).
         * </p>
         *
         * <p>
         * <strong>What? Testing the class itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For
         * example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS,
         * Sec.&thinsp;9.6.1</a>). Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
         * provides corresponding, reusable test methods:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
         * ,
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
         * , and
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}
         * .
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link HTMLDocumentTests.HTMLReaderTests.HiddenActionTests}.
         * </p>
         *
         * @see javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction class
         *      javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction (the hereby targeted class-under-test class)
         * @see HTMLDocumentTests.HTMLReaderTests.HiddenActionTests HTMLDocumentTests.HTMLReaderTests.HiddenActionTests
         *      (The complementary j8unit test interface containing the instance relevant test methods)
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface HiddenActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction>
        extends HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests<SUT> {

            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @BeforeClass
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction.class!",
                           javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Reusable j8unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.HTMLReader.PreAction class
         * javax.swing.text.html.HTMLDocument$HTMLReader$PreAction}, containing all type relevant aspects (e.&thinsp;g.,
         * runtime constraints and further type specific requirements). (In addition, the runtime type of this j8unit
         * test interface's generic type is verified by {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * j8unit strongly encourages you to not only test the instances behaviour but also to test the type
         * constraints. For this purpose, j8unit provides this reusable test interface covering type relevant aspects as
         * well as a complementarySetup test interface containing the instance relevant aspects (see
         * {@link HTMLDocumentTests.HTMLReaderTests.PreActionTests}).
         * </p>
         *
         * <p>
         * <strong>What? Testing the class itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For
         * example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS,
         * Sec.&thinsp;9.6.1</a>). Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
         * provides corresponding, reusable test methods:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
         * ,
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
         * , and
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}
         * .
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link HTMLDocumentTests.HTMLReaderTests.PreActionTests}.
         * </p>
         *
         * @see javax.swing.text.html.HTMLDocument.HTMLReader.PreAction class
         *      javax.swing.text.html.HTMLDocument$HTMLReader$PreAction (the hereby targeted class-under-test class)
         * @see HTMLDocumentTests.HTMLReaderTests.PreActionTests HTMLDocumentTests.HTMLReaderTests.PreActionTests (The
         *      complementary j8unit test interface containing the instance relevant test methods)
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface PreActionClassTests<SUT extends javax.swing.text.html.HTMLDocument.HTMLReader.PreAction>
        extends HTMLDocumentClassTests.HTMLReaderClassTests.BlockActionClassTests<SUT> {

            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @BeforeClass
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.html.HTMLDocument.HTMLReader.PreAction.class!",
                           javax.swing.text.html.HTMLDocument.HTMLReader.PreAction.class.isAssignableFrom(sut));
            }

        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.BlockElement class
     * javax.swing.text.html.HTMLDocument$BlockElement}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link HTMLDocumentTests.BlockElementTests}).
     * </p>
     *
     * <p>
     * <strong>What? Testing the class itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides corresponding, reusable
     * test methods:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
     * ,
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
     * , and
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}.
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link HTMLDocumentTests.BlockElementTests}.
     * </p>
     *
     * @see javax.swing.text.html.HTMLDocument.BlockElement class javax.swing.text.html.HTMLDocument$BlockElement (the
     *      hereby targeted class-under-test class)
     * @see HTMLDocumentTests.BlockElementTests HTMLDocumentTests.BlockElementTests (The complementary j8unit test
     *      interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BlockElementClassTests<SUT extends javax.swing.text.html.HTMLDocument.BlockElement>
    extends org.j8unit.repository.javax.swing.text.AbstractDocumentClassTests.BranchElementClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.html.HTMLDocument.BlockElement.class!",
                       javax.swing.text.html.HTMLDocument.BlockElement.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.html.HTMLDocument.Iterator class
     * javax.swing.text.html.HTMLDocument$Iterator}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link HTMLDocumentTests.IteratorTests}).
     * </p>
     *
     * <p>
     * <strong>What? Testing the class itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes may have its own requirements and/or constraints; and all of these needs to be tested too. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides corresponding, reusable
     * test methods:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveFormalParameters()}
     * ,
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveTypeParameters()}
     * , and
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#declaredMethodsCannotHaveThrowsClause()}.
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link HTMLDocumentTests.IteratorTests}.
     * </p>
     *
     * @see javax.swing.text.html.HTMLDocument.Iterator class javax.swing.text.html.HTMLDocument$Iterator (the hereby
     *      targeted class-under-test class)
     * @see HTMLDocumentTests.IteratorTests HTMLDocumentTests.IteratorTests (The complementary j8unit test interface
     *      containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface IteratorClassTests<SUT extends javax.swing.text.html.HTMLDocument.Iterator>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.html.HTMLDocument.Iterator.class!",
                       javax.swing.text.html.HTMLDocument.Iterator.class.isAssignableFrom(sut));
        }

    }

}
