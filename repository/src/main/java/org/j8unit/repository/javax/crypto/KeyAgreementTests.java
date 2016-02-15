package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.KeyAgreement class javax.crypto.KeyAgreement}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link KeyAgreementClassTests}.
 * </p>
 *
 * @see javax.crypto.KeyAgreement class javax.crypto.KeyAgreement (the hereby targeted class-under-test class)
 * @see KeyAgreementClassTests KeyAgreementClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyAgreementTests<SUT extends javax.crypto.KeyAgreement>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#getAlgorithm() public final java.lang.String
     * javax.crypto.KeyAgreement.getAlgorithm()}.
     *
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#getAlgorithm() public final java.lang.String
     * javax.crypto.KeyAgreement.getAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.KeyAgreement#getAlgorithm() public final java.lang.String
     *      javax.crypto.KeyAgreement.getAlgorithm() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.crypto.KeyAgreement#init(java.security.Key) public final void
     * javax.crypto.KeyAgreement.init(java.security.Key) throws java.security.InvalidKeyException}.
     *
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#init(java.security.Key) public final void
     * javax.crypto.KeyAgreement.init(java.security.Key) throws java.security.InvalidKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.KeyAgreement#init(java.security.Key) public final void
     *      javax.crypto.KeyAgreement.init(java.security.Key) throws java.security.InvalidKeyException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_Key()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#init(java.security.Key, java.security.SecureRandom) public final
     * void javax.crypto.KeyAgreement.init(java.security.Key,java.security.SecureRandom) throws
     * java.security.InvalidKeyException}.
     *
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#init(java.security.Key, java.security.SecureRandom) public final
     * void javax.crypto.KeyAgreement.init(java.security.Key,java.security.SecureRandom) throws
     * java.security.InvalidKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.KeyAgreement#init(java.security.Key, java.security.SecureRandom) public final void
     *      javax.crypto.KeyAgreement.init(java.security.Key,java.security.SecureRandom) throws
     *      java.security.InvalidKeyException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_Key_SecureRandom()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.crypto.KeyAgreement#init(java.security.Key, java.security.spec.AlgorithmParameterSpec) public final
     * void javax.crypto.KeyAgreement.init(java.security.Key,java.security.spec.AlgorithmParameterSpec) throws
     * java.security.InvalidKeyException,java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for
     * {@link javax.crypto.KeyAgreement#init(java.security.Key, java.security.spec.AlgorithmParameterSpec) public final
     * void javax.crypto.KeyAgreement.init(java.security.Key,java.security.spec.AlgorithmParameterSpec) throws
     * java.security.InvalidKeyException,java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.KeyAgreement#init(java.security.Key, java.security.spec.AlgorithmParameterSpec) public final
     *      void javax.crypto.KeyAgreement.init(java.security.Key,java.security.spec.AlgorithmParameterSpec) throws
     *      java.security.InvalidKeyException,java.security.InvalidAlgorithmParameterException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_Key_AlgorithmParameterSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.crypto.KeyAgreement#init(java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom)
     * public final void
     * javax.crypto.KeyAgreement.init(java.security.Key,java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom)
     * throws java.security.InvalidKeyException,java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for
     * {@link javax.crypto.KeyAgreement#init(java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom)
     * public final void
     * javax.crypto.KeyAgreement.init(java.security.Key,java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom)
     * throws java.security.InvalidKeyException,java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.KeyAgreement#init(java.security.Key, java.security.spec.AlgorithmParameterSpec,
     *      java.security.SecureRandom) public final void
     *      javax.crypto.KeyAgreement.init(java.security.Key,java.security.spec.AlgorithmParameterSpec,java.security.
     *      SecureRandom) throws java.security.InvalidKeyException,java.security.InvalidAlgorithmParameterException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_Key_AlgorithmParameterSpec_SecureRandom()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#doPhase(java.security.Key, boolean) public final
     * java.security.Key javax.crypto.KeyAgreement.doPhase(java.security.Key,boolean) throws
     * java.security.InvalidKeyException,java.lang.IllegalStateException}.
     *
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#doPhase(java.security.Key, boolean) public final
     * java.security.Key javax.crypto.KeyAgreement.doPhase(java.security.Key,boolean) throws
     * java.security.InvalidKeyException,java.lang.IllegalStateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.KeyAgreement#doPhase(java.security.Key, boolean) public final java.security.Key
     *      javax.crypto.KeyAgreement.doPhase(java.security.Key,boolean) throws
     *      java.security.InvalidKeyException,java.lang.IllegalStateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doPhase_Key_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#generateSecret() public final byte[]
     * javax.crypto.KeyAgreement.generateSecret() throws java.lang.IllegalStateException}.
     *
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#generateSecret() public final byte[]
     * javax.crypto.KeyAgreement.generateSecret() throws java.lang.IllegalStateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.KeyAgreement#generateSecret() public final byte[] javax.crypto.KeyAgreement.generateSecret()
     *      throws java.lang.IllegalStateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateSecret()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#generateSecret(String) public final javax.crypto.SecretKey
     * javax.crypto.KeyAgreement.generateSecret(java.lang.String) throws
     * java.lang.IllegalStateException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException}.
     *
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#generateSecret(String) public final javax.crypto.SecretKey
     * javax.crypto.KeyAgreement.generateSecret(java.lang.String) throws
     * java.lang.IllegalStateException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.KeyAgreement#generateSecret(String) public final javax.crypto.SecretKey
     *      javax.crypto.KeyAgreement.generateSecret(java.lang.String) throws
     *      java.lang.IllegalStateException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateSecret_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#generateSecret(byte[], int) public final int
     * javax.crypto.KeyAgreement.generateSecret(byte[],int) throws
     * java.lang.IllegalStateException,javax.crypto.ShortBufferException}.
     *
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#generateSecret(byte[], int) public final int
     * javax.crypto.KeyAgreement.generateSecret(byte[],int) throws
     * java.lang.IllegalStateException,javax.crypto.ShortBufferException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.KeyAgreement#generateSecret(byte[], int) public final int
     *      javax.crypto.KeyAgreement.generateSecret(byte[],int) throws
     *      java.lang.IllegalStateException,javax.crypto.ShortBufferException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateSecret_byteArray_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#getProvider() public final java.security.Provider
     * javax.crypto.KeyAgreement.getProvider()}.
     *
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#getProvider() public final java.security.Provider
     * javax.crypto.KeyAgreement.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.KeyAgreement#getProvider() public final java.security.Provider
     *      javax.crypto.KeyAgreement.getProvider() (the hereby targeted method-under-test)
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

}
