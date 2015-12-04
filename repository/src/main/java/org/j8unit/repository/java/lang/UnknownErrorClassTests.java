package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.UnknownError class java.lang.UnknownError}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.lang.UnknownErrorTests}.
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
 * @see org.j8unit.repository.java.lang.UnknownErrorTests
 */
@Category(J8UnitRepository.class)
public abstract interface UnknownErrorClassTests<SUT extends Class<? extends java.lang.UnknownError>>
extends org.j8unit.repository.java.lang.VirtualMachineErrorClassTests<SUT> {

    /**
     * Test method for {@link java.lang.UnknownError#UnknownError() public java.lang.UnknownError()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_UnknownError()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.UnknownError sut = null; // = new UnknownError();
    }

    /**
     * Test method for {@link java.lang.UnknownError#UnknownError(java.lang.String) public
     * java.lang.UnknownError(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_UnknownError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.UnknownError sut = null; // = new UnknownError(java.lang.String);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.lang.UnknownError> sut = createNewSUT();
        // assert assignability
        assertTrue(java.lang.UnknownError.class.isAssignableFrom(sut));
    }

}
