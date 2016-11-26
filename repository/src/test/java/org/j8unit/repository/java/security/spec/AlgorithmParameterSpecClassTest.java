package org.j8unit.repository.java.security.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AlgorithmParameterSpec} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.security.spec.AlgorithmParameterSpecClassTests}).
 */
@RunWith(J8Unit4.class)
public class AlgorithmParameterSpecClassTest
implements AlgorithmParameterSpecClassTests<AlgorithmParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.AlgorithmParameterSpec]

    @Override
    public Class<AlgorithmParameterSpec> createNewSUT() {
        return AlgorithmParameterSpec.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.spec.AlgorithmParameterSpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.AlgorithmParameterSpec]

}
