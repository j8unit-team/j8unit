package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLContextClassTest
implements org.j8unit.repository.javax.net.ssl.SSLContextClassTests<javax.net.ssl.SSLContext> {

    @Override
    public Class<javax.net.ssl.SSLContext> createNewSUT() {
        return javax.net.ssl.SSLContext.class;
    }

}
