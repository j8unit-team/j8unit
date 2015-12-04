package org.j8unit.repository.javax.swing.event;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.event.RowSorterEvent class javax.swing.event.RowSorterEvent}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.event.RowSorterEventTests}.
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
 * @see org.j8unit.repository.javax.swing.event.RowSorterEventTests
 */
@Category(J8UnitRepository.class)
public abstract interface RowSorterEventClassTests<SUT extends Class<? extends javax.swing.event.RowSorterEvent>>
extends org.j8unit.repository.java.util.EventObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.event.RowSorterEvent$Type class javax.swing.event.RowSorterEvent$Type},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.event.RowSorterEventTests.TypeTests}.
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
     * @see org.j8unit.repository.javax.swing.event.RowSorterEventTests.TypeTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TypeClassTests<SUT extends Class<? extends javax.swing.event.RowSorterEvent.Type>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT, javax.swing.event.RowSorterEvent.Type> {

        /**
         * <p>
         * Test method for {@link javax.swing.event.RowSorterEvent.Type#valueOf(java.lang.String) public static
         * javax.swing.event.RowSorterEvent$Type javax.swing.event.RowSorterEvent$Type.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.event.RowSorterEvent.Type#values() public static
         * javax.swing.event.RowSorterEvent$Type[] javax.swing.event.RowSorterEvent$Type.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.swing.event.RowSorterEvent.Type> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.event.RowSorterEvent.Type.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link javax.swing.event.RowSorterEvent#RowSorterEvent(javax.swing.RowSorter) public
     * javax.swing.event.RowSorterEvent(javax.swing.RowSorter)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_RowSorterEvent_RowSorter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.event.RowSorterEvent sut = null; // = new RowSorterEvent(javax.swing.RowSorter);
    }

    /**
     * Test method for
     * {@link javax.swing.event.RowSorterEvent#RowSorterEvent(javax.swing.RowSorter,javax.swing.event.RowSorterEvent.Type,int[])
     * public javax.swing.event.RowSorterEvent(javax.swing.RowSorter,javax.swing.event.RowSorterEvent$Type,int[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_RowSorterEvent_RowSorter_Type_intArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.event.RowSorterEvent sut = null; // = new
                                                           // RowSorterEvent(javax.swing.RowSorter,javax.swing.event.RowSorterEvent.Type,int[]);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.event.RowSorterEvent> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.event.RowSorterEvent.class.isAssignableFrom(sut));
    }

}
