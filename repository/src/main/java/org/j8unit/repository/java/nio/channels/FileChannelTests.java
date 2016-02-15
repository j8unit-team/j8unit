package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.FileChannel class java.nio.channels.FileChannel}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link FileChannelClassTests}.
 * </p>
 *
 * @see java.nio.channels.FileChannel class java.nio.channels.FileChannel (the hereby targeted class-under-test class)
 * @see FileChannelClassTests FileChannelClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileChannelTests<SUT extends java.nio.channels.FileChannel>
extends SeekableByteChannelTests<SUT>, GatheringByteChannelTests<SUT>, ScatteringByteChannelTests<SUT>,
org.j8unit.repository.java.nio.channels.spi.AbstractInterruptibleChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#write(java.nio.ByteBuffer, long) public abstract int
     * java.nio.channels.FileChannel.write(java.nio.ByteBuffer,long) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#write(java.nio.ByteBuffer, long) public abstract int
     * java.nio.channels.FileChannel.write(java.nio.ByteBuffer,long) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#write(java.nio.ByteBuffer, long) public abstract int
     *      java.nio.channels.FileChannel.write(java.nio.ByteBuffer,long) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_ByteBuffer_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#write(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.FileChannel.write(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#write(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.FileChannel.write(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#write(java.nio.ByteBuffer) public abstract int
     *      java.nio.channels.FileChannel.write(java.nio.ByteBuffer) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_write_ByteBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#write(java.nio.ByteBuffer[], int, int) public abstract long
     * java.nio.channels.FileChannel.write(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#write(java.nio.ByteBuffer[], int, int) public abstract long
     * java.nio.channels.FileChannel.write(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#write(java.nio.ByteBuffer[], int, int) public abstract long
     *      java.nio.channels.FileChannel.write(java.nio.ByteBuffer[],int,int) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_write_ByteBufferArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#write(java.nio.ByteBuffer[]) public final long
     * java.nio.channels.FileChannel.write(java.nio.ByteBuffer[]) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#write(java.nio.ByteBuffer[]) public final long
     * java.nio.channels.FileChannel.write(java.nio.ByteBuffer[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#write(java.nio.ByteBuffer[]) public final long
     *      java.nio.channels.FileChannel.write(java.nio.ByteBuffer[]) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_write_ByteBufferArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#map(java.nio.channels.FileChannel.MapMode, long, long)
     * public abstract java.nio.MappedByteBuffer
     * java.nio.channels.FileChannel.map(java.nio.channels.FileChannel$MapMode,long,long) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#map(java.nio.channels.FileChannel.MapMode, long, long)
     * public abstract java.nio.MappedByteBuffer
     * java.nio.channels.FileChannel.map(java.nio.channels.FileChannel$MapMode,long,long) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#map(java.nio.channels.FileChannel.MapMode, long, long) public abstract
     *      java.nio.MappedByteBuffer java.nio.channels.FileChannel.map(java.nio.channels.FileChannel$MapMode,long,long)
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_map_MapMode_long_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#lock(long, long, boolean) public abstract
     * java.nio.channels.FileLock java.nio.channels.FileChannel.lock(long,long,boolean) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#lock(long, long, boolean) public abstract
     * java.nio.channels.FileLock java.nio.channels.FileChannel.lock(long,long,boolean) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#lock(long, long, boolean) public abstract java.nio.channels.FileLock
     *      java.nio.channels.FileChannel.lock(long,long,boolean) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lock_long_long_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#lock() public final java.nio.channels.FileLock
     * java.nio.channels.FileChannel.lock() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#lock() public final java.nio.channels.FileLock
     * java.nio.channels.FileChannel.lock() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#lock() public final java.nio.channels.FileLock
     *      java.nio.channels.FileChannel.lock() throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#position() public abstract long
     * java.nio.channels.FileChannel.position() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#position() public abstract long
     * java.nio.channels.FileChannel.position() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#position() public abstract long java.nio.channels.FileChannel.position()
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_position()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#position(long) public abstract java.nio.channels.FileChannel
     * java.nio.channels.FileChannel.position(long) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#position(long) public abstract java.nio.channels.FileChannel
     * java.nio.channels.FileChannel.position(long) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#position(long) public abstract java.nio.channels.FileChannel
     *      java.nio.channels.FileChannel.position(long) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_position_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#force(boolean) public abstract void
     * java.nio.channels.FileChannel.force(boolean) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#force(boolean) public abstract void
     * java.nio.channels.FileChannel.force(boolean) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#force(boolean) public abstract void
     *      java.nio.channels.FileChannel.force(boolean) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_force_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#size() public abstract long
     * java.nio.channels.FileChannel.size() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#size() public abstract long
     * java.nio.channels.FileChannel.size() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#size() public abstract long java.nio.channels.FileChannel.size() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_size()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#truncate(long) public abstract java.nio.channels.FileChannel
     * java.nio.channels.FileChannel.truncate(long) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#truncate(long) public abstract java.nio.channels.FileChannel
     * java.nio.channels.FileChannel.truncate(long) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#truncate(long) public abstract java.nio.channels.FileChannel
     *      java.nio.channels.FileChannel.truncate(long) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_truncate_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.FileChannel#transferTo(long, long, java.nio.channels.WritableByteChannel) public
     * abstract long java.nio.channels.FileChannel.transferTo(long,long,java.nio.channels.WritableByteChannel) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.channels.FileChannel#transferTo(long, long, java.nio.channels.WritableByteChannel) public
     * abstract long java.nio.channels.FileChannel.transferTo(long,long,java.nio.channels.WritableByteChannel) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#transferTo(long, long, java.nio.channels.WritableByteChannel) public abstract
     *      long java.nio.channels.FileChannel.transferTo(long,long,java.nio.channels.WritableByteChannel) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transferTo_long_long_WritableByteChannel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#tryLock(long, long, boolean) public abstract
     * java.nio.channels.FileLock java.nio.channels.FileChannel.tryLock(long,long,boolean) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#tryLock(long, long, boolean) public abstract
     * java.nio.channels.FileLock java.nio.channels.FileChannel.tryLock(long,long,boolean) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#tryLock(long, long, boolean) public abstract java.nio.channels.FileLock
     *      java.nio.channels.FileChannel.tryLock(long,long,boolean) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryLock_long_long_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#tryLock() public final java.nio.channels.FileLock
     * java.nio.channels.FileChannel.tryLock() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#tryLock() public final java.nio.channels.FileLock
     * java.nio.channels.FileChannel.tryLock() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#tryLock() public final java.nio.channels.FileLock
     *      java.nio.channels.FileChannel.tryLock() throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryLock()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#read(java.nio.ByteBuffer, long) public abstract int
     * java.nio.channels.FileChannel.read(java.nio.ByteBuffer,long) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#read(java.nio.ByteBuffer, long) public abstract int
     * java.nio.channels.FileChannel.read(java.nio.ByteBuffer,long) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#read(java.nio.ByteBuffer, long) public abstract int
     *      java.nio.channels.FileChannel.read(java.nio.ByteBuffer,long) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_ByteBuffer_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#read(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.FileChannel.read(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#read(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.FileChannel.read(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#read(java.nio.ByteBuffer) public abstract int
     *      java.nio.channels.FileChannel.read(java.nio.ByteBuffer) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_read_ByteBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#read(java.nio.ByteBuffer[]) public final long
     * java.nio.channels.FileChannel.read(java.nio.ByteBuffer[]) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#read(java.nio.ByteBuffer[]) public final long
     * java.nio.channels.FileChannel.read(java.nio.ByteBuffer[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#read(java.nio.ByteBuffer[]) public final long
     *      java.nio.channels.FileChannel.read(java.nio.ByteBuffer[]) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_read_ByteBufferArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#read(java.nio.ByteBuffer[], int, int) public abstract long
     * java.nio.channels.FileChannel.read(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.FileChannel#read(java.nio.ByteBuffer[], int, int) public abstract long
     * java.nio.channels.FileChannel.read(java.nio.ByteBuffer[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#read(java.nio.ByteBuffer[], int, int) public abstract long
     *      java.nio.channels.FileChannel.read(java.nio.ByteBuffer[],int,int) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_read_ByteBufferArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.FileChannel#transferFrom(java.nio.channels.ReadableByteChannel, long, long) public
     * abstract long java.nio.channels.FileChannel.transferFrom(java.nio.channels.ReadableByteChannel,long,long) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.channels.FileChannel#transferFrom(java.nio.channels.ReadableByteChannel, long, long) public
     * abstract long java.nio.channels.FileChannel.transferFrom(java.nio.channels.ReadableByteChannel,long,long) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.FileChannel#transferFrom(java.nio.channels.ReadableByteChannel, long, long) public
     *      abstract long java.nio.channels.FileChannel.transferFrom(java.nio.channels.ReadableByteChannel,long,long)
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transferFrom_ReadableByteChannel_long_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.nio.channels.Channel#close() interface java.nio.channels.Channel}</li>
     * <li>{@linkplain java.nio.channels.spi.AbstractInterruptibleChannel#close() class
     * java.nio.channels.spi.AbstractInterruptibleChannel}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.nio.channels.Channel#isOpen() interface java.nio.channels.Channel}</li>
     * <li>{@linkplain java.nio.channels.spi.AbstractInterruptibleChannel#isOpen() class
     * java.nio.channels.spi.AbstractInterruptibleChannel}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isOpen()
    throws Exception {
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.nio.channels.FileChannel.MapMode class
     * java.nio.channels.FileChannel$MapMode}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link FileChannelClassTests.MapModeClassTests}.
     * </p>
     *
     * @see java.nio.channels.FileChannel.MapMode class java.nio.channels.FileChannel$MapMode (the hereby targeted
     *      class-under-test class)
     * @see FileChannelClassTests.MapModeClassTests FileChannelClassTests.MapModeClassTests (the complementary j8unit
     *      test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MapModeTests<SUT extends java.nio.channels.FileChannel.MapMode>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.nio.channels.FileChannel.MapMode#toString() public java.lang.String
         * java.nio.channels.FileChannel$MapMode.toString()}.
         *
         * <p>
         * Test method for {@link java.nio.channels.FileChannel.MapMode#toString() public java.lang.String
         * java.nio.channels.FileChannel$MapMode.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.nio.channels.FileChannel.MapMode#toString() public java.lang.String
         *      java.nio.channels.FileChannel$MapMode.toString() (the hereby targeted method-under-test)
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

    }

}
