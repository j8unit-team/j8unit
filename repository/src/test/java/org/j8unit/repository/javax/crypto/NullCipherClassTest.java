package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NullCipherClassTest
implements org.j8unit.repository.javax.crypto.NullCipherClassTests<javax.crypto.NullCipher> {

    @Override
    public Class<javax.crypto.NullCipher> createNewSUT() {
        return javax.crypto.NullCipher.class;
    }

}
