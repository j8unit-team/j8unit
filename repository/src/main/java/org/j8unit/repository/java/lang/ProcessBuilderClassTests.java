package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.ProcessBuilder class java.lang.ProcessBuilder}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.lang.ProcessBuilderTests}.
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
 * @see org.j8unit.repository.java.lang.ProcessBuilderTests
 */
@Category(J8UnitRepository.class)
public abstract interface ProcessBuilderClassTests<SUT extends Class<? extends java.lang.ProcessBuilder>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.lang.ProcessBuilder$Redirect class java.lang.ProcessBuilder$Redirect}, containing all
     * class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.lang.ProcessBuilderTests.RedirectTests}.
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
     * @see org.j8unit.repository.java.lang.ProcessBuilderTests.RedirectTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface RedirectClassTests<SUT extends Class<? extends java.lang.ProcessBuilder.Redirect>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test class for {@link java.lang.ProcessBuilder$Redirect$Type class java.lang.ProcessBuilder$Redirect$Type},
         * containing all class relevant test methods (at least the test methods of accessible constructors and of
         * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods
         * is {@link org.j8unit.repository.java.lang.ProcessBuilderTests.RedirectTests.TypeTests}.
         * </p>
         *
         * <p>
         * In addition, there may be assertions concerning the class itself. For example,
         * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS,
         * Sec.&thinsp;9.6.1</a> Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides
         * a corresponding, inheritable test method:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
         * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
         * runtime constraints and further class specific requirements.
         * </p>
         *
         * @param SUT
         *            the type of the subject-under-test
         * @since 0.9.0
         * @see org.j8unit.repository.java.lang.ProcessBuilderTests.RedirectTests.TypeTests
         */
        @Category(J8UnitRepository.class)
        public static abstract interface TypeClassTests<SUT extends Class<? extends java.lang.ProcessBuilder.Redirect.Type>>
        extends org.j8unit.repository.java.lang.EnumClassTests<SUT, java.lang.ProcessBuilder.Redirect.Type> {

            /**
             * <p>
             * Test method for {@link java.lang.ProcessBuilder.Redirect.Type#valueOf(java.lang.String) public static
             * java.lang.ProcessBuilder$Redirect$Type java.lang.ProcessBuilder$Redirect$Type.valueOf(java.lang.String)}.
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
             * Test method for {@link java.lang.ProcessBuilder.Redirect.Type#values() public static
             * java.lang.ProcessBuilder$Redirect$Type[] java.lang.ProcessBuilder$Redirect$Type.values()}.
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
                final Class<? extends java.lang.ProcessBuilder.Redirect.Type> sut = createNewSUT();
                // assert assignability
                assertTrue(java.lang.ProcessBuilder.Redirect.Type.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Test method for {@link java.lang.ProcessBuilder.Redirect#appendTo(java.io.File) public static
         * java.lang.ProcessBuilder$Redirect java.lang.ProcessBuilder$Redirect.appendTo(java.io.File)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_appendTo_File()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.lang.ProcessBuilder.Redirect#from(java.io.File) public static
         * java.lang.ProcessBuilder$Redirect java.lang.ProcessBuilder$Redirect.from(java.io.File)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_from_File()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.lang.ProcessBuilder.Redirect#to(java.io.File) public static
         * java.lang.ProcessBuilder$Redirect java.lang.ProcessBuilder$Redirect.to(java.io.File)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_to_File()
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
            final Class<? extends java.lang.ProcessBuilder.Redirect> sut = createNewSUT();
            // assert assignability
            assertTrue(java.lang.ProcessBuilder.Redirect.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link java.lang.ProcessBuilder#ProcessBuilder(java.util.List) public
     * java.lang.ProcessBuilder(java.util.List)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ProcessBuilder_List()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.ProcessBuilder sut = null; // = new ProcessBuilder(java.util.List);
    }

    /**
     * Test method for {@link java.lang.ProcessBuilder#ProcessBuilder(java.lang.String...) public
     * java.lang.ProcessBuilder(java.lang.String...)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ProcessBuilder_StringArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.ProcessBuilder sut = null; // = new ProcessBuilder(java.lang.String...);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.lang.ProcessBuilder> sut = createNewSUT();
        // assert assignability
        assertTrue(java.lang.ProcessBuilder.class.isAssignableFrom(sut));
    }

}
