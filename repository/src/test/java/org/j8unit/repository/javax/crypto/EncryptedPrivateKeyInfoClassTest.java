package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EncryptedPrivateKeyInfoClassTest
implements org.j8unit.repository.javax.crypto.EncryptedPrivateKeyInfoClassTests<javax.crypto.EncryptedPrivateKeyInfo> {

    @Override
    public Class<javax.crypto.EncryptedPrivateKeyInfo> createNewSUT() {
        return javax.crypto.EncryptedPrivateKeyInfo.class;
    }

}
