package org.j8unit.repository.javax.jws.soap;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.jws.soap.SOAPBinding interface javax.jws.soap.SOAPBinding},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests}.
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
 * @see org.j8unit.repository.javax.jws.soap.SOAPBindingTests
 */
@Category(J8UnitRepository.class)
public abstract interface SOAPBindingClassTests<SUT extends Class<? extends javax.jws.soap.SOAPBinding>>
extends org.j8unit.repository.java.lang.annotation.AnnotationClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.jws.soap.SOAPBinding> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.jws.soap.SOAPBinding.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.jws.soap.SOAPBinding$Use class javax.jws.soap.SOAPBinding$Use},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests.UseTests}.
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
     * @see org.j8unit.repository.javax.jws.soap.SOAPBindingTests.UseTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface UseClassTests<SUT extends Class<? extends javax.jws.soap.SOAPBinding.Use>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT,javax.jws.soap.SOAPBinding.Use>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.jws.soap.SOAPBinding.Use> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.jws.soap.SOAPBinding.Use.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Test method for {@link javax.jws.soap.SOAPBinding.Use#valueOf(java.lang.String) public static javax.jws.soap.SOAPBinding$Use javax.jws.soap.SOAPBinding$Use.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.jws.soap.SOAPBinding.Use#values() public static javax.jws.soap.SOAPBinding$Use[] javax.jws.soap.SOAPBinding$Use.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.jws.soap.SOAPBinding$ParameterStyle class javax.jws.soap.SOAPBinding$ParameterStyle},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests.ParameterStyleTests}.
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
     * @see org.j8unit.repository.javax.jws.soap.SOAPBindingTests.ParameterStyleTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ParameterStyleClassTests<SUT extends Class<? extends javax.jws.soap.SOAPBinding.ParameterStyle>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT,javax.jws.soap.SOAPBinding.ParameterStyle>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.jws.soap.SOAPBinding.ParameterStyle> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.jws.soap.SOAPBinding.ParameterStyle.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Test method for {@link javax.jws.soap.SOAPBinding.ParameterStyle#values() public static javax.jws.soap.SOAPBinding$ParameterStyle[] javax.jws.soap.SOAPBinding$ParameterStyle.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.jws.soap.SOAPBinding.ParameterStyle#valueOf(java.lang.String) public static javax.jws.soap.SOAPBinding$ParameterStyle javax.jws.soap.SOAPBinding$ParameterStyle.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.jws.soap.SOAPBinding$Style class javax.jws.soap.SOAPBinding$Style},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.jws.soap.SOAPBindingTests.StyleTests}.
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
     * @see org.j8unit.repository.javax.jws.soap.SOAPBindingTests.StyleTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface StyleClassTests<SUT extends Class<? extends javax.jws.soap.SOAPBinding.Style>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT,javax.jws.soap.SOAPBinding.Style>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.jws.soap.SOAPBinding.Style> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.jws.soap.SOAPBinding.Style.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Test method for {@link javax.jws.soap.SOAPBinding.Style#values() public static javax.jws.soap.SOAPBinding$Style[] javax.jws.soap.SOAPBinding$Style.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.jws.soap.SOAPBinding.Style#valueOf(java.lang.String) public static javax.jws.soap.SOAPBinding$Style javax.jws.soap.SOAPBinding$Style.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
