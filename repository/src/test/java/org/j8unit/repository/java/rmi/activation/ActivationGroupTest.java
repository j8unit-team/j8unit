package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationGroup;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ActivationGroup} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.rmi.activation.ActivationGroupTests}).
 */
@RunWith(J8Unit4.class)
public class ActivationGroupTest
implements ActivationGroupTests<ActivationGroup> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationGroup]

    @Override
    public ActivationGroup createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.activation.ActivationGroup], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.activation.ActivationGroup]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.activation.ActivationGroup]

}
