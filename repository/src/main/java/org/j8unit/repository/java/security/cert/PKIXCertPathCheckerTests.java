package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.PKIXCertPathChecker class
 * java.security.cert.PKIXCertPathChecker}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link PKIXCertPathCheckerClassTests}.
 * </p>
 *
 * @see java.security.cert.PKIXCertPathChecker class java.security.cert.PKIXCertPathChecker (the hereby targeted
 *      class-under-test class)
 * @see PKIXCertPathCheckerClassTests PKIXCertPathCheckerClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PKIXCertPathCheckerTests<SUT extends java.security.cert.PKIXCertPathChecker>
extends CertPathCheckerTests<SUT>, org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathChecker#init(boolean) public abstract void
     * java.security.cert.PKIXCertPathChecker.init(boolean) throws java.security.cert.CertPathValidatorException}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathChecker#init(boolean) public abstract void
     * java.security.cert.PKIXCertPathChecker.init(boolean) throws java.security.cert.CertPathValidatorException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXCertPathChecker#init(boolean) public abstract void
     *      java.security.cert.PKIXCertPathChecker.init(boolean) throws java.security.cert.CertPathValidatorException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.security.cert.PKIXCertPathChecker#isForwardCheckingSupported() public abstract
     * boolean java.security.cert.PKIXCertPathChecker.isForwardCheckingSupported()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathChecker#isForwardCheckingSupported() public abstract
     * boolean java.security.cert.PKIXCertPathChecker.isForwardCheckingSupported()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXCertPathChecker#isForwardCheckingSupported() public abstract boolean
     *      java.security.cert.PKIXCertPathChecker.isForwardCheckingSupported() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isForwardCheckingSupported()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathChecker#clone() public java.lang.Object
     * java.security.cert.PKIXCertPathChecker.clone()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathChecker#clone() public java.lang.Object
     * java.security.cert.PKIXCertPathChecker.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXCertPathChecker#clone() public java.lang.Object
     *      java.security.cert.PKIXCertPathChecker.clone() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.cert.PKIXCertPathChecker#check(java.security.cert.Certificate, java.util.Collection) public
     * abstract void java.security.cert.PKIXCertPathChecker.check(java.security.cert.Certificate,java.util.Collection
     * <java.lang.String>) throws java.security.cert.CertPathValidatorException}.
     *
     * <p>
     * Test method for
     * {@link java.security.cert.PKIXCertPathChecker#check(java.security.cert.Certificate, java.util.Collection) public
     * abstract void java.security.cert.PKIXCertPathChecker.check(java.security.cert.Certificate,java.util.Collection)
     * throws java.security.cert.CertPathValidatorException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXCertPathChecker#check(java.security.cert.Certificate, java.util.Collection) public
     *      abstract void
     *      java.security.cert.PKIXCertPathChecker.check(java.security.cert.Certificate,java.util.Collection) throws
     *      java.security.cert.CertPathValidatorException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_check_Certificate_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathChecker#check(java.security.cert.Certificate) public void
     * java.security.cert.PKIXCertPathChecker.check(java.security.cert.Certificate) throws
     * java.security.cert.CertPathValidatorException}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathChecker#check(java.security.cert.Certificate) public void
     * java.security.cert.PKIXCertPathChecker.check(java.security.cert.Certificate) throws
     * java.security.cert.CertPathValidatorException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXCertPathChecker#check(java.security.cert.Certificate) public void
     *      java.security.cert.PKIXCertPathChecker.check(java.security.cert.Certificate) throws
     *      java.security.cert.CertPathValidatorException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.security.cert.PKIXCertPathChecker#getSupportedExtensions() public abstract
     * java.util.Set<java.lang.String> java.security.cert.PKIXCertPathChecker.getSupportedExtensions()}.
     *
     * <p>
     * Test method for {@link java.security.cert.PKIXCertPathChecker#getSupportedExtensions() public abstract
     * java.util.Set java.security.cert.PKIXCertPathChecker.getSupportedExtensions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.PKIXCertPathChecker#getSupportedExtensions() public abstract java.util.Set
     *      java.security.cert.PKIXCertPathChecker.getSupportedExtensions() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSupportedExtensions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
