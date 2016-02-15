package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.Signature class java.security.Signature}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link SignatureClassTests}.
 * </p>
 *
 * @see java.security.Signature class java.security.Signature (the hereby targeted class-under-test class)
 * @see SignatureClassTests SignatureClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SignatureTests<SUT extends java.security.Signature>
extends SignatureSpiTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.Signature#sign() public final byte[] java.security.Signature.sign() throws
     * java.security.SignatureException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#sign() public final byte[] java.security.Signature.sign() throws
     * java.security.SignatureException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#sign() public final byte[] java.security.Signature.sign() throws
     *      java.security.SignatureException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sign()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#sign(byte[], int, int) public final int
     * java.security.Signature.sign(byte[],int,int) throws java.security.SignatureException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#sign(byte[], int, int) public final int
     * java.security.Signature.sign(byte[],int,int) throws java.security.SignatureException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#sign(byte[], int, int) public final int java.security.Signature.sign(byte[],int,int)
     *      throws java.security.SignatureException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sign_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#update(byte[]) public final void
     * java.security.Signature.update(byte[]) throws java.security.SignatureException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#update(byte[]) public final void
     * java.security.Signature.update(byte[]) throws java.security.SignatureException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#update(byte[]) public final void java.security.Signature.update(byte[]) throws
     *      java.security.SignatureException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_update_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#update(java.nio.ByteBuffer) public final void
     * java.security.Signature.update(java.nio.ByteBuffer) throws java.security.SignatureException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#update(java.nio.ByteBuffer) public final void
     * java.security.Signature.update(java.nio.ByteBuffer) throws java.security.SignatureException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#update(java.nio.ByteBuffer) public final void
     *      java.security.Signature.update(java.nio.ByteBuffer) throws java.security.SignatureException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_update_ByteBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#update(byte[], int, int) public final void
     * java.security.Signature.update(byte[],int,int) throws java.security.SignatureException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#update(byte[], int, int) public final void
     * java.security.Signature.update(byte[],int,int) throws java.security.SignatureException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#update(byte[], int, int) public final void
     *      java.security.Signature.update(byte[],int,int) throws java.security.SignatureException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_update_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#update(byte) public final void
     * java.security.Signature.update(byte) throws java.security.SignatureException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#update(byte) public final void
     * java.security.Signature.update(byte) throws java.security.SignatureException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#update(byte) public final void java.security.Signature.update(byte) throws
     *      java.security.SignatureException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_update_byte()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#getAlgorithm() public final java.lang.String
     * java.security.Signature.getAlgorithm()}.
     *
     * <p>
     * Test method for {@link java.security.Signature#getAlgorithm() public final java.lang.String
     * java.security.Signature.getAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#getAlgorithm() public final java.lang.String java.security.Signature.getAlgorithm()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAlgorithm()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#clone() public java.lang.Object java.security.Signature.clone()
     * throws java.lang.CloneNotSupportedException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#clone() public java.lang.Object java.security.Signature.clone()
     * throws java.lang.CloneNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#clone() public java.lang.Object java.security.Signature.clone() throws
     *      java.lang.CloneNotSupportedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.security.Signature#getParameters() public final java.security.AlgorithmParameters
     * java.security.Signature.getParameters()}.
     *
     * <p>
     * Test method for {@link java.security.Signature#getParameters() public final java.security.AlgorithmParameters
     * java.security.Signature.getParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#getParameters() public final java.security.AlgorithmParameters
     *      java.security.Signature.getParameters() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#setParameter(java.security.spec.AlgorithmParameterSpec) public
     * final void java.security.Signature.setParameter(java.security.spec.AlgorithmParameterSpec) throws
     * java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#setParameter(java.security.spec.AlgorithmParameterSpec) public
     * final void java.security.Signature.setParameter(java.security.spec.AlgorithmParameterSpec) throws
     * java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#setParameter(java.security.spec.AlgorithmParameterSpec) public final void
     *      java.security.Signature.setParameter(java.security.spec.AlgorithmParameterSpec) throws
     *      java.security.InvalidAlgorithmParameterException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setParameter_AlgorithmParameterSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#setParameter(String, Object) public final void
     * java.security.Signature.setParameter(java.lang.String,java.lang.Object) throws
     * java.security.InvalidParameterException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#setParameter(String, Object) public final void
     * java.security.Signature.setParameter(java.lang.String,java.lang.Object) throws
     * java.security.InvalidParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#setParameter(String, Object) public final void
     *      java.security.Signature.setParameter(java.lang.String,java.lang.Object) throws
     *      java.security.InvalidParameterException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setParameter_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#verify(byte[], int, int) public final boolean
     * java.security.Signature.verify(byte[],int,int) throws java.security.SignatureException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#verify(byte[], int, int) public final boolean
     * java.security.Signature.verify(byte[],int,int) throws java.security.SignatureException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#verify(byte[], int, int) public final boolean
     *      java.security.Signature.verify(byte[],int,int) throws java.security.SignatureException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_verify_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#verify(byte[]) public final boolean
     * java.security.Signature.verify(byte[]) throws java.security.SignatureException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#verify(byte[]) public final boolean
     * java.security.Signature.verify(byte[]) throws java.security.SignatureException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#verify(byte[]) public final boolean java.security.Signature.verify(byte[]) throws
     *      java.security.SignatureException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_verify_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#getProvider() public final java.security.Provider
     * java.security.Signature.getProvider()}.
     *
     * <p>
     * Test method for {@link java.security.Signature#getProvider() public final java.security.Provider
     * java.security.Signature.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#getProvider() public final java.security.Provider
     *      java.security.Signature.getProvider() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProvider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#toString() public java.lang.String
     * java.security.Signature.toString()}.
     *
     * <p>
     * Test method for {@link java.security.Signature#toString() public java.lang.String
     * java.security.Signature.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#toString() public java.lang.String java.security.Signature.toString() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.security.Signature#getParameter(String) public final java.lang.Object
     * java.security.Signature.getParameter(java.lang.String) throws java.security.InvalidParameterException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#getParameter(String) public final java.lang.Object
     * java.security.Signature.getParameter(java.lang.String) throws java.security.InvalidParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#getParameter(String) public final java.lang.Object
     *      java.security.Signature.getParameter(java.lang.String) throws java.security.InvalidParameterException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameter_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#initSign(java.security.PrivateKey, java.security.SecureRandom)
     * public final void java.security.Signature.initSign(java.security.PrivateKey,java.security.SecureRandom) throws
     * java.security.InvalidKeyException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#initSign(java.security.PrivateKey, java.security.SecureRandom)
     * public final void java.security.Signature.initSign(java.security.PrivateKey,java.security.SecureRandom) throws
     * java.security.InvalidKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#initSign(java.security.PrivateKey, java.security.SecureRandom) public final void
     *      java.security.Signature.initSign(java.security.PrivateKey,java.security.SecureRandom) throws
     *      java.security.InvalidKeyException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initSign_PrivateKey_SecureRandom()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#initSign(java.security.PrivateKey) public final void
     * java.security.Signature.initSign(java.security.PrivateKey) throws java.security.InvalidKeyException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#initSign(java.security.PrivateKey) public final void
     * java.security.Signature.initSign(java.security.PrivateKey) throws java.security.InvalidKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#initSign(java.security.PrivateKey) public final void
     *      java.security.Signature.initSign(java.security.PrivateKey) throws java.security.InvalidKeyException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initSign_PrivateKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#initVerify(java.security.cert.Certificate) public final void
     * java.security.Signature.initVerify(java.security.cert.Certificate) throws java.security.InvalidKeyException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#initVerify(java.security.cert.Certificate) public final void
     * java.security.Signature.initVerify(java.security.cert.Certificate) throws java.security.InvalidKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#initVerify(java.security.cert.Certificate) public final void
     *      java.security.Signature.initVerify(java.security.cert.Certificate) throws java.security.InvalidKeyException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initVerify_Certificate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Signature#initVerify(java.security.PublicKey) public final void
     * java.security.Signature.initVerify(java.security.PublicKey) throws java.security.InvalidKeyException}.
     *
     * <p>
     * Test method for {@link java.security.Signature#initVerify(java.security.PublicKey) public final void
     * java.security.Signature.initVerify(java.security.PublicKey) throws java.security.InvalidKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Signature#initVerify(java.security.PublicKey) public final void
     *      java.security.Signature.initVerify(java.security.PublicKey) throws java.security.InvalidKeyException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initVerify_PublicKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
