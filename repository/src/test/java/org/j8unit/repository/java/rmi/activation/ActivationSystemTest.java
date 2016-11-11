package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationSystem;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ActivationSystem} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.rmi.activation.ActivationSystemTests}).
 */

@RunWith(J8Unit4.class)
public class ActivationSystemTest
implements ActivationSystemTests<ActivationSystem> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationSystem]

    @Override
    public ActivationSystem createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.activation.ActivationSystem], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.activation.ActivationSystem]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.activation.ActivationSystem]

}
