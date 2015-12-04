package org.j8unit.repository.java.security.cert;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.security.cert.CertPathChecker interface java.security.cert.CertPathChecker},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.cert.CertPathCheckerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CertPathCheckerTests<SUT extends java.security.cert.CertPathChecker>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathChecker#check(java.security.cert.Certificate) public abstract void java.security.cert.CertPathChecker.check(java.security.cert.Certificate) throws java.security.cert.CertPathValidatorException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_check_Certificate() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathChecker#init(boolean) public abstract void java.security.cert.CertPathChecker.init(boolean) throws java.security.cert.CertPathValidatorException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathChecker#isForwardCheckingSupported() public abstract boolean java.security.cert.CertPathChecker.isForwardCheckingSupported()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isForwardCheckingSupported() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
