package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509KeyManagerClassTest
implements org.j8unit.repository.javax.net.ssl.X509KeyManagerClassTests<javax.net.ssl.X509KeyManager> {

    @Override
    public Class<javax.net.ssl.X509KeyManager> createNewSUT() {
        return javax.net.ssl.X509KeyManager.class;
    }

}
