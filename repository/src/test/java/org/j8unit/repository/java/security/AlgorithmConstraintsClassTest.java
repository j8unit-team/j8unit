package org.j8unit.repository.java.security;

import java.security.AlgorithmConstraints;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AlgorithmConstraints} (by simply reusing
 * the J8Unit test interface {@link AlgorithmConstraintsClassTests}).
 */

@RunWith(J8Unit4.class)
public class AlgorithmConstraintsClassTest
implements AlgorithmConstraintsClassTests<AlgorithmConstraints> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.AlgorithmConstraints]

    @Override
    public Class<AlgorithmConstraints> createNewSUT() {
        return AlgorithmConstraints.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.AlgorithmConstraints]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.AlgorithmConstraints]

}
