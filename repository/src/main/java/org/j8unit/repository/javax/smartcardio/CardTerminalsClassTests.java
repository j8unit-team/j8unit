package org.j8unit.repository.javax.smartcardio;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.smartcardio.CardTerminals class javax.smartcardio.CardTerminals}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.smartcardio.CardTerminalsTests}.
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
 * @see org.j8unit.repository.javax.smartcardio.CardTerminalsTests
 */
@Category(J8UnitRepository.class)
public abstract interface CardTerminalsClassTests<SUT extends Class<? extends javax.smartcardio.CardTerminals>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.smartcardio.CardTerminals> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.smartcardio.CardTerminals.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.smartcardio.CardTerminals$State class javax.smartcardio.CardTerminals$State},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.smartcardio.CardTerminalsTests.StateTests}.
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
     * @see org.j8unit.repository.javax.smartcardio.CardTerminalsTests.StateTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface StateClassTests<SUT extends Class<? extends javax.smartcardio.CardTerminals.State>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT, javax.smartcardio.CardTerminals.State> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.smartcardio.CardTerminals.State> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.smartcardio.CardTerminals.State.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Test method for {@link javax.smartcardio.CardTerminals.State#values() public static
         * javax.smartcardio.CardTerminals$State[] javax.smartcardio.CardTerminals$State.values()}.
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

        /**
         * <p>
         * Test method for {@link javax.smartcardio.CardTerminals.State#valueOf(java.lang.String) public static
         * javax.smartcardio.CardTerminals$State javax.smartcardio.CardTerminals$State.valueOf(java.lang.String)}.
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

    }

}
