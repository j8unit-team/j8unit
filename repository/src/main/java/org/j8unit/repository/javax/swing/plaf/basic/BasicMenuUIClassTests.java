package org.j8unit.repository.javax.swing.plaf.basic;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicMenuUI class
 * javax.swing.plaf.basic.BasicMenuUI}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicMenuUITests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicMenuUITests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.basic.BasicMenuUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicMenuUIClassTests<SUT extends javax.swing.plaf.basic.BasicMenuUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicMenuItemUIClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicMenuUI.ChangeHandler class
     * javax.swing.plaf.basic.BasicMenuUI$ChangeHandler}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicMenuUITests.ChangeHandlerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicMenuUITests.ChangeHandlerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicMenuUI.ChangeHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ChangeHandlerClassTests<SUT extends javax.swing.plaf.basic.BasicMenuUI.ChangeHandler>
    extends org.j8unit.repository.javax.swing.event.ChangeListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicMenuUI.ChangeHandler#ChangeHandler(javax.swing.plaf.basic.BasicMenuUI, javax.swing.JMenu, javax.swing.plaf.basic.BasicMenuUI)
         * public
         * javax.swing.plaf.basic.BasicMenuUI$ChangeHandler(javax.swing.plaf.basic.BasicMenuUI,javax.swing.JMenu,javax.swing.plaf.basic.BasicMenuUI)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicMenuUI.ChangeHandler#ChangeHandler(javax.swing.plaf.basic.
         *             BasicMenuUI, javax.swing.JMenu, javax.swing.plaf.basic.BasicMenuUI)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ChangeHandler_BasicMenuUI_JMenu_BasicMenuUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicMenuUI.ChangeHandler sut = null; // = new
                                                                               // ChangeHandler(javax.swing.plaf.basic.BasicMenuUI,
                                                                               // javax.swing.JMenu,
                                                                               // javax.swing.plaf.basic.BasicMenuUI);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicMenuUI.ChangeHandler#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicMenuUI.ChangeHandler.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicMenuUI#BasicMenuUI() public
     * javax.swing.plaf.basic.BasicMenuUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicMenuUI#BasicMenuUI()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicMenuUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.basic.BasicMenuUI sut = null; // = new BasicMenuUI();
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicMenuUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicMenuUI.createUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicMenuUI#createUI(javax.swing.JComponent)
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
     * @j8unit.aim javax.swing.plaf.basic.BasicMenuUI#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.basic.BasicMenuUI.class.isAssignableFrom(sut));
    }

}
