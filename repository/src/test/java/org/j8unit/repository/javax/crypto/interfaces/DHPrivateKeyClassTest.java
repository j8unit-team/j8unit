package org.j8unit.repository.javax.crypto.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DHPrivateKeyClassTest
implements org.j8unit.repository.javax.crypto.interfaces.DHPrivateKeyClassTests<javax.crypto.interfaces.DHPrivateKey> {

    @Override
    public Class<javax.crypto.interfaces.DHPrivateKey> createNewSUT() {
        return javax.crypto.interfaces.DHPrivateKey.class;
    }

}
