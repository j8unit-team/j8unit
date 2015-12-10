package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivatableClassTest
implements org.j8unit.repository.java.rmi.activation.ActivatableClassTests<java.rmi.activation.Activatable> {

    @Override
    public Class<java.rmi.activation.Activatable> createNewSUT() {
        return java.rmi.activation.Activatable.class;
    }

}
