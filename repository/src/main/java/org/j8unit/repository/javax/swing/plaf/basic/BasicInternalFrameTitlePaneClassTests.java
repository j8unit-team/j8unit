package org.j8unit.repository.javax.swing.plaf.basic;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface for {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane class
 * javax.swing.plaf.basic.BasicInternalFrameTitlePane}, containing all type relevant aspects (e.&thinsp;g., runtime
 * constraints and further type specific requirements). (In addition, the runtime type of this j8unit test interface's
 * generic type is verified by {@link #verifyGenericType()}).
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
 * complementarySetup test interface containing the instance relevant aspects (see
 * {@link BasicInternalFrameTitlePaneTests}).
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
 * The complementary j8unit test interface containing the instance relevant aspects is
 * {@link BasicInternalFrameTitlePaneTests}.
 * </p>
 *
 * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane class javax.swing.plaf.basic.BasicInternalFrameTitlePane (the
 *      hereby targeted class-under-test class)
 * @see BasicInternalFrameTitlePaneTests BasicInternalFrameTitlePaneTests (The complementary j8unit test interface
 *      containing the instance relevant test methods)
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicInternalFrameTitlePaneClassTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane>
extends org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

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
        assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.plaf.basic.BasicInternalFrameTitlePane.class!",
                   javax.swing.plaf.basic.BasicInternalFrameTitlePane.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Reusable j8unit test interface for
     * {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$PropertyChangeHandler}, containing all type relevant aspects
     * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
     * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link BasicInternalFrameTitlePaneTests.PropertyChangeHandlerTests}).
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
     * {@link BasicInternalFrameTitlePaneTests.PropertyChangeHandlerTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$PropertyChangeHandler (the hereby targeted
     *      class-under-test class)
     * @see BasicInternalFrameTitlePaneTests.PropertyChangeHandlerTests
     *      BasicInternalFrameTitlePaneTests.PropertyChangeHandlerTests (The complementary j8unit test interface
     *      containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyChangeHandlerClassTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler.class!",
                       javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction
     * class javax.swing.plaf.basic.BasicInternalFrameTitlePane$SizeAction}, containing all type relevant aspects
     * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
     * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link BasicInternalFrameTitlePaneTests.SizeActionTests}).
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
     * {@link BasicInternalFrameTitlePaneTests.SizeActionTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$SizeAction (the hereby targeted class-under-test class)
     * @see BasicInternalFrameTitlePaneTests.SizeActionTests BasicInternalFrameTitlePaneTests.SizeActionTests (The
     *      complementary j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SizeActionClassTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction.class!",
                       javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout
     * class javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout}, containing all type relevant aspects
     * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
     * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link BasicInternalFrameTitlePaneTests.TitlePaneLayoutTests}).
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
     * {@link BasicInternalFrameTitlePaneTests.TitlePaneLayoutTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout (the hereby targeted class-under-test
     *      class)
     * @see BasicInternalFrameTitlePaneTests.TitlePaneLayoutTests BasicInternalFrameTitlePaneTests.TitlePaneLayoutTests
     *      (The complementary j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TitlePaneLayoutClassTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout>
    extends org.j8unit.repository.java.awt.LayoutManagerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout.class!",
                       javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction
     * class javax.swing.plaf.basic.BasicInternalFrameTitlePane$RestoreAction}, containing all type relevant aspects
     * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
     * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link BasicInternalFrameTitlePaneTests.RestoreActionTests}).
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
     * {@link BasicInternalFrameTitlePaneTests.RestoreActionTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$RestoreAction (the hereby targeted class-under-test
     *      class)
     * @see BasicInternalFrameTitlePaneTests.RestoreActionTests BasicInternalFrameTitlePaneTests.RestoreActionTests (The
     *      complementary j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RestoreActionClassTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction.class!",
                       javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar
     * class javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar}, containing all type relevant aspects
     * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
     * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link BasicInternalFrameTitlePaneTests.SystemMenuBarTests}).
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
     * {@link BasicInternalFrameTitlePaneTests.SystemMenuBarTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar (the hereby targeted class-under-test
     *      class)
     * @see BasicInternalFrameTitlePaneTests.SystemMenuBarTests BasicInternalFrameTitlePaneTests.SystemMenuBarTests (The
     *      complementary j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SystemMenuBarClassTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar>
    extends org.j8unit.repository.javax.swing.JMenuBarClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar.class!",
                       javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction
     * class javax.swing.plaf.basic.BasicInternalFrameTitlePane$MaximizeAction}, containing all type relevant aspects
     * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
     * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link BasicInternalFrameTitlePaneTests.MaximizeActionTests}).
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
     * {@link BasicInternalFrameTitlePaneTests.MaximizeActionTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$MaximizeAction (the hereby targeted class-under-test
     *      class)
     * @see BasicInternalFrameTitlePaneTests.MaximizeActionTests BasicInternalFrameTitlePaneTests.MaximizeActionTests
     *      (The complementary j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MaximizeActionClassTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction.class!",
                       javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction
     * class javax.swing.plaf.basic.BasicInternalFrameTitlePane$IconifyAction}, containing all type relevant aspects
     * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
     * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link BasicInternalFrameTitlePaneTests.IconifyActionTests}).
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
     * {@link BasicInternalFrameTitlePaneTests.IconifyActionTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$IconifyAction (the hereby targeted class-under-test
     *      class)
     * @see BasicInternalFrameTitlePaneTests.IconifyActionTests BasicInternalFrameTitlePaneTests.IconifyActionTests (The
     *      complementary j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface IconifyActionClassTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction.class!",
                       javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction
     * class javax.swing.plaf.basic.BasicInternalFrameTitlePane$MoveAction}, containing all type relevant aspects
     * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
     * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link BasicInternalFrameTitlePaneTests.MoveActionTests}).
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
     * {@link BasicInternalFrameTitlePaneTests.MoveActionTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$MoveAction (the hereby targeted class-under-test class)
     * @see BasicInternalFrameTitlePaneTests.MoveActionTests BasicInternalFrameTitlePaneTests.MoveActionTests (The
     *      complementary j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MoveActionClassTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction.class!",
                       javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface for {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction
     * class javax.swing.plaf.basic.BasicInternalFrameTitlePane$CloseAction}, containing all type relevant aspects
     * (e.&thinsp;g., runtime constraints and further type specific requirements). (In addition, the runtime type of
     * this j8unit test interface's generic type is verified by {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit provides this reusable test interface covering type relevant aspects as well as a
     * complementarySetup test interface containing the instance relevant aspects (see
     * {@link BasicInternalFrameTitlePaneTests.CloseActionTests}).
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
     * {@link BasicInternalFrameTitlePaneTests.CloseActionTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$CloseAction (the hereby targeted class-under-test class)
     * @see BasicInternalFrameTitlePaneTests.CloseActionTests BasicInternalFrameTitlePaneTests.CloseActionTests (The
     *      complementary j8unit test interface containing the instance relevant test methods)
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CloseActionClassTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

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
            assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction.class!",
                       javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction.class.isAssignableFrom(sut));
        }

    }

}
