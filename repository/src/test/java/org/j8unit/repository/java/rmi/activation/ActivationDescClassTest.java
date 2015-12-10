package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationDescClassTest
implements org.j8unit.repository.java.rmi.activation.ActivationDescClassTests<java.rmi.activation.ActivationDesc> {

    @Override
    public Class<java.rmi.activation.ActivationDesc> createNewSUT() {
        return java.rmi.activation.ActivationDesc.class;
    }

}
