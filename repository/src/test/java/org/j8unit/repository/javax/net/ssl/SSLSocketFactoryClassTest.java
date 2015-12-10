package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLSocketFactoryClassTest
implements org.j8unit.repository.javax.net.ssl.SSLSocketFactoryClassTests<javax.net.ssl.SSLSocketFactory> {

    @Override
    public Class<javax.net.ssl.SSLSocketFactory> createNewSUT() {
        return javax.net.ssl.SSLSocketFactory.class;
    }

}
