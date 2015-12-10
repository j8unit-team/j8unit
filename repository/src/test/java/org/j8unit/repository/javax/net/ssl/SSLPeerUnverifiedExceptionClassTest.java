package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLPeerUnverifiedExceptionClassTest
implements org.j8unit.repository.javax.net.ssl.SSLPeerUnverifiedExceptionClassTests<javax.net.ssl.SSLPeerUnverifiedException> {

    @Override
    public Class<javax.net.ssl.SSLPeerUnverifiedException> createNewSUT() {
        return javax.net.ssl.SSLPeerUnverifiedException.class;
    }

}
