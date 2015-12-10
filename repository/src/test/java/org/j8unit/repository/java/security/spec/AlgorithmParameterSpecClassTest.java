package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlgorithmParameterSpecClassTest
implements org.j8unit.repository.java.security.spec.AlgorithmParameterSpecClassTests<java.security.spec.AlgorithmParameterSpec> {

    @Override
    public Class<java.security.spec.AlgorithmParameterSpec> createNewSUT() {
        return java.security.spec.AlgorithmParameterSpec.class;
    }

}
