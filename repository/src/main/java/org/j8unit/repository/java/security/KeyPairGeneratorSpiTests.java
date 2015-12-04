package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.KeyPairGeneratorSpi class java.security.KeyPairGeneratorSpi}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.KeyPairGeneratorSpiClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyPairGeneratorSpiTests<SUT extends java.security.KeyPairGeneratorSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.KeyPairGeneratorSpi#generateKeyPair() public abstract java.security.KeyPair
     * java.security.KeyPairGeneratorSpi.generateKeyPair()}.
     * </p>
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

    /**
     * <p>
     * Test method for
     * {@link java.security.KeyPairGeneratorSpi#initialize(java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom)
     * public void
     * java.security.KeyPairGeneratorSpi.initialize(java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom)
     * throws java.security.InvalidAlgorithmParameterException}.
     * </p>
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
     * Test method for {@link java.security.KeyPairGeneratorSpi#initialize(int,java.security.SecureRandom) public
     * abstract void java.security.KeyPairGeneratorSpi.initialize(int,java.security.SecureRandom)}.
     * </p>
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

}
