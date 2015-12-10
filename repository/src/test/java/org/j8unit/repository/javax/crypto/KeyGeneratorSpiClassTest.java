package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyGeneratorSpiClassTest
implements org.j8unit.repository.javax.crypto.KeyGeneratorSpiClassTests<javax.crypto.KeyGeneratorSpi> {

    @Override
    public Class<javax.crypto.KeyGeneratorSpi> createNewSUT() {
        return javax.crypto.KeyGeneratorSpi.class;
    }

}
