package org.j8unit.repository.java.security.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlgorithmParameterSpecClassTest
implements org.j8unit.repository.java.security.spec.AlgorithmParameterSpecClassTests<AlgorithmParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.AlgorithmParameterSpec]

    @Override
    public Class<AlgorithmParameterSpec> createNewSUT() {
        return AlgorithmParameterSpec.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.spec.AlgorithmParameterSpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.AlgorithmParameterSpec]

}
