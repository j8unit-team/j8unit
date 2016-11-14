package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.Activator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Activator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.rmi.activation.ActivatorTests}).
 */

@RunWith(J8Unit4.class)
public class ActivatorTest
implements ActivatorTests<Activator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.Activator]

    @Override
    public Activator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.activation.Activator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.activation.Activator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.activation.Activator]

}
