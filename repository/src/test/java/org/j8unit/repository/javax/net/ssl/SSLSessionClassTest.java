package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLSession;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLSessionClassTest
implements org.j8unit.repository.javax.net.ssl.SSLSessionClassTests<SSLSession> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLSession]

    @Override
    public Class<SSLSession> createNewSUT() {
        return SSLSession.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLSession]

}
