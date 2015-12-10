package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationMonitorClassTest
implements org.j8unit.repository.java.rmi.activation.ActivationMonitorClassTests<java.rmi.activation.ActivationMonitor> {

    @Override
    public Class<java.rmi.activation.ActivationMonitor> createNewSUT() {
        return java.rmi.activation.ActivationMonitor.class;
    }

}
