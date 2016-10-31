package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.HandshakeCompletedListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HandshakeCompletedListenerClassTest
implements org.j8unit.repository.javax.net.ssl.HandshakeCompletedListenerClassTests<HandshakeCompletedListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.HandshakeCompletedListener]

    @Override
    public Class<HandshakeCompletedListener> createNewSUT() {
        return HandshakeCompletedListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.HandshakeCompletedListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.HandshakeCompletedListener]

}
