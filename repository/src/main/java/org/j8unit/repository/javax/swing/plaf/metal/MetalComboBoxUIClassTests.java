package org.j8unit.repository.javax.swing.plaf.metal;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalComboBoxUI class
 * javax.swing.plaf.metal.MetalComboBoxUI}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUITests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUITests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.metal.MetalComboBoxUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalComboBoxUIClassTests<SUT extends javax.swing.plaf.metal.MetalComboBoxUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUIClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager
     * class javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager}, containing all class relevant test
     * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
     * counterpart J8Unit test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUITests.MetalComboBoxLayoutManagerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUITests.MetalComboBoxLayoutManagerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MetalComboBoxLayoutManagerClassTests<SUT extends javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager>
    extends org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUIClassTests.ComboBoxLayoutManagerClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager#MetalComboBoxLayoutManager(javax.swing.plaf.metal.MetalComboBoxUI)
         * public
         * javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager(javax.swing.plaf.metal.MetalComboBoxUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager#MetalComboBoxLayoutManager(
         *             javax.swing.plaf.metal.MetalComboBoxUI)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_MetalComboBoxLayoutManager_MetalComboBoxUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager sut = null; // = new
                                                                                                // MetalComboBoxLayoutManager(javax.swing.plaf.metal.MetalComboBoxUI);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager#isAssignableFrom(java.lang.
         *             Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup class
     * javax.swing.plaf.metal.MetalComboBoxUI$MetalComboPopup}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUITests.MetalComboPopupTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUITests.MetalComboPopupTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MetalComboPopupClassTests<SUT extends javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup>
    extends org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup#MetalComboPopup(javax.swing.plaf.metal.MetalComboBoxUI, javax.swing.JComboBox)
         * public
         * javax.swing.plaf.metal.MetalComboBoxUI$MetalComboPopup(javax.swing.plaf.metal.MetalComboBoxUI,javax.swing.JComboBox)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup#MetalComboPopup(javax.swing.plaf.metal.
         *             MetalComboBoxUI, javax.swing.JComboBox)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_MetalComboPopup_MetalComboBoxUI_JComboBox()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup sut = null; // = new
                                                                                     // MetalComboPopup(javax.swing.plaf.metal.MetalComboBoxUI,
                                                                                     // javax.swing.JComboBox);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener
     * class javax.swing.plaf.metal.MetalComboBoxUI$MetalPropertyChangeListener}, containing all class relevant test
     * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
     * counterpart J8Unit test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUITests.MetalPropertyChangeListenerTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUITests.MetalPropertyChangeListenerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MetalPropertyChangeListenerClassTests<SUT extends javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener>
    extends org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUIClassTests.PropertyChangeHandlerClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener#MetalPropertyChangeListener(javax.swing.plaf.metal.MetalComboBoxUI)
         * public
         * javax.swing.plaf.metal.MetalComboBoxUI$MetalPropertyChangeListener(javax.swing.plaf.metal.MetalComboBoxUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener#MetalPropertyChangeListener(
         *             javax.swing.plaf.metal.MetalComboBoxUI)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_MetalPropertyChangeListener_MetalComboBoxUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener sut = null; // = new
                                                                                                 // MetalPropertyChangeListener(javax.swing.plaf.metal.MetalComboBoxUI);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener#isAssignableFrom(java.lang.
         *             Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalComboBoxUI#MetalComboBoxUI() public
     * javax.swing.plaf.metal.MetalComboBoxUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalComboBoxUI#MetalComboBoxUI()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MetalComboBoxUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.metal.MetalComboBoxUI sut = null; // = new MetalComboBoxUI();
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalComboBoxUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.metal.MetalComboBoxUI.createUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalComboBoxUI#createUI(javax.swing.JComponent)
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
     * @j8unit.aim javax.swing.plaf.metal.MetalComboBoxUI#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.metal.MetalComboBoxUI.class.isAssignableFrom(sut));
    }

}
