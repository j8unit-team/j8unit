package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.Formatter class java.util.Formatter}, containing all class relevant test methods (at
 * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.util.FormatterTests}.
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
 * @see org.j8unit.repository.java.util.FormatterTests
 */
@Category(J8UnitRepository.class)
public abstract interface FormatterClassTests<SUT extends Class<? extends java.util.Formatter>>
extends org.j8unit.repository.java.io.CloseableClassTests<SUT>, org.j8unit.repository.java.io.FlushableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.util.Formatter$BigDecimalLayoutForm class java.util.Formatter$BigDecimalLayoutForm},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.FormatterTests.BigDecimalLayoutFormTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.FormatterTests.BigDecimalLayoutFormTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface BigDecimalLayoutFormClassTests<SUT extends Class<? extends java.util.Formatter.BigDecimalLayoutForm>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT, java.util.Formatter.BigDecimalLayoutForm> {

        /**
         * <p>
         * Test method for {@link java.util.Formatter.BigDecimalLayoutForm#valueOf(java.lang.String) public static
         * java.util.Formatter$BigDecimalLayoutForm java.util.Formatter$BigDecimalLayoutForm.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Formatter.BigDecimalLayoutForm#values() public static
         * java.util.Formatter$BigDecimalLayoutForm[] java.util.Formatter$BigDecimalLayoutForm.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values()
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
            final Class<? extends java.util.Formatter.BigDecimalLayoutForm> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.Formatter.BigDecimalLayoutForm.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link java.util.Formatter#Formatter() public java.util.Formatter()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Formatter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Formatter sut = null; // = new Formatter();
    }

    /**
     * Test method for {@link java.util.Formatter#Formatter(java.lang.Appendable) public
     * java.util.Formatter(java.lang.Appendable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Formatter_Appendable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Formatter sut = null; // = new Formatter(java.lang.Appendable);
    }

    /**
     * Test method for {@link java.util.Formatter#Formatter(java.lang.Appendable,java.util.Locale) public
     * java.util.Formatter(java.lang.Appendable,java.util.Locale)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Formatter_Appendable_Locale()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Formatter sut = null; // = new Formatter(java.lang.Appendable,java.util.Locale);
    }

    /**
     * Test method for {@link java.util.Formatter#Formatter(java.io.File) public java.util.Formatter(java.io.File)
     * throws java.io.FileNotFoundException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Formatter_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Formatter sut = null; // = new Formatter(java.io.File);
    }

    /**
     * Test method for {@link java.util.Formatter#Formatter(java.io.File,java.lang.String) public
     * java.util.Formatter(java.io.File,java.lang.String) throws
     * java.io.FileNotFoundException,java.io.UnsupportedEncodingException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Formatter_File_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Formatter sut = null; // = new Formatter(java.io.File,java.lang.String);
    }

    /**
     * Test method for {@link java.util.Formatter#Formatter(java.io.File,java.lang.String,java.util.Locale) public
     * java.util.Formatter(java.io.File,java.lang.String,java.util.Locale) throws
     * java.io.FileNotFoundException,java.io.UnsupportedEncodingException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Formatter_File_String_Locale()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Formatter sut = null; // = new Formatter(java.io.File,java.lang.String,java.util.Locale);
    }

    /**
     * Test method for {@link java.util.Formatter#Formatter(java.util.Locale) public
     * java.util.Formatter(java.util.Locale)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Formatter_Locale()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Formatter sut = null; // = new Formatter(java.util.Locale);
    }

    /**
     * Test method for {@link java.util.Formatter#Formatter(java.io.OutputStream) public
     * java.util.Formatter(java.io.OutputStream)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Formatter_OutputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Formatter sut = null; // = new Formatter(java.io.OutputStream);
    }

    /**
     * Test method for {@link java.util.Formatter#Formatter(java.io.OutputStream,java.lang.String) public
     * java.util.Formatter(java.io.OutputStream,java.lang.String) throws java.io.UnsupportedEncodingException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Formatter_OutputStream_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Formatter sut = null; // = new Formatter(java.io.OutputStream,java.lang.String);
    }

    /**
     * Test method for {@link java.util.Formatter#Formatter(java.io.OutputStream,java.lang.String,java.util.Locale)
     * public java.util.Formatter(java.io.OutputStream,java.lang.String,java.util.Locale) throws
     * java.io.UnsupportedEncodingException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Formatter_OutputStream_String_Locale()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Formatter sut = null; // = new
                                              // Formatter(java.io.OutputStream,java.lang.String,java.util.Locale);
    }

    /**
     * Test method for {@link java.util.Formatter#Formatter(java.io.PrintStream) public
     * java.util.Formatter(java.io.PrintStream)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Formatter_PrintStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Formatter sut = null; // = new Formatter(java.io.PrintStream);
    }

    /**
     * Test method for {@link java.util.Formatter#Formatter(java.lang.String) public
     * java.util.Formatter(java.lang.String) throws java.io.FileNotFoundException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Formatter_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Formatter sut = null; // = new Formatter(java.lang.String);
    }

    /**
     * Test method for {@link java.util.Formatter#Formatter(java.lang.String,java.lang.String) public
     * java.util.Formatter(java.lang.String,java.lang.String) throws
     * java.io.FileNotFoundException,java.io.UnsupportedEncodingException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Formatter_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Formatter sut = null; // = new Formatter(java.lang.String,java.lang.String);
    }

    /**
     * Test method for {@link java.util.Formatter#Formatter(java.lang.String,java.lang.String,java.util.Locale) public
     * java.util.Formatter(java.lang.String,java.lang.String,java.util.Locale) throws
     * java.io.FileNotFoundException,java.io.UnsupportedEncodingException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Formatter_String_String_Locale()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Formatter sut = null; // = new Formatter(java.lang.String,java.lang.String,java.util.Locale);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.util.Formatter> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.Formatter.class.isAssignableFrom(sut));
    }

}
