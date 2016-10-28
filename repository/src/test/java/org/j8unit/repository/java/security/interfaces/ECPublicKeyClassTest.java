package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.ECPublicKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECPublicKeyClassTest
implements org.j8unit.repository.java.security.interfaces.ECPublicKeyClassTests<ECPublicKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.ECPublicKey]

    @Override
    public Class<ECPublicKey> createNewSUT() {
        return ECPublicKey.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.ECPublicKey]

}
