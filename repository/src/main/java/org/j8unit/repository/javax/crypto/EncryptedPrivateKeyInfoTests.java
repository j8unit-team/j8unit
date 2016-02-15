package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.EncryptedPrivateKeyInfo class
 * javax.crypto.EncryptedPrivateKeyInfo}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link EncryptedPrivateKeyInfoClassTests}.
 * </p>
 *
 * @see javax.crypto.EncryptedPrivateKeyInfo class javax.crypto.EncryptedPrivateKeyInfo (the hereby targeted
 *      class-under-test class)
 * @see EncryptedPrivateKeyInfoClassTests EncryptedPrivateKeyInfoClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EncryptedPrivateKeyInfoTests<SUT extends javax.crypto.EncryptedPrivateKeyInfo>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getEncoded() public byte[]
     * javax.crypto.EncryptedPrivateKeyInfo.getEncoded() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getEncoded() public byte[]
     * javax.crypto.EncryptedPrivateKeyInfo.getEncoded() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.EncryptedPrivateKeyInfo#getEncoded() public byte[]
     *      javax.crypto.EncryptedPrivateKeyInfo.getEncoded() throws java.io.IOException (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getKeySpec(javax.crypto.Cipher) public
     * java.security.spec.PKCS8EncodedKeySpec javax.crypto.EncryptedPrivateKeyInfo.getKeySpec(javax.crypto.Cipher)
     * throws java.security.spec.InvalidKeySpecException}.
     *
     * <p>
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getKeySpec(javax.crypto.Cipher) public
     * java.security.spec.PKCS8EncodedKeySpec javax.crypto.EncryptedPrivateKeyInfo.getKeySpec(javax.crypto.Cipher)
     * throws java.security.spec.InvalidKeySpecException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.EncryptedPrivateKeyInfo#getKeySpec(javax.crypto.Cipher) public
     *      java.security.spec.PKCS8EncodedKeySpec javax.crypto.EncryptedPrivateKeyInfo.getKeySpec(javax.crypto.Cipher)
     *      throws java.security.spec.InvalidKeySpecException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeySpec_Cipher()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getKeySpec(java.security.Key) public
     * java.security.spec.PKCS8EncodedKeySpec javax.crypto.EncryptedPrivateKeyInfo.getKeySpec(java.security.Key) throws
     * java.security.NoSuchAlgorithmException,java.security.InvalidKeyException}.
     *
     * <p>
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getKeySpec(java.security.Key) public
     * java.security.spec.PKCS8EncodedKeySpec javax.crypto.EncryptedPrivateKeyInfo.getKeySpec(java.security.Key) throws
     * java.security.NoSuchAlgorithmException,java.security.InvalidKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.EncryptedPrivateKeyInfo#getKeySpec(java.security.Key) public
     *      java.security.spec.PKCS8EncodedKeySpec javax.crypto.EncryptedPrivateKeyInfo.getKeySpec(java.security.Key)
     *      throws java.security.NoSuchAlgorithmException,java.security.InvalidKeyException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeySpec_Key()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getKeySpec(java.security.Key, String) public
     * java.security.spec.PKCS8EncodedKeySpec
     * javax.crypto.EncryptedPrivateKeyInfo.getKeySpec(java.security.Key,java.lang.String) throws
     * java.security.NoSuchProviderException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException}.
     *
     * <p>
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getKeySpec(java.security.Key, String) public
     * java.security.spec.PKCS8EncodedKeySpec
     * javax.crypto.EncryptedPrivateKeyInfo.getKeySpec(java.security.Key,java.lang.String) throws
     * java.security.NoSuchProviderException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.EncryptedPrivateKeyInfo#getKeySpec(java.security.Key, String) public
     *      java.security.spec.PKCS8EncodedKeySpec
     *      javax.crypto.EncryptedPrivateKeyInfo.getKeySpec(java.security.Key,java.lang.String) throws
     *      java.security.NoSuchProviderException,java.security.NoSuchAlgorithmException,java.security.
     *      InvalidKeyException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeySpec_Key_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getKeySpec(java.security.Key, java.security.Provider)
     * public java.security.spec.PKCS8EncodedKeySpec
     * javax.crypto.EncryptedPrivateKeyInfo.getKeySpec(java.security.Key,java.security.Provider) throws
     * java.security.NoSuchAlgorithmException,java.security.InvalidKeyException}.
     *
     * <p>
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getKeySpec(java.security.Key, java.security.Provider)
     * public java.security.spec.PKCS8EncodedKeySpec
     * javax.crypto.EncryptedPrivateKeyInfo.getKeySpec(java.security.Key,java.security.Provider) throws
     * java.security.NoSuchAlgorithmException,java.security.InvalidKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.EncryptedPrivateKeyInfo#getKeySpec(java.security.Key, java.security.Provider) public
     *      java.security.spec.PKCS8EncodedKeySpec
     *      javax.crypto.EncryptedPrivateKeyInfo.getKeySpec(java.security.Key,java.security.Provider) throws
     *      java.security.NoSuchAlgorithmException,java.security.InvalidKeyException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeySpec_Key_Provider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getAlgName() public java.lang.String
     * javax.crypto.EncryptedPrivateKeyInfo.getAlgName()}.
     *
     * <p>
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getAlgName() public java.lang.String
     * javax.crypto.EncryptedPrivateKeyInfo.getAlgName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.EncryptedPrivateKeyInfo#getAlgName() public java.lang.String
     *      javax.crypto.EncryptedPrivateKeyInfo.getAlgName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAlgName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getAlgParameters() public
     * java.security.AlgorithmParameters javax.crypto.EncryptedPrivateKeyInfo.getAlgParameters()}.
     *
     * <p>
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getAlgParameters() public
     * java.security.AlgorithmParameters javax.crypto.EncryptedPrivateKeyInfo.getAlgParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.EncryptedPrivateKeyInfo#getAlgParameters() public java.security.AlgorithmParameters
     *      javax.crypto.EncryptedPrivateKeyInfo.getAlgParameters() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAlgParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getEncryptedData() public byte[]
     * javax.crypto.EncryptedPrivateKeyInfo.getEncryptedData()}.
     *
     * <p>
     * Test method for {@link javax.crypto.EncryptedPrivateKeyInfo#getEncryptedData() public byte[]
     * javax.crypto.EncryptedPrivateKeyInfo.getEncryptedData()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.EncryptedPrivateKeyInfo#getEncryptedData() public byte[]
     *      javax.crypto.EncryptedPrivateKeyInfo.getEncryptedData() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEncryptedData()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
