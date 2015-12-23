package org.j8unit.repository.javax.jws.soap;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.jws.soap.SOAPBinding interface javax.jws.soap.SOAPBinding},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests}.
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
 * @see org.j8unit.repository.javax.jws.soap.SOAPBindingTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.jws.soap.SOAPBinding
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SOAPBindingClassTests<SUT extends javax.jws.soap.SOAPBinding>
extends org.j8unit.repository.java.lang.annotation.AnnotationClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.jws.soap.SOAPBinding.ParameterStyle class
     * javax.jws.soap.SOAPBinding$ParameterStyle}, containing all class relevant test methods (at least the test methods
     * of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests.ParameterStyleTests}.
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
     * @see org.j8unit.repository.javax.jws.soap.SOAPBindingTests.ParameterStyleTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.jws.soap.SOAPBinding.ParameterStyle
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ParameterStyleClassTests<SUT extends javax.jws.soap.SOAPBinding.ParameterStyle>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.jws.soap.SOAPBinding.ParameterStyle#valueOf(java.lang.String) public static
         * javax.jws.soap.SOAPBinding$ParameterStyle
         * javax.jws.soap.SOAPBinding$ParameterStyle.valueOf(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.jws.soap.SOAPBinding.ParameterStyle#valueOf(java.lang.String)
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
         * Test method for {@link javax.jws.soap.SOAPBinding.ParameterStyle#values() public static
         * javax.jws.soap.SOAPBinding$ParameterStyle[] javax.jws.soap.SOAPBinding$ParameterStyle.values()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.jws.soap.SOAPBinding.ParameterStyle#values()
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
         * @j8unit.aim javax.jws.soap.SOAPBinding.ParameterStyle#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.jws.soap.SOAPBinding.ParameterStyle.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.jws.soap.SOAPBinding.Style class
     * javax.jws.soap.SOAPBinding$Style}, containing all class relevant test methods (at least the test methods of
     * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests.StyleTests}.
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
     * @see org.j8unit.repository.javax.jws.soap.SOAPBindingTests.StyleTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.jws.soap.SOAPBinding.Style
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface StyleClassTests<SUT extends javax.jws.soap.SOAPBinding.Style>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.jws.soap.SOAPBinding.Style#valueOf(java.lang.String) public static
         * javax.jws.soap.SOAPBinding$Style javax.jws.soap.SOAPBinding$Style.valueOf(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.jws.soap.SOAPBinding.Style#valueOf(java.lang.String)
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
         * Test method for {@link javax.jws.soap.SOAPBinding.Style#values() public static
         * javax.jws.soap.SOAPBinding$Style[] javax.jws.soap.SOAPBinding$Style.values()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.jws.soap.SOAPBinding.Style#values()
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
         * @j8unit.aim javax.jws.soap.SOAPBinding.Style#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.jws.soap.SOAPBinding.Style.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.jws.soap.SOAPBinding.Use class
     * javax.jws.soap.SOAPBinding$Use}, containing all class relevant test methods (at least the test methods of
     * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests.UseTests}.
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
     * @see org.j8unit.repository.javax.jws.soap.SOAPBindingTests.UseTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.jws.soap.SOAPBinding.Use
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UseClassTests<SUT extends javax.jws.soap.SOAPBinding.Use>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.jws.soap.SOAPBinding.Use#valueOf(java.lang.String) public static
         * javax.jws.soap.SOAPBinding$Use javax.jws.soap.SOAPBinding$Use.valueOf(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.jws.soap.SOAPBinding.Use#valueOf(java.lang.String)
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
         * Test method for {@link javax.jws.soap.SOAPBinding.Use#values() public static javax.jws.soap.SOAPBinding$Use[]
         * javax.jws.soap.SOAPBinding$Use.values()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.jws.soap.SOAPBinding.Use#values()
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
         * @j8unit.aim javax.jws.soap.SOAPBinding.Use#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.jws.soap.SOAPBinding.Use.class.isAssignableFrom(sut));
        }

    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.jws.soap.SOAPBinding#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.jws.soap.SOAPBinding.class.isAssignableFrom(sut));
    }

}
