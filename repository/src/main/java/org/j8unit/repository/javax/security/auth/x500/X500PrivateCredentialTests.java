package org.j8unit.repository.javax.security.auth.x500;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.security.auth.x500.X500PrivateCredential class
 * javax.security.auth.x500.X500PrivateCredential}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.security.auth.x500.X500PrivateCredentialClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface X500PrivateCredentialTests<SUT extends javax.security.auth.x500.X500PrivateCredential>
extends org.j8unit.repository.javax.security.auth.DestroyableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.auth.x500.X500PrivateCredential#isDestroyed() public boolean
     * javax.security.auth.x500.X500PrivateCredential.isDestroyed()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
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
     * </p>
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
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
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
     * </p>
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
     * </p>
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
