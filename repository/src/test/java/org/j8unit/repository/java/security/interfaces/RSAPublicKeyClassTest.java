package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.RSAPublicKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAPublicKeyClassTest
implements org.j8unit.repository.java.security.interfaces.RSAPublicKeyClassTests<RSAPublicKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.RSAPublicKey]

    @Override
    public Class<RSAPublicKey> createNewSUT() {
        return RSAPublicKey.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.RSAPublicKey]

}
