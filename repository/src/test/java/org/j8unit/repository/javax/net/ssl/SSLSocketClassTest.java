package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLSocketClassTest
implements org.j8unit.repository.javax.net.ssl.SSLSocketClassTests<javax.net.ssl.SSLSocket> {

    @Override
    public Class<javax.net.ssl.SSLSocket> createNewSUT() {
        return javax.net.ssl.SSLSocket.class;
    }

}
