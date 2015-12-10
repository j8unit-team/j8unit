package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509ExtendedKeyManagerClassTest
implements org.j8unit.repository.javax.net.ssl.X509ExtendedKeyManagerClassTests<javax.net.ssl.X509ExtendedKeyManager> {

    @Override
    public Class<javax.net.ssl.X509ExtendedKeyManager> createNewSUT() {
        return javax.net.ssl.X509ExtendedKeyManager.class;
    }

}
