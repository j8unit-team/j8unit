package org.j8unit.repository.javax.swing.plaf.basic;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicTabbedPaneUI class javax.swing.plaf.basic.BasicTabbedPaneUI},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicTabbedPaneUIClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTabbedPaneUI>>
extends org.j8unit.repository.javax.swing.SwingConstantsClassTests<SUT>, org.j8unit.repository.javax.swing.plaf.TabbedPaneUIClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTabbedPaneUI$FocusHandler class
     * javax.swing.plaf.basic.BasicTabbedPaneUI$FocusHandler}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.FocusHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.FocusHandlerTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FocusHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTabbedPaneUI.FocusHandler>>
    extends org.j8unit.repository.java.awt.event.FocusAdapterClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTabbedPaneUI.FocusHandler#FocusHandler(javax.swing.plaf.basic.BasicTabbedPaneUI)
         * public javax.swing.plaf.basic.BasicTabbedPaneUI$FocusHandler(javax.swing.plaf.basic.BasicTabbedPaneUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_FocusHandler_BasicTabbedPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTabbedPaneUI.FocusHandler sut = null; // = new
                                                                                    // FocusHandler(javax.swing.plaf.basic.BasicTabbedPaneUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTabbedPaneUI.FocusHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTabbedPaneUI.FocusHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTabbedPaneUI$MouseHandler class
     * javax.swing.plaf.basic.BasicTabbedPaneUI$MouseHandler}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.MouseHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.MouseHandlerTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MouseHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler>>
    extends org.j8unit.repository.java.awt.event.MouseAdapterClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler#MouseHandler(javax.swing.plaf.basic.BasicTabbedPaneUI)
         * public javax.swing.plaf.basic.BasicTabbedPaneUI$MouseHandler(javax.swing.plaf.basic.BasicTabbedPaneUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_MouseHandler_BasicTabbedPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler sut = null; // = new
                                                                                    // MouseHandler(javax.swing.plaf.basic.BasicTabbedPaneUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTabbedPaneUI$PropertyChangeHandler class
     * javax.swing.plaf.basic.BasicTabbedPaneUI$PropertyChangeHandler}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
     * class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.PropertyChangeHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.PropertyChangeHandlerTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyChangeHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTabbedPaneUI.PropertyChangeHandler>>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTabbedPaneUI.PropertyChangeHandler#PropertyChangeHandler(javax.swing.plaf.basic.BasicTabbedPaneUI)
         * public
         * javax.swing.plaf.basic.BasicTabbedPaneUI$PropertyChangeHandler(javax.swing.plaf.basic.BasicTabbedPaneUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PropertyChangeHandler_BasicTabbedPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTabbedPaneUI.PropertyChangeHandler sut = null; // = new
                                                                                             // PropertyChangeHandler(javax.swing.plaf.basic.BasicTabbedPaneUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTabbedPaneUI.PropertyChangeHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTabbedPaneUI.PropertyChangeHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTabbedPaneUI$TabbedPaneLayout class
     * javax.swing.plaf.basic.BasicTabbedPaneUI$TabbedPaneLayout}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.TabbedPaneLayoutTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.TabbedPaneLayoutTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TabbedPaneLayoutClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout>>
    extends org.j8unit.repository.java.awt.LayoutManagerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout#TabbedPaneLayout(javax.swing.plaf.basic.BasicTabbedPaneUI)
         * public javax.swing.plaf.basic.BasicTabbedPaneUI$TabbedPaneLayout(javax.swing.plaf.basic.BasicTabbedPaneUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TabbedPaneLayout_BasicTabbedPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout sut = null; // = new
                                                                                        // TabbedPaneLayout(javax.swing.plaf.basic.BasicTabbedPaneUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTabbedPaneUI$TabSelectionHandler class
     * javax.swing.plaf.basic.BasicTabbedPaneUI$TabSelectionHandler}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
     * class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.TabSelectionHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.TabSelectionHandlerTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TabSelectionHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler>>
    extends org.j8unit.repository.javax.swing.event.ChangeListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler#TabSelectionHandler(javax.swing.plaf.basic.BasicTabbedPaneUI)
         * public
         * javax.swing.plaf.basic.BasicTabbedPaneUI$TabSelectionHandler(javax.swing.plaf.basic.BasicTabbedPaneUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TabSelectionHandler_BasicTabbedPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler sut = null; // = new
                                                                                           // TabSelectionHandler(javax.swing.plaf.basic.BasicTabbedPaneUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link javax.swing.plaf.basic.BasicTabbedPaneUI#BasicTabbedPaneUI() public
     * javax.swing.plaf.basic.BasicTabbedPaneUI()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicTabbedPaneUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.basic.BasicTabbedPaneUI sut = null; // = new BasicTabbedPaneUI();
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTabbedPaneUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicTabbedPaneUI.createUI(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createUI_JComponent()
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
        final Class<? extends javax.swing.plaf.basic.BasicTabbedPaneUI> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.basic.BasicTabbedPaneUI.class.isAssignableFrom(sut));
    }

}
