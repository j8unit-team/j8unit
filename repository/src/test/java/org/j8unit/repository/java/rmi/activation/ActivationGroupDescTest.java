package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationGroupDesc;
import java.rmi.activation.ActivationGroupDesc.CommandEnvironment;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationGroupDescTest
implements org.j8unit.repository.java.rmi.activation.ActivationGroupDescTests<ActivationGroupDesc> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationGroupDesc]

    @Override
    public ActivationGroupDesc createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.activation.ActivationGroupDesc], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationGroupDesc]

    @RunWith(J8Unit4.class)
    public static class CommandEnvironmentTest
    implements org.j8unit.repository.java.rmi.activation.ActivationGroupDescTests.CommandEnvironmentTests<CommandEnvironment> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationGroupDesc$CommandEnvironment]

        @Override
        public CommandEnvironment createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.activation.ActivationGroupDesc.CommandEnvironment], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationGroupDesc$CommandEnvironment]

    }

}
