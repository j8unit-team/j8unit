package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface for {@linkplain javax.swing.text.DefaultEditorKit class
 * javax.swing.text.DefaultEditorKit}, containing all type relevant aspects (e.&thinsp;g., runtime constraints and
 * further type specific requirements). (In addition, the runtime type of this j8unit test interface's generic type is
 * verified by {@link #verifyGenericType()}).
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
 * complementarySetup test interface containing the instance relevant aspects (see {@link DefaultEditorKitTests}).
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
 * The complementary j8unit test interface containing the instance relevant aspects is {@link DefaultEditorKitTests}.
 * </p>
 *
 * @see javax.swing.text.DefaultEditorKit class javax.swing.text.DefaultEditorKit (the hereby targeted class-under-test
 *      class)
 * @see DefaultEditorKitTests DefaultEditorKitTests (The complementary j8unit test interface containing the instance
 *      relevant test methods)
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultEditorKitClassTests<SUT extends javax.swing.text.DefaultEditorKit>
extends EditorKitClassTests<SUT> {

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
        assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.DefaultEditorKit.class!",
                   javax.swing.text.DefaultEditorKit.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction class
     * javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction}, containing all type relevant aspects (e.&thinsp;g.,
     * runtime constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link DefaultEditorKitTests.DefaultKeyTypedActionTests}).
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
     * {@link DefaultEditorKitTests.DefaultKeyTypedActionTests}.
     * </p>
     *
     * @see javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction class
     *      javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction (the hereby targeted class-under-test class)
     * @see DefaultEditorKitTests.DefaultKeyTypedActionTests DefaultEditorKitTests.DefaultKeyTypedActionTests (The
     *      complementary j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DefaultKeyTypedActionClassTests<SUT extends javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction>
    extends TextActionClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction.class!",
                       javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.PasteAction class
     * javax.swing.text.DefaultEditorKit$PasteAction}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link DefaultEditorKitTests.PasteActionTests}).
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
     * {@link DefaultEditorKitTests.PasteActionTests}.
     * </p>
     *
     * @see javax.swing.text.DefaultEditorKit.PasteAction class javax.swing.text.DefaultEditorKit$PasteAction (the
     *      hereby targeted class-under-test class)
     * @see DefaultEditorKitTests.PasteActionTests DefaultEditorKitTests.PasteActionTests (The complementary j8unit test
     *      interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PasteActionClassTests<SUT extends javax.swing.text.DefaultEditorKit.PasteAction>
    extends TextActionClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.DefaultEditorKit.PasteAction.class!",
                       javax.swing.text.DefaultEditorKit.PasteAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.InsertTabAction class
     * javax.swing.text.DefaultEditorKit$InsertTabAction}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link DefaultEditorKitTests.InsertTabActionTests}).
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
     * {@link DefaultEditorKitTests.InsertTabActionTests}.
     * </p>
     *
     * @see javax.swing.text.DefaultEditorKit.InsertTabAction class javax.swing.text.DefaultEditorKit$InsertTabAction
     *      (the hereby targeted class-under-test class)
     * @see DefaultEditorKitTests.InsertTabActionTests DefaultEditorKitTests.InsertTabActionTests (The complementary
     *      j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InsertTabActionClassTests<SUT extends javax.swing.text.DefaultEditorKit.InsertTabAction>
    extends TextActionClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.DefaultEditorKit.InsertTabAction.class!",
                       javax.swing.text.DefaultEditorKit.InsertTabAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.CutAction class
     * javax.swing.text.DefaultEditorKit$CutAction}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link DefaultEditorKitTests.CutActionTests}).
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
     * {@link DefaultEditorKitTests.CutActionTests}.
     * </p>
     *
     * @see javax.swing.text.DefaultEditorKit.CutAction class javax.swing.text.DefaultEditorKit$CutAction (the hereby
     *      targeted class-under-test class)
     * @see DefaultEditorKitTests.CutActionTests DefaultEditorKitTests.CutActionTests (The complementary j8unit test
     *      interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CutActionClassTests<SUT extends javax.swing.text.DefaultEditorKit.CutAction>
    extends TextActionClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.DefaultEditorKit.CutAction.class!",
                       javax.swing.text.DefaultEditorKit.CutAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.CopyAction class
     * javax.swing.text.DefaultEditorKit$CopyAction}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link DefaultEditorKitTests.CopyActionTests}).
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
     * {@link DefaultEditorKitTests.CopyActionTests}.
     * </p>
     *
     * @see javax.swing.text.DefaultEditorKit.CopyAction class javax.swing.text.DefaultEditorKit$CopyAction (the hereby
     *      targeted class-under-test class)
     * @see DefaultEditorKitTests.CopyActionTests DefaultEditorKitTests.CopyActionTests (The complementary j8unit test
     *      interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CopyActionClassTests<SUT extends javax.swing.text.DefaultEditorKit.CopyAction>
    extends TextActionClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.DefaultEditorKit.CopyAction.class!",
                       javax.swing.text.DefaultEditorKit.CopyAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.InsertContentAction class
     * javax.swing.text.DefaultEditorKit$InsertContentAction}, containing all type relevant aspects (e.&thinsp;g.,
     * runtime constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link DefaultEditorKitTests.InsertContentActionTests}).
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
     * {@link DefaultEditorKitTests.InsertContentActionTests}.
     * </p>
     *
     * @see javax.swing.text.DefaultEditorKit.InsertContentAction class
     *      javax.swing.text.DefaultEditorKit$InsertContentAction (the hereby targeted class-under-test class)
     * @see DefaultEditorKitTests.InsertContentActionTests DefaultEditorKitTests.InsertContentActionTests (The
     *      complementary j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InsertContentActionClassTests<SUT extends javax.swing.text.DefaultEditorKit.InsertContentAction>
    extends TextActionClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.DefaultEditorKit.InsertContentAction.class!",
                       javax.swing.text.DefaultEditorKit.InsertContentAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.InsertBreakAction class
     * javax.swing.text.DefaultEditorKit$InsertBreakAction}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link DefaultEditorKitTests.InsertBreakActionTests}).
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
     * {@link DefaultEditorKitTests.InsertBreakActionTests}.
     * </p>
     *
     * @see javax.swing.text.DefaultEditorKit.InsertBreakAction class
     *      javax.swing.text.DefaultEditorKit$InsertBreakAction (the hereby targeted class-under-test class)
     * @see DefaultEditorKitTests.InsertBreakActionTests DefaultEditorKitTests.InsertBreakActionTests (The complementary
     *      j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InsertBreakActionClassTests<SUT extends javax.swing.text.DefaultEditorKit.InsertBreakAction>
    extends TextActionClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.DefaultEditorKit.InsertBreakAction.class!",
                       javax.swing.text.DefaultEditorKit.InsertBreakAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.DefaultEditorKit.BeepAction class
     * javax.swing.text.DefaultEditorKit$BeepAction}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link DefaultEditorKitTests.BeepActionTests}).
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
     * {@link DefaultEditorKitTests.BeepActionTests}.
     * </p>
     *
     * @see javax.swing.text.DefaultEditorKit.BeepAction class javax.swing.text.DefaultEditorKit$BeepAction (the hereby
     *      targeted class-under-test class)
     * @see DefaultEditorKitTests.BeepActionTests DefaultEditorKitTests.BeepActionTests (The complementary j8unit test
     *      interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BeepActionClassTests<SUT extends javax.swing.text.DefaultEditorKit.BeepAction>
    extends TextActionClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.DefaultEditorKit.BeepAction.class!",
                       javax.swing.text.DefaultEditorKit.BeepAction.class.isAssignableFrom(sut));
        }

    }

}
