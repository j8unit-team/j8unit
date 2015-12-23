package org.j8unit.repository.javax.swing.plaf.basic;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicOptionPaneUI class
 * javax.swing.plaf.basic.BasicOptionPaneUI}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicOptionPaneUIClassTests<SUT extends javax.swing.plaf.basic.BasicOptionPaneUI>
extends org.j8unit.repository.javax.swing.plaf.OptionPaneUIClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener
     * class javax.swing.plaf.basic.BasicOptionPaneUI$ButtonActionListener}, containing all class relevant test methods
     * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart
     * J8Unit test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.ButtonActionListenerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.ButtonActionListenerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ButtonActionListenerClassTests<SUT extends javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener>
    extends org.j8unit.repository.java.awt.event.ActionListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener#ButtonActionListener(javax.swing.plaf.basic.BasicOptionPaneUI, int)
         * public
         * javax.swing.plaf.basic.BasicOptionPaneUI$ButtonActionListener(javax.swing.plaf.basic.BasicOptionPaneUI,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener#ButtonActionListener(javax.swing.
         *             plaf.basic.BasicOptionPaneUI, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ButtonActionListener_BasicOptionPaneUI_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener sut = null; // = new
                                                                                            // ButtonActionListener(javax.swing.plaf.basic.BasicOptionPaneUI,
                                                                                            // int);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout class
     * javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit
     * test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.ButtonAreaLayoutTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.ButtonAreaLayoutTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ButtonAreaLayoutClassTests<SUT extends javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout>
    extends org.j8unit.repository.java.awt.LayoutManagerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#ButtonAreaLayout(boolean, int) public
         * javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout(boolean,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#ButtonAreaLayout(boolean, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ButtonAreaLayout_boolean_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout sut = null; // = new
                                                                                        // ButtonAreaLayout(boolean,
                                                                                        // int);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler
     * class javax.swing.plaf.basic.BasicOptionPaneUI$PropertyChangeHandler}, containing all class relevant test methods
     * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart
     * J8Unit test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.PropertyChangeHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.PropertyChangeHandlerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyChangeHandlerClassTests<SUT extends javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler#PropertyChangeHandler(javax.swing.plaf.basic.BasicOptionPaneUI)
         * public
         * javax.swing.plaf.basic.BasicOptionPaneUI$PropertyChangeHandler(javax.swing.plaf.basic.BasicOptionPaneUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler#PropertyChangeHandler(javax.swing.
         *             plaf.basic.BasicOptionPaneUI)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PropertyChangeHandler_BasicOptionPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler sut = null; // = new
                                                                                             // PropertyChangeHandler(javax.swing.plaf.basic.BasicOptionPaneUI);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI#BasicOptionPaneUI() public
     * javax.swing.plaf.basic.BasicOptionPaneUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI#BasicOptionPaneUI()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicOptionPaneUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.basic.BasicOptionPaneUI sut = null; // = new BasicOptionPaneUI();
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicOptionPaneUI.createUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI#createUI(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.basic.BasicOptionPaneUI.class.isAssignableFrom(sut));
    }

}
