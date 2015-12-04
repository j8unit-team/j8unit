package org.j8unit.repository.java.sql;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.sql.SQLDataException class java.sql.SQLDataException},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.sql.SQLDataExceptionTests}.
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
 * @see org.j8unit.repository.java.sql.SQLDataExceptionTests
 */
@Category(J8UnitRepository.class)
public abstract interface SQLDataExceptionClassTests<SUT extends Class<? extends java.sql.SQLDataException>>
extends org.j8unit.repository.java.sql.SQLNonTransientExceptionClassTests<SUT>
{

    /**
     * Test method for {@link java.sql.SQLDataException#SQLDataException(java.lang.Throwable) public java.sql.SQLDataException(java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SQLDataException_Throwable() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.sql.SQLDataException sut = null; // = new SQLDataException(java.lang.Throwable);
    }

    /**
     * Test method for {@link java.sql.SQLDataException#SQLDataException(java.lang.String,java.lang.Throwable) public java.sql.SQLDataException(java.lang.String,java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SQLDataException_String_Throwable() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.sql.SQLDataException sut = null; // = new SQLDataException(java.lang.String,java.lang.Throwable);
    }

    /**
     * Test method for {@link java.sql.SQLDataException#SQLDataException(java.lang.String,java.lang.String,java.lang.Throwable) public java.sql.SQLDataException(java.lang.String,java.lang.String,java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SQLDataException_String_String_Throwable() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.sql.SQLDataException sut = null; // = new SQLDataException(java.lang.String,java.lang.String,java.lang.Throwable);
    }

    /**
     * Test method for {@link java.sql.SQLDataException#SQLDataException(java.lang.String,java.lang.String,int,java.lang.Throwable) public java.sql.SQLDataException(java.lang.String,java.lang.String,int,java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SQLDataException_String_String_int_Throwable() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.sql.SQLDataException sut = null; // = new SQLDataException(java.lang.String,java.lang.String,int,java.lang.Throwable);
    }

    /**
     * Test method for {@link java.sql.SQLDataException#SQLDataException() public java.sql.SQLDataException()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SQLDataException() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.sql.SQLDataException sut = null; // = new SQLDataException();
    }

    /**
     * Test method for {@link java.sql.SQLDataException#SQLDataException(java.lang.String) public java.sql.SQLDataException(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SQLDataException_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.sql.SQLDataException sut = null; // = new SQLDataException(java.lang.String);
    }

    /**
     * Test method for {@link java.sql.SQLDataException#SQLDataException(java.lang.String,java.lang.String) public java.sql.SQLDataException(java.lang.String,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SQLDataException_String_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.sql.SQLDataException sut = null; // = new SQLDataException(java.lang.String,java.lang.String);
    }

    /**
     * Test method for {@link java.sql.SQLDataException#SQLDataException(java.lang.String,java.lang.String,int) public java.sql.SQLDataException(java.lang.String,java.lang.String,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SQLDataException_String_String_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.sql.SQLDataException sut = null; // = new SQLDataException(java.lang.String,java.lang.String,int);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.sql.SQLDataException> sut = createNewSUT();
        // assert assignability
        assertTrue(java.sql.SQLDataException.class.isAssignableFrom(sut));
    }

}
