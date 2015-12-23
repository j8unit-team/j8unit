package org.j8unit.repository.java.text;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.text.MessageFormat class java.text.MessageFormat}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.text.MessageFormatTests}.
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
 * @see org.j8unit.repository.java.text.MessageFormatTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.text.MessageFormat
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MessageFormatClassTests<SUT extends java.text.MessageFormat>
extends org.j8unit.repository.java.text.FormatClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.text.MessageFormat.Field class java.text.MessageFormat$Field}
     * , containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.text.MessageFormatTests.FieldTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.java.text.MessageFormatTests.FieldTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.text.MessageFormat.Field
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FieldClassTests<SUT extends java.text.MessageFormat.Field>
    extends org.j8unit.repository.java.text.FormatClassTests.FieldClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim java.text.MessageFormat.Field#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.text.MessageFormat.Field.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link java.text.MessageFormat#MessageFormat(java.lang.String) public
     * java.text.MessageFormat(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.MessageFormat#MessageFormat(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MessageFormat_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.text.MessageFormat sut = null; // = new MessageFormat(java.lang.String);
    }

    /**
     * <p>
     * Test method for {@link java.text.MessageFormat#MessageFormat(java.lang.String, java.util.Locale) public
     * java.text.MessageFormat(java.lang.String,java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.MessageFormat#MessageFormat(java.lang.String, java.util.Locale)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MessageFormat_String_Locale()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.text.MessageFormat sut = null; // = new MessageFormat(java.lang.String, java.util.Locale);
    }

    /**
     * <p>
     * Test method for {@link java.text.MessageFormat#format(java.lang.String, java.lang.Object...) public static
     * java.lang.String java.text.MessageFormat.format(java.lang.String,java.lang.Object...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.MessageFormat#format(java.lang.String, java.lang.Object...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_format_String_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.text.MessageFormat#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.text.MessageFormat.class.isAssignableFrom(sut));
    }

}
