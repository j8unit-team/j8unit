package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivatorClassTest
implements org.j8unit.repository.java.rmi.activation.ActivatorClassTests<java.rmi.activation.Activator> {

    @Override
    public Class<java.rmi.activation.Activator> createNewSUT() {
        return java.rmi.activation.Activator.class;
    }

}
