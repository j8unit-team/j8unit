package org.j8unit.repository.org.omg.CORBA;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.PolicyError class org.omg.CORBA.PolicyError}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.PolicyErrorTests}.
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
 * @see org.j8unit.repository.org.omg.CORBA.PolicyErrorTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PolicyErrorClassTests<SUT extends Class<? extends org.omg.CORBA.PolicyError>>
extends org.j8unit.repository.org.omg.CORBA.UserExceptionClassTests<SUT> {

    /**
     * Test method for {@link org.omg.CORBA.PolicyError#PolicyError() public org.omg.CORBA.PolicyError()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PolicyError()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.PolicyError sut = null; // = new PolicyError();
    }

    /**
     * Test method for {@link org.omg.CORBA.PolicyError#PolicyError(short) public org.omg.CORBA.PolicyError(short)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PolicyError_short()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.PolicyError sut = null; // = new PolicyError(short);
    }

    /**
     * Test method for {@link org.omg.CORBA.PolicyError#PolicyError(java.lang.String,short) public
     * org.omg.CORBA.PolicyError(java.lang.String,short)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PolicyError_String_short()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.PolicyError sut = null; // = new PolicyError(java.lang.String,short);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends org.omg.CORBA.PolicyError> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.CORBA.PolicyError.class.isAssignableFrom(sut));
    }

}
