package org.j8unit.repository.java.security;

import java.security.AlgorithmConstraints;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlgorithmConstraintsTest
implements org.j8unit.repository.java.security.AlgorithmConstraintsTests<AlgorithmConstraints> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.AlgorithmConstraints]

    @Override
    public AlgorithmConstraints createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.AlgorithmConstraints], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.AlgorithmConstraints]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.AlgorithmConstraints]

}
