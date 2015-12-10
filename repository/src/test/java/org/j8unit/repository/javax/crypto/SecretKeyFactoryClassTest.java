package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecretKeyFactoryClassTest
implements org.j8unit.repository.javax.crypto.SecretKeyFactoryClassTests<javax.crypto.SecretKeyFactory> {

    @Override
    public Class<javax.crypto.SecretKeyFactory> createNewSUT() {
        return javax.crypto.SecretKeyFactory.class;
    }

}
