package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.SecureRandom class java.security.SecureRandom}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SecureRandomClassTests}.
 * </p>
 *
 * @see java.security.SecureRandom class java.security.SecureRandom (the hereby targeted class-under-test class)
 * @see SecureRandomClassTests SecureRandomClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SecureRandomTests<SUT extends java.security.SecureRandom>
extends org.j8unit.repository.java.util.RandomTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.SecureRandom#getAlgorithm() public java.lang.String
     * java.security.SecureRandom.getAlgorithm()}.
     *
     * <p>
     * Test method for {@link java.security.SecureRandom#getAlgorithm() public java.lang.String
     * java.security.SecureRandom.getAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.SecureRandom#getAlgorithm() public java.lang.String java.security.SecureRandom.getAlgorithm()
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
     * Test method for {@link java.security.SecureRandom#getProvider() public final java.security.Provider
     * java.security.SecureRandom.getProvider()}.
     *
     * <p>
     * Test method for {@link java.security.SecureRandom#getProvider() public final java.security.Provider
     * java.security.SecureRandom.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.SecureRandom#getProvider() public final java.security.Provider
     *      java.security.SecureRandom.getProvider() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.SecureRandom#generateSeed(int) public byte[]
     * java.security.SecureRandom.generateSeed(int)}.
     *
     * <p>
     * Test method for {@link java.security.SecureRandom#generateSeed(int) public byte[]
     * java.security.SecureRandom.generateSeed(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.SecureRandom#generateSeed(int) public byte[] java.security.SecureRandom.generateSeed(int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_generateSeed_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.SecureRandom#setSeed(long) public void
     * java.security.SecureRandom.setSeed(long)}.
     *
     * <p>
     * Test method for {@link java.security.SecureRandom#setSeed(long) public void
     * java.security.SecureRandom.setSeed(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.SecureRandom#setSeed(long) public void java.security.SecureRandom.setSeed(long) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setSeed_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.SecureRandom#setSeed(byte[]) public synchronized void
     * java.security.SecureRandom.setSeed(byte[])}.
     *
     * <p>
     * Test method for {@link java.security.SecureRandom#setSeed(byte[]) public synchronized void
     * java.security.SecureRandom.setSeed(byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.SecureRandom#setSeed(byte[]) public synchronized void
     *      java.security.SecureRandom.setSeed(byte[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSeed_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.SecureRandom#nextBytes(byte[]) public synchronized void
     * java.security.SecureRandom.nextBytes(byte[])}.
     *
     * <p>
     * Test method for {@link java.security.SecureRandom#nextBytes(byte[]) public synchronized void
     * java.security.SecureRandom.nextBytes(byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.SecureRandom#nextBytes(byte[]) public synchronized void
     *      java.security.SecureRandom.nextBytes(byte[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_nextBytes_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
