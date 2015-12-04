package org.j8unit.repository.javax.swing.table;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.table.DefaultTableCellRenderer class javax.swing.table.DefaultTableCellRenderer},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.table.DefaultTableCellRendererTests}.
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
 * @see org.j8unit.repository.javax.swing.table.DefaultTableCellRendererTests
 */
@Category(J8UnitRepository.class)
public abstract interface DefaultTableCellRendererClassTests<SUT extends Class<? extends javax.swing.table.DefaultTableCellRenderer>>
extends org.j8unit.repository.javax.swing.table.TableCellRendererClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.javax.swing.JLabelClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.table.DefaultTableCellRenderer#DefaultTableCellRenderer() public
     * javax.swing.table.DefaultTableCellRenderer()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultTableCellRenderer()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.table.DefaultTableCellRenderer sut = null; // = new DefaultTableCellRenderer();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.table.DefaultTableCellRenderer> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.table.DefaultTableCellRenderer.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.swing.table.DefaultTableCellRenderer$UIResource class
     * javax.swing.table.DefaultTableCellRenderer$UIResource}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.table.DefaultTableCellRendererTests.UIResourceTests}.
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
     * @see org.j8unit.repository.javax.swing.table.DefaultTableCellRendererTests.UIResourceTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface UIResourceClassTests<SUT extends Class<? extends javax.swing.table.DefaultTableCellRenderer.UIResource>>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.table.DefaultTableCellRendererClassTests<SUT> {

        /**
         * Test method for {@link javax.swing.table.DefaultTableCellRenderer.UIResource#UIResource() public
         * javax.swing.table.DefaultTableCellRenderer$UIResource()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_UIResource()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.table.DefaultTableCellRenderer.UIResource sut = null; // = new UIResource();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.table.DefaultTableCellRenderer.UIResource> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.table.DefaultTableCellRenderer.UIResource.class.isAssignableFrom(sut));
        }

    }

}
