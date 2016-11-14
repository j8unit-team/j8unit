package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.DSAKeyPairGenerator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DSAKeyPairGenerator} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.interfaces.DSAKeyPairGeneratorClassTests}).
 */

@RunWith(J8Unit4.class)
public class DSAKeyPairGeneratorClassTest
implements DSAKeyPairGeneratorClassTests<DSAKeyPairGenerator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.DSAKeyPairGenerator]

    @Override
    public Class<DSAKeyPairGenerator> createNewSUT() {
        return DSAKeyPairGenerator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.interfaces.DSAKeyPairGenerator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.DSAKeyPairGenerator]

}
