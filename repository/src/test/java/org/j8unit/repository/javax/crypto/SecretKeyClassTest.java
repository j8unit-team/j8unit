package org.j8unit.repository.javax.crypto;

import javax.crypto.SecretKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecretKeyClassTest
implements org.j8unit.repository.javax.crypto.SecretKeyClassTests<SecretKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.SecretKey]

    @Override
    public Class<SecretKey> createNewSUT() {
        return SecretKey.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.SecretKey]

}
