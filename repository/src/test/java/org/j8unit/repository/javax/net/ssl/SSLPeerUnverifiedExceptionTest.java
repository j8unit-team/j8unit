package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLPeerUnverifiedExceptionTest
implements org.j8unit.repository.javax.net.ssl.SSLPeerUnverifiedExceptionTests<javax.net.ssl.SSLPeerUnverifiedException> {

    @Override
    public javax.net.ssl.SSLPeerUnverifiedException createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.net.ssl.SSLPeerUnverifiedException] available.");
    }

}
