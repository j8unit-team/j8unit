package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.channels.MulticastChannel interface java.nio.channels.MulticastChannel}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.MulticastChannelClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MulticastChannelTests<SUT extends java.nio.channels.MulticastChannel>
extends org.j8unit.repository.java.nio.channels.NetworkChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.MulticastChannel#join(java.net.InetAddress,java.net.NetworkInterface)
     * public abstract java.nio.channels.MembershipKey
     * java.nio.channels.MulticastChannel.join(java.net.InetAddress,java.net.NetworkInterface) throws
     * java.io.IOException}.
     * </p>
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
     * {@link java.nio.channels.MulticastChannel#join(java.net.InetAddress,java.net.NetworkInterface,java.net.InetAddress)
     * public abstract java.nio.channels.MembershipKey
     * java.nio.channels.MulticastChannel.join(java.net.InetAddress,java.net.NetworkInterface,java.net.InetAddress)
     * throws java.io.IOException}.
     * </p>
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
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
