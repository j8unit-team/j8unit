package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationGroupDesc;
import java.rmi.activation.ActivationGroupDesc.CommandEnvironment;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ActivationGroupDesc} (by simply
 * reusing the J8Unit test interface {@link ActivationGroupDescTests}).
 */

@RunWith(J8Unit4.class)
public class ActivationGroupDescTest
implements ActivationGroupDescTests<ActivationGroupDesc> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationGroupDesc]

    @Override
    public ActivationGroupDesc createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.activation.ActivationGroupDesc], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.activation.ActivationGroupDesc]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.activation.ActivationGroupDesc]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link CommandEnvironment} (by simply
     * reusing the J8Unit test interface {@link CommandEnvironmentTests}).
     */

    @RunWith(J8Unit4.class)
    public static class CommandEnvironmentTest
    implements CommandEnvironmentTests<CommandEnvironment> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationGroupDesc$CommandEnvironment]

        @Override
        public CommandEnvironment createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.activation.ActivationGroupDesc.CommandEnvironment], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.activation.ActivationGroupDesc$CommandEnvironment]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.activation.ActivationGroupDesc$CommandEnvironment]

    }

}
