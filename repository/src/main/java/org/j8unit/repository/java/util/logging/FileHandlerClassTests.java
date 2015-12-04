package org.j8unit.repository.java.util.logging;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.logging.FileHandler class java.util.logging.FileHandler},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.util.logging.FileHandlerTests}.
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
 * @see org.j8unit.repository.java.util.logging.FileHandlerTests
 */
@Category(J8UnitRepository.class)
public abstract interface FileHandlerClassTests<SUT extends Class<? extends java.util.logging.FileHandler>>
extends org.j8unit.repository.java.util.logging.StreamHandlerClassTests<SUT>
{

    /**
     * Test method for {@link java.util.logging.FileHandler#FileHandler(java.lang.String,int,int) public java.util.logging.FileHandler(java.lang.String,int,int) throws java.io.IOException,java.lang.SecurityException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_FileHandler_String_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.logging.FileHandler sut = null; // = new FileHandler(java.lang.String,int,int);
    }

    /**
     * Test method for {@link java.util.logging.FileHandler#FileHandler(java.lang.String) public java.util.logging.FileHandler(java.lang.String) throws java.io.IOException,java.lang.SecurityException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_FileHandler_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.logging.FileHandler sut = null; // = new FileHandler(java.lang.String);
    }

    /**
     * Test method for {@link java.util.logging.FileHandler#FileHandler() public java.util.logging.FileHandler() throws java.io.IOException,java.lang.SecurityException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_FileHandler() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.logging.FileHandler sut = null; // = new FileHandler();
    }

    /**
     * Test method for {@link java.util.logging.FileHandler#FileHandler(java.lang.String,int,int,boolean) public java.util.logging.FileHandler(java.lang.String,int,int,boolean) throws java.io.IOException,java.lang.SecurityException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_FileHandler_String_int_int_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.logging.FileHandler sut = null; // = new FileHandler(java.lang.String,int,int,boolean);
    }

    /**
     * Test method for {@link java.util.logging.FileHandler#FileHandler(java.lang.String,boolean) public java.util.logging.FileHandler(java.lang.String,boolean) throws java.io.IOException,java.lang.SecurityException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_FileHandler_String_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.logging.FileHandler sut = null; // = new FileHandler(java.lang.String,boolean);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.util.logging.FileHandler> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.logging.FileHandler.class.isAssignableFrom(sut));
    }

}
