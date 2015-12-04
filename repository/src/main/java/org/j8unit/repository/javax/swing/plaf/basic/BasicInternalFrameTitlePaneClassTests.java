package org.j8unit.repository.javax.swing.plaf.basic;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane class
 * javax.swing.plaf.basic.BasicInternalFrameTitlePane}, containing all class relevant test methods (at least the test
 * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class containing
 * the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicInternalFrameTitlePaneClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane>>
extends org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

    /**
     * Test method for
     * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane#BasicInternalFrameTitlePane(javax.swing.JInternalFrame)
     * public javax.swing.plaf.basic.BasicInternalFrameTitlePane(javax.swing.JInternalFrame)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicInternalFrameTitlePane_JInternalFrame()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.basic.BasicInternalFrameTitlePane sut = null; // = new
                                                                             // BasicInternalFrameTitlePane(javax.swing.JInternalFrame);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.basic.BasicInternalFrameTitlePane.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane$MaximizeAction class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$MaximizeAction}, containing all class relevant test methods
     * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart
     * test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.MaximizeActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.MaximizeActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface MaximizeActionClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction>>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction#MaximizeAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane)
         * public
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$MaximizeAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_MaximizeAction_BasicInternalFrameTitlePane()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction sut = null; // = new
                                                                                                // MaximizeAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
     * class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.SystemMenuBarTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.SystemMenuBarTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface SystemMenuBarClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar>>
    extends org.j8unit.repository.javax.swing.JMenuBarClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar#SystemMenuBar(javax.swing.plaf.basic.BasicInternalFrameTitlePane)
         * public
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar(javax.swing.plaf.basic.BasicInternalFrameTitlePane)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_SystemMenuBar_BasicInternalFrameTitlePane()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar sut = null; // = new
                                                                                               // SystemMenuBar(javax.swing.plaf.basic.BasicInternalFrameTitlePane);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout}, containing all class relevant test methods
     * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart
     * test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.TitlePaneLayoutTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.TitlePaneLayoutTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TitlePaneLayoutClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout>>
    extends org.j8unit.repository.java.awt.LayoutManagerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#TitlePaneLayout(javax.swing.plaf.basic.BasicInternalFrameTitlePane)
         * public
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout(javax.swing.plaf.basic.BasicInternalFrameTitlePane)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TitlePaneLayout_BasicInternalFrameTitlePane()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout sut = null; // = new
                                                                                                 // TitlePaneLayout(javax.swing.plaf.basic.BasicInternalFrameTitlePane);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane$RestoreAction class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$RestoreAction}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
     * class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.RestoreActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.RestoreActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface RestoreActionClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction>>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction#RestoreAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane)
         * public
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$RestoreAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_RestoreAction_BasicInternalFrameTitlePane()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction sut = null; // = new
                                                                                               // RestoreAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane$CloseAction class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$CloseAction}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
     * class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.CloseActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.CloseActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface CloseActionClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction>>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction#CloseAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane)
         * public
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$CloseAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_CloseAction_BasicInternalFrameTitlePane()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction sut = null; // = new
                                                                                             // CloseAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane$MoveAction class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$MoveAction}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
     * class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.MoveActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.MoveActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface MoveActionClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction>>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction#MoveAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane)
         * public
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$MoveAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_MoveAction_BasicInternalFrameTitlePane()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction sut = null; // = new
                                                                                            // MoveAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane$PropertyChangeHandler class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$PropertyChangeHandler}, containing all class relevant test
     * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
     * counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.PropertyChangeHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.PropertyChangeHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyChangeHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler>>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler#PropertyChangeHandler(javax.swing.plaf.basic.BasicInternalFrameTitlePane)
         * public
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$PropertyChangeHandler(javax.swing.plaf.basic.BasicInternalFrameTitlePane)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PropertyChangeHandler_BasicInternalFrameTitlePane()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler sut = null; // = new
                                                                                                       // PropertyChangeHandler(javax.swing.plaf.basic.BasicInternalFrameTitlePane);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane$SizeAction class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$SizeAction}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
     * class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.SizeActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.SizeActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface SizeActionClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction>>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction#SizeAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane)
         * public
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$SizeAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_SizeAction_BasicInternalFrameTitlePane()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction sut = null; // = new
                                                                                            // SizeAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane$IconifyAction class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$IconifyAction}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
     * class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.IconifyActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameTitlePaneTests.IconifyActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface IconifyActionClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction>>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction#IconifyAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane)
         * public
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$IconifyAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_IconifyAction_BasicInternalFrameTitlePane()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction sut = null; // = new
                                                                                               // IconifyAction(javax.swing.plaf.basic.BasicInternalFrameTitlePane);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction.class.isAssignableFrom(sut));
        }

    }

}
