package org.j8unit.repository.javax.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.cert.Certificate class javax.security.cert.Certificate}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link CertificateClassTests}.
 * </p>
 *
 * @see javax.security.cert.Certificate class javax.security.cert.Certificate (the hereby targeted class-under-test
 *      class)
 * @see CertificateClassTests CertificateClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertificateTests<SUT extends javax.security.cert.Certificate>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.cert.Certificate#toString() public abstract java.lang.String
     * javax.security.cert.Certificate.toString()}.
     *
     * <p>
     * Test method for {@link javax.security.cert.Certificate#toString() public abstract java.lang.String
     * javax.security.cert.Certificate.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.Certificate#toString() public abstract java.lang.String
     *      javax.security.cert.Certificate.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.cert.Certificate#getPublicKey() public abstract java.security.PublicKey
     * javax.security.cert.Certificate.getPublicKey()}.
     *
     * <p>
     * Test method for {@link javax.security.cert.Certificate#getPublicKey() public abstract java.security.PublicKey
     * javax.security.cert.Certificate.getPublicKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.Certificate#getPublicKey() public abstract java.security.PublicKey
     *      javax.security.cert.Certificate.getPublicKey() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPublicKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.cert.Certificate#verify(java.security.PublicKey, String) public abstract
     * void javax.security.cert.Certificate.verify(java.security.PublicKey,java.lang.String) throws
     * javax.security.cert.CertificateException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException,java.security.NoSuchProviderException,java.security.SignatureException}
     * .
     *
     * <p>
     * Test method for {@link javax.security.cert.Certificate#verify(java.security.PublicKey, String) public abstract
     * void javax.security.cert.Certificate.verify(java.security.PublicKey,java.lang.String) throws
     * javax.security.cert.CertificateException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException,java.security.NoSuchProviderException,java.security.SignatureException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.Certificate#verify(java.security.PublicKey, String) public abstract void
     *      javax.security.cert.Certificate.verify(java.security.PublicKey,java.lang.String) throws
     *      javax.security.cert.CertificateException,java.security.NoSuchAlgorithmException,java.security.
     *      InvalidKeyException,java.security.NoSuchProviderException,java.security.SignatureException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_verify_PublicKey_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.cert.Certificate#verify(java.security.PublicKey) public abstract void
     * javax.security.cert.Certificate.verify(java.security.PublicKey) throws
     * javax.security.cert.CertificateException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException,java.security.NoSuchProviderException,java.security.SignatureException}
     * .
     *
     * <p>
     * Test method for {@link javax.security.cert.Certificate#verify(java.security.PublicKey) public abstract void
     * javax.security.cert.Certificate.verify(java.security.PublicKey) throws
     * javax.security.cert.CertificateException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException,java.security.NoSuchProviderException,java.security.SignatureException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.Certificate#verify(java.security.PublicKey) public abstract void
     *      javax.security.cert.Certificate.verify(java.security.PublicKey) throws
     *      javax.security.cert.CertificateException,java.security.NoSuchAlgorithmException,java.security.
     *      InvalidKeyException,java.security.NoSuchProviderException,java.security.SignatureException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_verify_PublicKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.cert.Certificate#hashCode() public int
     * javax.security.cert.Certificate.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.security.cert.Certificate#hashCode() public int
     * javax.security.cert.Certificate.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.Certificate#hashCode() public int javax.security.cert.Certificate.hashCode() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.cert.Certificate#getEncoded() public abstract byte[]
     * javax.security.cert.Certificate.getEncoded() throws javax.security.cert.CertificateEncodingException}.
     *
     * <p>
     * Test method for {@link javax.security.cert.Certificate#getEncoded() public abstract byte[]
     * javax.security.cert.Certificate.getEncoded() throws javax.security.cert.CertificateEncodingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.Certificate#getEncoded() public abstract byte[]
     *      javax.security.cert.Certificate.getEncoded() throws javax.security.cert.CertificateEncodingException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEncoded()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.cert.Certificate#equals(Object) public boolean
     * javax.security.cert.Certificate.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.security.cert.Certificate#equals(Object) public boolean
     * javax.security.cert.Certificate.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.cert.Certificate#equals(Object) public boolean
     *      javax.security.cert.Certificate.equals(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
