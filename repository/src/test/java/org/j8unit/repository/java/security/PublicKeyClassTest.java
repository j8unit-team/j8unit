package org.j8unit.repository.java.security;

import java.security.PublicKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PublicKeyClassTest
implements org.j8unit.repository.java.security.PublicKeyClassTests<PublicKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.PublicKey]

    @Override
    public Class<PublicKey> createNewSUT() {
        return PublicKey.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.PublicKey]

}
