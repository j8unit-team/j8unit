package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivationMonitor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationMonitorClassTest
implements org.j8unit.repository.java.rmi.activation.ActivationMonitorClassTests<ActivationMonitor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.activation.ActivationMonitor]

    @Override
    public Class<ActivationMonitor> createNewSUT() {
        return ActivationMonitor.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.activation.ActivationMonitor]

}
