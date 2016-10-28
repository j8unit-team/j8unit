package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLSocket;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLSocketClassTest
implements org.j8unit.repository.javax.net.ssl.SSLSocketClassTests<SSLSocket> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLSocket]

    @Override
    public Class<SSLSocket> createNewSUT() {
        return SSLSocket.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLSocket]

}
