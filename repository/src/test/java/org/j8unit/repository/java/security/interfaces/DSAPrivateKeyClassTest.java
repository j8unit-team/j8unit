package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.DSAPrivateKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAPrivateKeyClassTest
implements org.j8unit.repository.java.security.interfaces.DSAPrivateKeyClassTests<DSAPrivateKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.DSAPrivateKey]

    @Override
    public Class<DSAPrivateKey> createNewSUT() {
        return DSAPrivateKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.interfaces.DSAPrivateKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.DSAPrivateKey]

}
