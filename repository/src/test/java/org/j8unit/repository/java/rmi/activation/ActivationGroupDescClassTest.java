package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationGroupDescClassTest
implements org.j8unit.repository.java.rmi.activation.ActivationGroupDescClassTests<java.rmi.activation.ActivationGroupDesc> {

    @Override
    public Class<java.rmi.activation.ActivationGroupDesc> createNewSUT() {
        return java.rmi.activation.ActivationGroupDesc.class;
    }

    @RunWith(J8Unit4.class)
    public static class CommandEnvironmentClassTest
    implements
    org.j8unit.repository.java.rmi.activation.ActivationGroupDescClassTests.CommandEnvironmentClassTests<java.rmi.activation.ActivationGroupDesc.CommandEnvironment> {

        @Override
        public Class<java.rmi.activation.ActivationGroupDesc.CommandEnvironment> createNewSUT() {
            return java.rmi.activation.ActivationGroupDesc.CommandEnvironment.class;
        }

    }

}
