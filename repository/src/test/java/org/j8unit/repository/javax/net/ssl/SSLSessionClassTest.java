package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLSessionClassTest
implements org.j8unit.repository.javax.net.ssl.SSLSessionClassTests<javax.net.ssl.SSLSession> {

    @Override
    public Class<javax.net.ssl.SSLSession> createNewSUT() {
        return javax.net.ssl.SSLSession.class;
    }

}
