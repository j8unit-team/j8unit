package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.net.ssl.HandshakeCompletedListener interface javax.net.ssl.HandshakeCompletedListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.net.ssl.HandshakeCompletedListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HandshakeCompletedListenerTests<SUT extends javax.net.ssl.HandshakeCompletedListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.net.ssl.HandshakeCompletedListener#handshakeCompleted(javax.net.ssl.HandshakeCompletedEvent) public
     * abstract void javax.net.ssl.HandshakeCompletedListener.handshakeCompleted(javax.net.ssl.HandshakeCompletedEvent)}
     * .
     * </p>
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
