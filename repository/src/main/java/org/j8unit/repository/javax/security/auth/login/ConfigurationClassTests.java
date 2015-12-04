package org.j8unit.repository.javax.security.auth.login;

import static org.junit.Assert.assertTrue;
import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.security.auth.login.Configuration class javax.security.auth.login.Configuration},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.security.auth.login.ConfigurationTests}.
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
 * @see org.j8unit.repository.javax.security.auth.login.ConfigurationTests
 */
@Category(J8UnitRepository.class)
public abstract interface ConfigurationClassTests<SUT extends Class<? extends javax.security.auth.login.Configuration>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.security.auth.login.Configuration$Parameters interface
     * javax.security.auth.login.Configuration$Parameters}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.security.auth.login.ConfigurationTests.ParametersTests}.
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
     * @see org.j8unit.repository.javax.security.auth.login.ConfigurationTests.ParametersTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ParametersClassTests<SUT extends Class<? extends javax.security.auth.login.Configuration.Parameters>>
    extends J8UnitTest<SUT> {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.security.auth.login.Configuration.Parameters> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.security.auth.login.Configuration.Parameters.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.login.Configuration#getConfiguration() public static
     * javax.security.auth.login.Configuration javax.security.auth.login.Configuration.getConfiguration()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConfiguration()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.security.auth.login.Configuration#getInstance(java.lang.String,javax.security.auth.login.Configuration.Parameters)
     * public static javax.security.auth.login.Configuration
     * javax.security.auth.login.Configuration.getInstance(java.lang.String,javax.security.auth.login.Configuration$Parameters)
     * throws java.security.NoSuchAlgorithmException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String_Parameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.security.auth.login.Configuration#getInstance(java.lang.String,javax.security.auth.login.Configuration.Parameters,java.security.Provider)
     * public static javax.security.auth.login.Configuration
     * javax.security.auth.login.Configuration.getInstance(java.lang.String,javax.security.auth.login.Configuration$Parameters,java.security.Provider)
     * throws java.security.NoSuchAlgorithmException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String_Parameters_Provider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.security.auth.login.Configuration#getInstance(java.lang.String,javax.security.auth.login.Configuration.Parameters,java.lang.String)
     * public static javax.security.auth.login.Configuration
     * javax.security.auth.login.Configuration.getInstance(java.lang.String,javax.security.auth.login.Configuration$Parameters,java.lang.String)
     * throws java.security.NoSuchProviderException,java.security.NoSuchAlgorithmException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String_Parameters_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.security.auth.login.Configuration#setConfiguration(javax.security.auth.login.Configuration) public
     * static void javax.security.auth.login.Configuration.setConfiguration(javax.security.auth.login.Configuration)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setConfiguration_Configuration()
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
        final Class<? extends javax.security.auth.login.Configuration> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.security.auth.login.Configuration.class.isAssignableFrom(sut));
    }

}
