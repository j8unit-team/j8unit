package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.RepositoryClassTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface for {@linkplain java.util.Spliterator interface java.util.Spliterator}, containing all
 * type relevant aspects (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the
 * runtime type of this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
 * complementarySetup test interface containing the instance relevant aspects (see {@link SpliteratorTests}).
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
 * The complementary j8unit test interface containing the instance relevant aspects is {@link SpliteratorTests}.
 * </p>
 *
 * @see java.util.Spliterator interface java.util.Spliterator (the hereby targeted class-under-test class)
 * @see SpliteratorTests SpliteratorTests (The complementary j8unit test interface containing the instance relevant test
 *      methods)
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SpliteratorClassTests<SUT extends java.util.Spliterator>
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
        assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.util.Spliterator.class!",
                   java.util.Spliterator.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain java.util.Spliterator.OfDouble interface
     * java.util.Spliterator$OfDouble}, containing all type relevant aspects (e.&thinsp;g., runtime constraints and
     * further type specific requirements). (In addition, the runtime type of this j8unit test interface's generic type
     * is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link SpliteratorTests.OfDoubleTests}).
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
     * {@link SpliteratorTests.OfDoubleTests}.
     * </p>
     *
     * @see java.util.Spliterator.OfDouble interface java.util.Spliterator$OfDouble (the hereby targeted
     *      class-under-test class)
     * @see SpliteratorTests.OfDoubleTests SpliteratorTests.OfDoubleTests (The complementary j8unit test interface
     *      containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OfDoubleClassTests<SUT extends java.util.Spliterator.OfDouble>
    extends SpliteratorClassTests.OfPrimitiveClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.util.Spliterator.OfDouble.class!",
                       java.util.Spliterator.OfDouble.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain java.util.Spliterator.OfLong interface
     * java.util.Spliterator$OfLong}, containing all type relevant aspects (e.&thinsp;g., runtime constraints and
     * further type specific requirements). (In addition, the runtime type of this j8unit test interface's generic type
     * is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link SpliteratorTests.OfLongTests}).
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
     * {@link SpliteratorTests.OfLongTests}.
     * </p>
     *
     * @see java.util.Spliterator.OfLong interface java.util.Spliterator$OfLong (the hereby targeted class-under-test
     *      class)
     * @see SpliteratorTests.OfLongTests SpliteratorTests.OfLongTests (The complementary j8unit test interface
     *      containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OfLongClassTests<SUT extends java.util.Spliterator.OfLong>
    extends SpliteratorClassTests.OfPrimitiveClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.util.Spliterator.OfLong.class!",
                       java.util.Spliterator.OfLong.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain java.util.Spliterator.OfPrimitive interface
     * java.util.Spliterator$OfPrimitive}, containing all type relevant aspects (e.&thinsp;g., runtime constraints and
     * further type specific requirements). (In addition, the runtime type of this j8unit test interface's generic type
     * is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link SpliteratorTests.OfPrimitiveTests}).
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
     * {@link SpliteratorTests.OfPrimitiveTests}.
     * </p>
     *
     * @see java.util.Spliterator.OfPrimitive interface java.util.Spliterator$OfPrimitive (the hereby targeted
     *      class-under-test class)
     * @see SpliteratorTests.OfPrimitiveTests SpliteratorTests.OfPrimitiveTests (The complementary j8unit test interface
     *      containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @SuppressWarnings("rawtypes")
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OfPrimitiveClassTests<SUT extends java.util.Spliterator.OfPrimitive>
    extends SpliteratorClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.util.Spliterator.OfPrimitive.class!",
                       java.util.Spliterator.OfPrimitive.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain java.util.Spliterator.OfInt interface java.util.Spliterator$OfInt}
     * , containing all type relevant aspects (e.&thinsp;g., runtime constraints and further type specific
     * requirements). (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link SpliteratorTests.OfIntTests}).
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
     * {@link SpliteratorTests.OfIntTests}.
     * </p>
     *
     * @see java.util.Spliterator.OfInt interface java.util.Spliterator$OfInt (the hereby targeted class-under-test
     *      class)
     * @see SpliteratorTests.OfIntTests SpliteratorTests.OfIntTests (The complementary j8unit test interface containing
     *      the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OfIntClassTests<SUT extends java.util.Spliterator.OfInt>
    extends SpliteratorClassTests.OfPrimitiveClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to java.util.Spliterator.OfInt.class!",
                       java.util.Spliterator.OfInt.class.isAssignableFrom(sut));
        }

    }

}
