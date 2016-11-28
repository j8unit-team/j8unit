package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationInstantiator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ActivationInstantiator} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.rmi.activation.ActivationInstantiatorClassTests}).
 */
@RunWith(J8Unit4.class)
public class ActivationInstantiatorClassTest
implements ActivationInstantiatorClassTests<ActivationInstantiator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.activation.ActivationInstantiator]

    @Override
    public Class<ActivationInstantiator> createNewSUT() {
        return ActivationInstantiator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.activation.ActivationInstantiator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.activation.ActivationInstantiator]

}
