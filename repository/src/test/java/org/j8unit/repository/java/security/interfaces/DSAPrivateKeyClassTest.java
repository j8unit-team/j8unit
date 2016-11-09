package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.DSAPrivateKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DSAPrivateKey} (by simply reusing the
 * J8Unit test interface {@link DSAPrivateKeyClassTests}).
 */

@RunWith(J8Unit4.class)
public class DSAPrivateKeyClassTest
implements DSAPrivateKeyClassTests<DSAPrivateKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.DSAPrivateKey]

    @Override
    public Class<DSAPrivateKey> createNewSUT() {
        return DSAPrivateKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.interfaces.DSAPrivateKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.DSAPrivateKey]

}
