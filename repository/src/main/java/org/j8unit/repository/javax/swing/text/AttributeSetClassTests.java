package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.RepositoryClassTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface for {@linkplain javax.swing.text.AttributeSet interface javax.swing.text.AttributeSet}
 * , containing all type relevant aspects (e.&thinsp;g., runtime constraints and further type specific requirements).
 * (In addition, the runtime type of this j8unit test interface's generic type is verified by
 * {@link #verifyGenericType()}).
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
 * complementarySetup test interface containing the instance relevant aspects (see {@link AttributeSetTests}).
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
 * The complementary j8unit test interface containing the instance relevant aspects is {@link AttributeSetTests}.
 * </p>
 *
 * @see javax.swing.text.AttributeSet interface javax.swing.text.AttributeSet (the hereby targeted class-under-test
 *      class)
 * @see AttributeSetTests AttributeSetTests (The complementary j8unit test interface containing the instance relevant
 *      test methods)
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AttributeSetClassTests<SUT extends javax.swing.text.AttributeSet>
extends RepositoryClassTests<SUT> {

    /**
     * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class) (the
     *      hereby targeted method-under-test)
     *
     * @since 0.9.2
     */
    @BeforeClass
    public default void verifyGenericType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.AttributeSet.class!",
                   javax.swing.text.AttributeSet.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.AttributeSet.FontAttribute interface
     * javax.swing.text.AttributeSet$FontAttribute}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link AttributeSetTests.FontAttributeTests}).
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
     * {@link AttributeSetTests.FontAttributeTests}.
     * </p>
     *
     * @see javax.swing.text.AttributeSet.FontAttribute interface javax.swing.text.AttributeSet$FontAttribute (the
     *      hereby targeted class-under-test class)
     * @see AttributeSetTests.FontAttributeTests AttributeSetTests.FontAttributeTests (The complementary j8unit test
     *      interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FontAttributeClassTests<SUT extends javax.swing.text.AttributeSet.FontAttribute>
    extends RepositoryClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.AttributeSet.FontAttribute.class!",
                       javax.swing.text.AttributeSet.FontAttribute.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.AttributeSet.ColorAttribute interface
     * javax.swing.text.AttributeSet$ColorAttribute}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link AttributeSetTests.ColorAttributeTests}).
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
     * {@link AttributeSetTests.ColorAttributeTests}.
     * </p>
     *
     * @see javax.swing.text.AttributeSet.ColorAttribute interface javax.swing.text.AttributeSet$ColorAttribute (the
     *      hereby targeted class-under-test class)
     * @see AttributeSetTests.ColorAttributeTests AttributeSetTests.ColorAttributeTests (The complementary j8unit test
     *      interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ColorAttributeClassTests<SUT extends javax.swing.text.AttributeSet.ColorAttribute>
    extends RepositoryClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.AttributeSet.ColorAttribute.class!",
                       javax.swing.text.AttributeSet.ColorAttribute.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.AttributeSet.CharacterAttribute interface
     * javax.swing.text.AttributeSet$CharacterAttribute}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link AttributeSetTests.CharacterAttributeTests}).
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
     * {@link AttributeSetTests.CharacterAttributeTests}.
     * </p>
     *
     * @see javax.swing.text.AttributeSet.CharacterAttribute interface javax.swing.text.AttributeSet$CharacterAttribute
     *      (the hereby targeted class-under-test class)
     * @see AttributeSetTests.CharacterAttributeTests AttributeSetTests.CharacterAttributeTests (The complementary
     *      j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CharacterAttributeClassTests<SUT extends javax.swing.text.AttributeSet.CharacterAttribute>
    extends RepositoryClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.AttributeSet.CharacterAttribute.class!",
                       javax.swing.text.AttributeSet.CharacterAttribute.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.text.AttributeSet.ParagraphAttribute interface
     * javax.swing.text.AttributeSet$ParagraphAttribute}, containing all type relevant aspects (e.&thinsp;g., runtime
     * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test
     * interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link AttributeSetTests.ParagraphAttributeTests}).
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
     * {@link AttributeSetTests.ParagraphAttributeTests}.
     * </p>
     *
     * @see javax.swing.text.AttributeSet.ParagraphAttribute interface javax.swing.text.AttributeSet$ParagraphAttribute
     *      (the hereby targeted class-under-test class)
     * @see AttributeSetTests.ParagraphAttributeTests AttributeSetTests.ParagraphAttributeTests (The complementary
     *      j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ParagraphAttributeClassTests<SUT extends javax.swing.text.AttributeSet.ParagraphAttribute>
    extends RepositoryClassTests<SUT> {

        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @BeforeClass
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.text.AttributeSet.ParagraphAttribute.class!",
                       javax.swing.text.AttributeSet.ParagraphAttribute.class.isAssignableFrom(sut));
        }

    }

}
