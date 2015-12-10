package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationGroupClassTest
implements org.j8unit.repository.java.rmi.activation.ActivationGroupClassTests<java.rmi.activation.ActivationGroup> {

    @Override
    public Class<java.rmi.activation.ActivationGroup> createNewSUT() {
        return java.rmi.activation.ActivationGroup.class;
    }

}
