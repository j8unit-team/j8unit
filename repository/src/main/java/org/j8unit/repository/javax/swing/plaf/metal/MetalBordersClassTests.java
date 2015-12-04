package org.j8unit.repository.javax.swing.plaf.metal;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.metal.MetalBorders class javax.swing.plaf.metal.MetalBorders}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalBordersClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalBorders>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$ButtonBorder class
     * javax.swing.plaf.metal.MetalBorders$ButtonBorder}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ButtonBorderTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ButtonBorderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ButtonBorderClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalBorders.ButtonBorder>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.ButtonBorder#ButtonBorder() public
         * javax.swing.plaf.metal.MetalBorders$ButtonBorder()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ButtonBorder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalBorders.ButtonBorder sut = null; // = new ButtonBorder();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalBorders.ButtonBorder> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.ButtonBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$Flush3DBorder class
     * javax.swing.plaf.metal.MetalBorders$Flush3DBorder}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.Flush3DBorderTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.Flush3DBorderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface Flush3DBorderClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalBorders.Flush3DBorder>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.Flush3DBorder#Flush3DBorder() public
         * javax.swing.plaf.metal.MetalBorders$Flush3DBorder()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Flush3DBorder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalBorders.Flush3DBorder sut = null; // = new Flush3DBorder();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalBorders.Flush3DBorder> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.Flush3DBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$InternalFrameBorder class
     * javax.swing.plaf.metal.MetalBorders$InternalFrameBorder}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.InternalFrameBorderTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.InternalFrameBorderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InternalFrameBorderClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalBorders.InternalFrameBorder>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.InternalFrameBorder#InternalFrameBorder() public
         * javax.swing.plaf.metal.MetalBorders$InternalFrameBorder()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_InternalFrameBorder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalBorders.InternalFrameBorder sut = null; // = new InternalFrameBorder();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalBorders.InternalFrameBorder> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.InternalFrameBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$MenuBarBorder class
     * javax.swing.plaf.metal.MetalBorders$MenuBarBorder}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.MenuBarBorderTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.MenuBarBorderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MenuBarBorderClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalBorders.MenuBarBorder>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.MenuBarBorder#MenuBarBorder() public
         * javax.swing.plaf.metal.MetalBorders$MenuBarBorder()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_MenuBarBorder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalBorders.MenuBarBorder sut = null; // = new MenuBarBorder();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalBorders.MenuBarBorder> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.MenuBarBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$MenuItemBorder class
     * javax.swing.plaf.metal.MetalBorders$MenuItemBorder}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.MenuItemBorderTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.MenuItemBorderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MenuItemBorderClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalBorders.MenuItemBorder>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.MenuItemBorder#MenuItemBorder() public
         * javax.swing.plaf.metal.MetalBorders$MenuItemBorder()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_MenuItemBorder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalBorders.MenuItemBorder sut = null; // = new MenuItemBorder();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalBorders.MenuItemBorder> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.MenuItemBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$OptionDialogBorder class
     * javax.swing.plaf.metal.MetalBorders$OptionDialogBorder}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.OptionDialogBorderTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.OptionDialogBorderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OptionDialogBorderClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalBorders.OptionDialogBorder>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.OptionDialogBorder#OptionDialogBorder() public
         * javax.swing.plaf.metal.MetalBorders$OptionDialogBorder()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_OptionDialogBorder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalBorders.OptionDialogBorder sut = null; // = new OptionDialogBorder();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalBorders.OptionDialogBorder> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.OptionDialogBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$PaletteBorder class
     * javax.swing.plaf.metal.MetalBorders$PaletteBorder}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.PaletteBorderTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.PaletteBorderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PaletteBorderClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalBorders.PaletteBorder>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.PaletteBorder#PaletteBorder() public
         * javax.swing.plaf.metal.MetalBorders$PaletteBorder()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PaletteBorder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalBorders.PaletteBorder sut = null; // = new PaletteBorder();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalBorders.PaletteBorder> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.PaletteBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$PopupMenuBorder class
     * javax.swing.plaf.metal.MetalBorders$PopupMenuBorder}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.PopupMenuBorderTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.PopupMenuBorderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PopupMenuBorderClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalBorders.PopupMenuBorder>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.PopupMenuBorder#PopupMenuBorder() public
         * javax.swing.plaf.metal.MetalBorders$PopupMenuBorder()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PopupMenuBorder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalBorders.PopupMenuBorder sut = null; // = new PopupMenuBorder();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalBorders.PopupMenuBorder> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.PopupMenuBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder class
     * javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.RolloverButtonBorderTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.RolloverButtonBorderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RolloverButtonBorderClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder>>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.ButtonBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder#RolloverButtonBorder() public
         * javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_RolloverButtonBorder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder sut = null; // = new RolloverButtonBorder();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder class
     * javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ScrollPaneBorderTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ScrollPaneBorderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ScrollPaneBorderClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder#ScrollPaneBorder() public
         * javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ScrollPaneBorder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder sut = null; // = new ScrollPaneBorder();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$TableHeaderBorder class
     * javax.swing.plaf.metal.MetalBorders$TableHeaderBorder}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.TableHeaderBorderTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.TableHeaderBorderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TableHeaderBorderClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalBorders.TableHeaderBorder>>
    extends org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.TableHeaderBorder#TableHeaderBorder() public
         * javax.swing.plaf.metal.MetalBorders$TableHeaderBorder()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TableHeaderBorder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalBorders.TableHeaderBorder sut = null; // = new TableHeaderBorder();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalBorders.TableHeaderBorder> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.TableHeaderBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$TextFieldBorder class
     * javax.swing.plaf.metal.MetalBorders$TextFieldBorder}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.TextFieldBorderTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.TextFieldBorderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TextFieldBorderClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalBorders.TextFieldBorder>>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.Flush3DBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.TextFieldBorder#TextFieldBorder() public
         * javax.swing.plaf.metal.MetalBorders$TextFieldBorder()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TextFieldBorder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalBorders.TextFieldBorder sut = null; // = new TextFieldBorder();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalBorders.TextFieldBorder> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.TextFieldBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder class
     * javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ToggleButtonBorderTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ToggleButtonBorderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ToggleButtonBorderClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder>>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.ButtonBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder#ToggleButtonBorder() public
         * javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ToggleButtonBorder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder sut = null; // = new ToggleButtonBorder();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalBorders$ToolBarBorder class
     * javax.swing.plaf.metal.MetalBorders$ToolBarBorder}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ToolBarBorderTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ToolBarBorderTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ToolBarBorderClassTests<SUT extends Class<? extends javax.swing.plaf.metal.MetalBorders.ToolBarBorder>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.SwingConstantsClassTests<SUT>,
    org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.ToolBarBorder#ToolBarBorder() public
         * javax.swing.plaf.metal.MetalBorders$ToolBarBorder()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ToolBarBorder()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalBorders.ToolBarBorder sut = null; // = new ToolBarBorder();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.metal.MetalBorders.ToolBarBorder> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.ToolBarBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link javax.swing.plaf.metal.MetalBorders#MetalBorders() public
     * javax.swing.plaf.metal.MetalBorders()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MetalBorders()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.metal.MetalBorders sut = null; // = new MetalBorders();
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalBorders#getButtonBorder() public static
     * javax.swing.border.Border javax.swing.plaf.metal.MetalBorders.getButtonBorder()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getButtonBorder()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalBorders#getDesktopIconBorder() public static
     * javax.swing.border.Border javax.swing.plaf.metal.MetalBorders.getDesktopIconBorder()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDesktopIconBorder()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalBorders#getTextBorder() public static
     * javax.swing.border.Border javax.swing.plaf.metal.MetalBorders.getTextBorder()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTextBorder()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalBorders#getTextFieldBorder() public static
     * javax.swing.border.Border javax.swing.plaf.metal.MetalBorders.getTextFieldBorder()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTextFieldBorder()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalBorders#getToggleButtonBorder() public static
     * javax.swing.border.Border javax.swing.plaf.metal.MetalBorders.getToggleButtonBorder()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getToggleButtonBorder()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.plaf.metal.MetalBorders> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.metal.MetalBorders.class.isAssignableFrom(sut));
    }

}
