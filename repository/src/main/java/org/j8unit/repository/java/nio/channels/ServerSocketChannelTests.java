package org.j8unit.repository.java.nio.channels;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.nio.channels.ServerSocketChannel class java.nio.channels.ServerSocketChannel},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.ServerSocketChannelClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ServerSocketChannelTests<SUT extends java.nio.channels.ServerSocketChannel>
extends org.j8unit.repository.java.nio.channels.NetworkChannelTests<SUT>,
        org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#accept() public abstract java.nio.channels.SocketChannel java.nio.channels.ServerSocketChannel.accept() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accept() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#validOps() public final int java.nio.channels.ServerSocketChannel.validOps()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_validOps() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#getLocalAddress() public abstract java.net.SocketAddress java.nio.channels.ServerSocketChannel.getLocalAddress() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getLocalAddress() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#socket() public abstract java.net.ServerSocket java.nio.channels.ServerSocketChannel.socket()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_socket() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#bind(java.net.SocketAddress,int) public abstract java.nio.channels.ServerSocketChannel java.nio.channels.ServerSocketChannel.bind(java.net.SocketAddress,int) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_bind_SocketAddress_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#bind(java.net.SocketAddress) public final java.nio.channels.ServerSocketChannel java.nio.channels.ServerSocketChannel.bind(java.net.SocketAddress) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_bind_SocketAddress() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.ServerSocketChannel#setOption(java.net.SocketOption,java.lang.Object) public abstract java.nio.channels.ServerSocketChannel java.nio.channels.ServerSocketChannel.setOption(java.net.SocketOption,java.lang.Object) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setOption_SocketOption_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

 /**
  * <p>
  * The method-under-test covered by this test method is inherited duplicatedly within
  * the declaring class-under-test. In result, there are duplicated according test
  * method within the super test classes. To solve this situation, this method must be
  * overriden. Dont't worry, there will be meaningful test methods soon and, thus,
  * overriding becomes unnecessary.
  * </p>
  */
 @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
 @Test
 @Category(Draft.class)
 @Override
 public default void test_close() throws Exception {
 }

 /**
  * <p>
  * The method-under-test covered by this test method is inherited duplicatedly within
  * the declaring class-under-test. In result, there are duplicated according test
  * method within the super test classes. To solve this situation, this method must be
  * overriden. Dont't worry, there will be meaningful test methods soon and, thus,
  * overriding becomes unnecessary.
  * </p>
  */
 @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
 @Test
 @Category(Draft.class)
 @Override
 public default void test_isOpen() throws Exception {
 }

}
