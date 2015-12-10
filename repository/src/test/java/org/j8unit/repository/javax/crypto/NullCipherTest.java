package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NullCipherTest
implements org.j8unit.repository.javax.crypto.NullCipherTests<javax.crypto.NullCipher> {

    @Override
    public javax.crypto.NullCipher createNewSUT() {
        return new javax.crypto.NullCipher();
    }

}
