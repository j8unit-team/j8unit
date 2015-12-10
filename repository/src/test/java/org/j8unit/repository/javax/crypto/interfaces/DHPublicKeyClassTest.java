package org.j8unit.repository.javax.crypto.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DHPublicKeyClassTest
implements org.j8unit.repository.javax.crypto.interfaces.DHPublicKeyClassTests<javax.crypto.interfaces.DHPublicKey> {

    @Override
    public Class<javax.crypto.interfaces.DHPublicKey> createNewSUT() {
        return javax.crypto.interfaces.DHPublicKey.class;
    }

}
