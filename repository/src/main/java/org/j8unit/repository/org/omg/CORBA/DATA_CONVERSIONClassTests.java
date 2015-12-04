package org.j8unit.repository.org.omg.CORBA;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.DATA_CONVERSION class org.omg.CORBA.DATA_CONVERSION}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.DATA_CONVERSIONTests}.
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
 * @see org.j8unit.repository.org.omg.CORBA.DATA_CONVERSIONTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DATA_CONVERSIONClassTests<SUT extends Class<? extends org.omg.CORBA.DATA_CONVERSION>>
extends org.j8unit.repository.org.omg.CORBA.SystemExceptionClassTests<SUT> {

    /**
     * Test method for {@link org.omg.CORBA.DATA_CONVERSION#DATA_CONVERSION() public org.omg.CORBA.DATA_CONVERSION()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DATA_CONVERSION()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.DATA_CONVERSION sut = null; // = new DATA_CONVERSION();
    }

    /**
     * Test method for {@link org.omg.CORBA.DATA_CONVERSION#DATA_CONVERSION(int,org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.DATA_CONVERSION(int,org.omg.CORBA.CompletionStatus)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DATA_CONVERSION_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.DATA_CONVERSION sut = null; // = new DATA_CONVERSION(int,org.omg.CORBA.CompletionStatus);
    }

    /**
     * Test method for {@link org.omg.CORBA.DATA_CONVERSION#DATA_CONVERSION(java.lang.String) public
     * org.omg.CORBA.DATA_CONVERSION(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DATA_CONVERSION_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.DATA_CONVERSION sut = null; // = new DATA_CONVERSION(java.lang.String);
    }

    /**
     * Test method for
     * {@link org.omg.CORBA.DATA_CONVERSION#DATA_CONVERSION(java.lang.String,int,org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.DATA_CONVERSION(java.lang.String,int,org.omg.CORBA.CompletionStatus)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DATA_CONVERSION_String_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.DATA_CONVERSION sut = null; // = new
                                                        // DATA_CONVERSION(java.lang.String,int,org.omg.CORBA.CompletionStatus);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends org.omg.CORBA.DATA_CONVERSION> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.CORBA.DATA_CONVERSION.class.isAssignableFrom(sut));
    }

}
