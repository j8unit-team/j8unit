package org.j8unit.repository.javax.swing.plaf.metal;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalTabbedPaneUI class
 * javax.swing.plaf.metal.MetalTabbedPaneUI}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUITests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUITests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.metal.MetalTabbedPaneUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalTabbedPaneUIClassTests<SUT extends javax.swing.plaf.metal.MetalTabbedPaneUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUIClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout class
     * javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit
     * test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUITests.TabbedPaneLayoutTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUITests.TabbedPaneLayoutTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TabbedPaneLayoutClassTests<SUT extends javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout>
    extends org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUIClassTests.TabbedPaneLayoutClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout#TabbedPaneLayout(javax.swing.plaf.metal.MetalTabbedPaneUI)
         * public javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout(javax.swing.plaf.metal.MetalTabbedPaneUI)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout#TabbedPaneLayout(javax.swing.plaf.metal
         *             .MetalTabbedPaneUI)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TabbedPaneLayout_MetalTabbedPaneUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout sut = null; // = new
                                                                                        // TabbedPaneLayout(javax.swing.plaf.metal.MetalTabbedPaneUI);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalTabbedPaneUI#MetalTabbedPaneUI() public
     * javax.swing.plaf.metal.MetalTabbedPaneUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalTabbedPaneUI#MetalTabbedPaneUI()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MetalTabbedPaneUI()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.metal.MetalTabbedPaneUI sut = null; // = new MetalTabbedPaneUI();
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalTabbedPaneUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.metal.MetalTabbedPaneUI.createUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalTabbedPaneUI#createUI(javax.swing.JComponent)
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
     * @j8unit.aim javax.swing.plaf.metal.MetalTabbedPaneUI#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.metal.MetalTabbedPaneUI.class.isAssignableFrom(sut));
    }

}
