package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlgorithmParameterGeneratorSpiClassTest
implements org.j8unit.repository.java.security.AlgorithmParameterGeneratorSpiClassTests<java.security.AlgorithmParameterGeneratorSpi> {

    @Override
    public Class<java.security.AlgorithmParameterGeneratorSpi> createNewSUT() {
        return java.security.AlgorithmParameterGeneratorSpi.class;
    }

}
