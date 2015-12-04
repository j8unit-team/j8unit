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
 * Test class for {@link java.util.GregorianCalendar class java.util.GregorianCalendar},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.util.GregorianCalendarTests}.
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
 * @see org.j8unit.repository.java.util.GregorianCalendarTests
 */
@Category(J8UnitRepository.class)
public abstract interface GregorianCalendarClassTests<SUT extends Class<? extends java.util.GregorianCalendar>>
extends org.j8unit.repository.java.util.CalendarClassTests<SUT>
{

    /**
     * Test method for {@link java.util.GregorianCalendar#GregorianCalendar(int,int,int) public java.util.GregorianCalendar(int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_GregorianCalendar_int_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.GregorianCalendar sut = null; // = new GregorianCalendar(int,int,int);
    }

    /**
     * Test method for {@link java.util.GregorianCalendar#GregorianCalendar(int,int,int,int,int) public java.util.GregorianCalendar(int,int,int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_GregorianCalendar_int_int_int_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.GregorianCalendar sut = null; // = new GregorianCalendar(int,int,int,int,int);
    }

    /**
     * Test method for {@link java.util.GregorianCalendar#GregorianCalendar(int,int,int,int,int,int) public java.util.GregorianCalendar(int,int,int,int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_GregorianCalendar_int_int_int_int_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.GregorianCalendar sut = null; // = new GregorianCalendar(int,int,int,int,int,int);
    }

    /**
     * Test method for {@link java.util.GregorianCalendar#GregorianCalendar() public java.util.GregorianCalendar()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_GregorianCalendar() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.GregorianCalendar sut = null; // = new GregorianCalendar();
    }

    /**
     * Test method for {@link java.util.GregorianCalendar#GregorianCalendar(java.util.TimeZone) public java.util.GregorianCalendar(java.util.TimeZone)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_GregorianCalendar_TimeZone() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.GregorianCalendar sut = null; // = new GregorianCalendar(java.util.TimeZone);
    }

    /**
     * Test method for {@link java.util.GregorianCalendar#GregorianCalendar(java.util.Locale) public java.util.GregorianCalendar(java.util.Locale)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_GregorianCalendar_Locale() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.GregorianCalendar sut = null; // = new GregorianCalendar(java.util.Locale);
    }

    /**
     * Test method for {@link java.util.GregorianCalendar#GregorianCalendar(java.util.TimeZone,java.util.Locale) public java.util.GregorianCalendar(java.util.TimeZone,java.util.Locale)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_GregorianCalendar_TimeZone_Locale() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.GregorianCalendar sut = null; // = new GregorianCalendar(java.util.TimeZone,java.util.Locale);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.util.GregorianCalendar> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.GregorianCalendar.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.util.GregorianCalendar#from(java.time.ZonedDateTime) public static java.util.GregorianCalendar java.util.GregorianCalendar.from(java.time.ZonedDateTime)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_from_ZonedDateTime() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
