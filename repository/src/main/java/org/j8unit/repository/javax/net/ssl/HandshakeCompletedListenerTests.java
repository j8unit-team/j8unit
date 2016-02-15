package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.HandshakeCompletedListener interface
 * javax.net.ssl.HandshakeCompletedListener}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link HandshakeCompletedListenerClassTests}.
 * </p>
 *
 * @see javax.net.ssl.HandshakeCompletedListener interface javax.net.ssl.HandshakeCompletedListener (the hereby targeted
 *      class-under-test class)
 * @see HandshakeCompletedListenerClassTests HandshakeCompletedListenerClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HandshakeCompletedListenerTests<SUT extends javax.net.ssl.HandshakeCompletedListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.HandshakeCompletedListener#handshakeCompleted(javax.net.ssl.HandshakeCompletedEvent) public
     * abstract void javax.net.ssl.HandshakeCompletedListener.handshakeCompleted(javax.net.ssl.HandshakeCompletedEvent)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.net.ssl.HandshakeCompletedListener#handshakeCompleted(javax.net.ssl.HandshakeCompletedEvent) public
     * abstract void javax.net.ssl.HandshakeCompletedListener.handshakeCompleted(javax.net.ssl.HandshakeCompletedEvent)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.HandshakeCompletedListener#handshakeCompleted(javax.net.ssl.HandshakeCompletedEvent) public
     *      abstract void
     *      javax.net.ssl.HandshakeCompletedListener.handshakeCompleted(javax.net.ssl.HandshakeCompletedEvent) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handshakeCompleted_HandshakeCompletedEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
