package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyAgreementSpiClassTest
implements org.j8unit.repository.javax.crypto.KeyAgreementSpiClassTests<javax.crypto.KeyAgreementSpi> {

    @Override
    public Class<javax.crypto.KeyAgreementSpi> createNewSUT() {
        return javax.crypto.KeyAgreementSpi.class;
    }

}
