package org.j8unit.repository.java.security.cert;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.cert.CertPathValidatorException class
 * java.security.cert.CertPathValidatorException}, containing all class relevant test methods (at least the test methods
 * of accessible constructors and of accessible {@code static} methods). The counterpart test class containing the
 * instance relevant test methods is {@link org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests}.
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
 * @see org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertPathValidatorExceptionClassTests<SUT extends Class<? extends java.security.cert.CertPathValidatorException>>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.security.cert.CertPathValidatorException$BasicReason class
     * java.security.cert.CertPathValidatorException$BasicReason}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests.BasicReasonTests}.
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
     * @see org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests.BasicReasonTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BasicReasonClassTests<SUT extends Class<? extends java.security.cert.CertPathValidatorException.BasicReason>>
    extends org.j8unit.repository.java.security.cert.CertPathValidatorExceptionClassTests.ReasonClassTests<SUT>,
    org.j8unit.repository.java.lang.EnumClassTests<SUT, java.security.cert.CertPathValidatorException.BasicReason> {

        /**
         * <p>
         * Test method for {@link java.security.cert.CertPathValidatorException.BasicReason#valueOf(java.lang.String)
         * public static java.security.cert.CertPathValidatorException$BasicReason
         * java.security.cert.CertPathValidatorException$BasicReason.valueOf(java.lang.String)}.
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
         * Test method for {@link java.security.cert.CertPathValidatorException.BasicReason#values() public static
         * java.security.cert.CertPathValidatorException$BasicReason[]
         * java.security.cert.CertPathValidatorException$BasicReason.values()}.
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
            final Class<? extends java.security.cert.CertPathValidatorException.BasicReason> sut = createNewSUT();
            // assert assignability
            assertTrue(java.security.cert.CertPathValidatorException.BasicReason.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.security.cert.CertPathValidatorException$Reason interface
     * java.security.cert.CertPathValidatorException$Reason}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests.ReasonTests}.
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
     * @see org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests.ReasonTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ReasonClassTests<SUT extends Class<? extends java.security.cert.CertPathValidatorException.Reason>>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.security.cert.CertPathValidatorException.Reason> sut = createNewSUT();
            // assert assignability
            assertTrue(java.security.cert.CertPathValidatorException.Reason.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link java.security.cert.CertPathValidatorException#CertPathValidatorException() public
     * java.security.cert.CertPathValidatorException()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_CertPathValidatorException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.security.cert.CertPathValidatorException sut = null; // = new CertPathValidatorException();
    }

    /**
     * Test method for {@link java.security.cert.CertPathValidatorException#CertPathValidatorException(java.lang.String)
     * public java.security.cert.CertPathValidatorException(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_CertPathValidatorException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.security.cert.CertPathValidatorException sut = null; // = new
                                                                        // CertPathValidatorException(java.lang.String);
    }

    /**
     * Test method for
     * {@link java.security.cert.CertPathValidatorException#CertPathValidatorException(java.lang.String,java.lang.Throwable)
     * public java.security.cert.CertPathValidatorException(java.lang.String,java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_CertPathValidatorException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.security.cert.CertPathValidatorException sut = null; // = new
                                                                        // CertPathValidatorException(java.lang.String,java.lang.Throwable);
    }

    /**
     * Test method for
     * {@link java.security.cert.CertPathValidatorException#CertPathValidatorException(java.lang.String,java.lang.Throwable,java.security.cert.CertPath,int)
     * public
     * java.security.cert.CertPathValidatorException(java.lang.String,java.lang.Throwable,java.security.cert.CertPath,int)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_CertPathValidatorException_String_Throwable_CertPath_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.security.cert.CertPathValidatorException sut = null; // = new
                                                                        // CertPathValidatorException(java.lang.String,java.lang.Throwable,java.security.cert.CertPath,int);
    }

    /**
     * Test method for
     * {@link java.security.cert.CertPathValidatorException#CertPathValidatorException(java.lang.String,java.lang.Throwable,java.security.cert.CertPath,int,java.security.cert.CertPathValidatorException.Reason)
     * public
     * java.security.cert.CertPathValidatorException(java.lang.String,java.lang.Throwable,java.security.cert.CertPath,int,java.security.cert.CertPathValidatorException$Reason)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_CertPathValidatorException_String_Throwable_CertPath_int_Reason()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.security.cert.CertPathValidatorException sut = null; // = new
                                                                        // CertPathValidatorException(java.lang.String,java.lang.Throwable,java.security.cert.CertPath,int,java.security.cert.CertPathValidatorException.Reason);
    }

    /**
     * Test method for
     * {@link java.security.cert.CertPathValidatorException#CertPathValidatorException(java.lang.Throwable) public
     * java.security.cert.CertPathValidatorException(java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_CertPathValidatorException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.security.cert.CertPathValidatorException sut = null; // = new
                                                                        // CertPathValidatorException(java.lang.Throwable);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.security.cert.CertPathValidatorException> sut = createNewSUT();
        // assert assignability
        assertTrue(java.security.cert.CertPathValidatorException.class.isAssignableFrom(sut));
    }

}