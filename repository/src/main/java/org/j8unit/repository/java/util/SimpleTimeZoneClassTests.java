package org.j8unit.repository.java.util;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.SimpleTimeZone class java.util.SimpleTimeZone},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.util.SimpleTimeZoneTests}.
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
 * @see org.j8unit.repository.java.util.SimpleTimeZoneTests
 */
@Category(J8UnitRepository.class)
public abstract interface SimpleTimeZoneClassTests<SUT extends Class<? extends java.util.SimpleTimeZone>>
extends org.j8unit.repository.java.util.TimeZoneClassTests<SUT>
{

    /**
     * Test method for {@link java.util.SimpleTimeZone#SimpleTimeZone(int,java.lang.String,int,int,int,int,int,int,int,int,int,int,int) public java.util.SimpleTimeZone(int,java.lang.String,int,int,int,int,int,int,int,int,int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SimpleTimeZone_int_String_int_int_int_int_int_int_int_int_int_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.SimpleTimeZone sut = null; // = new SimpleTimeZone(int,java.lang.String,int,int,int,int,int,int,int,int,int,int,int);
    }

    /**
     * Test method for {@link java.util.SimpleTimeZone#SimpleTimeZone(int,java.lang.String,int,int,int,int,int,int,int,int,int) public java.util.SimpleTimeZone(int,java.lang.String,int,int,int,int,int,int,int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SimpleTimeZone_int_String_int_int_int_int_int_int_int_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.SimpleTimeZone sut = null; // = new SimpleTimeZone(int,java.lang.String,int,int,int,int,int,int,int,int,int);
    }

    /**
     * Test method for {@link java.util.SimpleTimeZone#SimpleTimeZone(int,java.lang.String,int,int,int,int,int,int,int,int) public java.util.SimpleTimeZone(int,java.lang.String,int,int,int,int,int,int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SimpleTimeZone_int_String_int_int_int_int_int_int_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.SimpleTimeZone sut = null; // = new SimpleTimeZone(int,java.lang.String,int,int,int,int,int,int,int,int);
    }

    /**
     * Test method for {@link java.util.SimpleTimeZone#SimpleTimeZone(int,java.lang.String) public java.util.SimpleTimeZone(int,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SimpleTimeZone_int_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.SimpleTimeZone sut = null; // = new SimpleTimeZone(int,java.lang.String);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.util.SimpleTimeZone> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.SimpleTimeZone.class.isAssignableFrom(sut));
    }

}
