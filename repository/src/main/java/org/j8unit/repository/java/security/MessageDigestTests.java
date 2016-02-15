package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.MessageDigest class java.security.MessageDigest}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MessageDigestClassTests}.
 * </p>
 *
 * @see java.security.MessageDigest class java.security.MessageDigest (the hereby targeted class-under-test class)
 * @see MessageDigestClassTests MessageDigestClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MessageDigestTests<SUT extends java.security.MessageDigest>
extends MessageDigestSpiTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.MessageDigest#getAlgorithm() public final java.lang.String
     * java.security.MessageDigest.getAlgorithm()}.
     *
     * <p>
     * Test method for {@link java.security.MessageDigest#getAlgorithm() public final java.lang.String
     * java.security.MessageDigest.getAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.MessageDigest#getAlgorithm() public final java.lang.String
     *      java.security.MessageDigest.getAlgorithm() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.MessageDigest#update(byte[]) public void
     * java.security.MessageDigest.update(byte[])}.
     *
     * <p>
     * Test method for {@link java.security.MessageDigest#update(byte[]) public void
     * java.security.MessageDigest.update(byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.MessageDigest#update(byte[]) public void java.security.MessageDigest.update(byte[]) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_update_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.MessageDigest#update(byte[], int, int) public void
     * java.security.MessageDigest.update(byte[],int,int)}.
     *
     * <p>
     * Test method for {@link java.security.MessageDigest#update(byte[], int, int) public void
     * java.security.MessageDigest.update(byte[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.MessageDigest#update(byte[], int, int) public void
     *      java.security.MessageDigest.update(byte[],int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_update_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.MessageDigest#update(java.nio.ByteBuffer) public final void
     * java.security.MessageDigest.update(java.nio.ByteBuffer)}.
     *
     * <p>
     * Test method for {@link java.security.MessageDigest#update(java.nio.ByteBuffer) public final void
     * java.security.MessageDigest.update(java.nio.ByteBuffer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.MessageDigest#update(java.nio.ByteBuffer) public final void
     *      java.security.MessageDigest.update(java.nio.ByteBuffer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_update_ByteBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.MessageDigest#update(byte) public void
     * java.security.MessageDigest.update(byte)}.
     *
     * <p>
     * Test method for {@link java.security.MessageDigest#update(byte) public void
     * java.security.MessageDigest.update(byte)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.MessageDigest#update(byte) public void java.security.MessageDigest.update(byte) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_update_byte()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.MessageDigest#getDigestLength() public final int
     * java.security.MessageDigest.getDigestLength()}.
     *
     * <p>
     * Test method for {@link java.security.MessageDigest#getDigestLength() public final int
     * java.security.MessageDigest.getDigestLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.MessageDigest#getDigestLength() public final int java.security.MessageDigest.getDigestLength()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDigestLength()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.MessageDigest#toString() public java.lang.String
     * java.security.MessageDigest.toString()}.
     *
     * <p>
     * Test method for {@link java.security.MessageDigest#toString() public java.lang.String
     * java.security.MessageDigest.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.MessageDigest#toString() public java.lang.String java.security.MessageDigest.toString() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.MessageDigest#clone() public java.lang.Object
     * java.security.MessageDigest.clone() throws java.lang.CloneNotSupportedException}.
     *
     * <p>
     * Test method for {@link java.security.MessageDigest#clone() public java.lang.Object
     * java.security.MessageDigest.clone() throws java.lang.CloneNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.MessageDigest#clone() public java.lang.Object java.security.MessageDigest.clone() throws
     *      java.lang.CloneNotSupportedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.MessageDigest#digest(byte[]) public byte[]
     * java.security.MessageDigest.digest(byte[])}.
     *
     * <p>
     * Test method for {@link java.security.MessageDigest#digest(byte[]) public byte[]
     * java.security.MessageDigest.digest(byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.MessageDigest#digest(byte[]) public byte[] java.security.MessageDigest.digest(byte[]) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_digest_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.MessageDigest#digest() public byte[] java.security.MessageDigest.digest()}.
     *
     * <p>
     * Test method for {@link java.security.MessageDigest#digest() public byte[] java.security.MessageDigest.digest()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.MessageDigest#digest() public byte[] java.security.MessageDigest.digest() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_digest()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.MessageDigest#digest(byte[], int, int) public int
     * java.security.MessageDigest.digest(byte[],int,int) throws java.security.DigestException}.
     *
     * <p>
     * Test method for {@link java.security.MessageDigest#digest(byte[], int, int) public int
     * java.security.MessageDigest.digest(byte[],int,int) throws java.security.DigestException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.MessageDigest#digest(byte[], int, int) public int
     *      java.security.MessageDigest.digest(byte[],int,int) throws java.security.DigestException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_digest_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.MessageDigest#reset() public void java.security.MessageDigest.reset()}.
     *
     * <p>
     * Test method for {@link java.security.MessageDigest#reset() public void java.security.MessageDigest.reset()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.MessageDigest#reset() public void java.security.MessageDigest.reset() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.MessageDigest#getProvider() public final java.security.Provider
     * java.security.MessageDigest.getProvider()}.
     *
     * <p>
     * Test method for {@link java.security.MessageDigest#getProvider() public final java.security.Provider
     * java.security.MessageDigest.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.MessageDigest#getProvider() public final java.security.Provider
     *      java.security.MessageDigest.getProvider() (the hereby targeted method-under-test)
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
