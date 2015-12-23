package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.SpringLayout class javax.swing.SpringLayout}, containing
 * all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.SpringLayoutTests}.
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
 * @see org.j8unit.repository.javax.swing.SpringLayoutTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.SpringLayout
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SpringLayoutClassTests<SUT extends javax.swing.SpringLayout>
extends org.j8unit.repository.java.awt.LayoutManager2ClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.SpringLayout.Constraints class
     * javax.swing.SpringLayout$Constraints}, containing all class relevant test methods (at least the test methods of
     * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.SpringLayoutTests.ConstraintsTests}.
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
     * @see org.j8unit.repository.javax.swing.SpringLayoutTests.ConstraintsTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.SpringLayout.Constraints
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ConstraintsClassTests<SUT extends javax.swing.SpringLayout.Constraints>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.SpringLayout.Constraints#Constraints() public
         * javax.swing.SpringLayout$Constraints()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.SpringLayout.Constraints#Constraints()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Constraints()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.SpringLayout.Constraints sut = null; // = new Constraints();
        }

        /**
         * <p>
         * Test method for {@link javax.swing.SpringLayout.Constraints#Constraints(java.awt.Component) public
         * javax.swing.SpringLayout$Constraints(java.awt.Component)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.SpringLayout.Constraints#Constraints(java.awt.Component)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Constraints_Component()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.SpringLayout.Constraints sut = null; // = new Constraints(java.awt.Component);
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.SpringLayout.Constraints#Constraints(javax.swing.Spring, javax.swing.Spring) public
         * javax.swing.SpringLayout$Constraints(javax.swing.Spring,javax.swing.Spring)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.SpringLayout.Constraints#Constraints(javax.swing.Spring, javax.swing.Spring)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Constraints_Spring_Spring()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.SpringLayout.Constraints sut = null; // = new Constraints(javax.swing.Spring,
                                                                   // javax.swing.Spring);
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.SpringLayout.Constraints#Constraints(javax.swing.Spring, javax.swing.Spring, javax.swing.Spring, javax.swing.Spring)
         * public
         * javax.swing.SpringLayout$Constraints(javax.swing.Spring,javax.swing.Spring,javax.swing.Spring,javax.swing.Spring)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.SpringLayout.Constraints#Constraints(javax.swing.Spring, javax.swing.Spring,
         *             javax.swing.Spring, javax.swing.Spring)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Constraints_Spring_Spring_Spring_Spring()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.SpringLayout.Constraints sut = null; // = new Constraints(javax.swing.Spring,
                                                                   // javax.swing.Spring, javax.swing.Spring,
                                                                   // javax.swing.Spring);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.SpringLayout.Constraints#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.SpringLayout.Constraints.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.SpringLayout#SpringLayout() public javax.swing.SpringLayout()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.SpringLayout#SpringLayout()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SpringLayout()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.SpringLayout sut = null; // = new SpringLayout();
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.SpringLayout#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.SpringLayout.class.isAssignableFrom(sut));
    }

}
