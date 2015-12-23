package org.j8unit.repository.javax.swing.plaf.metal;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalBorders class
 * javax.swing.plaf.metal.MetalBorders}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.metal.MetalBorders
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalBordersClassTests<SUT extends javax.swing.plaf.metal.MetalBorders>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalBorders.ButtonBorder class
     * javax.swing.plaf.metal.MetalBorders$ButtonBorder}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ButtonBorderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ButtonBorderTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders.ButtonBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ButtonBorderClassTests<SUT extends javax.swing.plaf.metal.MetalBorders.ButtonBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.ButtonBorder#ButtonBorder() public
         * javax.swing.plaf.metal.MetalBorders$ButtonBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.ButtonBorder#ButtonBorder()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.ButtonBorder#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.ButtonBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalBorders.Flush3DBorder class
     * javax.swing.plaf.metal.MetalBorders$Flush3DBorder}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.Flush3DBorderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.Flush3DBorderTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders.Flush3DBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface Flush3DBorderClassTests<SUT extends javax.swing.plaf.metal.MetalBorders.Flush3DBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.Flush3DBorder#Flush3DBorder() public
         * javax.swing.plaf.metal.MetalBorders$Flush3DBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.Flush3DBorder#Flush3DBorder()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.Flush3DBorder#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.Flush3DBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalBorders.InternalFrameBorder class
     * javax.swing.plaf.metal.MetalBorders$InternalFrameBorder}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit
     * test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.InternalFrameBorderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.InternalFrameBorderTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders.InternalFrameBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InternalFrameBorderClassTests<SUT extends javax.swing.plaf.metal.MetalBorders.InternalFrameBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.InternalFrameBorder#InternalFrameBorder() public
         * javax.swing.plaf.metal.MetalBorders$InternalFrameBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.InternalFrameBorder#InternalFrameBorder()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.InternalFrameBorder#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.InternalFrameBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalBorders.MenuBarBorder class
     * javax.swing.plaf.metal.MetalBorders$MenuBarBorder}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.MenuBarBorderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.MenuBarBorderTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders.MenuBarBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MenuBarBorderClassTests<SUT extends javax.swing.plaf.metal.MetalBorders.MenuBarBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.MenuBarBorder#MenuBarBorder() public
         * javax.swing.plaf.metal.MetalBorders$MenuBarBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.MenuBarBorder#MenuBarBorder()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.MenuBarBorder#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.MenuBarBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalBorders.MenuItemBorder class
     * javax.swing.plaf.metal.MetalBorders$MenuItemBorder}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.MenuItemBorderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.MenuItemBorderTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders.MenuItemBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MenuItemBorderClassTests<SUT extends javax.swing.plaf.metal.MetalBorders.MenuItemBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.MenuItemBorder#MenuItemBorder() public
         * javax.swing.plaf.metal.MetalBorders$MenuItemBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.MenuItemBorder#MenuItemBorder()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.MenuItemBorder#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.MenuItemBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalBorders.OptionDialogBorder class
     * javax.swing.plaf.metal.MetalBorders$OptionDialogBorder}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.OptionDialogBorderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.OptionDialogBorderTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders.OptionDialogBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OptionDialogBorderClassTests<SUT extends javax.swing.plaf.metal.MetalBorders.OptionDialogBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.OptionDialogBorder#OptionDialogBorder() public
         * javax.swing.plaf.metal.MetalBorders$OptionDialogBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.OptionDialogBorder#OptionDialogBorder()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.OptionDialogBorder#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.OptionDialogBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalBorders.PaletteBorder class
     * javax.swing.plaf.metal.MetalBorders$PaletteBorder}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.PaletteBorderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.PaletteBorderTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders.PaletteBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PaletteBorderClassTests<SUT extends javax.swing.plaf.metal.MetalBorders.PaletteBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.PaletteBorder#PaletteBorder() public
         * javax.swing.plaf.metal.MetalBorders$PaletteBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.PaletteBorder#PaletteBorder()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.PaletteBorder#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.PaletteBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalBorders.PopupMenuBorder class
     * javax.swing.plaf.metal.MetalBorders$PopupMenuBorder}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.PopupMenuBorderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.PopupMenuBorderTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders.PopupMenuBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PopupMenuBorderClassTests<SUT extends javax.swing.plaf.metal.MetalBorders.PopupMenuBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.PopupMenuBorder#PopupMenuBorder() public
         * javax.swing.plaf.metal.MetalBorders$PopupMenuBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.PopupMenuBorder#PopupMenuBorder()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.PopupMenuBorder#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.PopupMenuBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder class
     * javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit
     * test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.RolloverButtonBorderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.RolloverButtonBorderTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RolloverButtonBorderClassTests<SUT extends javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.ButtonBorderClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder#RolloverButtonBorder() public
         * javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder#RolloverButtonBorder()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder class
     * javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ScrollPaneBorderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ScrollPaneBorderTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ScrollPaneBorderClassTests<SUT extends javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder#ScrollPaneBorder() public
         * javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder#ScrollPaneBorder()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalBorders.TableHeaderBorder class
     * javax.swing.plaf.metal.MetalBorders$TableHeaderBorder}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.TableHeaderBorderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.TableHeaderBorderTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders.TableHeaderBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TableHeaderBorderClassTests<SUT extends javax.swing.plaf.metal.MetalBorders.TableHeaderBorder>
    extends org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.TableHeaderBorder#TableHeaderBorder() public
         * javax.swing.plaf.metal.MetalBorders$TableHeaderBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.TableHeaderBorder#TableHeaderBorder()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.TableHeaderBorder#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.TableHeaderBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalBorders.TextFieldBorder class
     * javax.swing.plaf.metal.MetalBorders$TextFieldBorder}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.TextFieldBorderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.TextFieldBorderTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders.TextFieldBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TextFieldBorderClassTests<SUT extends javax.swing.plaf.metal.MetalBorders.TextFieldBorder>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.Flush3DBorderClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.TextFieldBorder#TextFieldBorder() public
         * javax.swing.plaf.metal.MetalBorders$TextFieldBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.TextFieldBorder#TextFieldBorder()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.TextFieldBorder#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.TextFieldBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder class
     * javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ToggleButtonBorderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ToggleButtonBorderTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ToggleButtonBorderClassTests<SUT extends javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.ButtonBorderClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder#ToggleButtonBorder() public
         * javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder#ToggleButtonBorder()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalBorders.ToolBarBorder class
     * javax.swing.plaf.metal.MetalBorders$ToolBarBorder}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ToolBarBorderTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ToolBarBorderTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders.ToolBarBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ToolBarBorderClassTests<SUT extends javax.swing.plaf.metal.MetalBorders.ToolBarBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.SwingConstantsClassTests<SUT>,
    org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.metal.MetalBorders.ToolBarBorder#ToolBarBorder() public
         * javax.swing.plaf.metal.MetalBorders$ToolBarBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.ToolBarBorder#ToolBarBorder()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalBorders.ToolBarBorder#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalBorders.ToolBarBorder.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalBorders#MetalBorders() public
     * javax.swing.plaf.metal.MetalBorders()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders#MetalBorders()
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders#getButtonBorder()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getButtonBorder()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalBorders#getDesktopIconBorder() public static
     * javax.swing.border.Border javax.swing.plaf.metal.MetalBorders.getDesktopIconBorder()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders#getDesktopIconBorder()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDesktopIconBorder()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalBorders#getTextBorder() public static
     * javax.swing.border.Border javax.swing.plaf.metal.MetalBorders.getTextBorder()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders#getTextBorder()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTextBorder()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalBorders#getTextFieldBorder() public static
     * javax.swing.border.Border javax.swing.plaf.metal.MetalBorders.getTextFieldBorder()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders#getTextFieldBorder()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTextFieldBorder()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalBorders#getToggleButtonBorder() public static
     * javax.swing.border.Border javax.swing.plaf.metal.MetalBorders.getToggleButtonBorder()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders#getToggleButtonBorder()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getToggleButtonBorder()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalBorders#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.metal.MetalBorders.class.isAssignableFrom(sut));
    }

}
