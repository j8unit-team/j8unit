package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.cert.CertPathBuilderResult interface
 * java.security.cert.CertPathBuilderResult}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.cert.CertPathBuilderResultTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.cert.CertPathBuilderResultClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.cert.CertPathBuilderResult
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertPathBuilderResultTests<SUT extends java.security.cert.CertPathBuilderResult>
extends org.j8unit.repository.java.lang.CloneableTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilderResult#clone() public abstract java.lang.Object
     * java.security.cert.CertPathBuilderResult.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.cert.CertPathBuilderResult#clone()
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
     * Test method for {@link java.security.cert.CertPathBuilderResult#getCertPath() public abstract
     * java.security.cert.CertPath java.security.cert.CertPathBuilderResult.getCertPath()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.cert.CertPathBuilderResult#getCertPath()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertPath()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
