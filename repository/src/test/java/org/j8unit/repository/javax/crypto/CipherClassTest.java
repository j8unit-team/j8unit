package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CipherClassTest
implements org.j8unit.repository.javax.crypto.CipherClassTests<javax.crypto.Cipher> {

    @Override
    public Class<javax.crypto.Cipher> createNewSUT() {
        return javax.crypto.Cipher.class;
    }

}
