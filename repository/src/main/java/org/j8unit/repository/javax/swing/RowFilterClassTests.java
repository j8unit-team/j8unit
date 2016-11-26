package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import javax.swing.RowFilter;
import javax.swing.RowFilter.ComparisonType;
import javax.swing.RowFilter.Entry;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.EnumClassTests;
import org.j8unit.repository.java.lang.ObjectClassTests;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime constraints
 * and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test {@link RowFilter public
 * abstract class javax.swing.RowFilter<M,I>}.
 *
 * (In addition, the runtime type of this j8unit test interface's generic type is verified by
 * {@link #verifyGenericType()}).
 * </p>
 *
 * <p>
 * The complementary j8unit test interface containing the instance relevant aspects is
 * {@link org.j8unit.repository.javax.swing.RowFilterTests}.
 * </p>
 *
 * <p>
 * <strong>What? Testing the class/the type itself? What is it good for?</strong>
 * </p>
 *
 * <p>
 * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
 *
 * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
 * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the provision of
 * specific constructors (and its individual requirements) should be covered by according test methods. (Note, this is
 * not limited to constructors only; Just think of factory methods and further.)
 *
 * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q> (JLS,
 * Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
 * </p>
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RowFilterClassTests<SUT extends RowFilter>
extends ObjectClassTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.RowFilter]
    /**
     * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
     *      (the hereby targeted method-under-test)
     *
     * @since 0.9.2
     */
    @Override
    @Test
    public default void verifyGenericType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to RowFilter.class!",
                   RowFilter.class.isAssignableFrom(sut));
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.RowFilter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.RowFilter]

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link Entry public abstract static class javax.swing.RowFilter$Entry<M,I>}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.RowFilterTests.EntryTests}.
     * </p>
     *
     * <p>
     * <strong>What? Testing the class/the type itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
     *
     * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
     * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the provision
     * of specific constructors (and its individual requirements) should be covered by according test methods. (Note,
     * this is not limited to constructors only; Just think of factory methods and further.)
     *
     * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an annotation
     * type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q> (JLS,
     * Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @SuppressWarnings("rawtypes")
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EntryClassTests<SUT extends Entry>
    extends ObjectClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.RowFilter$Entry]
        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @Test
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to Entry.class!",
                              Entry.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.RowFilter$Entry]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.RowFilter$Entry]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link ComparisonType public static final enum javax.swing.RowFilter$ComparisonType}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.RowFilterTests.ComparisonTypeTests}.
     * </p>
     *
     * <p>
     * <strong>What? Testing the class/the type itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
     *
     * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
     * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the provision
     * of specific constructors (and its individual requirements) should be covered by according test methods. (Note,
     * this is not limited to constructors only; Just think of factory methods and further.)
     *
     * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an annotation
     * type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q> (JLS,
     * Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ComparisonTypeClassTests<SUT extends ComparisonType>
    extends EnumClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.RowFilter$ComparisonType]
        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @Test
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to ComparisonType.class!",
                              ComparisonType.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.RowFilter$ComparisonType]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.RowFilter$ComparisonType]

    }

}
