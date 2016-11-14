package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.AlgorithmMethod;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AlgorithmMethod} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.AlgorithmMethodClassTests}).
 */

@RunWith(J8Unit4.class)
public class AlgorithmMethodClassTest
implements AlgorithmMethodClassTests<AlgorithmMethod> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.AlgorithmMethod]

    @Override
    public Class<AlgorithmMethod> createNewSUT() {
        return AlgorithmMethod.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.AlgorithmMethod]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.AlgorithmMethod]

}
