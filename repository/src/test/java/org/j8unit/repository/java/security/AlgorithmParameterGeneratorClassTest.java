package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlgorithmParameterGeneratorClassTest
implements org.j8unit.repository.java.security.AlgorithmParameterGeneratorClassTests<java.security.AlgorithmParameterGenerator> {

    @Override
    public Class<java.security.AlgorithmParameterGenerator> createNewSUT() {
        return java.security.AlgorithmParameterGenerator.class;
    }

}
