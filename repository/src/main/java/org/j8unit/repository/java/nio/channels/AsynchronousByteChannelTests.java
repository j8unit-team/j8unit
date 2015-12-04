package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.channels.AsynchronousByteChannel interface java.nio.channels.AsynchronousByteChannel},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.AsynchronousByteChannelClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AsynchronousByteChannelTests<SUT extends java.nio.channels.AsynchronousByteChannel>
extends org.j8unit.repository.java.nio.channels.AsynchronousChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousByteChannel#write(java.nio.ByteBuffer) public abstract
     * java.util.concurrent.Future java.nio.channels.AsynchronousByteChannel.write(java.nio.ByteBuffer)}.
     * </p>
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
     * {@link java.nio.channels.AsynchronousByteChannel#write(java.nio.ByteBuffer,java.lang.Object,java.nio.channels.CompletionHandler)
     * public abstract void
     * java.nio.channels.AsynchronousByteChannel.write(java.nio.ByteBuffer,java.lang.Object,java.nio.channels.CompletionHandler)}
     * .
     * </p>
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
     * java.util.concurrent.Future java.nio.channels.AsynchronousByteChannel.read(java.nio.ByteBuffer)}.
     * </p>
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
     * {@link java.nio.channels.AsynchronousByteChannel#read(java.nio.ByteBuffer,java.lang.Object,java.nio.channels.CompletionHandler)
     * public abstract void
     * java.nio.channels.AsynchronousByteChannel.read(java.nio.ByteBuffer,java.lang.Object,java.nio.channels.CompletionHandler)}
     * .
     * </p>
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
