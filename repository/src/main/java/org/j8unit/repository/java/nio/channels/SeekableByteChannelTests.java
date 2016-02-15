package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.SeekableByteChannel interface
 * java.nio.channels.SeekableByteChannel}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link SeekableByteChannelClassTests}.
 * </p>
 *
 * @see java.nio.channels.SeekableByteChannel interface java.nio.channels.SeekableByteChannel (the hereby targeted
 *      class-under-test class)
 * @see SeekableByteChannelClassTests SeekableByteChannelClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SeekableByteChannelTests<SUT extends java.nio.channels.SeekableByteChannel>
extends ByteChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.SeekableByteChannel#read(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.SeekableByteChannel.read(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SeekableByteChannel#read(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.SeekableByteChannel.read(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SeekableByteChannel#read(java.nio.ByteBuffer) public abstract int
     *      java.nio.channels.SeekableByteChannel.read(java.nio.ByteBuffer) throws java.io.IOException (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.nio.channels.SeekableByteChannel#size() public abstract long
     * java.nio.channels.SeekableByteChannel.size() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SeekableByteChannel#size() public abstract long
     * java.nio.channels.SeekableByteChannel.size() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SeekableByteChannel#size() public abstract long
     *      java.nio.channels.SeekableByteChannel.size() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.nio.channels.SeekableByteChannel#truncate(long) public abstract
     * java.nio.channels.SeekableByteChannel java.nio.channels.SeekableByteChannel.truncate(long) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SeekableByteChannel#truncate(long) public abstract
     * java.nio.channels.SeekableByteChannel java.nio.channels.SeekableByteChannel.truncate(long) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SeekableByteChannel#truncate(long) public abstract java.nio.channels.SeekableByteChannel
     *      java.nio.channels.SeekableByteChannel.truncate(long) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.nio.channels.SeekableByteChannel#position(long) public abstract
     * java.nio.channels.SeekableByteChannel java.nio.channels.SeekableByteChannel.position(long) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SeekableByteChannel#position(long) public abstract
     * java.nio.channels.SeekableByteChannel java.nio.channels.SeekableByteChannel.position(long) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SeekableByteChannel#position(long) public abstract java.nio.channels.SeekableByteChannel
     *      java.nio.channels.SeekableByteChannel.position(long) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.nio.channels.SeekableByteChannel#position() public abstract long
     * java.nio.channels.SeekableByteChannel.position() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SeekableByteChannel#position() public abstract long
     * java.nio.channels.SeekableByteChannel.position() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SeekableByteChannel#position() public abstract long
     *      java.nio.channels.SeekableByteChannel.position() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.nio.channels.SeekableByteChannel#write(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.SeekableByteChannel.write(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.SeekableByteChannel#write(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.SeekableByteChannel.write(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.SeekableByteChannel#write(java.nio.ByteBuffer) public abstract int
     *      java.nio.channels.SeekableByteChannel.write(java.nio.ByteBuffer) throws java.io.IOException (the hereby
     *      targeted method-under-test)
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

}
