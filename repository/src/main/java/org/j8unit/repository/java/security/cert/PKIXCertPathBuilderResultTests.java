package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.PKIXCertPathBuilderResult class
 * java.security.cert.PKIXCertPathBuilderResult}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link PKIXCertPathBuilderResultClassTests}.
 * </p>
 *
 * @see java.security.cert.PKIXCertPathBuilderResult class java.security.cert.PKIXCertPathBuilderResult (the hereby
 *      targeted class-under-test class)
 * @see PKIXCertPathBuilderResultClassTests PKIXCertPathBuilderResultClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PKIXCertPathBuilderResultTests<SUT extends java.security.cert.PKIXCertPathBuilderResult>
extends CertPathBuilderResultTests<SUT>, PKIXCertPathValidatorResultTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathBuilderResult#toString() public java.lang.String
     * java.security.cert.PKIXCertPathBuilderResult.toString()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathBuilderResult#toString() public java.lang.String
     * java.security.cert.PKIXCertPathBuilderResult.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXCertPathBuilderResult#toString() public java.lang.String
     *      java.security.cert.PKIXCertPathBuilderResult.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathBuilderResult#getCertPath() public
     * java.security.cert.CertPath java.security.cert.PKIXCertPathBuilderResult.getCertPath()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathBuilderResult#getCertPath() public
     * java.security.cert.CertPath java.security.cert.PKIXCertPathBuilderResult.getCertPath()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXCertPathBuilderResult#getCertPath() public java.security.cert.CertPath
     *      java.security.cert.PKIXCertPathBuilderResult.getCertPath() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCertPath()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.security.cert.PKIXCertPathValidatorResult#clone() class
     * java.security.cert.PKIXCertPathValidatorResult}</li>
     * <li>{@linkplain java.security.cert.CertPathBuilderResult#clone() interface
     * java.security.cert.CertPathBuilderResult}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
    }

}
