package org.j8unit.repository.java.security.cert;

import java.security.cert.PKIXCertPathBuilderResult;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link PKIXCertPathBuilderResult public class java.security.cert.PKIXCertPathBuilderResult}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.security.cert.PKIXCertPathBuilderResultClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PKIXCertPathBuilderResultTests<SUT extends PKIXCertPathBuilderResult>
extends org.j8unit.repository.java.security.cert.CertPathBuilderResultTests<SUT>,
org.j8unit.repository.java.security.cert.PKIXCertPathValidatorResultTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.PKIXCertPathBuilderResult]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.cert.PKIXCertPathBuilderResult#toString() public java.lang.String
     * java.security.cert.PKIXCertPathBuilderResult.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test
     * {@link java.security.cert.PKIXCertPathBuilderResult#getCertPath() public java.security.cert.CertPath
     * java.security.cert.PKIXCertPathBuilderResult.getCertPath()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * <li>{@link java.security.cert.CertPathBuilderResult#clone() interface java.security.cert.CertPathBuilderResult}
     * </li>
     * <li>{@link java.security.cert.PKIXCertPathValidatorResult#clone() class
     * java.security.cert.PKIXCertPathValidatorResult}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this
     * compiler-error situation, this method must be overridden. Dont't worry, there will be meaningful test methods
     * soon and, thus, overriding becomes unnecessary.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        org.j8unit.repository.java.security.cert.CertPathBuilderResultTests.super.test_clone();
        org.j8unit.repository.java.security.cert.PKIXCertPathValidatorResultTests.super.test_clone();
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.PKIXCertPathBuilderResult]

}
