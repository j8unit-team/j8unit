package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.Activator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Activator} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.rmi.activation.ActivatorClassTests}).
 */
@RunWith(J8Unit4.class)
public class ActivatorClassTest
implements ActivatorClassTests<Activator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.activation.Activator]

    @Override
    public Class<Activator> createNewSUT() {
        return Activator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.activation.Activator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.activation.Activator]

}
