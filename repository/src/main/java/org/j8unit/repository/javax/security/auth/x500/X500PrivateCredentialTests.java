package org.j8unit.repository.javax.security.auth.x500;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.x500.X500PrivateCredential class
 * javax.security.auth.x500.X500PrivateCredential}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link X500PrivateCredentialClassTests}.
 * </p>
 *
 * @see javax.security.auth.x500.X500PrivateCredential class javax.security.auth.x500.X500PrivateCredential (the hereby
 *      targeted class-under-test class)
 * @see X500PrivateCredentialClassTests X500PrivateCredentialClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface X500PrivateCredentialTests<SUT extends javax.security.auth.x500.X500PrivateCredential>
extends org.j8unit.repository.javax.security.auth.DestroyableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.auth.x500.X500PrivateCredential#isDestroyed() public boolean
     * javax.security.auth.x500.X500PrivateCredential.isDestroyed()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.x500.X500PrivateCredential#isDestroyed() public boolean
     * javax.security.auth.x500.X500PrivateCredential.isDestroyed()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.x500.X500PrivateCredential#isDestroyed() public boolean
     *      javax.security.auth.x500.X500PrivateCredential.isDestroyed() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isDestroyed()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.x500.X500PrivateCredential#getCertificate() public
     * java.security.cert.X509Certificate javax.security.auth.x500.X500PrivateCredential.getCertificate()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.x500.X500PrivateCredential#getCertificate() public
     * java.security.cert.X509Certificate javax.security.auth.x500.X500PrivateCredential.getCertificate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.x500.X500PrivateCredential#getCertificate() public java.security.cert.X509Certificate
     *      javax.security.auth.x500.X500PrivateCredential.getCertificate() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.x500.X500PrivateCredential#destroy() public void
     * javax.security.auth.x500.X500PrivateCredential.destroy()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.x500.X500PrivateCredential#destroy() public void
     * javax.security.auth.x500.X500PrivateCredential.destroy()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.x500.X500PrivateCredential#destroy() public void
     *      javax.security.auth.x500.X500PrivateCredential.destroy() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_destroy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.x500.X500PrivateCredential#getPrivateKey() public
     * java.security.PrivateKey javax.security.auth.x500.X500PrivateCredential.getPrivateKey()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.x500.X500PrivateCredential#getPrivateKey() public
     * java.security.PrivateKey javax.security.auth.x500.X500PrivateCredential.getPrivateKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.x500.X500PrivateCredential#getPrivateKey() public java.security.PrivateKey
     *      javax.security.auth.x500.X500PrivateCredential.getPrivateKey() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrivateKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.x500.X500PrivateCredential#getAlias() public java.lang.String
     * javax.security.auth.x500.X500PrivateCredential.getAlias()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.x500.X500PrivateCredential#getAlias() public java.lang.String
     * javax.security.auth.x500.X500PrivateCredential.getAlias()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.x500.X500PrivateCredential#getAlias() public java.lang.String
     *      javax.security.auth.x500.X500PrivateCredential.getAlias() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAlias()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
