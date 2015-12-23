package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.AsyncBoxView class javax.swing.text.AsyncBoxView},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.AsyncBoxViewTests}.
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
 * @see org.j8unit.repository.javax.swing.text.AsyncBoxViewTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.AsyncBoxView
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AsyncBoxViewClassTests<SUT extends javax.swing.text.AsyncBoxView>
extends org.j8unit.repository.javax.swing.text.ViewClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.AsyncBoxView.ChildLocator class
     * javax.swing.text.AsyncBoxView$ChildLocator}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.AsyncBoxViewTests.ChildLocatorTests}.
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
     * @see org.j8unit.repository.javax.swing.text.AsyncBoxViewTests.ChildLocatorTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.AsyncBoxView.ChildLocator
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ChildLocatorClassTests<SUT extends javax.swing.text.AsyncBoxView.ChildLocator>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.AsyncBoxView.ChildLocator#ChildLocator(javax.swing.text.AsyncBoxView)
         * public javax.swing.text.AsyncBoxView$ChildLocator(javax.swing.text.AsyncBoxView)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.AsyncBoxView.ChildLocator#ChildLocator(javax.swing.text.AsyncBoxView)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ChildLocator_AsyncBoxView()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.AsyncBoxView.ChildLocator sut = null; // = new
                                                                         // ChildLocator(javax.swing.text.AsyncBoxView);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.AsyncBoxView.ChildLocator#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.AsyncBoxView.ChildLocator.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.AsyncBoxView.ChildState class
     * javax.swing.text.AsyncBoxView$ChildState}, containing all class relevant test methods (at least the test methods
     * of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.text.AsyncBoxViewTests.ChildStateTests}.
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
     * @see org.j8unit.repository.javax.swing.text.AsyncBoxViewTests.ChildStateTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.AsyncBoxView.ChildState
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ChildStateClassTests<SUT extends javax.swing.text.AsyncBoxView.ChildState>
    extends org.j8unit.repository.java.lang.RunnableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.AsyncBoxView.ChildState#ChildState(javax.swing.text.AsyncBoxView, javax.swing.text.View)
         * public javax.swing.text.AsyncBoxView$ChildState(javax.swing.text.AsyncBoxView,javax.swing.text.View)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.AsyncBoxView.ChildState#ChildState(javax.swing.text.AsyncBoxView,
         *             javax.swing.text.View)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ChildState_AsyncBoxView_View()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.text.AsyncBoxView.ChildState sut = null; // = new
                                                                       // ChildState(javax.swing.text.AsyncBoxView,
                                                                       // javax.swing.text.View);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.text.AsyncBoxView.ChildState#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.AsyncBoxView.ChildState.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.AsyncBoxView#AsyncBoxView(javax.swing.text.Element, int) public
     * javax.swing.text.AsyncBoxView(javax.swing.text.Element,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.AsyncBoxView#AsyncBoxView(javax.swing.text.Element, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_AsyncBoxView_Element_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.text.AsyncBoxView sut = null; // = new AsyncBoxView(javax.swing.text.Element, int);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.text.AsyncBoxView#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.AsyncBoxView.class.isAssignableFrom(sut));
    }

}
