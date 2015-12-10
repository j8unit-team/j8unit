package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLServerSocketClassTest
implements org.j8unit.repository.javax.net.ssl.SSLServerSocketClassTests<javax.net.ssl.SSLServerSocket> {

    @Override
    public Class<javax.net.ssl.SSLServerSocket> createNewSUT() {
        return javax.net.ssl.SSLServerSocket.class;
    }

}
