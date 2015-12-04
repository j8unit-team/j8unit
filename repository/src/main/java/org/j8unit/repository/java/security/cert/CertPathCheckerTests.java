package org.j8unit.repository.java.security.cert;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.cert.CertPathChecker interface java.security.cert.CertPathChecker}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.cert.CertPathCheckerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertPathCheckerTests<SUT extends java.security.cert.CertPathChecker>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathChecker#check(java.security.cert.Certificate) public abstract
     * void java.security.cert.CertPathChecker.check(java.security.cert.Certificate) throws
     * java.security.cert.CertPathValidatorException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_check_Certificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathChecker#init(boolean) public abstract void
     * java.security.cert.CertPathChecker.init(boolean) throws java.security.cert.CertPathValidatorException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathChecker#isForwardCheckingSupported() public abstract boolean
     * java.security.cert.CertPathChecker.isForwardCheckingSupported()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isForwardCheckingSupported()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
