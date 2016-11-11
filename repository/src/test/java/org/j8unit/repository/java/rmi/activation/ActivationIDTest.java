package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationID;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ActivationID} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.rmi.activation.ActivationIDTests}).
 */

@RunWith(J8Unit4.class)
public class ActivationIDTest
implements ActivationIDTests<ActivationID> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationID]

    @Override
    public ActivationID createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.activation.ActivationID], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.activation.ActivationID]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.activation.ActivationID]

}
