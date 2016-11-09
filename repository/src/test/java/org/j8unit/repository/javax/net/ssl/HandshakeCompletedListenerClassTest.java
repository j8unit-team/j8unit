package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.HandshakeCompletedListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HandshakeCompletedListener} (by simply
 * reusing the J8Unit test interface {@link HandshakeCompletedListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class HandshakeCompletedListenerClassTest
implements HandshakeCompletedListenerClassTests<HandshakeCompletedListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.HandshakeCompletedListener]

    @Override
    public Class<HandshakeCompletedListener> createNewSUT() {
        return HandshakeCompletedListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.HandshakeCompletedListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.HandshakeCompletedListener]

}
