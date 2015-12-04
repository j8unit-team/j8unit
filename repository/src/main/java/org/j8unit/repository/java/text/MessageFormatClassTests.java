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
 * Test class for {@link java.text.MessageFormat class java.text.MessageFormat},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.text.MessageFormatTests}.
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
 * @see org.j8unit.repository.java.text.MessageFormatTests
 */
@Category(J8UnitRepository.class)
public abstract interface MessageFormatClassTests<SUT extends Class<? extends java.text.MessageFormat>>
extends org.j8unit.repository.java.text.FormatClassTests<SUT>
{

    /**
     * Test method for {@link java.text.MessageFormat#MessageFormat(java.lang.String) public java.text.MessageFormat(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MessageFormat_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.text.MessageFormat sut = null; // = new MessageFormat(java.lang.String);
    }

    /**
     * Test method for {@link java.text.MessageFormat#MessageFormat(java.lang.String,java.util.Locale) public java.text.MessageFormat(java.lang.String,java.util.Locale)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MessageFormat_String_Locale() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.text.MessageFormat sut = null; // = new MessageFormat(java.lang.String,java.util.Locale);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.text.MessageFormat> sut = createNewSUT();
        // assert assignability
        assertTrue(java.text.MessageFormat.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.text.MessageFormat#format(java.lang.String,java.lang.Object...) public static java.lang.String java.text.MessageFormat.format(java.lang.String,java.lang.Object...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_format_String_ObjectArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link java.text.MessageFormat$Field class java.text.MessageFormat$Field},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.text.MessageFormatTests.FieldTests}.
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
     * @see org.j8unit.repository.java.text.MessageFormatTests.FieldTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FieldClassTests<SUT extends Class<? extends java.text.MessageFormat.Field>>
    extends org.j8unit.repository.java.text.FormatClassTests.FieldClassTests<SUT>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.text.MessageFormat.Field> sut = createNewSUT();
            // assert assignability
            assertTrue(java.text.MessageFormat.Field.class.isAssignableFrom(sut));
        }

    }

}
