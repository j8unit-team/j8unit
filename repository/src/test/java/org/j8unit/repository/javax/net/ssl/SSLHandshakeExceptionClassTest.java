package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLHandshakeExceptionClassTest
implements org.j8unit.repository.javax.net.ssl.SSLHandshakeExceptionClassTests<javax.net.ssl.SSLHandshakeException> {

    @Override
    public Class<javax.net.ssl.SSLHandshakeException> createNewSUT() {
        return javax.net.ssl.SSLHandshakeException.class;
    }

}
