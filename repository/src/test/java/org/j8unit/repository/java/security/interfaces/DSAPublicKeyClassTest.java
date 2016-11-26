package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.DSAPublicKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DSAPublicKey} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.interfaces.DSAPublicKeyClassTests}).
 */
@RunWith(J8Unit4.class)
public class DSAPublicKeyClassTest
implements DSAPublicKeyClassTests<DSAPublicKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.DSAPublicKey]

    @Override
    public Class<DSAPublicKey> createNewSUT() {
        return DSAPublicKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.interfaces.DSAPublicKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.DSAPublicKey]

}
