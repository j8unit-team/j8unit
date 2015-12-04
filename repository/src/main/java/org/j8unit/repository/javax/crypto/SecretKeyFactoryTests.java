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
 * Test class for {@link javax.crypto.SecretKeyFactory class javax.crypto.SecretKeyFactory},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.crypto.SecretKeyFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SecretKeyFactoryTests<SUT extends javax.crypto.SecretKeyFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.crypto.SecretKeyFactory#translateKey(javax.crypto.SecretKey) public final javax.crypto.SecretKey javax.crypto.SecretKeyFactory.translateKey(javax.crypto.SecretKey) throws java.security.InvalidKeyException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_translateKey_SecretKey() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.SecretKeyFactory#getKeySpec(javax.crypto.SecretKey,java.lang.Class) public final java.security.spec.KeySpec javax.crypto.SecretKeyFactory.getKeySpec(javax.crypto.SecretKey,java.lang.Class) throws java.security.spec.InvalidKeySpecException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeySpec_SecretKey_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.SecretKeyFactory#getAlgorithm() public final java.lang.String javax.crypto.SecretKeyFactory.getAlgorithm()}.
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
     * Test method for {@link javax.crypto.SecretKeyFactory#getProvider() public final java.security.Provider javax.crypto.SecretKeyFactory.getProvider()}.
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

    /**
     * <p>
     * Test method for {@link javax.crypto.SecretKeyFactory#generateSecret(java.security.spec.KeySpec) public final javax.crypto.SecretKey javax.crypto.SecretKeyFactory.generateSecret(java.security.spec.KeySpec) throws java.security.spec.InvalidKeySpecException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateSecret_KeySpec() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
