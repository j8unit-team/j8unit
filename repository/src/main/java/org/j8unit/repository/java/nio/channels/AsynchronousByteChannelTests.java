package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.AsynchronousByteChannel interface
 * java.nio.channels.AsynchronousByteChannel}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AsynchronousByteChannelClassTests}.
 * </p>
 *
 * @see java.nio.channels.AsynchronousByteChannel interface java.nio.channels.AsynchronousByteChannel (the hereby
 *      targeted class-under-test class)
 * @see AsynchronousByteChannelClassTests AsynchronousByteChannelClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AsynchronousByteChannelTests<SUT extends java.nio.channels.AsynchronousByteChannel>
extends AsynchronousChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousByteChannel#write(java.nio.ByteBuffer) public abstract
     * java.util.concurrent.Future
     * <java.lang.Integer> java.nio.channels.AsynchronousByteChannel.write(java.nio.ByteBuffer)}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousByteChannel#write(java.nio.ByteBuffer) public abstract
     * java.util.concurrent.Future java.nio.channels.AsynchronousByteChannel.write(java.nio.ByteBuffer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousByteChannel#write(java.nio.ByteBuffer) public abstract
     *      java.util.concurrent.Future java.nio.channels.AsynchronousByteChannel.write(java.nio.ByteBuffer) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link java.nio.channels.AsynchronousByteChannel#write(java.nio.ByteBuffer, Object, java.nio.channels.CompletionHandler)
     * public abstract <A> void
     * java.nio.channels.AsynchronousByteChannel.write(java.nio.ByteBuffer,A,java.nio.channels.CompletionHandler<java.lang.Integer,
     * ? super A>)}.
     *
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousByteChannel#write(java.nio.ByteBuffer, Object, java.nio.channels.CompletionHandler)
     * public abstract void
     * java.nio.channels.AsynchronousByteChannel.write(java.nio.ByteBuffer,java.lang.Object,java.nio.channels.CompletionHandler)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousByteChannel#write(java.nio.ByteBuffer, Object,
     *      java.nio.channels.CompletionHandler) public abstract void
     *      java.nio.channels.AsynchronousByteChannel.write(java.nio.ByteBuffer,java.lang.Object,java.nio.channels.
     *      CompletionHandler) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_ByteBuffer_Object_CompletionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousByteChannel#read(java.nio.ByteBuffer) public abstract
     * java.util.concurrent.Future
     * <java.lang.Integer> java.nio.channels.AsynchronousByteChannel.read(java.nio.ByteBuffer)}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousByteChannel#read(java.nio.ByteBuffer) public abstract
     * java.util.concurrent.Future java.nio.channels.AsynchronousByteChannel.read(java.nio.ByteBuffer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousByteChannel#read(java.nio.ByteBuffer) public abstract
     *      java.util.concurrent.Future java.nio.channels.AsynchronousByteChannel.read(java.nio.ByteBuffer) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link java.nio.channels.AsynchronousByteChannel#read(java.nio.ByteBuffer, Object, java.nio.channels.CompletionHandler)
     * public abstract <A> void
     * java.nio.channels.AsynchronousByteChannel.read(java.nio.ByteBuffer,A,java.nio.channels.CompletionHandler<java.lang.Integer,
     * ? super A>)}.
     *
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousByteChannel#read(java.nio.ByteBuffer, Object, java.nio.channels.CompletionHandler)
     * public abstract void
     * java.nio.channels.AsynchronousByteChannel.read(java.nio.ByteBuffer,java.lang.Object,java.nio.channels.CompletionHandler)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousByteChannel#read(java.nio.ByteBuffer, Object,
     *      java.nio.channels.CompletionHandler) public abstract void
     *      java.nio.channels.AsynchronousByteChannel.read(java.nio.ByteBuffer,java.lang.Object,java.nio.channels.
     *      CompletionHandler) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_ByteBuffer_Object_CompletionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
