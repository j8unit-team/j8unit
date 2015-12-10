package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlgorithmParametersSpiClassTest
implements org.j8unit.repository.java.security.AlgorithmParametersSpiClassTests<java.security.AlgorithmParametersSpi> {

    @Override
    public Class<java.security.AlgorithmParametersSpi> createNewSUT() {
        return java.security.AlgorithmParametersSpi.class;
    }

}
