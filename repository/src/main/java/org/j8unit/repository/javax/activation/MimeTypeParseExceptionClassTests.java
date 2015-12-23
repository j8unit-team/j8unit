package org.j8unit.repository.javax.activation;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.activation.MimeTypeParseException class
 * javax.activation.MimeTypeParseException}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.activation.MimeTypeParseExceptionTests}.
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
 * @see org.j8unit.repository.javax.activation.MimeTypeParseExceptionTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.activation.MimeTypeParseException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MimeTypeParseExceptionClassTests<SUT extends javax.activation.MimeTypeParseException>
extends org.j8unit.repository.java.lang.ExceptionClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.activation.MimeTypeParseException#MimeTypeParseException() public
     * javax.activation.MimeTypeParseException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.activation.MimeTypeParseException#MimeTypeParseException()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MimeTypeParseException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.activation.MimeTypeParseException sut = null; // = new MimeTypeParseException();
    }

    /**
     * <p>
     * Test method for {@link javax.activation.MimeTypeParseException#MimeTypeParseException(java.lang.String) public
     * javax.activation.MimeTypeParseException(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.activation.MimeTypeParseException#MimeTypeParseException(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MimeTypeParseException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.activation.MimeTypeParseException sut = null; // = new MimeTypeParseException(java.lang.String);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.activation.MimeTypeParseException#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.activation.MimeTypeParseException.class.isAssignableFrom(sut));
    }

}
