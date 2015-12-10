package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CipherTest
implements org.j8unit.repository.javax.crypto.CipherTests<javax.crypto.Cipher> {

    @Override
    public javax.crypto.Cipher createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.crypto.Cipher] available.");
    }

}
