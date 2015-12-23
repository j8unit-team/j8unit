package org.j8unit.repository.javax.swing.table;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.table.DefaultTableCellRenderer class
 * javax.swing.table.DefaultTableCellRenderer}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.swing.table.DefaultTableCellRendererTests}.
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
 * @see org.j8unit.repository.javax.swing.table.DefaultTableCellRendererTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.table.DefaultTableCellRenderer
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultTableCellRendererClassTests<SUT extends javax.swing.table.DefaultTableCellRenderer>
extends org.j8unit.repository.javax.swing.table.TableCellRendererClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.javax.swing.JLabelClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.table.DefaultTableCellRenderer.UIResource class
     * javax.swing.table.DefaultTableCellRenderer$UIResource}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.table.DefaultTableCellRendererTests.UIResourceTests}.
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
     * @see org.j8unit.repository.javax.swing.table.DefaultTableCellRendererTests.UIResourceTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.table.DefaultTableCellRenderer.UIResource
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UIResourceClassTests<SUT extends javax.swing.table.DefaultTableCellRenderer.UIResource>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.javax.swing.table.DefaultTableCellRendererClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.table.DefaultTableCellRenderer.UIResource#UIResource() public
         * javax.swing.table.DefaultTableCellRenderer$UIResource()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.table.DefaultTableCellRenderer.UIResource#UIResource()
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

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.table.DefaultTableCellRenderer.UIResource#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.table.DefaultTableCellRenderer.UIResource.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.table.DefaultTableCellRenderer#DefaultTableCellRenderer() public
     * javax.swing.table.DefaultTableCellRenderer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.table.DefaultTableCellRenderer#DefaultTableCellRenderer()
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

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.table.DefaultTableCellRenderer#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.table.DefaultTableCellRenderer.class.isAssignableFrom(sut));
    }

}
