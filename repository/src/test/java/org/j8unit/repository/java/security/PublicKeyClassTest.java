package org.j8unit.repository.java.security;

import java.security.PublicKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PublicKey} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.security.PublicKeyClassTests}).
 */

@RunWith(J8Unit4.class)
public class PublicKeyClassTest
implements PublicKeyClassTests<PublicKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.PublicKey]

    @Override
    public Class<PublicKey> createNewSUT() {
        return PublicKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.PublicKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.PublicKey]

}
