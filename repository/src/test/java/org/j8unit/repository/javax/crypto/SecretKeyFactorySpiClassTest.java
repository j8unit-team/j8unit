package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecretKeyFactorySpiClassTest
implements org.j8unit.repository.javax.crypto.SecretKeyFactorySpiClassTests<javax.crypto.SecretKeyFactorySpi> {

    @Override
    public Class<javax.crypto.SecretKeyFactorySpi> createNewSUT() {
        return javax.crypto.SecretKeyFactorySpi.class;
    }

}
