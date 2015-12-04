package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.PrimitiveIterator interface java.util.PrimitiveIterator}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.util.PrimitiveIteratorTests}.
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
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.PrimitiveIteratorTests
 */
@Category(J8UnitRepository.class)
public abstract interface PrimitiveIteratorClassTests<SUT extends Class<? extends java.util.PrimitiveIterator<T, T_CONS>>, T, T_CONS>
extends org.j8unit.repository.java.util.IteratorClassTests<SUT, T> {

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.util.PrimitiveIterator<T, T_CONS>> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.PrimitiveIterator.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link java.util.PrimitiveIterator$OfLong interface java.util.PrimitiveIterator$OfLong},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.PrimitiveIteratorTests.OfLongTests}.
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
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.PrimitiveIteratorTests.OfLongTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface OfLongClassTests<SUT extends Class<? extends java.util.PrimitiveIterator.OfLong>>
    extends org.j8unit.repository.java.util.PrimitiveIteratorClassTests<SUT, java.lang.Long, java.util.function.LongConsumer> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.util.PrimitiveIterator.OfLong> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.PrimitiveIterator.OfLong.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.PrimitiveIterator$OfInt interface java.util.PrimitiveIterator$OfInt}, containing
     * all class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.PrimitiveIteratorTests.OfIntTests}.
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
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.PrimitiveIteratorTests.OfIntTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface OfIntClassTests<SUT extends Class<? extends java.util.PrimitiveIterator.OfInt>>
    extends org.j8unit.repository.java.util.PrimitiveIteratorClassTests<SUT, java.lang.Integer, java.util.function.IntConsumer> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.util.PrimitiveIterator.OfInt> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.PrimitiveIterator.OfInt.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.PrimitiveIterator$OfDouble interface java.util.PrimitiveIterator$OfDouble},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.PrimitiveIteratorTests.OfDoubleTests}.
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
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.PrimitiveIteratorTests.OfDoubleTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface OfDoubleClassTests<SUT extends Class<? extends java.util.PrimitiveIterator.OfDouble>>
    extends org.j8unit.repository.java.util.PrimitiveIteratorClassTests<SUT, java.lang.Double, java.util.function.DoubleConsumer> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.util.PrimitiveIterator.OfDouble> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.PrimitiveIterator.OfDouble.class.isAssignableFrom(sut));
        }

    }

}
