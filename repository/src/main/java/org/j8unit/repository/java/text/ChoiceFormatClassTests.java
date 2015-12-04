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
 * Test class for {@link java.text.ChoiceFormat class java.text.ChoiceFormat},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.text.ChoiceFormatTests}.
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
 * @see org.j8unit.repository.java.text.ChoiceFormatTests
 */
@Category(J8UnitRepository.class)
public abstract interface ChoiceFormatClassTests<SUT extends Class<? extends java.text.ChoiceFormat>>
extends org.j8unit.repository.java.text.NumberFormatClassTests<SUT>
{

    /**
     * Test method for {@link java.text.ChoiceFormat#ChoiceFormat(double[],java.lang.String[]) public java.text.ChoiceFormat(double[],java.lang.String[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ChoiceFormat_doubleArray_StringArray() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.text.ChoiceFormat sut = null; // = new ChoiceFormat(double[],java.lang.String[]);
    }

    /**
     * Test method for {@link java.text.ChoiceFormat#ChoiceFormat(java.lang.String) public java.text.ChoiceFormat(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ChoiceFormat_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.text.ChoiceFormat sut = null; // = new ChoiceFormat(java.lang.String);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.text.ChoiceFormat> sut = createNewSUT();
        // assert assignability
        assertTrue(java.text.ChoiceFormat.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.text.ChoiceFormat#previousDouble(double) public static final double java.text.ChoiceFormat.previousDouble(double)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_previousDouble_double() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.ChoiceFormat#nextDouble(double,boolean) public static double java.text.ChoiceFormat.nextDouble(double,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_nextDouble_double_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.ChoiceFormat#nextDouble(double) public static final double java.text.ChoiceFormat.nextDouble(double)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_nextDouble_double() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
