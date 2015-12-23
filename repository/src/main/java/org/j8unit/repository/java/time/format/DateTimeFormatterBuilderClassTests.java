package org.j8unit.repository.java.time.format;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.time.format.DateTimeFormatterBuilder class
 * java.time.format.DateTimeFormatterBuilder}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.java.time.format.DateTimeFormatterBuilderTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.java.time.format.DateTimeFormatterBuilderTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.time.format.DateTimeFormatterBuilder
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DateTimeFormatterBuilderClassTests<SUT extends java.time.format.DateTimeFormatterBuilder>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeFormatterBuilder#DateTimeFormatterBuilder() public
     * java.time.format.DateTimeFormatterBuilder()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.format.DateTimeFormatterBuilder#DateTimeFormatterBuilder()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DateTimeFormatterBuilder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.time.format.DateTimeFormatterBuilder sut = null; // = new DateTimeFormatterBuilder();
    }

    /**
     * <p>
     * Test method for
     * {@link java.time.format.DateTimeFormatterBuilder#getLocalizedDateTimePattern(java.time.format.FormatStyle, java.time.format.FormatStyle, java.time.chrono.Chronology, java.util.Locale)
     * public static java.lang.String
     * java.time.format.DateTimeFormatterBuilder.getLocalizedDateTimePattern(java.time.format.FormatStyle,java.time.format.FormatStyle,java.time.chrono.Chronology,java.util.Locale)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.format.DateTimeFormatterBuilder#getLocalizedDateTimePattern(java.time.format.FormatStyle,
     *             java.time.format.FormatStyle, java.time.chrono.Chronology, java.util.Locale)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocalizedDateTimePattern_FormatStyle_FormatStyle_Chronology_Locale()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.time.format.DateTimeFormatterBuilder#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.time.format.DateTimeFormatterBuilder.class.isAssignableFrom(sut));
    }

}
