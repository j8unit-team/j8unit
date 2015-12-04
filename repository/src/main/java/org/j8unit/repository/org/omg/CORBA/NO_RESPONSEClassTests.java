package org.j8unit.repository.org.omg.CORBA;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.NO_RESPONSE class org.omg.CORBA.NO_RESPONSE}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.NO_RESPONSETests}.
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
 * @see org.j8unit.repository.org.omg.CORBA.NO_RESPONSETests
 */
@Category(J8UnitRepository.class)
public abstract interface NO_RESPONSEClassTests<SUT extends Class<? extends org.omg.CORBA.NO_RESPONSE>>
extends org.j8unit.repository.org.omg.CORBA.SystemExceptionClassTests<SUT> {

    /**
     * Test method for {@link org.omg.CORBA.NO_RESPONSE#NO_RESPONSE(java.lang.String,int,org.omg.CORBA.CompletionStatus)
     * public org.omg.CORBA.NO_RESPONSE(java.lang.String,int,org.omg.CORBA.CompletionStatus)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_NO_RESPONSE_String_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.NO_RESPONSE sut = null; // = new
                                                    // NO_RESPONSE(java.lang.String,int,org.omg.CORBA.CompletionStatus);
    }

    /**
     * Test method for {@link org.omg.CORBA.NO_RESPONSE#NO_RESPONSE(int,org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.NO_RESPONSE(int,org.omg.CORBA.CompletionStatus)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_NO_RESPONSE_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.NO_RESPONSE sut = null; // = new NO_RESPONSE(int,org.omg.CORBA.CompletionStatus);
    }

    /**
     * Test method for {@link org.omg.CORBA.NO_RESPONSE#NO_RESPONSE(java.lang.String) public
     * org.omg.CORBA.NO_RESPONSE(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_NO_RESPONSE_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.NO_RESPONSE sut = null; // = new NO_RESPONSE(java.lang.String);
    }

    /**
     * Test method for {@link org.omg.CORBA.NO_RESPONSE#NO_RESPONSE() public org.omg.CORBA.NO_RESPONSE()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_NO_RESPONSE()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.NO_RESPONSE sut = null; // = new NO_RESPONSE();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends org.omg.CORBA.NO_RESPONSE> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.CORBA.NO_RESPONSE.class.isAssignableFrom(sut));
    }

}
