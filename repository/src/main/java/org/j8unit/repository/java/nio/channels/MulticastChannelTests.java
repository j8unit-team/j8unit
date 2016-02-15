package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.MulticastChannel interface
 * java.nio.channels.MulticastChannel}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link MulticastChannelClassTests}.
 * </p>
 *
 * @see java.nio.channels.MulticastChannel interface java.nio.channels.MulticastChannel (the hereby targeted
 *      class-under-test class)
 * @see MulticastChannelClassTests MulticastChannelClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MulticastChannelTests<SUT extends java.nio.channels.MulticastChannel>
extends NetworkChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.MulticastChannel#join(java.net.InetAddress, java.net.NetworkInterface)
     * public abstract java.nio.channels.MembershipKey
     * java.nio.channels.MulticastChannel.join(java.net.InetAddress,java.net.NetworkInterface) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.MulticastChannel#join(java.net.InetAddress, java.net.NetworkInterface)
     * public abstract java.nio.channels.MembershipKey
     * java.nio.channels.MulticastChannel.join(java.net.InetAddress,java.net.NetworkInterface) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.MulticastChannel#join(java.net.InetAddress, java.net.NetworkInterface) public abstract
     *      java.nio.channels.MembershipKey
     *      java.nio.channels.MulticastChannel.join(java.net.InetAddress,java.net.NetworkInterface) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_join_InetAddress_NetworkInterface()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.channels.MulticastChannel#join(java.net.InetAddress, java.net.NetworkInterface, java.net.InetAddress)
     * public abstract java.nio.channels.MembershipKey
     * java.nio.channels.MulticastChannel.join(java.net.InetAddress,java.net.NetworkInterface,java.net.InetAddress)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.channels.MulticastChannel#join(java.net.InetAddress, java.net.NetworkInterface, java.net.InetAddress)
     * public abstract java.nio.channels.MembershipKey
     * java.nio.channels.MulticastChannel.join(java.net.InetAddress,java.net.NetworkInterface,java.net.InetAddress)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.MulticastChannel#join(java.net.InetAddress, java.net.NetworkInterface,
     *      java.net.InetAddress) public abstract java.nio.channels.MembershipKey
     *      java.nio.channels.MulticastChannel.join(java.net.InetAddress,java.net.NetworkInterface,java.net.InetAddress)
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_join_InetAddress_NetworkInterface_InetAddress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.MulticastChannel#close() public abstract void
     * java.nio.channels.MulticastChannel.close() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.MulticastChannel#close() public abstract void
     * java.nio.channels.MulticastChannel.close() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.MulticastChannel#close() public abstract void java.nio.channels.MulticastChannel.close()
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
