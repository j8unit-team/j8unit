package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.ProcessBuilder class java.lang.ProcessBuilder}, containing
 * all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.lang.ProcessBuilderTests}.
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
 * @see org.j8unit.repository.java.lang.ProcessBuilderTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.ProcessBuilder
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ProcessBuilderClassTests<SUT extends java.lang.ProcessBuilder>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.lang.ProcessBuilder.Redirect class
     * java.lang.ProcessBuilder$Redirect}, containing all class relevant test methods (at least the test methods of
     * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.lang.ProcessBuilderTests.RedirectTests}.
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
     * @see org.j8unit.repository.java.lang.ProcessBuilderTests.RedirectTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.lang.ProcessBuilder.Redirect
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RedirectClassTests<SUT extends java.lang.ProcessBuilder.Redirect>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Reusable J8Unit test interface for {@linkplain java.lang.ProcessBuilder.Redirect.Type class
         * java.lang.ProcessBuilder$Redirect$Type}, containing all class relevant test methods (at least the test
         * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
         * interface containing the instance relevant test methods is
         * {@link org.j8unit.repository.java.lang.ProcessBuilderTests.RedirectTests.TypeTests}.
         * </p>
         *
         * <p>
         * In addition, there may be assertions concerning the class itself. For example,
         * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
         * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS,
         * Sec.&thinsp;9.6.1</a>). Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
         * provides a corresponding, inheritable test method:
         * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
         * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
         * runtime constraints and further class specific requirements.
         * </p>
         *
         * @see org.j8unit.repository.java.lang.ProcessBuilderTests.RedirectTests.TypeTests
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         *
         * @j8unit.aim java.lang.ProcessBuilder.Redirect.Type
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface TypeClassTests<SUT extends java.lang.ProcessBuilder.Redirect.Type>
        extends org.j8unit.repository.java.lang.EnumClassTests<SUT> {

            /**
             * <p>
             * Test method for {@link java.lang.ProcessBuilder.Redirect.Type#valueOf(java.lang.String) public static
             * java.lang.ProcessBuilder$Redirect$Type java.lang.ProcessBuilder$Redirect$Type.valueOf(java.lang.String)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim java.lang.ProcessBuilder.Redirect.Type#valueOf(java.lang.String)
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public default void test_valueOf_String()
            throws Exception {
                // query fresh subject-under-test
                final Class<SUT> sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * <p>
             * Test method for {@link java.lang.ProcessBuilder.Redirect.Type#values() public static
             * java.lang.ProcessBuilder$Redirect$Type[] java.lang.ProcessBuilder$Redirect$Type.values()}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @j8unit.aim java.lang.ProcessBuilder.Redirect.Type#values()
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public default void test_values()
            throws Exception {
                // query fresh subject-under-test
                final Class<SUT> sut = this.createNewSUT();
                assert sut != null;
            }

            /**
             * @since 0.9.2
             *
             * @j8unit.aim java.lang.ProcessBuilder.Redirect.Type#isAssignableFrom(java.lang.Class)
             */
            @Override
            @Test
            public default void testBaseTypeIsAssignableFromCurrentType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                assertTrue(java.lang.ProcessBuilder.Redirect.Type.class.isAssignableFrom(sut));
            }

        }

        /**
         * <p>
         * Test method for {@link java.lang.ProcessBuilder.Redirect#appendTo(java.io.File) public static
         * java.lang.ProcessBuilder$Redirect java.lang.ProcessBuilder$Redirect.appendTo(java.io.File)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.lang.ProcessBuilder.Redirect#appendTo(java.io.File)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_appendTo_File()
        throws Exception {
            // query fresh subject-under-test
            final Class<SUT> sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.lang.ProcessBuilder.Redirect#from(java.io.File) public static
         * java.lang.ProcessBuilder$Redirect java.lang.ProcessBuilder$Redirect.from(java.io.File)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.lang.ProcessBuilder.Redirect#from(java.io.File)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_from_File()
        throws Exception {
            // query fresh subject-under-test
            final Class<SUT> sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.lang.ProcessBuilder.Redirect#to(java.io.File) public static
         * java.lang.ProcessBuilder$Redirect java.lang.ProcessBuilder$Redirect.to(java.io.File)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.lang.ProcessBuilder.Redirect#to(java.io.File)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_to_File()
        throws Exception {
            // query fresh subject-under-test
            final Class<SUT> sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim java.lang.ProcessBuilder.Redirect#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.lang.ProcessBuilder.Redirect.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link java.lang.ProcessBuilder#ProcessBuilder(java.util.List) public
     * java.lang.ProcessBuilder(java.util.List)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.ProcessBuilder#ProcessBuilder(java.util.List)
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
     * <p>
     * Test method for {@link java.lang.ProcessBuilder#ProcessBuilder(java.lang.String...) public
     * java.lang.ProcessBuilder(java.lang.String...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.ProcessBuilder#ProcessBuilder(java.lang.String...)
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

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.lang.ProcessBuilder#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.lang.ProcessBuilder.class.isAssignableFrom(sut));
    }

}
