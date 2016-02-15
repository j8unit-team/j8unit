package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.KeyPairGeneratorSpi class java.security.KeyPairGeneratorSpi}
 * . The complementary j8unit test interface containing the class relevant aspects is
 * {@link KeyPairGeneratorSpiClassTests}.
 * </p>
 *
 * @see java.security.KeyPairGeneratorSpi class java.security.KeyPairGeneratorSpi (the hereby targeted class-under-test
 *      class)
 * @see KeyPairGeneratorSpiClassTests KeyPairGeneratorSpiClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyPairGeneratorSpiTests<SUT extends java.security.KeyPairGeneratorSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.security.KeyPairGeneratorSpi#initialize(java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom)
     * public void
     * java.security.KeyPairGeneratorSpi.initialize(java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom)
     * throws java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for
     * {@link java.security.KeyPairGeneratorSpi#initialize(java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom)
     * public void
     * java.security.KeyPairGeneratorSpi.initialize(java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom)
     * throws java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyPairGeneratorSpi#initialize(java.security.spec.AlgorithmParameterSpec,
     *      java.security.SecureRandom) public void
     *      java.security.KeyPairGeneratorSpi.initialize(java.security.spec.AlgorithmParameterSpec,java.security.
     *      SecureRandom) throws java.security.InvalidAlgorithmParameterException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initialize_AlgorithmParameterSpec_SecureRandom()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyPairGeneratorSpi#initialize(int, java.security.SecureRandom) public
     * abstract void java.security.KeyPairGeneratorSpi.initialize(int,java.security.SecureRandom)}.
     *
     * <p>
     * Test method for {@link java.security.KeyPairGeneratorSpi#initialize(int, java.security.SecureRandom) public
     * abstract void java.security.KeyPairGeneratorSpi.initialize(int,java.security.SecureRandom)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyPairGeneratorSpi#initialize(int, java.security.SecureRandom) public abstract void
     *      java.security.KeyPairGeneratorSpi.initialize(int,java.security.SecureRandom) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initialize_int_SecureRandom()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyPairGeneratorSpi#generateKeyPair() public abstract java.security.KeyPair
     * java.security.KeyPairGeneratorSpi.generateKeyPair()}.
     *
     * <p>
     * Test method for {@link java.security.KeyPairGeneratorSpi#generateKeyPair() public abstract java.security.KeyPair
     * java.security.KeyPairGeneratorSpi.generateKeyPair()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyPairGeneratorSpi#generateKeyPair() public abstract java.security.KeyPair
     *      java.security.KeyPairGeneratorSpi.generateKeyPair() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateKeyPair()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
