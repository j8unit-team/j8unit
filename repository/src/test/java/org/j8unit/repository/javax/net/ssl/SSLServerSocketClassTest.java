package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLServerSocket;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLServerSocketClassTest
implements org.j8unit.repository.javax.net.ssl.SSLServerSocketClassTests<SSLServerSocket> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLServerSocket]

    @Override
    public Class<SSLServerSocket> createNewSUT() {
        return SSLServerSocket.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLServerSocket]

}
