package org.j8unit.repository.java.security;

import java.security.AlgorithmParameterGeneratorSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AlgorithmParameterGeneratorSpi} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.security.AlgorithmParameterGeneratorSpiTests}).
 */

@RunWith(J8Unit4.class)
public class AlgorithmParameterGeneratorSpiTest
implements AlgorithmParameterGeneratorSpiTests<AlgorithmParameterGeneratorSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.AlgorithmParameterGeneratorSpi]

    @Override
    public AlgorithmParameterGeneratorSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.AlgorithmParameterGeneratorSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.AlgorithmParameterGeneratorSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.AlgorithmParameterGeneratorSpi]

}
