package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlgorithmConstraintsClassTest
implements org.j8unit.repository.java.security.AlgorithmConstraintsClassTests<java.security.AlgorithmConstraints> {

    @Override
    public Class<java.security.AlgorithmConstraints> createNewSUT() {
        return java.security.AlgorithmConstraints.class;
    }

}
