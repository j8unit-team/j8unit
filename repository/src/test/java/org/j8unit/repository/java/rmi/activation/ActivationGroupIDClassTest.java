package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationGroupIDClassTest
implements org.j8unit.repository.java.rmi.activation.ActivationGroupIDClassTests<java.rmi.activation.ActivationGroupID> {

    @Override
    public Class<java.rmi.activation.ActivationGroupID> createNewSUT() {
        return java.rmi.activation.ActivationGroupID.class;
    }

}
