package org.j8unit.repository.java.security.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlgorithmParameterSpecTest
implements org.j8unit.repository.java.security.spec.AlgorithmParameterSpecTests<AlgorithmParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.AlgorithmParameterSpec]

    @Override
    public AlgorithmParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.spec.AlgorithmParameterSpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.AlgorithmParameterSpec]

}
