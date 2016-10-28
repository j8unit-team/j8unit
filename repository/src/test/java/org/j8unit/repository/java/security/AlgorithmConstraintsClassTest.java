package org.j8unit.repository.java.security;

import java.security.AlgorithmConstraints;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlgorithmConstraintsClassTest
implements org.j8unit.repository.java.security.AlgorithmConstraintsClassTests<AlgorithmConstraints> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.AlgorithmConstraints]

    @Override
    public Class<AlgorithmConstraints> createNewSUT() {
        return AlgorithmConstraints.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.AlgorithmConstraints]

}
