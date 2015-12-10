package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyAgreementClassTest
implements org.j8unit.repository.javax.crypto.KeyAgreementClassTests<javax.crypto.KeyAgreement> {

    @Override
    public Class<javax.crypto.KeyAgreement> createNewSUT() {
        return javax.crypto.KeyAgreement.class;
    }

}
