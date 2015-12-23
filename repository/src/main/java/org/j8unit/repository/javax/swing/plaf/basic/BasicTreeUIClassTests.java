package org.j8unit.repository.javax.swing.plaf.basic;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI class
 * javax.swing.plaf.basic.BasicTreeUI}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicTreeUIClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI>
extends org.j8unit.repository.javax.swing.plaf.TreeUIClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler class
     * javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.CellEditorHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.CellEditorHandlerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CellEditorHandlerClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler>
    extends org.j8unit.repository.javax.swing.event.CellEditorListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler#CellEditorHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$CellEditorHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler#CellEditorHandler(javax.swing.plaf.basic.
         *             BasicTreeUI)
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.ComponentHandler class
     * javax.swing.plaf.basic.BasicTreeUI$ComponentHandler}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.ComponentHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.ComponentHandlerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.ComponentHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ComponentHandlerClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.ComponentHandler>
    extends org.j8unit.repository.java.awt.event.ActionListenerClassTests<SUT>, org.j8unit.repository.java.awt.event.ComponentAdapterClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.ComponentHandler#ComponentHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$ComponentHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.ComponentHandler#ComponentHandler(javax.swing.plaf.basic.
         *             BasicTreeUI)
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.ComponentHandler#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.ComponentHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.FocusHandler class
     * javax.swing.plaf.basic.BasicTreeUI$FocusHandler}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.FocusHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.FocusHandlerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.FocusHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FocusHandlerClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.FocusHandler>
    extends org.j8unit.repository.java.awt.event.FocusListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.FocusHandler#FocusHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$FocusHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.FocusHandler#FocusHandler(javax.swing.plaf.basic.BasicTreeUI)
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.FocusHandler#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.FocusHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.KeyHandler class
     * javax.swing.plaf.basic.BasicTreeUI$KeyHandler}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.KeyHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.KeyHandlerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.KeyHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface KeyHandlerClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.KeyHandler>
    extends org.j8unit.repository.java.awt.event.KeyAdapterClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.KeyHandler#KeyHandler(javax.swing.plaf.basic.BasicTreeUI) public
         * javax.swing.plaf.basic.BasicTreeUI$KeyHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.KeyHandler#KeyHandler(javax.swing.plaf.basic.BasicTreeUI)
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.KeyHandler#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.KeyHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.MouseHandler class
     * javax.swing.plaf.basic.BasicTreeUI$MouseHandler}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.MouseHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.MouseHandlerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.MouseHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MouseHandlerClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.MouseHandler>
    extends org.j8unit.repository.java.awt.event.MouseMotionListenerClassTests<SUT>, org.j8unit.repository.java.awt.event.MouseAdapterClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.MouseHandler#MouseHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$MouseHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.MouseHandler#MouseHandler(javax.swing.plaf.basic.BasicTreeUI)
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.MouseHandler#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.MouseHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler class
     * javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.MouseInputHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.MouseInputHandlerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MouseInputHandlerClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler>
    extends org.j8unit.repository.javax.swing.event.MouseInputListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler#MouseInputHandler(javax.swing.plaf.basic.BasicTreeUI, java.awt.Component, java.awt.Component, java.awt.event.MouseEvent)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$MouseInputHandler(javax.swing.plaf.basic.BasicTreeUI,java.awt.Component,java.awt.Component,java.awt.event.MouseEvent)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler#MouseInputHandler(javax.swing.plaf.basic.
         *             BasicTreeUI, java.awt.Component, java.awt.Component, java.awt.event.MouseEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_MouseInputHandler_BasicTreeUI_Component_Component_MouseEvent()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler sut = null; // = new
                                                                                   // MouseInputHandler(javax.swing.plaf.basic.BasicTreeUI,
                                                                                   // java.awt.Component,
                                                                                   // java.awt.Component,
                                                                                   // java.awt.event.MouseEvent);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.MouseInputHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler class
     * javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit
     * test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.NodeDimensionsHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.NodeDimensionsHandlerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface NodeDimensionsHandlerClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler>
    extends org.j8unit.repository.javax.swing.tree.AbstractLayoutCacheClassTests.NodeDimensionsClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler#NodeDimensionsHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$NodeDimensionsHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler#NodeDimensionsHandler(javax.swing.plaf.
         *             basic.BasicTreeUI)
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler class
     * javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit
     * test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.PropertyChangeHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.PropertyChangeHandlerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyChangeHandlerClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler#PropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$PropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler#PropertyChangeHandler(javax.swing.plaf.
         *             basic.BasicTreeUI)
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.PropertyChangeHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for
     * {@linkplain javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler class
     * javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler}, containing all class relevant test
     * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
     * counterpart J8Unit test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.SelectionModelPropertyChangeHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.SelectionModelPropertyChangeHandlerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SelectionModelPropertyChangeHandlerClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler#SelectionModelPropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$SelectionModelPropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler#
         *             SelectionModelPropertyChangeHandler(javax.swing.plaf.basic.BasicTreeUI)
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler#isAssignableFrom(java.lang
         *             .Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction class
     * javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit
     * test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeCancelEditingActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeCancelEditingActionTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeCancelEditingActionClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction#TreeCancelEditingAction(javax.swing.plaf.basic.BasicTreeUI, java.lang.String)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$TreeCancelEditingAction(javax.swing.plaf.basic.BasicTreeUI,java.lang.String)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction#TreeCancelEditingAction(javax.swing.
         *             plaf.basic.BasicTreeUI, java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeCancelEditingAction_BasicTreeUI_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction sut = null; // = new
                                                                                         // TreeCancelEditingAction(javax.swing.plaf.basic.BasicTreeUI,
                                                                                         // java.lang.String);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler class
     * javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit
     * test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeExpansionHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeExpansionHandlerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeExpansionHandlerClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler>
    extends org.j8unit.repository.javax.swing.event.TreeExpansionListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler#TreeExpansionHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$TreeExpansionHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler#TreeExpansionHandler(javax.swing.plaf.
         *             basic.BasicTreeUI)
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeExpansionHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction class
     * javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeHomeActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeHomeActionTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeHomeActionClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction#TreeHomeAction(javax.swing.plaf.basic.BasicTreeUI, int, java.lang.String)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$TreeHomeAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction#TreeHomeAction(javax.swing.plaf.basic.
         *             BasicTreeUI, int, java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeHomeAction_BasicTreeUI_int_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction sut = null; // = new
                                                                                // TreeHomeAction(javax.swing.plaf.basic.BasicTreeUI,
                                                                                // int, java.lang.String);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction class
     * javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeIncrementActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeIncrementActionTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeIncrementActionClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction#TreeIncrementAction(javax.swing.plaf.basic.BasicTreeUI, int, java.lang.String)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$TreeIncrementAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction#TreeIncrementAction(javax.swing.plaf.basic
         *             .BasicTreeUI, int, java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeIncrementAction_BasicTreeUI_int_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction sut = null; // = new
                                                                                     // TreeIncrementAction(javax.swing.plaf.basic.BasicTreeUI,
                                                                                     // int, java.lang.String);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler class
     * javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeModelHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeModelHandlerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeModelHandlerClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler>
    extends org.j8unit.repository.javax.swing.event.TreeModelListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler#TreeModelHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$TreeModelHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler#TreeModelHandler(javax.swing.plaf.basic.
         *             BasicTreeUI)
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeModelHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.TreePageAction class
     * javax.swing.plaf.basic.BasicTreeUI$TreePageAction}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreePageActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreePageActionTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreePageAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreePageActionClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.TreePageAction>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreePageAction#TreePageAction(javax.swing.plaf.basic.BasicTreeUI, int, java.lang.String)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$TreePageAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreePageAction#TreePageAction(javax.swing.plaf.basic.
         *             BasicTreeUI, int, java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreePageAction_BasicTreeUI_int_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.TreePageAction sut = null; // = new
                                                                                // TreePageAction(javax.swing.plaf.basic.BasicTreeUI,
                                                                                // int, java.lang.String);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreePageAction#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreePageAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler class
     * javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit
     * test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeSelectionHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeSelectionHandlerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeSelectionHandlerClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler>
    extends org.j8unit.repository.javax.swing.event.TreeSelectionListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler#TreeSelectionHandler(javax.swing.plaf.basic.BasicTreeUI)
         * public javax.swing.plaf.basic.BasicTreeUI$TreeSelectionHandler(javax.swing.plaf.basic.BasicTreeUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler#TreeSelectionHandler(javax.swing.plaf.
         *             basic.BasicTreeUI)
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction class
     * javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeToggleActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeToggleActionTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeToggleActionClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction#TreeToggleAction(javax.swing.plaf.basic.BasicTreeUI, java.lang.String)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$TreeToggleAction(javax.swing.plaf.basic.BasicTreeUI,java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction#TreeToggleAction(javax.swing.plaf.basic.
         *             BasicTreeUI, java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeToggleAction_BasicTreeUI_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction sut = null; // = new
                                                                                  // TreeToggleAction(javax.swing.plaf.basic.BasicTreeUI,
                                                                                  // java.lang.String);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction class
     * javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeTraverseActionTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTreeUITests.TreeTraverseActionTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TreeTraverseActionClassTests<SUT extends javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction>
    extends org.j8unit.repository.javax.swing.AbstractActionClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction#TreeTraverseAction(javax.swing.plaf.basic.BasicTreeUI, int, java.lang.String)
         * public
         * javax.swing.plaf.basic.BasicTreeUI$TreeTraverseAction(javax.swing.plaf.basic.BasicTreeUI,int,java.lang.String)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction#TreeTraverseAction(javax.swing.plaf.basic.
         *             BasicTreeUI, int, java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TreeTraverseAction_BasicTreeUI_int_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction sut = null; // = new
                                                                                    // TreeTraverseAction(javax.swing.plaf.basic.BasicTreeUI,
                                                                                    // int, java.lang.String);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTreeUI#BasicTreeUI() public
     * javax.swing.plaf.basic.BasicTreeUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI#BasicTreeUI()
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

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTreeUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicTreeUI.createUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI#createUI(javax.swing.JComponent)
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
     * @j8unit.aim javax.swing.plaf.basic.BasicTreeUI#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.basic.BasicTreeUI.class.isAssignableFrom(sut));
    }

}
