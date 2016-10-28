package org.j8unit.repository.javax.crypto;

import javax.crypto.EncryptedPrivateKeyInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EncryptedPrivateKeyInfoTest
implements org.j8unit.repository.javax.crypto.EncryptedPrivateKeyInfoTests<EncryptedPrivateKeyInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.EncryptedPrivateKeyInfo]

    @Override
    public EncryptedPrivateKeyInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.EncryptedPrivateKeyInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.EncryptedPrivateKeyInfo]

}
