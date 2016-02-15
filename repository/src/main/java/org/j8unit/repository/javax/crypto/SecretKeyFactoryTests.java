package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.SecretKeyFactory class javax.crypto.SecretKeyFactory}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SecretKeyFactoryClassTests}.
 * </p>
 *
 * @see javax.crypto.SecretKeyFactory class javax.crypto.SecretKeyFactory (the hereby targeted class-under-test class)
 * @see SecretKeyFactoryClassTests SecretKeyFactoryClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SecretKeyFactoryTests<SUT extends javax.crypto.SecretKeyFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.SecretKeyFactory#translateKey(javax.crypto.SecretKey) public final
     * javax.crypto.SecretKey javax.crypto.SecretKeyFactory.translateKey(javax.crypto.SecretKey) throws
     * java.security.InvalidKeyException}.
     *
     * <p>
     * Test method for {@link javax.crypto.SecretKeyFactory#translateKey(javax.crypto.SecretKey) public final
     * javax.crypto.SecretKey javax.crypto.SecretKeyFactory.translateKey(javax.crypto.SecretKey) throws
     * java.security.InvalidKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.SecretKeyFactory#translateKey(javax.crypto.SecretKey) public final javax.crypto.SecretKey
     *      javax.crypto.SecretKeyFactory.translateKey(javax.crypto.SecretKey) throws java.security.InvalidKeyException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_translateKey_SecretKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.SecretKeyFactory#getKeySpec(javax.crypto.SecretKey, Class) public final
     * java.security.spec.KeySpec javax.crypto.SecretKeyFactory.getKeySpec(javax.crypto.SecretKey,java.lang.Class<?>)
     * throws java.security.spec.InvalidKeySpecException}.
     *
     * <p>
     * Test method for {@link javax.crypto.SecretKeyFactory#getKeySpec(javax.crypto.SecretKey, Class) public final
     * java.security.spec.KeySpec javax.crypto.SecretKeyFactory.getKeySpec(javax.crypto.SecretKey,java.lang.Class)
     * throws java.security.spec.InvalidKeySpecException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.SecretKeyFactory#getKeySpec(javax.crypto.SecretKey, Class) public final
     *      java.security.spec.KeySpec javax.crypto.SecretKeyFactory.getKeySpec(javax.crypto.SecretKey,java.lang.Class)
     *      throws java.security.spec.InvalidKeySpecException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeySpec_SecretKey_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.SecretKeyFactory#getAlgorithm() public final java.lang.String
     * javax.crypto.SecretKeyFactory.getAlgorithm()}.
     *
     * <p>
     * Test method for {@link javax.crypto.SecretKeyFactory#getAlgorithm() public final java.lang.String
     * javax.crypto.SecretKeyFactory.getAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.SecretKeyFactory#getAlgorithm() public final java.lang.String
     *      javax.crypto.SecretKeyFactory.getAlgorithm() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.crypto.SecretKeyFactory#getProvider() public final java.security.Provider
     * javax.crypto.SecretKeyFactory.getProvider()}.
     *
     * <p>
     * Test method for {@link javax.crypto.SecretKeyFactory#getProvider() public final java.security.Provider
     * javax.crypto.SecretKeyFactory.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.SecretKeyFactory#getProvider() public final java.security.Provider
     *      javax.crypto.SecretKeyFactory.getProvider() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.crypto.SecretKeyFactory#generateSecret(java.security.spec.KeySpec) public final
     * javax.crypto.SecretKey javax.crypto.SecretKeyFactory.generateSecret(java.security.spec.KeySpec) throws
     * java.security.spec.InvalidKeySpecException}.
     *
     * <p>
     * Test method for {@link javax.crypto.SecretKeyFactory#generateSecret(java.security.spec.KeySpec) public final
     * javax.crypto.SecretKey javax.crypto.SecretKeyFactory.generateSecret(java.security.spec.KeySpec) throws
     * java.security.spec.InvalidKeySpecException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.SecretKeyFactory#generateSecret(java.security.spec.KeySpec) public final javax.crypto.SecretKey
     *      javax.crypto.SecretKeyFactory.generateSecret(java.security.spec.KeySpec) throws
     *      java.security.spec.InvalidKeySpecException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateSecret_KeySpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
