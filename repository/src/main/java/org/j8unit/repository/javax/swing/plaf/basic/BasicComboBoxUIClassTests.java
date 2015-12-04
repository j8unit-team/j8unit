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
 * Test class for {@link javax.swing.plaf.basic.BasicComboBoxUI class javax.swing.plaf.basic.BasicComboBoxUI},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicComboBoxUIClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicComboBoxUI>>
extends org.j8unit.repository.javax.swing.plaf.ComboBoxUIClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.plaf.basic.BasicComboBoxUI#BasicComboBoxUI() public javax.swing.plaf.basic.BasicComboBoxUI()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicComboBoxUI() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.plaf.basic.BasicComboBoxUI sut = null; // = new BasicComboBoxUI();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.plaf.basic.BasicComboBoxUI> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.basic.BasicComboBoxUI.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicComboBoxUI#createUI(javax.swing.JComponent) public static javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicComboBoxUI.createUI(javax.swing.JComponent)}.
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
     * Test class for {@link javax.swing.plaf.basic.BasicComboBoxUI$ComboBoxLayoutManager class javax.swing.plaf.basic.BasicComboBoxUI$ComboBoxLayoutManager},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.ComboBoxLayoutManagerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.ComboBoxLayoutManagerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ComboBoxLayoutManagerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager>>
    extends org.j8unit.repository.java.awt.LayoutManagerClassTests<SUT>,
            org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager#ComboBoxLayoutManager(javax.swing.plaf.basic.BasicComboBoxUI) public javax.swing.plaf.basic.BasicComboBoxUI$ComboBoxLayoutManager(javax.swing.plaf.basic.BasicComboBoxUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ComboBoxLayoutManager_BasicComboBoxUI() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager sut = null; // = new ComboBoxLayoutManager(javax.swing.plaf.basic.BasicComboBoxUI);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicComboBoxUI$ItemHandler class javax.swing.plaf.basic.BasicComboBoxUI$ItemHandler},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.ItemHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.ItemHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ItemHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler>>
    extends org.j8unit.repository.java.awt.event.ItemListenerClassTests<SUT>,
            org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler#ItemHandler(javax.swing.plaf.basic.BasicComboBoxUI) public javax.swing.plaf.basic.BasicComboBoxUI$ItemHandler(javax.swing.plaf.basic.BasicComboBoxUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ItemHandler_BasicComboBoxUI() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler sut = null; // = new ItemHandler(javax.swing.plaf.basic.BasicComboBoxUI);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicComboBoxUI$FocusHandler class javax.swing.plaf.basic.BasicComboBoxUI$FocusHandler},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.FocusHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.FocusHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FocusHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicComboBoxUI.FocusHandler>>
    extends org.j8unit.repository.java.awt.event.FocusListenerClassTests<SUT>,
            org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.plaf.basic.BasicComboBoxUI.FocusHandler#FocusHandler(javax.swing.plaf.basic.BasicComboBoxUI) public javax.swing.plaf.basic.BasicComboBoxUI$FocusHandler(javax.swing.plaf.basic.BasicComboBoxUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_FocusHandler_BasicComboBoxUI() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.plaf.basic.BasicComboBoxUI.FocusHandler sut = null; // = new FocusHandler(javax.swing.plaf.basic.BasicComboBoxUI);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.plaf.basic.BasicComboBoxUI.FocusHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicComboBoxUI.FocusHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicComboBoxUI$KeyHandler class javax.swing.plaf.basic.BasicComboBoxUI$KeyHandler},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.KeyHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.KeyHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface KeyHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicComboBoxUI.KeyHandler>>
    extends org.j8unit.repository.java.awt.event.KeyAdapterClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.plaf.basic.BasicComboBoxUI.KeyHandler#KeyHandler(javax.swing.plaf.basic.BasicComboBoxUI) public javax.swing.plaf.basic.BasicComboBoxUI$KeyHandler(javax.swing.plaf.basic.BasicComboBoxUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_KeyHandler_BasicComboBoxUI() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.plaf.basic.BasicComboBoxUI.KeyHandler sut = null; // = new KeyHandler(javax.swing.plaf.basic.BasicComboBoxUI);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.plaf.basic.BasicComboBoxUI.KeyHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicComboBoxUI.KeyHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicComboBoxUI$ListDataHandler class javax.swing.plaf.basic.BasicComboBoxUI$ListDataHandler},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.ListDataHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.ListDataHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ListDataHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicComboBoxUI.ListDataHandler>>
    extends org.j8unit.repository.javax.swing.event.ListDataListenerClassTests<SUT>,
            org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.plaf.basic.BasicComboBoxUI.ListDataHandler#ListDataHandler(javax.swing.plaf.basic.BasicComboBoxUI) public javax.swing.plaf.basic.BasicComboBoxUI$ListDataHandler(javax.swing.plaf.basic.BasicComboBoxUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ListDataHandler_BasicComboBoxUI() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.plaf.basic.BasicComboBoxUI.ListDataHandler sut = null; // = new ListDataHandler(javax.swing.plaf.basic.BasicComboBoxUI);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.plaf.basic.BasicComboBoxUI.ListDataHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicComboBoxUI.ListDataHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicComboBoxUI$PropertyChangeHandler class javax.swing.plaf.basic.BasicComboBoxUI$PropertyChangeHandler},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.PropertyChangeHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.PropertyChangeHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyChangeHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicComboBoxUI.PropertyChangeHandler>>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>,
            org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.plaf.basic.BasicComboBoxUI.PropertyChangeHandler#PropertyChangeHandler(javax.swing.plaf.basic.BasicComboBoxUI) public javax.swing.plaf.basic.BasicComboBoxUI$PropertyChangeHandler(javax.swing.plaf.basic.BasicComboBoxUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PropertyChangeHandler_BasicComboBoxUI() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.plaf.basic.BasicComboBoxUI.PropertyChangeHandler sut = null; // = new PropertyChangeHandler(javax.swing.plaf.basic.BasicComboBoxUI);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.plaf.basic.BasicComboBoxUI.PropertyChangeHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicComboBoxUI.PropertyChangeHandler.class.isAssignableFrom(sut));
        }

    }

}
