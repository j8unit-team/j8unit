package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.X509KeyManager;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509KeyManagerClassTest
implements org.j8unit.repository.javax.net.ssl.X509KeyManagerClassTests<X509KeyManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.X509KeyManager]

    @Override
    public Class<X509KeyManager> createNewSUT() {
        return X509KeyManager.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.X509KeyManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.X509KeyManager]

}
