package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationGroupDescTest
implements org.j8unit.repository.java.rmi.activation.ActivationGroupDescTests<java.rmi.activation.ActivationGroupDesc> {

    @Override
    public java.rmi.activation.ActivationGroupDesc createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.activation.ActivationGroupDesc] available.");
    }

    @RunWith(J8Unit4.class)
    public static class CommandEnvironmentTest
    implements
    org.j8unit.repository.java.rmi.activation.ActivationGroupDescTests.CommandEnvironmentTests<java.rmi.activation.ActivationGroupDesc.CommandEnvironment> {

        @Override
        public java.rmi.activation.ActivationGroupDesc.CommandEnvironment createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [java.rmi.activation.ActivationGroupDesc.CommandEnvironment] available.");
        }

    }

}
