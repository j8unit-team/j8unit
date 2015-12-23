package org.j8unit.repository.java.security.cert;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.cert.PKIXParameters class
 * java.security.cert.PKIXParameters}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.java.security.cert.PKIXParametersTests}.
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
 * @see org.j8unit.repository.java.security.cert.PKIXParametersTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.cert.PKIXParameters
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PKIXParametersClassTests<SUT extends java.security.cert.PKIXParameters>
extends org.j8unit.repository.java.security.cert.CertPathParametersClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#PKIXParameters(java.security.KeyStore) public
     * java.security.cert.PKIXParameters(java.security.KeyStore) throws
     * java.security.KeyStoreException,java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.cert.PKIXParameters#PKIXParameters(java.security.KeyStore)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PKIXParameters_KeyStore()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.security.cert.PKIXParameters sut = null; // = new PKIXParameters(java.security.KeyStore);
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXParameters#PKIXParameters(java.util.Set) public
     * java.security.cert.PKIXParameters(java.util.Set) throws java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.cert.PKIXParameters#PKIXParameters(java.util.Set)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PKIXParameters_Set()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.security.cert.PKIXParameters sut = null; // = new PKIXParameters(java.util.Set);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.security.cert.PKIXParameters#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.security.cert.PKIXParameters.class.isAssignableFrom(sut));
    }

}
