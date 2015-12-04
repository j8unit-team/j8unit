package org.j8unit.repository.java.security.cert;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.cert.CertStore class java.security.cert.CertStore}, containing all class relevant
 * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.security.cert.CertStoreTests}.
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
 * @see org.j8unit.repository.java.security.cert.CertStoreTests
 */
@Category(J8UnitRepository.class)
public abstract interface CertStoreClassTests<SUT extends Class<? extends java.security.cert.CertStore>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.security.cert.CertStore> sut = createNewSUT();
        // assert assignability
        assertTrue(java.security.cert.CertStore.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertStore#getDefaultType() public static final java.lang.String
     * java.security.cert.CertStore.getDefaultType()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.cert.CertStore#getInstance(java.lang.String,java.security.cert.CertStoreParameters) public
     * static java.security.cert.CertStore
     * java.security.cert.CertStore.getInstance(java.lang.String,java.security.cert.CertStoreParameters) throws
     * java.security.InvalidAlgorithmParameterException,java.security.NoSuchAlgorithmException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String_CertStoreParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.cert.CertStore#getInstance(java.lang.String,java.security.cert.CertStoreParameters,java.lang.String)
     * public static java.security.cert.CertStore
     * java.security.cert.CertStore.getInstance(java.lang.String,java.security.cert.CertStoreParameters,java.lang.String)
     * throws
     * java.security.InvalidAlgorithmParameterException,java.security.NoSuchAlgorithmException,java.security.NoSuchProviderException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String_CertStoreParameters_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.cert.CertStore#getInstance(java.lang.String,java.security.cert.CertStoreParameters,java.security.Provider)
     * public static java.security.cert.CertStore
     * java.security.cert.CertStore.getInstance(java.lang.String,java.security.cert.CertStoreParameters,java.security.Provider)
     * throws java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInstance_String_CertStoreParameters_Provider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
