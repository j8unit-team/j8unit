package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.KeyPairGenerator class java.security.KeyPairGenerator}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link KeyPairGeneratorClassTests}.
 * </p>
 *
 * @see java.security.KeyPairGenerator class java.security.KeyPairGenerator (the hereby targeted class-under-test class)
 * @see KeyPairGeneratorClassTests KeyPairGeneratorClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyPairGeneratorTests<SUT extends java.security.KeyPairGenerator>
extends KeyPairGeneratorSpiTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.KeyPairGenerator#genKeyPair() public final java.security.KeyPair
     * java.security.KeyPairGenerator.genKeyPair()}.
     *
     * <p>
     * Test method for {@link java.security.KeyPairGenerator#genKeyPair() public final java.security.KeyPair
     * java.security.KeyPairGenerator.genKeyPair()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyPairGenerator#genKeyPair() public final java.security.KeyPair
     *      java.security.KeyPairGenerator.genKeyPair() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_genKeyPair()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyPairGenerator#getAlgorithm() public java.lang.String
     * java.security.KeyPairGenerator.getAlgorithm()}.
     *
     * <p>
     * Test method for {@link java.security.KeyPairGenerator#getAlgorithm() public java.lang.String
     * java.security.KeyPairGenerator.getAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyPairGenerator#getAlgorithm() public java.lang.String
     *      java.security.KeyPairGenerator.getAlgorithm() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.KeyPairGenerator#getProvider() public final java.security.Provider
     * java.security.KeyPairGenerator.getProvider()}.
     *
     * <p>
     * Test method for {@link java.security.KeyPairGenerator#getProvider() public final java.security.Provider
     * java.security.KeyPairGenerator.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyPairGenerator#getProvider() public final java.security.Provider
     *      java.security.KeyPairGenerator.getProvider() (the hereby targeted method-under-test)
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
     * Test method for
     * {@link java.security.KeyPairGenerator#initialize(java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom)
     * public void
     * java.security.KeyPairGenerator.initialize(java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom)
     * throws java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for
     * {@link java.security.KeyPairGenerator#initialize(java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom)
     * public void
     * java.security.KeyPairGenerator.initialize(java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom)
     * throws java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyPairGenerator#initialize(java.security.spec.AlgorithmParameterSpec,
     *      java.security.SecureRandom) public void
     *      java.security.KeyPairGenerator.initialize(java.security.spec.AlgorithmParameterSpec,java.security.
     *      SecureRandom) throws java.security.InvalidAlgorithmParameterException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.security.KeyPairGenerator#initialize(java.security.spec.AlgorithmParameterSpec)
     * public void java.security.KeyPairGenerator.initialize(java.security.spec.AlgorithmParameterSpec) throws
     * java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for {@link java.security.KeyPairGenerator#initialize(java.security.spec.AlgorithmParameterSpec)
     * public void java.security.KeyPairGenerator.initialize(java.security.spec.AlgorithmParameterSpec) throws
     * java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyPairGenerator#initialize(java.security.spec.AlgorithmParameterSpec) public void
     *      java.security.KeyPairGenerator.initialize(java.security.spec.AlgorithmParameterSpec) throws
     *      java.security.InvalidAlgorithmParameterException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initialize_AlgorithmParameterSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyPairGenerator#initialize(int) public void
     * java.security.KeyPairGenerator.initialize(int)}.
     *
     * <p>
     * Test method for {@link java.security.KeyPairGenerator#initialize(int) public void
     * java.security.KeyPairGenerator.initialize(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyPairGenerator#initialize(int) public void java.security.KeyPairGenerator.initialize(int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initialize_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.KeyPairGenerator#initialize(int, java.security.SecureRandom) public void
     * java.security.KeyPairGenerator.initialize(int,java.security.SecureRandom)}.
     *
     * <p>
     * Test method for {@link java.security.KeyPairGenerator#initialize(int, java.security.SecureRandom) public void
     * java.security.KeyPairGenerator.initialize(int,java.security.SecureRandom)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyPairGenerator#initialize(int, java.security.SecureRandom) public void
     *      java.security.KeyPairGenerator.initialize(int,java.security.SecureRandom) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.security.KeyPairGenerator#generateKeyPair() public java.security.KeyPair
     * java.security.KeyPairGenerator.generateKeyPair()}.
     *
     * <p>
     * Test method for {@link java.security.KeyPairGenerator#generateKeyPair() public java.security.KeyPair
     * java.security.KeyPairGenerator.generateKeyPair()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.KeyPairGenerator#generateKeyPair() public java.security.KeyPair
     *      java.security.KeyPairGenerator.generateKeyPair() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_generateKeyPair()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
