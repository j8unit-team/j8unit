package org.j8unit.repository.java.security;

import java.security.PrivateKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrivateKeyClassTest
implements org.j8unit.repository.java.security.PrivateKeyClassTests<PrivateKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.PrivateKey]

    @Override
    public Class<PrivateKey> createNewSUT() {
        return PrivateKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.PrivateKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.PrivateKey]

}
