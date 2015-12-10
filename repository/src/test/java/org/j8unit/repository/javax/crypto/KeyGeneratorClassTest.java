package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyGeneratorClassTest
implements org.j8unit.repository.javax.crypto.KeyGeneratorClassTests<javax.crypto.KeyGenerator> {

    @Override
    public Class<javax.crypto.KeyGenerator> createNewSUT() {
        return javax.crypto.KeyGenerator.class;
    }

}
