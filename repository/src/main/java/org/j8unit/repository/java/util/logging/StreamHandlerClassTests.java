package org.j8unit.repository.java.util.logging;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.logging.StreamHandler class java.util.logging.StreamHandler}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.util.logging.StreamHandlerTests}.
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
 * @see org.j8unit.repository.java.util.logging.StreamHandlerTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StreamHandlerClassTests<SUT extends Class<? extends java.util.logging.StreamHandler>>
extends org.j8unit.repository.java.util.logging.HandlerClassTests<SUT> {

    /**
     * Test method for {@link java.util.logging.StreamHandler#StreamHandler() public java.util.logging.StreamHandler()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StreamHandler()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.logging.StreamHandler sut = null; // = new StreamHandler();
    }

    /**
     * Test method for
     * {@link java.util.logging.StreamHandler#StreamHandler(java.io.OutputStream,java.util.logging.Formatter) public
     * java.util.logging.StreamHandler(java.io.OutputStream,java.util.logging.Formatter)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StreamHandler_OutputStream_Formatter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.logging.StreamHandler sut = null; // = new
                                                          // StreamHandler(java.io.OutputStream,java.util.logging.Formatter);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.util.logging.StreamHandler> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.logging.StreamHandler.class.isAssignableFrom(sut));
    }

}
