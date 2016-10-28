package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationSystem;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationSystemTest
implements org.j8unit.repository.java.rmi.activation.ActivationSystemTests<ActivationSystem> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationSystem]

    @Override
    public ActivationSystem createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.activation.ActivationSystem], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationSystem]

}
