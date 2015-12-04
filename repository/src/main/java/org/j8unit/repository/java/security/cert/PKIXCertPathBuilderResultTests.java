package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.cert.PKIXCertPathBuilderResult class
 * java.security.cert.PKIXCertPathBuilderResult}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.cert.PKIXCertPathBuilderResultClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PKIXCertPathBuilderResultTests<SUT extends java.security.cert.PKIXCertPathBuilderResult>
extends org.j8unit.repository.java.security.cert.CertPathBuilderResultTests<SUT>,
org.j8unit.repository.java.security.cert.PKIXCertPathValidatorResultTests<SUT> {

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test. In result, there are duplicated according test method within the super test classes. To solve
     * this situation, this method must be overriden. Dont't worry, there will be meaningful test methods soon and,
     * thus, overriding becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_clone()
    throws Exception {
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathBuilderResult#getCertPath() public
     * java.security.cert.CertPath java.security.cert.PKIXCertPathBuilderResult.getCertPath()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCertPath()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathBuilderResult#toString() public java.lang.String
     * java.security.cert.PKIXCertPathBuilderResult.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
