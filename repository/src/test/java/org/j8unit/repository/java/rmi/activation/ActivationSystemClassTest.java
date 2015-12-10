package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationSystemClassTest
implements org.j8unit.repository.java.rmi.activation.ActivationSystemClassTests<java.rmi.activation.ActivationSystem> {

    @Override
    public Class<java.rmi.activation.ActivationSystem> createNewSUT() {
        return java.rmi.activation.ActivationSystem.class;
    }

}
