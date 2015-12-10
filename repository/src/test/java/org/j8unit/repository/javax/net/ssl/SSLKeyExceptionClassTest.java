package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLKeyExceptionClassTest
implements org.j8unit.repository.javax.net.ssl.SSLKeyExceptionClassTests<javax.net.ssl.SSLKeyException> {

    @Override
    public Class<javax.net.ssl.SSLKeyException> createNewSUT() {
        return javax.net.ssl.SSLKeyException.class;
    }

}
