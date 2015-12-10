package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MacSpiClassTest
implements org.j8unit.repository.javax.crypto.MacSpiClassTests<javax.crypto.MacSpi> {

    @Override
    public Class<javax.crypto.MacSpi> createNewSUT() {
        return javax.crypto.MacSpi.class;
    }

}
