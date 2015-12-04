package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.cert.CertPathBuilder class java.security.cert.CertPathBuilder}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.cert.CertPathBuilderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CertPathBuilderTests<SUT extends java.security.cert.CertPathBuilder>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilder#getProvider() public final java.security.Provider
     * java.security.cert.CertPathBuilder.getProvider()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProvider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilder#getRevocationChecker() public final
     * java.security.cert.CertPathChecker java.security.cert.CertPathBuilder.getRevocationChecker()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRevocationChecker()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilder#build(java.security.cert.CertPathParameters) public
     * final java.security.cert.CertPathBuilderResult
     * java.security.cert.CertPathBuilder.build(java.security.cert.CertPathParameters) throws
     * java.security.cert.CertPathBuilderException,java.security.InvalidAlgorithmParameterException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_build_CertPathParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilder#getAlgorithm() public final java.lang.String
     * java.security.cert.CertPathBuilder.getAlgorithm()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAlgorithm()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
