package org.j8unit.repository.javax.swing.plaf.basic;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicComboBoxRenderer class
 * javax.swing.plaf.basic.BasicComboBoxRenderer}, containing all class relevant test methods (at least the test methods
 * of accessible constructors and of accessible {@code static} methods). The counterpart test class containing the
 * instance relevant test methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererTests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererTests
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicComboBoxRendererClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicComboBoxRenderer>>
extends org.j8unit.repository.javax.swing.ListCellRendererClassTests, org.j8unit.repository.java.io.SerializableClassTests,
org.j8unit.repository.javax.swing.JLabelClassTests {

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicComboBoxRenderer$UIResource class
     * javax.swing.plaf.basic.BasicComboBoxRenderer$UIResource}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererTests.UIResourceTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererTests.UIResourceTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UIResourceClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests, org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererClassTests {

        /**
         * Test method for {@link javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource#UIResource() public
         * javax.swing.plaf.basic.BasicComboBoxRenderer$UIResource()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_UIResource()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource sut = null; // = new UIResource();
        }

        // The definition of the SUT factory method must be repeated
        // because of the "rawtypes" nature of this test class (caused
        // by the "rawtypes" nature of the class-under-test).
        @Override
        public abstract SUT createNewSUT();

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link javax.swing.plaf.basic.BasicComboBoxRenderer#BasicComboBoxRenderer() public
     * javax.swing.plaf.basic.BasicComboBoxRenderer()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicComboBoxRenderer()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.basic.BasicComboBoxRenderer sut = null; // = new BasicComboBoxRenderer();
    }

    // The definition of the SUT factory method must be repeated
    // because of the "rawtypes" nature of this test class (caused
    // by the "rawtypes" nature of the class-under-test).
    @Override
    public abstract SUT createNewSUT();

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.plaf.basic.BasicComboBoxRenderer> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.basic.BasicComboBoxRenderer.class.isAssignableFrom(sut));
    }

}
