package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CertPathChecker interface
 * java.security.cert.CertPathChecker}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link CertPathCheckerClassTests}.
 * </p>
 *
 * @see java.security.cert.CertPathChecker interface java.security.cert.CertPathChecker (the hereby targeted
 *      class-under-test class)
 * @see CertPathCheckerClassTests CertPathCheckerClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertPathCheckerTests<SUT extends java.security.cert.CertPathChecker>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathChecker#check(java.security.cert.Certificate) public abstract
     * void java.security.cert.CertPathChecker.check(java.security.cert.Certificate) throws
     * java.security.cert.CertPathValidatorException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertPathChecker#check(java.security.cert.Certificate) public abstract
     * void java.security.cert.CertPathChecker.check(java.security.cert.Certificate) throws
     * java.security.cert.CertPathValidatorException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPathChecker#check(java.security.cert.Certificate) public abstract void
     *      java.security.cert.CertPathChecker.check(java.security.cert.Certificate) throws
     *      java.security.cert.CertPathValidatorException (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.security.cert.CertPathChecker#init(boolean) public abstract void
     * java.security.cert.CertPathChecker.init(boolean) throws java.security.cert.CertPathValidatorException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPathChecker#init(boolean) public abstract void
     *      java.security.cert.CertPathChecker.init(boolean) throws java.security.cert.CertPathValidatorException (the
     *      hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.security.cert.CertPathChecker#isForwardCheckingSupported() public abstract boolean
     * java.security.cert.CertPathChecker.isForwardCheckingSupported()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPathChecker#isForwardCheckingSupported() public abstract boolean
     *      java.security.cert.CertPathChecker.isForwardCheckingSupported() (the hereby targeted method-under-test)
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
