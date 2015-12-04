package org.j8unit.repository.java.text;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.text.SimpleDateFormat class java.text.SimpleDateFormat},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.text.SimpleDateFormatTests}.
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
 * @see org.j8unit.repository.java.text.SimpleDateFormatTests
 */
@Category(J8UnitRepository.class)
public abstract interface SimpleDateFormatClassTests<SUT extends Class<? extends java.text.SimpleDateFormat>>
extends org.j8unit.repository.java.text.DateFormatClassTests<SUT>
{

    /**
     * Test method for {@link java.text.SimpleDateFormat#SimpleDateFormat(java.lang.String,java.text.DateFormatSymbols) public java.text.SimpleDateFormat(java.lang.String,java.text.DateFormatSymbols)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SimpleDateFormat_String_DateFormatSymbols() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.text.SimpleDateFormat sut = null; // = new SimpleDateFormat(java.lang.String,java.text.DateFormatSymbols);
    }

    /**
     * Test method for {@link java.text.SimpleDateFormat#SimpleDateFormat(java.lang.String,java.util.Locale) public java.text.SimpleDateFormat(java.lang.String,java.util.Locale)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SimpleDateFormat_String_Locale() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.text.SimpleDateFormat sut = null; // = new SimpleDateFormat(java.lang.String,java.util.Locale);
    }

    /**
     * Test method for {@link java.text.SimpleDateFormat#SimpleDateFormat(java.lang.String) public java.text.SimpleDateFormat(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SimpleDateFormat_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.text.SimpleDateFormat sut = null; // = new SimpleDateFormat(java.lang.String);
    }

    /**
     * Test method for {@link java.text.SimpleDateFormat#SimpleDateFormat() public java.text.SimpleDateFormat()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SimpleDateFormat() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.text.SimpleDateFormat sut = null; // = new SimpleDateFormat();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.text.SimpleDateFormat> sut = createNewSUT();
        // assert assignability
        assertTrue(java.text.SimpleDateFormat.class.isAssignableFrom(sut));
    }

}
