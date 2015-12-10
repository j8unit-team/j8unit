package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CipherOutputStreamClassTest
implements org.j8unit.repository.javax.crypto.CipherOutputStreamClassTests<javax.crypto.CipherOutputStream> {

    @Override
    public Class<javax.crypto.CipherOutputStream> createNewSUT() {
        return javax.crypto.CipherOutputStream.class;
    }

}
