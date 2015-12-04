package org.j8unit.repository.javax.xml.ws;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.ws.ProtocolException class javax.xml.ws.ProtocolException},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.xml.ws.ProtocolExceptionTests}.
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
 * @see org.j8unit.repository.javax.xml.ws.ProtocolExceptionTests
 */
@Category(J8UnitRepository.class)
public abstract interface ProtocolExceptionClassTests<SUT extends Class<? extends javax.xml.ws.ProtocolException>>
extends org.j8unit.repository.javax.xml.ws.WebServiceExceptionClassTests<SUT>
{

    /**
     * Test method for {@link javax.xml.ws.ProtocolException#ProtocolException(java.lang.Throwable) public javax.xml.ws.ProtocolException(java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ProtocolException_Throwable() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.xml.ws.ProtocolException sut = null; // = new ProtocolException(java.lang.Throwable);
    }

    /**
     * Test method for {@link javax.xml.ws.ProtocolException#ProtocolException(java.lang.String,java.lang.Throwable) public javax.xml.ws.ProtocolException(java.lang.String,java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ProtocolException_String_Throwable() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.xml.ws.ProtocolException sut = null; // = new ProtocolException(java.lang.String,java.lang.Throwable);
    }

    /**
     * Test method for {@link javax.xml.ws.ProtocolException#ProtocolException(java.lang.String) public javax.xml.ws.ProtocolException(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ProtocolException_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.xml.ws.ProtocolException sut = null; // = new ProtocolException(java.lang.String);
    }

    /**
     * Test method for {@link javax.xml.ws.ProtocolException#ProtocolException() public javax.xml.ws.ProtocolException()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ProtocolException() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.xml.ws.ProtocolException sut = null; // = new ProtocolException();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.xml.ws.ProtocolException> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.ws.ProtocolException.class.isAssignableFrom(sut));
    }

}
