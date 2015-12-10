package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationIDClassTest
implements org.j8unit.repository.java.rmi.activation.ActivationIDClassTests<java.rmi.activation.ActivationID> {

    @Override
    public Class<java.rmi.activation.ActivationID> createNewSUT() {
        return java.rmi.activation.ActivationID.class;
    }

}
