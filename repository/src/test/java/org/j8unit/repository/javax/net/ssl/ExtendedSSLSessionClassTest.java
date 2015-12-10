package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExtendedSSLSessionClassTest
implements org.j8unit.repository.javax.net.ssl.ExtendedSSLSessionClassTests<javax.net.ssl.ExtendedSSLSession> {

    @Override
    public Class<javax.net.ssl.ExtendedSSLSession> createNewSUT() {
        return javax.net.ssl.ExtendedSSLSession.class;
    }

}
