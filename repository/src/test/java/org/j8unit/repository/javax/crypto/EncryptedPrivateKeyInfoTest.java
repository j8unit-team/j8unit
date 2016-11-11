package org.j8unit.repository.javax.crypto;

import javax.crypto.EncryptedPrivateKeyInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EncryptedPrivateKeyInfo} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.crypto.EncryptedPrivateKeyInfoTests}).
 */

@RunWith(J8Unit4.class)
public class EncryptedPrivateKeyInfoTest
implements EncryptedPrivateKeyInfoTests<EncryptedPrivateKeyInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.EncryptedPrivateKeyInfo]

    @Override
    public EncryptedPrivateKeyInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.EncryptedPrivateKeyInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.EncryptedPrivateKeyInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.EncryptedPrivateKeyInfo]

}
