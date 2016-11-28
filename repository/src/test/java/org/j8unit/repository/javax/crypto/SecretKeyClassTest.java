package org.j8unit.repository.javax.crypto;

import javax.crypto.SecretKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SecretKey} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.crypto.SecretKeyClassTests}).
 */
@RunWith(J8Unit4.class)
public class SecretKeyClassTest
implements SecretKeyClassTests<SecretKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.SecretKey]

    @Override
    public Class<SecretKey> createNewSUT() {
        return SecretKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.SecretKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.SecretKey]

}
