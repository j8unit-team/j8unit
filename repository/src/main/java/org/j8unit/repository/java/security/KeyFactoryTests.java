package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.KeyFactory class java.security.KeyFactory}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link KeyFactoryClassTests}.
 * </p>
 *
 * @see java.security.KeyFactory class java.security.KeyFactory (the hereby targeted class-under-test class)
 * @see KeyFactoryClassTests KeyFactoryClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyFactoryTests<SUT extends java.security.KeyFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.KeyFactory#generatePublic(java.security.spec.KeySpec) public final
     * java.security.PublicKey java.security.KeyFactory.generatePublic(java.security.spec.KeySpec) throws
     * java.security.spec.InvalidKeySpecException}.
     *
     * <p>
     * Test method for {@link java.security.KeyFactory#generatePublic(java.security.spec.KeySpec) public final
     * java.security.PublicKey java.security.KeyFactory.generatePublic(java.security.spec.KeySpec) throws
     * java.security.spec.InvalidKeySpecException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyFactory#generatePublic(java.security.spec.KeySpec) public final java.security.PublicKey
     *      java.security.KeyFactory.generatePublic(java.security.spec.KeySpec) throws
     *      java.security.spec.InvalidKeySpecException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generatePublic_KeySpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyFactory#getProvider() public final java.security.Provider
     * java.security.KeyFactory.getProvider()}.
     *
     * <p>
     * Test method for {@link java.security.KeyFactory#getProvider() public final java.security.Provider
     * java.security.KeyFactory.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyFactory#getProvider() public final java.security.Provider
     *      java.security.KeyFactory.getProvider() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.KeyFactory#getAlgorithm() public final java.lang.String
     * java.security.KeyFactory.getAlgorithm()}.
     *
     * <p>
     * Test method for {@link java.security.KeyFactory#getAlgorithm() public final java.lang.String
     * java.security.KeyFactory.getAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyFactory#getAlgorithm() public final java.lang.String
     *      java.security.KeyFactory.getAlgorithm() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.KeyFactory#generatePrivate(java.security.spec.KeySpec) public final
     * java.security.PrivateKey java.security.KeyFactory.generatePrivate(java.security.spec.KeySpec) throws
     * java.security.spec.InvalidKeySpecException}.
     *
     * <p>
     * Test method for {@link java.security.KeyFactory#generatePrivate(java.security.spec.KeySpec) public final
     * java.security.PrivateKey java.security.KeyFactory.generatePrivate(java.security.spec.KeySpec) throws
     * java.security.spec.InvalidKeySpecException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyFactory#generatePrivate(java.security.spec.KeySpec) public final java.security.PrivateKey
     *      java.security.KeyFactory.generatePrivate(java.security.spec.KeySpec) throws
     *      java.security.spec.InvalidKeySpecException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generatePrivate_KeySpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyFactory#getKeySpec(java.security.Key, Class) public final <T> T
     * java.security.KeyFactory.getKeySpec(java.security.Key,java.lang.Class<T>) throws
     * java.security.spec.InvalidKeySpecException}.
     *
     * <p>
     * Test method for {@link java.security.KeyFactory#getKeySpec(java.security.Key, Class) public final
     * java.security.spec.KeySpec java.security.KeyFactory.getKeySpec(java.security.Key,java.lang.Class) throws
     * java.security.spec.InvalidKeySpecException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyFactory#getKeySpec(java.security.Key, Class) public final java.security.spec.KeySpec
     *      java.security.KeyFactory.getKeySpec(java.security.Key,java.lang.Class) throws
     *      java.security.spec.InvalidKeySpecException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeySpec_Key_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyFactory#translateKey(java.security.Key) public final java.security.Key
     * java.security.KeyFactory.translateKey(java.security.Key) throws java.security.InvalidKeyException}.
     *
     * <p>
     * Test method for {@link java.security.KeyFactory#translateKey(java.security.Key) public final java.security.Key
     * java.security.KeyFactory.translateKey(java.security.Key) throws java.security.InvalidKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyFactory#translateKey(java.security.Key) public final java.security.Key
     *      java.security.KeyFactory.translateKey(java.security.Key) throws java.security.InvalidKeyException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_translateKey_Key()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
