package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.ChannelBinding;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ChannelBinding} (by simply reusing the
 * J8Unit test interface {@link ChannelBindingClassTests}).
 */

@RunWith(J8Unit4.class)
public class ChannelBindingClassTest
implements ChannelBindingClassTests<ChannelBinding> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.ietf.jgss.ChannelBinding]

    @Override
    public Class<ChannelBinding> createNewSUT() {
        return ChannelBinding.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.ietf.jgss.ChannelBinding#ChannelBinding(java.net.InetAddress, java.net.InetAddress, byte[]) public
     * org.ietf.jgss.ChannelBinding(java.net.InetAddress,java.net.InetAddress,byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ChannelBinding_InetAddress_InetAddress_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ChannelBinding sut = null; // = new ChannelBinding(java.net.InetAddress, java.net.InetAddress, byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.ietf.jgss.ChannelBinding#ChannelBinding(byte[]) public org.ietf.jgss.ChannelBinding(byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ChannelBinding_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ChannelBinding sut = null; // = new ChannelBinding(byte[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.ietf.jgss.ChannelBinding]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.ietf.jgss.ChannelBinding]

}
