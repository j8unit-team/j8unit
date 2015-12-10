package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CipherInputStreamClassTest
implements org.j8unit.repository.javax.crypto.CipherInputStreamClassTests<javax.crypto.CipherInputStream> {

    @Override
    public Class<javax.crypto.CipherInputStream> createNewSUT() {
        return javax.crypto.CipherInputStream.class;
    }

}
