package org.j8unit.repository.java.security;

import java.security.AlgorithmParametersSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlgorithmParametersSpiTest
implements org.j8unit.repository.java.security.AlgorithmParametersSpiTests<AlgorithmParametersSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.AlgorithmParametersSpi]

    @Override
    public AlgorithmParametersSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.AlgorithmParametersSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.AlgorithmParametersSpi]

}
