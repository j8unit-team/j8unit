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
 * Test class for {@link java.text.DateFormatSymbols class java.text.DateFormatSymbols},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.text.DateFormatSymbolsTests}.
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
 * @see org.j8unit.repository.java.text.DateFormatSymbolsTests
 */
@Category(J8UnitRepository.class)
public abstract interface DateFormatSymbolsClassTests<SUT extends Class<? extends java.text.DateFormatSymbols>>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>,
        org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link java.text.DateFormatSymbols#DateFormatSymbols() public java.text.DateFormatSymbols()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DateFormatSymbols() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.text.DateFormatSymbols sut = null; // = new DateFormatSymbols();
    }

    /**
     * Test method for {@link java.text.DateFormatSymbols#DateFormatSymbols(java.util.Locale) public java.text.DateFormatSymbols(java.util.Locale)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DateFormatSymbols_Locale() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.text.DateFormatSymbols sut = null; // = new DateFormatSymbols(java.util.Locale);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.text.DateFormatSymbols> sut = createNewSUT();
        // assert assignability
        assertTrue(java.text.DateFormatSymbols.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.text.DateFormatSymbols#getInstance() public static final java.text.DateFormatSymbols java.text.DateFormatSymbols.getInstance()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.DateFormatSymbols#getInstance(java.util.Locale) public static final java.text.DateFormatSymbols java.text.DateFormatSymbols.getInstance(java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_Locale() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.DateFormatSymbols#getAvailableLocales() public static java.util.Locale[] java.text.DateFormatSymbols.getAvailableLocales()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAvailableLocales() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
