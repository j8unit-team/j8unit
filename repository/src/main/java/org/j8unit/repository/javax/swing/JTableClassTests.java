package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import javax.swing.JTable;
import javax.swing.JTable.DropLocation;
import javax.swing.JTable.PrintMode;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.EnumClassTests;
import org.j8unit.repository.javax.accessibility.AccessibleClassTests;
import org.j8unit.repository.javax.swing.event.CellEditorListenerClassTests;
import org.j8unit.repository.javax.swing.event.ListSelectionListenerClassTests;
import org.j8unit.repository.javax.swing.event.RowSorterListenerClassTests;
import org.j8unit.repository.javax.swing.event.TableColumnModelListenerClassTests;
import org.j8unit.repository.javax.swing.event.TableModelListenerClassTests;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime constraints
 * and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test {@link JTable public class
 * javax.swing.JTable}.
 *
 * (In addition, the runtime type of this j8unit test interface's generic type is verified by
 * {@link #verifyGenericType()}).
 * </p>
 *
 * <p>
 * The complementary j8unit test interface containing the instance relevant aspects is
 * {@link org.j8unit.repository.javax.swing.JTableTests}.
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
 * constructor. Obviously, this is a class-specific behaviour. In general, all constraints referring to the provision of
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
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JTableClassTests<SUT extends JTable>
extends TableModelListenerClassTests<SUT>, ScrollableClassTests<SUT>, TableColumnModelListenerClassTests<SUT>, ListSelectionListenerClassTests<SUT>,
CellEditorListenerClassTests<SUT>, AccessibleClassTests<SUT>, RowSorterListenerClassTests<SUT>, JComponentClassTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JTable]

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
        assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to JTable.class!",
                   JTable.class.isAssignableFrom(sut));
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JTable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JTable]

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link DropLocation public static final class javax.swing.JTable$DropLocation}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.JTableTests.DropLocationTests}.
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
     * constructor. Obviously, this is a class-specific behaviour. In general, all constraints referring to the
     * provision of specific constructors (and its individual requirements) should be covered by according test methods.
     * (Note, this is not limited to constructors only; Just think of factory methods and further.)
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
    public static abstract interface DropLocationClassTests<SUT extends DropLocation>
    extends org.j8unit.repository.javax.swing.TransferHandlerClassTests.DropLocationClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JTable$DropLocation]

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
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to DropLocation.class!",
                              DropLocation.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JTable$DropLocation]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JTable$DropLocation]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link PrintMode public static final enum javax.swing.JTable$PrintMode}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.JTableTests.PrintModeTests}.
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
     * constructor. Obviously, this is a class-specific behaviour. In general, all constraints referring to the
     * provision of specific constructors (and its individual requirements) should be covered by according test methods.
     * (Note, this is not limited to constructors only; Just think of factory methods and further.)
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
    public static abstract interface PrintModeClassTests<SUT extends PrintMode>
    extends EnumClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.JTable$PrintMode]

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
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to PrintMode.class!",
                              PrintMode.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.JTable$PrintMode]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.JTable$PrintMode]

    }

}
