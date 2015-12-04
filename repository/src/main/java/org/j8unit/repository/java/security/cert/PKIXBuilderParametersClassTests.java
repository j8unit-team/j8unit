package org.j8unit.repository.java.security.cert;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.cert.PKIXBuilderParameters class java.security.cert.PKIXBuilderParameters},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.security.cert.PKIXBuilderParametersTests}.
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
 * @see org.j8unit.repository.java.security.cert.PKIXBuilderParametersTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PKIXBuilderParametersClassTests<SUT extends Class<? extends java.security.cert.PKIXBuilderParameters>>
extends org.j8unit.repository.java.security.cert.PKIXParametersClassTests<SUT> {

    /**
     * Test method for
     * {@link java.security.cert.PKIXBuilderParameters#PKIXBuilderParameters(java.security.KeyStore,java.security.cert.CertSelector)
     * public java.security.cert.PKIXBuilderParameters(java.security.KeyStore,java.security.cert.CertSelector) throws
     * java.security.KeyStoreException,java.security.InvalidAlgorithmParameterException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PKIXBuilderParameters_KeyStore_CertSelector()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.security.cert.PKIXBuilderParameters sut = null; // = new
                                                                   // PKIXBuilderParameters(java.security.KeyStore,java.security.cert.CertSelector);
    }

    /**
     * Test method for
     * {@link java.security.cert.PKIXBuilderParameters#PKIXBuilderParameters(java.util.Set,java.security.cert.CertSelector)
     * public java.security.cert.PKIXBuilderParameters(java.util.Set,java.security.cert.CertSelector) throws
     * java.security.InvalidAlgorithmParameterException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PKIXBuilderParameters_Set_CertSelector()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.security.cert.PKIXBuilderParameters sut = null; // = new
                                                                   // PKIXBuilderParameters(java.util.Set,java.security.cert.CertSelector);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.security.cert.PKIXBuilderParameters> sut = createNewSUT();
        // assert assignability
        assertTrue(java.security.cert.PKIXBuilderParameters.class.isAssignableFrom(sut));
    }

}
