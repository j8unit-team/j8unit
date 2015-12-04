package org.j8unit.repository.javax.swing.plaf.basic;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicTreeUI class javax.swing.plaf.basic.BasicTreeUI}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicTreeUIClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI>>
extends org.j8unit.repository.javax.swing.plaf.TreeUIClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.plaf.basic.BasicTreeUI#BasicTreeUI() public
     * javax.swing.plaf.basic.BasicTreeUI()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicTreeUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.basic.BasicTreeUI sut = null; // = new BasicTreeUI();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.plaf.basic.BasicTreeUI> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.basic.BasicTreeUI.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTreeUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicTreeUI.createUI(javax.swing.JComponent)}.
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
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler class
     * javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler}, containing all class relevant test
     * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
     * counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.SelectionModelPropertyChangeHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.SelectionModelPropertyChangeHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface SelectionModelPropertyChangeHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler>>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler#SelectionModelPropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_SelectionModelPropertyChangeHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler sut = null; // = new
                                                                                                     // SelectionModelPropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$TreePageAction class
     * javax.swing.plaf.basic.BasicTreeUI$TreePageAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreePageActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreePageActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TreePageActionClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreePageAction>>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreePageAction#TreePageAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$TreePageAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreePageAction_BasicTreeUI_int_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.TreePageAction sut = null; // = new
                                                                                // TreePageAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreePageAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreePageAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$MouseHandler class
     * javax.swing.plaf.basic.BasicTreeUI$MouseHandler}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.MouseHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.MouseHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface MouseHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.MouseHandler>>
    extends org.j8unit.repository.java.awt.event.MouseMotionListenerClassTests<SUT>, org.j8unit.repository.java.awt.event.MouseAdapterClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.MouseHandler#MouseHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$MouseHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_MouseHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.MouseHandler sut = null; // = new
                                                                              // MouseHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.MouseHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.MouseHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler class
     * javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeExpansionHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeExpansionHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TreeExpansionHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler>>
    extends org.j8unit.repository.javax.swing.event.TreeExpansionListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler#TreeExpansionHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeExpansionHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler sut = null; // = new
                                                                                      // TreeExpansionHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$KeyHandler class
     * javax.swing.plaf.basic.BasicTreeUI$KeyHandler}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.KeyHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.KeyHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface KeyHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.KeyHandler>>
    extends org.j8unit.repository.java.awt.event.KeyAdapterClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.KeyHandler#KeyHandler(javax.swing.plaf.basic.BasicTreeUI) public
         * javax.swing.plaf.basic.BasicTreeUI$KeyHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_KeyHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.KeyHandler sut = null; // = new
                                                                            // KeyHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.KeyHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.KeyHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler class
     * javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.MouseInputHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.MouseInputHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface MouseInputHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler>>
    extends org.j8unit.repository.javax.swing.event.MouseInputListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler#MouseInputHandler(javax.swing.plaf.basic.BasicTreeUI,java.awt.Component,java.awt.Component,java.awt.event.MouseEvent)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler(javax.swing.plaf.basic.BasicTreeUI,java.awt.Component,java.awt.Component,java.awt.event.MouseEvent)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_MouseInputHandler_BasicTreeUI_Component_Component_MouseEvent()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler sut = null; // = new
                                                                                   // MouseInputHandler(javax.swing.plaf.basic.BasicTreeUI,java.awt.Component,java.awt.Component,java.awt.event.MouseEvent);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction class
     * javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeTraverseActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeTraverseActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TreeTraverseActionClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction>>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction#TreeTraverseAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeTraverseAction_BasicTreeUI_int_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction sut = null; // = new
                                                                                    // TreeTraverseAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction class
     * javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeHomeActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeHomeActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TreeHomeActionClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction>>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction#TreeHomeAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeHomeAction_BasicTreeUI_int_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction sut = null; // = new
                                                                                // TreeHomeAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$FocusHandler class
     * javax.swing.plaf.basic.BasicTreeUI$FocusHandler}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.FocusHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.FocusHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FocusHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.FocusHandler>>
    extends org.j8unit.repository.java.awt.event.FocusListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.FocusHandler#FocusHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$FocusHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_FocusHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.FocusHandler sut = null; // = new
                                                                              // FocusHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.FocusHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.FocusHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler class
     * javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.CellEditorHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.CellEditorHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface CellEditorHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler>>
    extends org.j8unit.repository.javax.swing.event.CellEditorListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler#CellEditorHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_CellEditorHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler sut = null; // = new
                                                                                   // CellEditorHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$ComponentHandler class
     * javax.swing.plaf.basic.BasicTreeUI$ComponentHandler}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.ComponentHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.ComponentHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ComponentHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.ComponentHandler>>
    extends org.j8unit.repository.java.awt.event.ActionListenerClassTests<SUT>, org.j8unit.repository.java.awt.event.ComponentAdapterClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.ComponentHandler#ComponentHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$ComponentHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ComponentHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.ComponentHandler sut = null; // = new
                                                                                  // ComponentHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.ComponentHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.ComponentHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction class
     * javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeCancelEditingActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeCancelEditingActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TreeCancelEditingActionClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction>>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction#TreeCancelEditingAction(javax.swing.plaf.basic.BasicTreeUI,java.lang.String)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction(javax.swing.plaf.basic.BasicTreeUI,java.lang.String)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeCancelEditingAction_BasicTreeUI_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction sut = null; // = new
                                                                                         // TreeCancelEditingAction(javax.swing.plaf.basic.BasicTreeUI,java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler class
     * javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeModelHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeModelHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TreeModelHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler>>
    extends org.j8unit.repository.javax.swing.event.TreeModelListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler#TreeModelHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeModelHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler sut = null; // = new
                                                                                  // TreeModelHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction class
     * javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeToggleActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeToggleActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TreeToggleActionClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction>>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction#TreeToggleAction(javax.swing.plaf.basic.BasicTreeUI,java.lang.String)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction(javax.swing.plaf.basic.BasicTreeUI,java.lang.String)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeToggleAction_BasicTreeUI_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction sut = null; // = new
                                                                                  // TreeToggleAction(javax.swing.plaf.basic.BasicTreeUI,java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction class
     * javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeIncrementActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeIncrementActionTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TreeIncrementActionClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction>>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction#TreeIncrementAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)}
         * .
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeIncrementAction_BasicTreeUI_int_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction sut = null; // = new
                                                                                     // TreeIncrementAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler class
     * javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.NodeDimensionsHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.NodeDimensionsHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface NodeDimensionsHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler>>
    extends org.j8unit.repository.javax.swing.tree.AbstractLayoutCacheClassTests.NodeDimensionsClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler#NodeDimensionsHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_NodeDimensionsHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler sut = null; // = new
                                                                                       // NodeDimensionsHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler class
     * javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.PropertyChangeHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.PropertyChangeHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyChangeHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler>>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler#PropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_PropertyChangeHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler sut = null; // = new
                                                                                       // PropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler class
     * javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeSelectionHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeSelectionHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TreeSelectionHandlerClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler>>
    extends org.j8unit.repository.javax.swing.event.TreeSelectionListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler#TreeSelectionHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeSelectionHandler_BasicTreeUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler sut = null; // = new
                                                                                      // TreeSelectionHandler(javax.swing.plaf.basic.BasicTreeUI);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler.class.isAssignableFrom(sut));
        }

    }

}
