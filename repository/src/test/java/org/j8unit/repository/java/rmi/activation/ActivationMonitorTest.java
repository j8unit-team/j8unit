package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationMonitor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ActivationMonitor} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.rmi.activation.ActivationMonitorTests}).
 */
@RunWith(J8Unit4.class)
public class ActivationMonitorTest
implements ActivationMonitorTests<ActivationMonitor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivationMonitor]

    @Override
    public ActivationMonitor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.activation.ActivationMonitor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.activation.ActivationMonitor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.activation.ActivationMonitor]

}
