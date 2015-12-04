package org.j8unit.repository.javax.crypto;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.crypto.KeyAgreement class javax.crypto.KeyAgreement},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.crypto.KeyAgreementClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface KeyAgreementTests<SUT extends javax.crypto.KeyAgreement>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#getAlgorithm() public final java.lang.String javax.crypto.KeyAgreement.getAlgorithm()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAlgorithm() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#init(java.security.Key) public final void javax.crypto.KeyAgreement.init(java.security.Key) throws java.security.InvalidKeyException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_Key() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#init(java.security.Key,java.security.SecureRandom) public final void javax.crypto.KeyAgreement.init(java.security.Key,java.security.SecureRandom) throws java.security.InvalidKeyException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_Key_SecureRandom() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#init(java.security.Key,java.security.spec.AlgorithmParameterSpec) public final void javax.crypto.KeyAgreement.init(java.security.Key,java.security.spec.AlgorithmParameterSpec) throws java.security.InvalidKeyException,java.security.InvalidAlgorithmParameterException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_Key_AlgorithmParameterSpec() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#init(java.security.Key,java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom) public final void javax.crypto.KeyAgreement.init(java.security.Key,java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom) throws java.security.InvalidKeyException,java.security.InvalidAlgorithmParameterException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_Key_AlgorithmParameterSpec_SecureRandom() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#doPhase(java.security.Key,boolean) public final java.security.Key javax.crypto.KeyAgreement.doPhase(java.security.Key,boolean) throws java.security.InvalidKeyException,java.lang.IllegalStateException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doPhase_Key_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#generateSecret(java.lang.String) public final javax.crypto.SecretKey javax.crypto.KeyAgreement.generateSecret(java.lang.String) throws java.lang.IllegalStateException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateSecret_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#generateSecret(byte[],int) public final int javax.crypto.KeyAgreement.generateSecret(byte[],int) throws java.lang.IllegalStateException,javax.crypto.ShortBufferException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateSecret_byteArray_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#generateSecret() public final byte[] javax.crypto.KeyAgreement.generateSecret() throws java.lang.IllegalStateException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateSecret() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.KeyAgreement#getProvider() public final java.security.Provider javax.crypto.KeyAgreement.getProvider()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProvider() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
