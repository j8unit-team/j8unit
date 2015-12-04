package org.j8unit.repository.java.lang.invoke;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.invoke.LambdaConversionException class java.lang.invoke.LambdaConversionException},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.lang.invoke.LambdaConversionExceptionTests}.
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
 * @see org.j8unit.repository.java.lang.invoke.LambdaConversionExceptionTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LambdaConversionExceptionClassTests<SUT extends Class<? extends java.lang.invoke.LambdaConversionException>>
extends org.j8unit.repository.java.lang.ExceptionClassTests<SUT> {

    /**
     * Test method for {@link java.lang.invoke.LambdaConversionException#LambdaConversionException() public
     * java.lang.invoke.LambdaConversionException()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LambdaConversionException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.invoke.LambdaConversionException sut = null; // = new LambdaConversionException();
    }

    /**
     * Test method for {@link java.lang.invoke.LambdaConversionException#LambdaConversionException(java.lang.String)
     * public java.lang.invoke.LambdaConversionException(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LambdaConversionException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.invoke.LambdaConversionException sut = null; // = new
                                                                     // LambdaConversionException(java.lang.String);
    }

    /**
     * Test method for
     * {@link java.lang.invoke.LambdaConversionException#LambdaConversionException(java.lang.String,java.lang.Throwable)
     * public java.lang.invoke.LambdaConversionException(java.lang.String,java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LambdaConversionException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.invoke.LambdaConversionException sut = null; // = new
                                                                     // LambdaConversionException(java.lang.String,java.lang.Throwable);
    }

    /**
     * Test method for
     * {@link java.lang.invoke.LambdaConversionException#LambdaConversionException(java.lang.String,java.lang.Throwable,boolean,boolean)
     * public java.lang.invoke.LambdaConversionException(java.lang.String,java.lang.Throwable,boolean,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LambdaConversionException_String_Throwable_boolean_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.invoke.LambdaConversionException sut = null; // = new
                                                                     // LambdaConversionException(java.lang.String,java.lang.Throwable,boolean,boolean);
    }

    /**
     * Test method for {@link java.lang.invoke.LambdaConversionException#LambdaConversionException(java.lang.Throwable)
     * public java.lang.invoke.LambdaConversionException(java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LambdaConversionException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.invoke.LambdaConversionException sut = null; // = new
                                                                     // LambdaConversionException(java.lang.Throwable);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.lang.invoke.LambdaConversionException> sut = createNewSUT();
        // assert assignability
        assertTrue(java.lang.invoke.LambdaConversionException.class.isAssignableFrom(sut));
    }

}
