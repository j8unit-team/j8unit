package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.AsynchronousSocketChannel class
 * java.nio.channels.AsynchronousSocketChannel}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AsynchronousSocketChannelClassTests}.
 * </p>
 *
 * @see java.nio.channels.AsynchronousSocketChannel class java.nio.channels.AsynchronousSocketChannel (the hereby
 *      targeted class-under-test class)
 * @see AsynchronousSocketChannelClassTests AsynchronousSocketChannelClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AsynchronousSocketChannelTests<SUT extends java.nio.channels.AsynchronousSocketChannel>
extends AsynchronousByteChannelTests<SUT>, NetworkChannelTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#connect(java.net.SocketAddress) public
     * abstract java.util.concurrent.Future
     * <java.lang.Void> java.nio.channels.AsynchronousSocketChannel.connect(java.net.SocketAddress)}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#connect(java.net.SocketAddress) public
     * abstract java.util.concurrent.Future java.nio.channels.AsynchronousSocketChannel.connect(java.net.SocketAddress)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#connect(java.net.SocketAddress) public abstract
     *      java.util.concurrent.Future java.nio.channels.AsynchronousSocketChannel.connect(java.net.SocketAddress) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_connect_SocketAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousSocketChannel#connect(java.net.SocketAddress, Object, java.nio.channels.CompletionHandler)
     * public abstract <A> void
     * java.nio.channels.AsynchronousSocketChannel.connect(java.net.SocketAddress,A,java.nio.channels.CompletionHandler<java.lang.Void,
     * ? super A>)}.
     *
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousSocketChannel#connect(java.net.SocketAddress, Object, java.nio.channels.CompletionHandler)
     * public abstract void
     * java.nio.channels.AsynchronousSocketChannel.connect(java.net.SocketAddress,java.lang.Object,java.nio.channels.CompletionHandler)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#connect(java.net.SocketAddress, Object,
     *      java.nio.channels.CompletionHandler) public abstract void
     *      java.nio.channels.AsynchronousSocketChannel.connect(java.net.SocketAddress,java.lang.Object,java.nio.
     *      channels.CompletionHandler) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_connect_SocketAddress_Object_CompletionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousSocketChannel#write(java.nio.ByteBuffer, Object, java.nio.channels.CompletionHandler)
     * public final <A> void
     * java.nio.channels.AsynchronousSocketChannel.write(java.nio.ByteBuffer,A,java.nio.channels.CompletionHandler<java.lang.Integer,
     * ? super A>)}.
     *
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousSocketChannel#write(java.nio.ByteBuffer, Object, java.nio.channels.CompletionHandler)
     * public final void
     * java.nio.channels.AsynchronousSocketChannel.write(java.nio.ByteBuffer,java.lang.Object,java.nio.channels.CompletionHandler)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#write(java.nio.ByteBuffer, Object,
     *      java.nio.channels.CompletionHandler) public final void
     *      java.nio.channels.AsynchronousSocketChannel.write(java.nio.ByteBuffer,java.lang.Object,java.nio.channels.
     *      CompletionHandler) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for
     * {@link java.nio.channels.AsynchronousSocketChannel#write(java.nio.ByteBuffer, long, java.util.concurrent.TimeUnit, Object, java.nio.channels.CompletionHandler)
     * public abstract <A> void
     * java.nio.channels.AsynchronousSocketChannel.write(java.nio.ByteBuffer,long,java.util.concurrent.TimeUnit,A,java.nio.channels.CompletionHandler<java.lang.Integer,
     * ? super A>)}.
     *
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousSocketChannel#write(java.nio.ByteBuffer, long, java.util.concurrent.TimeUnit, Object, java.nio.channels.CompletionHandler)
     * public abstract void
     * java.nio.channels.AsynchronousSocketChannel.write(java.nio.ByteBuffer,long,java.util.concurrent.TimeUnit,java.lang.Object,java.nio.channels.CompletionHandler)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#write(java.nio.ByteBuffer, long, java.util.concurrent.TimeUnit,
     *      Object, java.nio.channels.CompletionHandler) public abstract void
     *      java.nio.channels.AsynchronousSocketChannel.write(java.nio.ByteBuffer,long,java.util.concurrent.TimeUnit,
     *      java.lang.Object,java.nio.channels.CompletionHandler) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_ByteBuffer_long_TimeUnit_Object_CompletionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#write(java.nio.ByteBuffer) public abstract
     * java.util.concurrent.Future
     * <java.lang.Integer> java.nio.channels.AsynchronousSocketChannel.write(java.nio.ByteBuffer)}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#write(java.nio.ByteBuffer) public abstract
     * java.util.concurrent.Future java.nio.channels.AsynchronousSocketChannel.write(java.nio.ByteBuffer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#write(java.nio.ByteBuffer) public abstract
     *      java.util.concurrent.Future java.nio.channels.AsynchronousSocketChannel.write(java.nio.ByteBuffer) (the
     *      hereby targeted method-under-test)
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
     * Test method for
     * {@link java.nio.channels.AsynchronousSocketChannel#write(java.nio.ByteBuffer[], int, int, long, java.util.concurrent.TimeUnit, Object, java.nio.channels.CompletionHandler)
     * public abstract <A> void
     * java.nio.channels.AsynchronousSocketChannel.write(java.nio.ByteBuffer[],int,int,long,java.util.concurrent.TimeUnit,A,java.nio.channels.CompletionHandler<java.lang.Long,
     * ? super A>)}.
     *
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousSocketChannel#write(java.nio.ByteBuffer[], int, int, long, java.util.concurrent.TimeUnit, Object, java.nio.channels.CompletionHandler)
     * public abstract void
     * java.nio.channels.AsynchronousSocketChannel.write(java.nio.ByteBuffer[],int,int,long,java.util.concurrent.TimeUnit,java.lang.Object,java.nio.channels.CompletionHandler)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#write(java.nio.ByteBuffer[], int, int, long,
     *      java.util.concurrent.TimeUnit, Object, java.nio.channels.CompletionHandler) public abstract void
     *      java.nio.channels.AsynchronousSocketChannel.write(java.nio.ByteBuffer[],int,int,long,java.util.concurrent.
     *      TimeUnit,java.lang.Object,java.nio.channels.CompletionHandler) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_ByteBufferArray_int_int_long_TimeUnit_Object_CompletionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#provider() public final
     * java.nio.channels.spi.AsynchronousChannelProvider java.nio.channels.AsynchronousSocketChannel.provider()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#provider() public final
     * java.nio.channels.spi.AsynchronousChannelProvider java.nio.channels.AsynchronousSocketChannel.provider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#provider() public final
     *      java.nio.channels.spi.AsynchronousChannelProvider java.nio.channels.AsynchronousSocketChannel.provider()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_provider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#bind(java.net.SocketAddress) public abstract
     * java.nio.channels.AsynchronousSocketChannel
     * java.nio.channels.AsynchronousSocketChannel.bind(java.net.SocketAddress) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#bind(java.net.SocketAddress) public abstract
     * java.nio.channels.AsynchronousSocketChannel
     * java.nio.channels.AsynchronousSocketChannel.bind(java.net.SocketAddress) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#bind(java.net.SocketAddress) public abstract
     *      java.nio.channels.AsynchronousSocketChannel
     *      java.nio.channels.AsynchronousSocketChannel.bind(java.net.SocketAddress) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_bind_SocketAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#shutdownInput() public abstract
     * java.nio.channels.AsynchronousSocketChannel java.nio.channels.AsynchronousSocketChannel.shutdownInput() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#shutdownInput() public abstract
     * java.nio.channels.AsynchronousSocketChannel java.nio.channels.AsynchronousSocketChannel.shutdownInput() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#shutdownInput() public abstract
     *      java.nio.channels.AsynchronousSocketChannel java.nio.channels.AsynchronousSocketChannel.shutdownInput()
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_shutdownInput()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#shutdownOutput() public abstract
     * java.nio.channels.AsynchronousSocketChannel java.nio.channels.AsynchronousSocketChannel.shutdownOutput() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#shutdownOutput() public abstract
     * java.nio.channels.AsynchronousSocketChannel java.nio.channels.AsynchronousSocketChannel.shutdownOutput() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#shutdownOutput() public abstract
     *      java.nio.channels.AsynchronousSocketChannel java.nio.channels.AsynchronousSocketChannel.shutdownOutput()
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_shutdownOutput()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#getLocalAddress() public abstract
     * java.net.SocketAddress java.nio.channels.AsynchronousSocketChannel.getLocalAddress() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#getLocalAddress() public abstract
     * java.net.SocketAddress java.nio.channels.AsynchronousSocketChannel.getLocalAddress() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#getLocalAddress() public abstract java.net.SocketAddress
     *      java.nio.channels.AsynchronousSocketChannel.getLocalAddress() throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getLocalAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#getRemoteAddress() public abstract
     * java.net.SocketAddress java.nio.channels.AsynchronousSocketChannel.getRemoteAddress() throws java.io.IOException}
     * .
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#getRemoteAddress() public abstract
     * java.net.SocketAddress java.nio.channels.AsynchronousSocketChannel.getRemoteAddress() throws java.io.IOException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#getRemoteAddress() public abstract java.net.SocketAddress
     *      java.nio.channels.AsynchronousSocketChannel.getRemoteAddress() throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRemoteAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousSocketChannel#read(java.nio.ByteBuffer, long, java.util.concurrent.TimeUnit, Object, java.nio.channels.CompletionHandler)
     * public abstract <A> void
     * java.nio.channels.AsynchronousSocketChannel.read(java.nio.ByteBuffer,long,java.util.concurrent.TimeUnit,A,java.nio.channels.CompletionHandler<java.lang.Integer,
     * ? super A>)}.
     *
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousSocketChannel#read(java.nio.ByteBuffer, long, java.util.concurrent.TimeUnit, Object, java.nio.channels.CompletionHandler)
     * public abstract void
     * java.nio.channels.AsynchronousSocketChannel.read(java.nio.ByteBuffer,long,java.util.concurrent.TimeUnit,java.lang.Object,java.nio.channels.CompletionHandler)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#read(java.nio.ByteBuffer, long, java.util.concurrent.TimeUnit,
     *      Object, java.nio.channels.CompletionHandler) public abstract void
     *      java.nio.channels.AsynchronousSocketChannel.read(java.nio.ByteBuffer,long,java.util.concurrent.TimeUnit,java
     *      .lang.Object,java.nio.channels.CompletionHandler) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_ByteBuffer_long_TimeUnit_Object_CompletionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousSocketChannel#read(java.nio.ByteBuffer, Object, java.nio.channels.CompletionHandler)
     * public final <A> void
     * java.nio.channels.AsynchronousSocketChannel.read(java.nio.ByteBuffer,A,java.nio.channels.CompletionHandler<java.lang.Integer,
     * ? super A>)}.
     *
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousSocketChannel#read(java.nio.ByteBuffer, Object, java.nio.channels.CompletionHandler)
     * public final void
     * java.nio.channels.AsynchronousSocketChannel.read(java.nio.ByteBuffer,java.lang.Object,java.nio.channels.CompletionHandler)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#read(java.nio.ByteBuffer, Object,
     *      java.nio.channels.CompletionHandler) public final void
     *      java.nio.channels.AsynchronousSocketChannel.read(java.nio.ByteBuffer,java.lang.Object,java.nio.channels.
     *      CompletionHandler) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_read_ByteBuffer_Object_CompletionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#read(java.nio.ByteBuffer) public abstract
     * java.util.concurrent.Future
     * <java.lang.Integer> java.nio.channels.AsynchronousSocketChannel.read(java.nio.ByteBuffer)}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#read(java.nio.ByteBuffer) public abstract
     * java.util.concurrent.Future java.nio.channels.AsynchronousSocketChannel.read(java.nio.ByteBuffer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#read(java.nio.ByteBuffer) public abstract
     *      java.util.concurrent.Future java.nio.channels.AsynchronousSocketChannel.read(java.nio.ByteBuffer) (the
     *      hereby targeted method-under-test)
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
     * Test method for
     * {@link java.nio.channels.AsynchronousSocketChannel#read(java.nio.ByteBuffer[], int, int, long, java.util.concurrent.TimeUnit, Object, java.nio.channels.CompletionHandler)
     * public abstract <A> void
     * java.nio.channels.AsynchronousSocketChannel.read(java.nio.ByteBuffer[],int,int,long,java.util.concurrent.TimeUnit,A,java.nio.channels.CompletionHandler<java.lang.Long,
     * ? super A>)}.
     *
     * <p>
     * Test method for
     * {@link java.nio.channels.AsynchronousSocketChannel#read(java.nio.ByteBuffer[], int, int, long, java.util.concurrent.TimeUnit, Object, java.nio.channels.CompletionHandler)
     * public abstract void
     * java.nio.channels.AsynchronousSocketChannel.read(java.nio.ByteBuffer[],int,int,long,java.util.concurrent.TimeUnit,java.lang.Object,java.nio.channels.CompletionHandler)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#read(java.nio.ByteBuffer[], int, int, long,
     *      java.util.concurrent.TimeUnit, Object, java.nio.channels.CompletionHandler) public abstract void
     *      java.nio.channels.AsynchronousSocketChannel.read(java.nio.ByteBuffer[],int,int,long,java.util.concurrent.
     *      TimeUnit,java.lang.Object,java.nio.channels.CompletionHandler) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_ByteBufferArray_int_int_long_TimeUnit_Object_CompletionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#setOption(java.net.SocketOption, Object)
     * public abstract <T> java.nio.channels.AsynchronousSocketChannel
     * java.nio.channels.AsynchronousSocketChannel.setOption(java.net.SocketOption<T>,T) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.AsynchronousSocketChannel#setOption(java.net.SocketOption, Object)
     * public abstract java.nio.channels.AsynchronousSocketChannel
     * java.nio.channels.AsynchronousSocketChannel.setOption(java.net.SocketOption,java.lang.Object) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.AsynchronousSocketChannel#setOption(java.net.SocketOption, Object) public abstract
     *      java.nio.channels.AsynchronousSocketChannel
     *      java.nio.channels.AsynchronousSocketChannel.setOption(java.net.SocketOption,java.lang.Object) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setOption_SocketOption_Object()
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
     * <li>{@linkplain java.nio.channels.AsynchronousChannel#close() interface java.nio.channels.AsynchronousChannel}
     * </li>
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

}
