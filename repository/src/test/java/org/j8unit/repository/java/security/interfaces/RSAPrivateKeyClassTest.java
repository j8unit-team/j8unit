package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.RSAPrivateKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAPrivateKeyClassTest
implements org.j8unit.repository.java.security.interfaces.RSAPrivateKeyClassTests<RSAPrivateKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.RSAPrivateKey]

    @Override
    public Class<RSAPrivateKey> createNewSUT() {
        return RSAPrivateKey.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.RSAPrivateKey]

}
