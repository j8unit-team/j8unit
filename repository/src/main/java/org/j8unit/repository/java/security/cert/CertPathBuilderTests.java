package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CertPathBuilder class
 * java.security.cert.CertPathBuilder}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link CertPathBuilderClassTests}.
 * </p>
 *
 * @see java.security.cert.CertPathBuilder class java.security.cert.CertPathBuilder (the hereby targeted
 *      class-under-test class)
 * @see CertPathBuilderClassTests CertPathBuilderClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertPathBuilderTests<SUT extends java.security.cert.CertPathBuilder>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilder#getProvider() public final java.security.Provider
     * java.security.cert.CertPathBuilder.getProvider()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilder#getProvider() public final java.security.Provider
     * java.security.cert.CertPathBuilder.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPathBuilder#getProvider() public final java.security.Provider
     *      java.security.cert.CertPathBuilder.getProvider() (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilder#getRevocationChecker() public final
     * java.security.cert.CertPathChecker java.security.cert.CertPathBuilder.getRevocationChecker()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPathBuilder#getRevocationChecker() public final java.security.cert.CertPathChecker
     *      java.security.cert.CertPathBuilder.getRevocationChecker() (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilder#build(java.security.cert.CertPathParameters) public
     * final java.security.cert.CertPathBuilderResult
     * java.security.cert.CertPathBuilder.build(java.security.cert.CertPathParameters) throws
     * java.security.cert.CertPathBuilderException,java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPathBuilder#build(java.security.cert.CertPathParameters) public final
     *      java.security.cert.CertPathBuilderResult
     *      java.security.cert.CertPathBuilder.build(java.security.cert.CertPathParameters) throws
     *      java.security.cert.CertPathBuilderException,java.security.InvalidAlgorithmParameterException (the hereby
     *      targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilder#getAlgorithm() public final java.lang.String
     * java.security.cert.CertPathBuilder.getAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPathBuilder#getAlgorithm() public final java.lang.String
     *      java.security.cert.CertPathBuilder.getAlgorithm() (the hereby targeted method-under-test)
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
