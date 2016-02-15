package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.Mac class javax.crypto.Mac}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link MacClassTests}.
 * </p>
 *
 * @see javax.crypto.Mac class javax.crypto.Mac (the hereby targeted class-under-test class)
 * @see MacClassTests MacClassTests (the complementary j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MacTests<SUT extends javax.crypto.Mac>
extends org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.Mac#update(byte[]) public final void javax.crypto.Mac.update(byte[]) throws
     * java.lang.IllegalStateException}.
     *
     * <p>
     * Test method for {@link javax.crypto.Mac#update(byte[]) public final void javax.crypto.Mac.update(byte[]) throws
     * java.lang.IllegalStateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.Mac#update(byte[]) public final void javax.crypto.Mac.update(byte[]) throws
     *      java.lang.IllegalStateException (the hereby targeted method-under-test)
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
     * Test method for {@link javax.crypto.Mac#update(byte[], int, int) public final void
     * javax.crypto.Mac.update(byte[],int,int) throws java.lang.IllegalStateException}.
     *
     * <p>
     * Test method for {@link javax.crypto.Mac#update(byte[], int, int) public final void
     * javax.crypto.Mac.update(byte[],int,int) throws java.lang.IllegalStateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.Mac#update(byte[], int, int) public final void javax.crypto.Mac.update(byte[],int,int) throws
     *      java.lang.IllegalStateException (the hereby targeted method-under-test)
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
     * Test method for {@link javax.crypto.Mac#update(java.nio.ByteBuffer) public final void
     * javax.crypto.Mac.update(java.nio.ByteBuffer)}.
     *
     * <p>
     * Test method for {@link javax.crypto.Mac#update(java.nio.ByteBuffer) public final void
     * javax.crypto.Mac.update(java.nio.ByteBuffer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.Mac#update(java.nio.ByteBuffer) public final void javax.crypto.Mac.update(java.nio.ByteBuffer)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link javax.crypto.Mac#update(byte) public final void javax.crypto.Mac.update(byte) throws
     * java.lang.IllegalStateException}.
     *
     * <p>
     * Test method for {@link javax.crypto.Mac#update(byte) public final void javax.crypto.Mac.update(byte) throws
     * java.lang.IllegalStateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.Mac#update(byte) public final void javax.crypto.Mac.update(byte) throws
     *      java.lang.IllegalStateException (the hereby targeted method-under-test)
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
     * Test method for {@link javax.crypto.Mac#doFinal(byte[], int) public final void
     * javax.crypto.Mac.doFinal(byte[],int) throws javax.crypto.ShortBufferException,java.lang.IllegalStateException}.
     *
     * <p>
     * Test method for {@link javax.crypto.Mac#doFinal(byte[], int) public final void
     * javax.crypto.Mac.doFinal(byte[],int) throws javax.crypto.ShortBufferException,java.lang.IllegalStateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.Mac#doFinal(byte[], int) public final void javax.crypto.Mac.doFinal(byte[],int) throws
     *      javax.crypto.ShortBufferException,java.lang.IllegalStateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doFinal_byteArray_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.Mac#doFinal(byte[]) public final byte[] javax.crypto.Mac.doFinal(byte[])
     * throws java.lang.IllegalStateException}.
     *
     * <p>
     * Test method for {@link javax.crypto.Mac#doFinal(byte[]) public final byte[] javax.crypto.Mac.doFinal(byte[])
     * throws java.lang.IllegalStateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.Mac#doFinal(byte[]) public final byte[] javax.crypto.Mac.doFinal(byte[]) throws
     *      java.lang.IllegalStateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doFinal_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.Mac#doFinal() public final byte[] javax.crypto.Mac.doFinal() throws
     * java.lang.IllegalStateException}.
     *
     * <p>
     * Test method for {@link javax.crypto.Mac#doFinal() public final byte[] javax.crypto.Mac.doFinal() throws
     * java.lang.IllegalStateException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.Mac#doFinal() public final byte[] javax.crypto.Mac.doFinal() throws
     *      java.lang.IllegalStateException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doFinal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.Mac#init(java.security.Key, java.security.spec.AlgorithmParameterSpec) public
     * final void javax.crypto.Mac.init(java.security.Key,java.security.spec.AlgorithmParameterSpec) throws
     * java.security.InvalidKeyException,java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for {@link javax.crypto.Mac#init(java.security.Key, java.security.spec.AlgorithmParameterSpec) public
     * final void javax.crypto.Mac.init(java.security.Key,java.security.spec.AlgorithmParameterSpec) throws
     * java.security.InvalidKeyException,java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.Mac#init(java.security.Key, java.security.spec.AlgorithmParameterSpec) public final void
     *      javax.crypto.Mac.init(java.security.Key,java.security.spec.AlgorithmParameterSpec) throws
     *      java.security.InvalidKeyException,java.security.InvalidAlgorithmParameterException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_Key_AlgorithmParameterSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.Mac#init(java.security.Key) public final void
     * javax.crypto.Mac.init(java.security.Key) throws java.security.InvalidKeyException}.
     *
     * <p>
     * Test method for {@link javax.crypto.Mac#init(java.security.Key) public final void
     * javax.crypto.Mac.init(java.security.Key) throws java.security.InvalidKeyException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.Mac#init(java.security.Key) public final void javax.crypto.Mac.init(java.security.Key) throws
     *      java.security.InvalidKeyException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_Key()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.Mac#getMacLength() public final int javax.crypto.Mac.getMacLength()}.
     *
     * <p>
     * Test method for {@link javax.crypto.Mac#getMacLength() public final int javax.crypto.Mac.getMacLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.Mac#getMacLength() public final int javax.crypto.Mac.getMacLength() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMacLength()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.Mac#getAlgorithm() public final java.lang.String
     * javax.crypto.Mac.getAlgorithm()}.
     *
     * <p>
     * Test method for {@link javax.crypto.Mac#getAlgorithm() public final java.lang.String
     * javax.crypto.Mac.getAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.Mac#getAlgorithm() public final java.lang.String javax.crypto.Mac.getAlgorithm() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link javax.crypto.Mac#reset() public final void javax.crypto.Mac.reset()}.
     *
     * <p>
     * Test method for {@link javax.crypto.Mac#reset() public final void javax.crypto.Mac.reset()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.Mac#reset() public final void javax.crypto.Mac.reset() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.crypto.Mac#getProvider() public final java.security.Provider
     * javax.crypto.Mac.getProvider()}.
     *
     * <p>
     * Test method for {@link javax.crypto.Mac#getProvider() public final java.security.Provider
     * javax.crypto.Mac.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.Mac#getProvider() public final java.security.Provider javax.crypto.Mac.getProvider() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link javax.crypto.Mac#clone() public final java.lang.Object javax.crypto.Mac.clone() throws
     * java.lang.CloneNotSupportedException}.
     *
     * <p>
     * Test method for {@link javax.crypto.Mac#clone() public final java.lang.Object javax.crypto.Mac.clone() throws
     * java.lang.CloneNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.Mac#clone() public final java.lang.Object javax.crypto.Mac.clone() throws
     *      java.lang.CloneNotSupportedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
