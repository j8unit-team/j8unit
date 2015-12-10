package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HandshakeCompletedListenerClassTest
implements org.j8unit.repository.javax.net.ssl.HandshakeCompletedListenerClassTests<javax.net.ssl.HandshakeCompletedListener> {

    @Override
    public Class<javax.net.ssl.HandshakeCompletedListener> createNewSUT() {
        return javax.net.ssl.HandshakeCompletedListener.class;
    }

}
