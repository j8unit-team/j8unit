package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HandshakeCompletedEventClassTest
implements org.j8unit.repository.javax.net.ssl.HandshakeCompletedEventClassTests<javax.net.ssl.HandshakeCompletedEvent> {

    @Override
    public Class<javax.net.ssl.HandshakeCompletedEvent> createNewSUT() {
        return javax.net.ssl.HandshakeCompletedEvent.class;
    }

}
