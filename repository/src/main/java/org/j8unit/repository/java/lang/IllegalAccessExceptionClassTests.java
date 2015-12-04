package org.j8unit.repository.java.lang;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.lang.IllegalAccessException class java.lang.IllegalAccessException},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.lang.IllegalAccessExceptionTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.IllegalAccessExceptionTests
 */
@Category(J8UnitRepository.class)
public abstract interface IllegalAccessExceptionClassTests<SUT extends Class<? extends java.lang.IllegalAccessException>>
extends org.j8unit.repository.java.lang.ReflectiveOperationExceptionClassTests<SUT>
{

    /**
     * Test method for {@link java.lang.IllegalAccessException#IllegalAccessException() public java.lang.IllegalAccessException()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_IllegalAccessException() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.lang.IllegalAccessException sut = null; // = new IllegalAccessException();
    }

    /**
     * Test method for {@link java.lang.IllegalAccessException#IllegalAccessException(java.lang.String) public java.lang.IllegalAccessException(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_IllegalAccessException_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.lang.IllegalAccessException sut = null; // = new IllegalAccessException(java.lang.String);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.lang.IllegalAccessException> sut = createNewSUT();
        // assert assignability
        assertTrue(java.lang.IllegalAccessException.class.isAssignableFrom(sut));
    }

}
