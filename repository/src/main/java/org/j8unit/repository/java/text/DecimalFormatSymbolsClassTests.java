package org.j8unit.repository.java.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.text.DecimalFormatSymbols class java.text.DecimalFormatSymbols}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.text.DecimalFormatSymbolsTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.text.DecimalFormatSymbolsTests
 */
@Category(J8UnitRepository.class)
public abstract interface DecimalFormatSymbolsClassTests<SUT extends Class<? extends java.text.DecimalFormatSymbols>>
extends org.j8unit.repository.java.lang.CloneableClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.text.DecimalFormatSymbols#DecimalFormatSymbols() public
     * java.text.DecimalFormatSymbols()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DecimalFormatSymbols()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.text.DecimalFormatSymbols sut = null; // = new DecimalFormatSymbols();
    }

    /**
     * Test method for {@link java.text.DecimalFormatSymbols#DecimalFormatSymbols(java.util.Locale) public
     * java.text.DecimalFormatSymbols(java.util.Locale)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DecimalFormatSymbols_Locale()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.text.DecimalFormatSymbols sut = null; // = new DecimalFormatSymbols(java.util.Locale);
    }

    /**
     * <p>
     * Test method for {@link java.text.DecimalFormatSymbols#getAvailableLocales() public static java.util.Locale[]
     * java.text.DecimalFormatSymbols.getAvailableLocales()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAvailableLocales()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.DecimalFormatSymbols#getInstance() public static final
     * java.text.DecimalFormatSymbols java.text.DecimalFormatSymbols.getInstance()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.DecimalFormatSymbols#getInstance(java.util.Locale) public static final
     * java.text.DecimalFormatSymbols java.text.DecimalFormatSymbols.getInstance(java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.text.DecimalFormatSymbols> sut = createNewSUT();
        // assert assignability
        assertTrue(java.text.DecimalFormatSymbols.class.isAssignableFrom(sut));
    }

}
