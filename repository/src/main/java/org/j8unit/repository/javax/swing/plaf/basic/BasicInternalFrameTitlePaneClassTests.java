package org.j8unit.repository.javax.swing.plaf.basic;

import static org.junit.Assert.assertTrue;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.awt.LayoutManagerClassTests;
import org.j8unit.repository.java.beans.PropertyChangeListenerClassTests;
import org.j8unit.repository.java.lang.ObjectClassTests;
import org.j8unit.repository.javax.swing.AbstractActionClassTests;
import org.j8unit.repository.javax.swing.JComponentClassTests;
import org.j8unit.repository.javax.swing.JMenuBarClassTests;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime constraints
 * and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link BasicInternalFrameTitlePane public class javax.swing.plaf.basic.BasicInternalFrameTitlePane}.
 *
 * (In addition, the runtime type of this j8unit test interface's generic type is verified by
 * {@link #verifyGenericType()}).
 * </p>
 *
 * <p>
 * The complementary j8unit test interface containing the instance relevant aspects is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests}.
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
public abstract interface BasicInternalFrameTitlePaneClassTests<SUT extends BasicInternalFrameTitlePane>
extends JComponentClassTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane]

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
        assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to BasicInternalFrameTitlePane.class!",
                   BasicInternalFrameTitlePane.class.isAssignableFrom(sut));
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane]

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link SizeAction public class javax.swing.plaf.basic.BasicInternalFrameTitlePane$SizeAction}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.SizeActionTests}.
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
    public static abstract interface SizeActionClassTests<SUT extends SizeAction>
    extends AbstractActionClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$SizeAction]

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
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to SizeAction.class!",
                              SizeAction.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$SizeAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$SizeAction]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link MoveAction public class javax.swing.plaf.basic.BasicInternalFrameTitlePane$MoveAction}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.MoveActionTests}.
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
    public static abstract interface MoveActionClassTests<SUT extends MoveAction>
    extends AbstractActionClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$MoveAction]

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
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to MoveAction.class!",
                              MoveAction.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$MoveAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$MoveAction]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link SystemMenuBar public class javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.SystemMenuBarTests}.
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
    public static abstract interface SystemMenuBarClassTests<SUT extends SystemMenuBar>
    extends JMenuBarClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar]

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
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to SystemMenuBar.class!",
                              SystemMenuBar.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link MaximizeAction public class javax.swing.plaf.basic.BasicInternalFrameTitlePane$MaximizeAction}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.MaximizeActionTests}.
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
    public static abstract interface MaximizeActionClassTests<SUT extends MaximizeAction>
    extends AbstractActionClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$MaximizeAction]

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
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to MaximizeAction.class!",
                              MaximizeAction.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$MaximizeAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$MaximizeAction]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link CloseAction public class javax.swing.plaf.basic.BasicInternalFrameTitlePane$CloseAction}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.CloseActionTests}.
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
    public static abstract interface CloseActionClassTests<SUT extends CloseAction>
    extends AbstractActionClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$CloseAction]

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
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to CloseAction.class!",
                              CloseAction.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$CloseAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$CloseAction]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link RestoreAction public class javax.swing.plaf.basic.BasicInternalFrameTitlePane$RestoreAction}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.RestoreActionTests}.
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
    public static abstract interface RestoreActionClassTests<SUT extends RestoreAction>
    extends AbstractActionClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$RestoreAction]

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
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to RestoreAction.class!",
                              RestoreAction.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$RestoreAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$RestoreAction]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link TitlePaneLayout public class javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.TitlePaneLayoutTests}.
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
    public static abstract interface TitlePaneLayoutClassTests<SUT extends TitlePaneLayout>
    extends LayoutManagerClassTests<SUT>, ObjectClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout]

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
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to TitlePaneLayout.class!",
                              TitlePaneLayout.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link IconifyAction public class javax.swing.plaf.basic.BasicInternalFrameTitlePane$IconifyAction}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.IconifyActionTests}.
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
    public static abstract interface IconifyActionClassTests<SUT extends IconifyAction>
    extends AbstractActionClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$IconifyAction]

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
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to IconifyAction.class!",
                              IconifyAction.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$IconifyAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$IconifyAction]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link PropertyChangeHandler public class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$PropertyChangeHandler}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.PropertyChangeHandlerTests}.
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
    public static abstract interface PropertyChangeHandlerClassTests<SUT extends PropertyChangeHandler>
    extends PropertyChangeListenerClassTests<SUT>, ObjectClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$PropertyChangeHandler]

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
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to PropertyChangeHandler.class!",
                              PropertyChangeHandler.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$PropertyChangeHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicInternalFrameTitlePane$PropertyChangeHandler]

    }

}
