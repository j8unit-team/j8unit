package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.HandshakeCompletedListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HandshakeCompletedListener} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.net.ssl.HandshakeCompletedListenerTests}).
 */
@RunWith(J8Unit4.class)
public class HandshakeCompletedListenerTest
implements HandshakeCompletedListenerTests<HandshakeCompletedListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.HandshakeCompletedListener]

    @Override
    public HandshakeCompletedListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.HandshakeCompletedListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.HandshakeCompletedListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.HandshakeCompletedListener]

}
