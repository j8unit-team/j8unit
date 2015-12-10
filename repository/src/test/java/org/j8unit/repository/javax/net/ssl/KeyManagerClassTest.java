package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyManagerClassTest
implements org.j8unit.repository.javax.net.ssl.KeyManagerClassTests<javax.net.ssl.KeyManager> {

    @Override
    public Class<javax.net.ssl.KeyManager> createNewSUT() {
        return javax.net.ssl.KeyManager.class;
    }

}
