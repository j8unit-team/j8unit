package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.DSAPublicKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAPublicKeyClassTest
implements org.j8unit.repository.java.security.interfaces.DSAPublicKeyClassTests<DSAPublicKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.DSAPublicKey]

    @Override
    public Class<DSAPublicKey> createNewSUT() {
        return DSAPublicKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.interfaces.DSAPublicKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.DSAPublicKey]

}
