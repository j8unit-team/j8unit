package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationSystem;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ActivationSystem} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.rmi.activation.ActivationSystemClassTests}).
 */
@RunWith(J8Unit4.class)
public class ActivationSystemClassTest
implements ActivationSystemClassTests<ActivationSystem> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.activation.ActivationSystem]

    @Override
    public Class<ActivationSystem> createNewSUT() {
        return ActivationSystem.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.activation.ActivationSystem]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.activation.ActivationSystem]

}
