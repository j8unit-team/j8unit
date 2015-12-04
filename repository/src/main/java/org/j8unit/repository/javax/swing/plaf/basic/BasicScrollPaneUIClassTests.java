package org.j8unit.repository.javax.swing.plaf.basic;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicScrollPaneUI class javax.swing.plaf.basic.BasicScrollPaneUI},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicScrollPaneUIClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicScrollPaneUI>>
extends org.j8unit.repository.javax.swing.ScrollPaneConstantsClassTests<SUT>, org.j8unit.repository.javax.swing.plaf.ScrollPaneUIClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.plaf.basic.BasicScrollPaneUI#BasicScrollPaneUI() public
     * javax.swing.plaf.basic.BasicScrollPaneUI()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicScrollPaneUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.basic.BasicScrollPaneUI sut = null; // = new BasicScrollPaneUI();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.plaf.basic.BasicScrollPaneUI> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.basic.BasicScrollPaneUI.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicScrollPaneUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicScrollPaneUI.createUI(javax.swing.JComponent)}.
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

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicScrollPaneUI$HSBChangeListener class
     * javax.swing.plaf.basic.BasicScrollPaneUI$HSBChangeListener}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.HSBChangeListenerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.HSBChangeListenerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface HSBChangeListenerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener>>
    extends org.j8unit.repository.javax.swing.event.ChangeListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener#HSBChangeListener(javax.swing.plaf.basic.BasicScrollPaneUI)
         * public javax.swing.plaf.basic.BasicScrollPaneUI$HSBChangeListener(javax.swing.plaf.basic.BasicScrollPaneUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_HSBChangeListener_BasicScrollPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener sut = null; // = new
                                                                                         // HSBChangeListener(javax.swing.plaf.basic.BasicScrollPaneUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicScrollPaneUI$VSBChangeListener class
     * javax.swing.plaf.basic.BasicScrollPaneUI$VSBChangeListener}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.VSBChangeListenerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.VSBChangeListenerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface VSBChangeListenerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener>>
    extends org.j8unit.repository.javax.swing.event.ChangeListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener#VSBChangeListener(javax.swing.plaf.basic.BasicScrollPaneUI)
         * public javax.swing.plaf.basic.BasicScrollPaneUI$VSBChangeListener(javax.swing.plaf.basic.BasicScrollPaneUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_VSBChangeListener_BasicScrollPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener sut = null; // = new
                                                                                         // VSBChangeListener(javax.swing.plaf.basic.BasicScrollPaneUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicScrollPaneUI$ViewportChangeHandler class
     * javax.swing.plaf.basic.BasicScrollPaneUI$ViewportChangeHandler}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
     * class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.ViewportChangeHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.ViewportChangeHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ViewportChangeHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler>>
    extends org.j8unit.repository.javax.swing.event.ChangeListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler#ViewportChangeHandler(javax.swing.plaf.basic.BasicScrollPaneUI)
         * public
         * javax.swing.plaf.basic.BasicScrollPaneUI$ViewportChangeHandler(javax.swing.plaf.basic.BasicScrollPaneUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ViewportChangeHandler_BasicScrollPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler sut = null; // = new
                                                                                             // ViewportChangeHandler(javax.swing.plaf.basic.BasicScrollPaneUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicScrollPaneUI$PropertyChangeHandler class
     * javax.swing.plaf.basic.BasicScrollPaneUI$PropertyChangeHandler}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
     * class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.PropertyChangeHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests.PropertyChangeHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyChangeHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler>>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler#PropertyChangeHandler(javax.swing.plaf.basic.BasicScrollPaneUI)
         * public
         * javax.swing.plaf.basic.BasicScrollPaneUI$PropertyChangeHandler(javax.swing.plaf.basic.BasicScrollPaneUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PropertyChangeHandler_BasicScrollPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler sut = null; // = new
                                                                                             // PropertyChangeHandler(javax.swing.plaf.basic.BasicScrollPaneUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler.class.isAssignableFrom(sut));
        }

    }

}
