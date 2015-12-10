package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyAgreementTest
implements org.j8unit.repository.javax.crypto.KeyAgreementTests<javax.crypto.KeyAgreement> {

    @Override
    public javax.crypto.KeyAgreement createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.crypto.KeyAgreement] available.");
    }

}
