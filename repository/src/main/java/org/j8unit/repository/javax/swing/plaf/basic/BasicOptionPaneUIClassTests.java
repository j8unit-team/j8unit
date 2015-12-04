package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicOptionPaneUI class javax.swing.plaf.basic.BasicOptionPaneUI},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicOptionPaneUIClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicOptionPaneUI>>
extends org.j8unit.repository.javax.swing.plaf.OptionPaneUIClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI#BasicOptionPaneUI() public javax.swing.plaf.basic.BasicOptionPaneUI()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicOptionPaneUI() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.plaf.basic.BasicOptionPaneUI sut = null; // = new BasicOptionPaneUI();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.plaf.basic.BasicOptionPaneUI> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.basic.BasicOptionPaneUI.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI#createUI(javax.swing.JComponent) public static javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicOptionPaneUI.createUI(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createUI_JComponent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicOptionPaneUI$ButtonActionListener class javax.swing.plaf.basic.BasicOptionPaneUI$ButtonActionListener},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.ButtonActionListenerTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.ButtonActionListenerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ButtonActionListenerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener>>
    extends org.j8unit.repository.java.awt.event.ActionListenerClassTests<SUT>,
            org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener#ButtonActionListener(javax.swing.plaf.basic.BasicOptionPaneUI,int) public javax.swing.plaf.basic.BasicOptionPaneUI$ButtonActionListener(javax.swing.plaf.basic.BasicOptionPaneUI,int)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ButtonActionListener_BasicOptionPaneUI_int() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener sut = null; // = new ButtonActionListener(javax.swing.plaf.basic.BasicOptionPaneUI,int);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicOptionPaneUI$PropertyChangeHandler class javax.swing.plaf.basic.BasicOptionPaneUI$PropertyChangeHandler},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.PropertyChangeHandlerTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.PropertyChangeHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyChangeHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler>>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>,
            org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler#PropertyChangeHandler(javax.swing.plaf.basic.BasicOptionPaneUI) public javax.swing.plaf.basic.BasicOptionPaneUI$PropertyChangeHandler(javax.swing.plaf.basic.BasicOptionPaneUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PropertyChangeHandler_BasicOptionPaneUI() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler sut = null; // = new PropertyChangeHandler(javax.swing.plaf.basic.BasicOptionPaneUI);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout class javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.ButtonAreaLayoutTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.ButtonAreaLayoutTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ButtonAreaLayoutClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout>>
    extends org.j8unit.repository.java.awt.LayoutManagerClassTests<SUT>,
            org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#ButtonAreaLayout(boolean,int) public javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout(boolean,int)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ButtonAreaLayout_boolean_int() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout sut = null; // = new ButtonAreaLayout(boolean,int);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout.class.isAssignableFrom(sut));
        }

    }

}
