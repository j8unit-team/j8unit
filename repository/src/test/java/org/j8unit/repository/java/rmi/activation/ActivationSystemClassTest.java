package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationSystem;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationSystemClassTest
implements org.j8unit.repository.java.rmi.activation.ActivationSystemClassTests<ActivationSystem> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.activation.ActivationSystem]

    @Override
    public Class<ActivationSystem> createNewSUT() {
        return ActivationSystem.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.activation.ActivationSystem]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.activation.ActivationSystem]

}
